package Jogadores;

import cata_frutas.Mochila;

public class ContraCatador extends Jogador {

    Avatar avatarContraCatador;

    public ContraCatador(String nome,
                         int quantVitorias,
                         int periodoArvore,
                         Mochila mochila,
                         Avatar avatarContraCatador) {

        super(nome, quantVitorias, periodoArvore, mochila);
        this.avatarContraCatador = avatarContraCatador;
    }
}
