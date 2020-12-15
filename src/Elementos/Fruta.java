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
public class Fruta extends Item {
    String tipo;
    int forca;
    int agilidade;
    int ouro;
    boolean antidoto;

    public Fruta(int posicao, boolean estatico, String tipo){
        super(posicao, estatico);
        this.tipo = tipo;


        switch (this.tipo){
            case "maracuja":
                this.forca = 1;
                this.agilidade = 1;
                this.ouro = 1;
                this.antidoto = false;
           
            case "coco":
                this.forca = 1;
                this.agilidade = 2;
                this.ouro = 0;
                this.antidoto = false;
            
            case "abacate":
                this.forca = 2;
                this.agilidade = 1;
                this.ouro = 0;
                this.antidoto = false;
            
            case "laranja":
                this.forca = 1;
                this.agilidade = 1;
                this.ouro = 0;
                this.antidoto = true;
            
            case "morango":
                this.forca = 1;
                this.agilidade = 1;
                this.ouro = 0;
                this.antidoto = false;
            
            case "amora":
                this.forca = 1;
                this.agilidade = 1;
                this.ouro = 0;
                this.antidoto = false;
            
            case "uva":
                this.forca = 1;
                this.agilidade = 1;
                this.ouro = 0;
                this.antidoto = false;
        
        }
    }

    public String getTipo(){
        return this.tipo;
    }
    public int getForça(){
        return this.forca;
    }
    public int getAgilidade(){
        return this.agilidade;
    }
    public int getOuro(){
        return this.ouro;
    }
}
