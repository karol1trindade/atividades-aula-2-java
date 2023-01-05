import java.util.Scanner;
public class Questao1{

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
        System.out.println("digite um valor para N:");
        double n = sc.nextDouble();
        sc.close();
        double a = n;
        double num = n;
        double den = 1;

        while(den <= n){
            a += num/den;
            num--;
            den++;
        }

        System.out.println("A= "+ a);
    }
}
