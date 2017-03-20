package com.example.users.jsonprojetoreceita;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textJSON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textJSON = (TextView) findViewById(R.id.textJSON);

    }

    public void loadJSON(View v) {
        Receita receita = Util.convertJSONtoReceita(Util.rawToJson(getResources().openRawResource(R.raw.teste)));
        textJSON.setText(receita.toString());
    }
}
