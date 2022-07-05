import java.util.*;

public class main {
    static Scanner in = new Scanner(System.in);

    public static void inserimentoNome(){
        String Nome;
        Nome = in.next();
        System.out.print("Inserisci il tuo nome:" + Nome);
    }

    public static void main(String []args){
        inserimentoNome();
    }
}
