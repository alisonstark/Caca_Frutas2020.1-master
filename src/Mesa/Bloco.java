package Mesa;

import Elementos.Item;

public abstract class Bloco {

    /*
    int posicaoX;
    int posicaoY;

     */

    int posicao;

    Bloco(int posicao) {
        this.posicao = posicao;
    }

    //Define 2 main abstract methods for the subclasses
    public abstract boolean blocoVazio();
    public abstract Item getItem();

    //Set up getter methods
    public int getPosicao() {
        return this.posicao;
    }
    /*
    public int getPosicaoY() {
        return this.posicaoY;
    }

     */

    //main subclasses
    public static final class BlocoOcupado extends Bloco {
        private final Item itemNoBloco;

        BlocoOcupado(int posicao, Item itemNoBloco) {
            super(posicao);
            this.itemNoBloco = itemNoBloco;
        }

        public boolean blocoVazio() {
            return false;
        }

        public Item getItem() {
            return this.itemNoBloco;
        }
    }
    public static final class BlocoVazio extends Bloco {
        BlocoVazio(int posicao) {
            super(posicao);
        }

        public boolean blocoVazio() {
            return true;
        }
        public Item getItem() {
            return null;
        }
    }

}
