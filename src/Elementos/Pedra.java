/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elementos;

import Elementos.Item;

/**
 *
 * @author rafael
 */
public class Pedra extends Item {
    int custoPAgilidade;

    public Pedra(int posicao,
                 boolean estatico,
                 int custoPAgilidade) {
        super(posicao, estatico);

        this.custoPAgilidade = custoPAgilidade;
    }

    
    
}
