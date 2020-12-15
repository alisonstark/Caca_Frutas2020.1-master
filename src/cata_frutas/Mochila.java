/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cata_frutas;
import Elementos.Fruta;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author rafael
 */
public class Mochila {
    int capacidade; // total de frutas/3
    Collection<Fruta> inventario;
    int frutasOuro;
    
    public Mochila(int capacidade, ArrayList<Fruta> inventario){
        this.capacidade = capacidade;
        this.inventario = inventario;
    }

    public int getFrutasOuro(){

        for (Fruta fruta : inventario){
            if (fruta.getTipo().equalsIgnoreCase("maracujá")){
                frutasOuro += 1;
            }
        }
        return this.frutasOuro;
    }
    
}
