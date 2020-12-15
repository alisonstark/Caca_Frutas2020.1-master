package Jogadores;

import Mesa.Floresta;
import cata_frutas.Mochila;

public class Catador extends Jogador {

    Avatar avatarCatador;

    public Catador(String nome,
                   int quantVitorias,
                   int periodoArvore,
                   Mochila mochila,
                   Avatar avatarCatador,
                   Floresta floresta) {

        super(nome, quantVitorias, periodoArvore, mochila, floresta);
        this.avatarCatador = avatarCatador;
    }

    @Override
    public int getPeriodoArvore() {
        return this.periodoArvore;
    }

    @Override
    public int getQuantVitorias() {
        return this.quantVitorias;
    }

    @Override
    public void setVitoria() {

        if (mochila.getFrutasOuro() >= (floresta.getFrutasOuroTotal() / 2 + 1))

        this.quantVitorias += 1;
    }

    @Override
    public void setPeriodoArvore() {

        if ()


    }
}
