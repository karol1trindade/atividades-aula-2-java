import java.util.Scanner;

import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("digite uma frase:");
        String frase = sc.nextLine();

        sc.close();
        
        int contador = 0;

        for(int i = 0; i < frase.length(); i++){
            char caracterAtual = frase.charAt(i);

            if(caracterAtual == 'A' || caracterAtual == 'a'){
                contador++;
            }

        }
        System.out.println("TOTAL DE A:" +contador);
    }
}
