import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Deck {

    LinkedList<String> baraja = new LinkedList<String>();

    public Deck(){

    }

    Card card = new Card();

    public void creBaraja(){
        String [] palo = card.getPalo();
        String [] color = card.getColor();
        String [] valor = card.getValor();

        String carta = "";
        int iterar = 0;
        int cambiarColor = 0;


        for (int i = 0; i< palo.length;i++) {
            for (int j = 0; j < valor.length; j++) {
                iterar++;
                if (iterar >= 27) {
                    cambiarColor = 1;
                }
                carta = "{" + palo[i] + "}" + "," + "{" + color[cambiarColor] + "}" + "," + "{" + valor[j] + "}";
                baraja.add(carta);
            }
        }
    }

    public void shhuffle (){
        System.out.println("Se mezclo el deck");
    }

    public void head(){

        try {
            System.out.println("Su carta es");
            System.out.println(baraja.getFirst());
            baraja.removeFirst();
        } catch(Exception e){
            System.out.println("Se acabaron las cartas, se dara por terminado el programa");
            System.exit(0);
        }
        System.out.println("Quedan " + baraja.size() + " cartas");
    }

    public void pick (){

        int aleatorio  = 0;
        Random random = new Random();

        aleatorio = (int) (random.nextDouble() * baraja.size());

        try {
            System.out.println("Su carta es");
            System.out.println(baraja.get(aleatorio));
            baraja.remove(aleatorio);
        }catch(Exception e){
            System.out.println("Se acabaron las cartas, se dara por terminado el programa");
            System.exit(0);
        }
        System.out.println("Quedan " + baraja.size() + " cartas");

    }

    public void hand (){

        String [] Cartas = new String[5];
        int aleatorio  = 0;
        Random random = new Random();

        for (int i = 0; i< Cartas.length; i++){
            aleatorio = (int) (random.nextDouble() * baraja.size());
            try {
                Cartas[i] = baraja.get(aleatorio);
                baraja.remove(aleatorio);
            } catch (Exception e){
                System.out.println("Se acabaron las cartas, se dara por terminado el programa");
                System.exit(0);
            }
        }

        for (String cartas: Cartas){
            System.out.println(cartas);
        }
        System.out.println("Quedan " + baraja.size() + " cartas");
    }





}
