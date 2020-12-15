/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import Elementos.Fruta;
import Elementos.Item;

/**
 *
 * @author rafael
 */
public class Arvore extends Item {
    int periodoFrutaArvore;
    Fruta tipo;

    public Arvore(int posicao, boolean estatico, int periodoFrutaArvore, Fruta tipo) {
        super(posicao, estatico);

        this.periodoFrutaArvore = periodoFrutaArvore;
        this.tipo = tipo;
    }
    
    

    
    
    
    
}
