package com.example.users.jsonprojetoreceita;

import java.util.List;


public class Receita {

    private String nomeAutor;
    private String nomeReceita;
    private int tempoReceita;
    private List<Ingrediente> ingredientes;

    public Receita() {
    }

    public Receita(String nomeAutor, String nomeReceita, int tempoReceita, List<Ingrediente> ingredientes) {
        this.nomeAutor = nomeAutor;
        this.nomeReceita = nomeReceita;
        this.tempoReceita = tempoReceita;
        this.ingredientes = ingredientes;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getNomeReceita() {
        return nomeReceita;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public int getTempoReceita() {
        return tempoReceita;
    }

    public void setTempoReceita(int tempoReceita) {
        this.tempoReceita = tempoReceita;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Receita: \n" +
                "nomeAutor=" + nomeAutor + "\n" +
                "nomeReceita=" + nomeReceita + "\n" +
                "tempoReceita=" + tempoReceita + "\n" +
                "ingredientes=" + ingredientes;
    }
}
