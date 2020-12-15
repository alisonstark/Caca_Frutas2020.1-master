/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mesa;

import Elementos.Arvore;
import Elementos.Fruta;
import Elementos.Item;
import Elementos.Pedra;
import Jogadores.Catador;
import Jogadores.ContraCatador;
import Jogadores.Jogador;
import cata_frutas.Tribo;

import java.io.IOException;
import java.util.*;

/**
 *
 * @author rafael
 */

public class Floresta {

    Collection<Fruta> frutasOutroTotal;
    int arestaFloresta; //tamanho m de um dos lados da matriz
    List<Bloco> florestaLayout;

    Catador catador;
    ContraCatador contraCatador;


    int tamanhoFloresta;
    int[][] floresta;
    int quantArvores; // <= quantGrama
    int quantPedras; // m/4
    int quantGrama; // m-quantPedras
    int quantFrutasFloresta; // quantGrama/5
    int quantMaracuja; // >=3
    int quantAbacate; // quantFrutasFloresta/25
    int quantCoco; // quantFrutasFloresta/25
    int quantLaranja; // (quantFrutasFloresta/100)*15
    int quantMorango; // (quantFrutasFloresta/100)*15
    int quantAmora; //(quantFrutasFloresta/100)*15
    int quantBichadas; // (quantFrutasFloresta/100)*30



    //How to use X & Y coordinates for a map? Alternatives
    private final Map<Integer, Bloco.BlocoVazio> CACHE_BLOCOS_VAZIOS = criaTodosBlocosVazios();
    private Map<Integer, Bloco.BlocoVazio> criaTodosBlocosVazios() {
        Map<Integer, Bloco.BlocoVazio> mapaBlocosVazios = new HashMap();

        // Tamanho default da matriz, 3x3
        for(int i = 1; i <= (arestaFloresta * arestaFloresta) ; ++i) {
            mapaBlocosVazios.put(i, new Bloco.BlocoVazio(i));
        }
        return Collections.unmodifiableMap(mapaBlocosVazios);
    }

    public Bloco criaBloco(int posicao, Item item) {
        return (Bloco)(item != null ? new Bloco.BlocoOcupado(posicao, item) : (Bloco) this.CACHE_BLOCOS_VAZIOS.get(posicao));
    }

    private List<Bloco> criaFloresta(Floresta.Builder builder) {
        Bloco[] tiles = new Bloco[arestaFloresta * arestaFloresta];
        List<Bloco> tilesToReturn = new ArrayList();

        for(int i = 1; i < arestaFloresta * arestaFloresta; ++i) {
            tiles[i] = criaBloco(i, (Item) builder.configFloresta.get(i));
            tilesToReturn.add(tiles[i]);
        }
        return Collections.unmodifiableList(tilesToReturn);
    }

    public Collection<Pedra> geraPedras(int tamanhoFloresta){

        Collection<Pedra> pedrasNaFloresta;

        for (int i = 0; i < tamanhoFloresta * 0.25; i++){

            pedrasNaFloresta.add(new Pedra());

        }

    }

    private Floresta criaFlorestaDefault() throws IOException {

        Builder builder = new Floresta.Builder();
        Floresta floresta = new Floresta(builder);

        int min = 1;
        int max = arestaFloresta * arestaFloresta;
        int range = max - min + 1;

        //SET STONES
        for (int i = 1; i <= Math.round(max * 0.25); i++){
            int posAleatoriaBloco = (int)(Math.random() * range) + min;

            //Verify "custoPAgilidade" in terms of how the avatar moves
            builder.setItem(posAleatoriaBloco, new Pedra(posAleatoriaBloco, true, 3));
        }

        //SET TREES
        for (int i = 1; i <= Math.round(max * 0.25); i++){
            int posAleatoriaBloco = (int)(Math.random() * range) + min;

            //Verify "custoPAgilidade" in terms of how the avatar moves
            builder.setItem(posAleatoriaBloco, new Arvore(posAleatoriaBloco, true, floresta.getJogadorAtual.getPeriodoArvore()));
        }


        for (int i = 1; i <= max; i++){

            int blocoAleatorio = (int)(Math.random() * range) + min;

            //builder.setItem(blocoAleatorio, );


        }

        // builder.setMoveMaker() How to set the next player to make a move);

    return builder.build();
    }

    
    public Floresta(Floresta.Builder builder) throws IOException {

        this.catador = new Catador();
        this.contraCatador = new ContraCatador();
        this.frutasOutroTotal = geraColecaoFrutas();


        //TODO design the forest layout here
        this.florestaLayout = this.criaFloresta(builder);

    }

    private Collection<Fruta> geraColecaoFrutas(){
        Collection<Fruta> frutasOuro = new ArrayList<>();

        int min = 1;
        int max = (int) Math.round(tamanhoFloresta * 0.1);
        int range = max - min + 1;


        int quantAleatoria = (int)(Math.random() * range) + min;

        for (int i = 0; i <= quantAleatoria; i++){
            frutasOuro.add(new Fruta());
        }

        if (frutasOuro.size() < 3 || frutasOuro.size() % 3 != 0) {
            frutasOuro.add(new Fruta());
        }
        return frutasOuro;
    }

    public Bloco getBloco(int posicao) {
        return (Bloco) this.florestaLayout.get(posicao);
    }

    public Jogador getJogadorAtual(Floresta floresta){

        return this
    }

    public int getFrutasOuroTotal(){
        return this.frutasOutroTotal.size();
    }


    public static class Builder {

        Map<Integer, Item> configFloresta = new HashMap();

        Tribo proximoAjogar;

        public Builder() {
        }

        public Floresta.Builder setMoveMaker(Tribo proximoAjogar) {
            this.proximoAjogar = proximoAjogar;
            return this;
        }

        public Floresta build() throws IOException {
            return new Floresta(this);
        }

        public void setItem(int posicao, Item item) {
            this.configFloresta.put(posicao, item);
        }

    }
}
