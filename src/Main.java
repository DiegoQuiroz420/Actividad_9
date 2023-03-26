import java.util.*;

public class Main {
    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.creBaraja();

        String repetir;
        do {

            int opc = 8;
            boolean validar = true;


            do{
                System.out.println("Menu");
                System.out.println("1. Mezclar deck");
                System.out.println("2. Sacar una carta");
                System.out.println("3. Carta al azar");
                System.out.println("4. Generar una mano de 5 cartas");
                System.out.println("5. Salir");

                try {
                    System.out.print("Opcion: ");
                    Scanner scanner = new Scanner(System.in);
                    opc = scanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("Solo admite valores numericos");
                }

                if (opc >= 6 || opc <= 0) {
                    System.out.println("Digite un numero entre los rangos correctos");
                    validar = true;
                } else {
                    validar = false;
                }


            } while (validar);


            switch (opc) {
                case 1:
                    System.out.println("1. Mezclar deck");
                    deck.shhuffle();

                    break;
                case 2:
                    System.out.println("2. Sacar una carta");
                    deck.head();

                    break;
                case 3:
                    System.out.println("3. Carta al azar");
                    deck.pick();

                    break;
                case 4:
                    System.out.println("Generar una mano de 5 cartas");
                    deck.hand();

                    break;
                case 5:
                    System.exit(0);
                    break;

            }

            Scanner scanner = new Scanner(System.in);

            System.out.println("¿Deseas hacer algo mas? (s/n)");
            repetir = scanner.nextLine();
            repetir.toLowerCase();


        } while (repetir.equals("s"));

    }


}