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
public class Grama extends Item {
    int custoPAgilidade;

    public Grama(boolean estatico, int custoPAgilidade, int posiçãoX, int posiçãoY) {
        super(posiçãoX, posiçãoY, estatico);
        this.custoPAgilidade = custoPAgilidade;
    }
    
    

    
}
