/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogadores;

import Mesa.Floresta;
import cata_frutas.Mochila;

/**
 *
 * @author rafael
 */
public abstract class Jogador {
    String nome;
    int quantVitorias;
    int periodoArvore;
    int pontosDoAvatar;

    Floresta floresta;


    Mochila mochila;

    Avatar personagem; //a cada partida jogador pode usar um avatar diferente

    public Jogador(String nome,
                   int quantVitorias,
                   int periodoArvore,
                   Mochila mochila,
                   Floresta floresta){
        this.nome = nome;
        this.quantVitorias = quantVitorias;
        this.periodoArvore = periodoArvore;
        this.mochila = mochila;
        this.floresta = floresta;
    }

    public abstract int getPeriodoArvore();
    public abstract int getQuantVitorias();

    public abstract void setVitoria();
    public abstract void setPeriodoArvore();
}
