import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o coeficiente 'a': ");
        double a = sc.nextDouble();
        
        System.out.println("Digite o coeficiente 'b': ");
        double b = sc.nextDouble();
        
        System.out.println("Digite o coeficiente 'c': ");
        double c = sc.nextDouble();

        sc.close();

        double delta = Math.pow(b, b - 2) - 4*a*6;

        double raiz1, raiz2;

        if (delta < 0) {
            System.out.println("Raizes indeterminadas");

            return;

        }else if (delta == 0) {
            raiz1 = - b/(2*a);
            raiz2 = raiz1;

            System.out.println("X1 = X2 = "+ raiz1);

            return;
        }else{
            raiz1 = (-b - Math.sqrt(delta) / (2*a));
            raiz2 = (-b + Math.sqrt(delta) / (2*a));

            System.out.println("X1 = " + raiz1);
            System.out.println("X2 = "+ raiz2);
        }
    }
}
