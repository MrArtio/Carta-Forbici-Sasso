import java.util.*;

public class main {
    static Scanner in = new Scanner(System.in);

    public static int CARTA = 0;
    public static int FORBICI = 1;
    public static int SASSO = 2;

    public static void inserimentoNome(){
        String Nome;

        System.out.print("Inserisci il tuo nome: ");
        Nome = in.next();
        System.out.println("Benvenuto! " + Nome + " ");
    }

    public static void modalitàEasy(){
        int giocatore;

        System.out.print("Carta = 0, Forbici = 1, Sasso = 2");
        giocatore = in.nextInt();

        if (giocatore == CARTA){
            System.out.print("Sasso");
        } else {
            System.out.print("Forbici");
        }

        if (giocatore == FORBICI){
            System.out.print("Carta");
        } else {
            System.out.print("Sasso");
        }

        if (giocatore == SASSO){
            System.out.print("Forbici");
        } else {
            System.out.print("Carta");
        }

    }

    public static void modalitàNormal(){
        int giocatore;


    }

    public static void modalitàHard(){
        int giocatore;


    }

    public static void main(String []args){
        int s_es = 0;

        inserimentoNome();

        System.out.print("Seleziona Modalita'; Easy = 1, Normal = 2, Hard = 3 ");
        in.nextInt();

        switch (s_es) {
            case 1:
                modalitàEasy();
                break;

                case 2:
                modalitàNormal();
                break;

                case 3:
                modalitàHard();
                break;
        }
    }
}
