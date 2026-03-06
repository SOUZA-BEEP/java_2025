package Tarte;

import bolo.Bolo;

public class Tarte extends Bolo {


    private String tipoMassa;
    private String fruta;


    public Tarte(String tipoMassa, String fruta) {
        this.tipoMassa = tipoMassa;
        this.fruta = fruta;
    }

    // Método pedacosfrutas
    public void pedacosFrutas() {
        System.out.println("Tipo de fruta escolhida: " + fruta);
    }
}

