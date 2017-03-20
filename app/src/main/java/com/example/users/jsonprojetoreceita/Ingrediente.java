package com.example.users.jsonprojetoreceita;

public class Ingrediente {

    private String item;
    private String qtde;

    public Ingrediente() {
    }

    public Ingrediente(String item, String qtde) {
        this.item = item;
        this.qtde = qtde;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQtde() {
        return qtde;
    }

    public void setQtde(String qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return "Ingrediente:\n" +
                "item=" + item + "\n" +
                "qtde=" + qtde + "\n";
    }
}
