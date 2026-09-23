package org.example;

public class ControleLeitos {
    private static ControleLeitos instance = new ControleLeitos();
    private ControleLeitos() {};
    private int leitosLivres = 10;

    public static ControleLeitos getInstance(){
        return instance;
    };

    public void ocuparLeitos(int numLeitos){
        this.leitosLivres -= numLeitos;
    }

    public String liberarLeitos(int numLeitos){
        if (numLeitos + this.leitosLivres > 10) {
            this.leitosLivres = 10;
        } else {
            this.leitosLivres += numLeitos;
        }
        return "Leitos livres: " + this.leitosLivres;
    }

}
