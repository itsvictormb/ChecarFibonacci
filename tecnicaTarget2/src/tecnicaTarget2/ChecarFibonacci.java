package tecnicaTarget2;

import java.util.Scanner;
import java.util.ArrayList;

public class ChecarFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        
        while (true) {
            int proximo = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
            if (proximo > numero) {
                break;
            }
            fibonacci.add(proximo);
        }
        
        if (fibonacci.contains(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
        
        sc.close();
    }
}