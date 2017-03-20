package com.example.users.jsonprojetoreceita;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Util {

    public static String rawToJson(InputStream inputStream) {
        InputStream localStream = inputStream;
        String jsonString = "";
        Writer writer = new StringWriter();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(localStream, "UTF-8"));
            String line = reader.readLine();
            while (line != null) {
                writer.write(line);
                line = reader.readLine();
            }
            jsonString = writer.toString();
            writer.close();
            reader.close();
            localStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonString;
    }

    public static Receita convertJSONtoReceita(String jsonFile) {
        Receita novaReceita = null;
        try {
            novaReceita = new Receita();
            List<Ingrediente> ingredientes = new ArrayList<>();
            JSONObject mainObject = new JSONObject(jsonFile);
            String autor = mainObject.getString("Autor");
            String receita = mainObject.getString("Receita");
            int tempo = mainObject.getInt("Tempo");

            JSONArray ingredientesJson = mainObject.getJSONArray("Ingredientes");

            for (int i = 0; i < ingredientesJson.length(); i++) {
                JSONObject localObj = ingredientesJson.getJSONObject(i);
                String item = localObj.getString("Item");
                String qtde = localObj.getString("Qtde");
                ingredientes.add(new Ingrediente(item, qtde));
            }
            novaReceita.setNomeAutor(autor);
            novaReceita.setNomeReceita(receita);
            novaReceita.setTempoReceita(tempo);
            novaReceita.setIngredientes(ingredientes);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return novaReceita;
    }
}
