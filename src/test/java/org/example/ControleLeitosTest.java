package org.example;

import static org.junit.jupiter.api.Assertions.*;

class ControleLeitosTest {

    @org.junit.jupiter.api.Test
    void deveRetornarNumeroLeitosLivres() {
        ControleLeitos.getInstance().ocuparLeitos(2);
        assertEquals("Leitos livres: 9", ControleLeitos.getInstance().liberarLeitos(1));
    }

}