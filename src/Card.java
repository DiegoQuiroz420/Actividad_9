
public class Card {

    String [] palo = {"Diamante","Corazon","Picas","Trebol"};
    String [] color = {"Rojo","Negro"};
    String [] valor = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};

    public Card(){

    }


    public String[] getPalo() {
        return palo;
    }

    public void setPalo(String[] palo) {
        this.palo = palo;
    }

    public String[] getColor() {
        return color;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public String[] getValor() {
        return valor;
    }

    public void setValor(String[] valor) {
        this.valor = valor;
    }
}
