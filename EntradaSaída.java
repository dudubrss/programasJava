
package entradasaída;

import java.util.Scanner;


public class EntradaSaída {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o nomew");
        String nome = teclado.nextLine();
        System.out.println("digite a nota");
        float nota = teclado.nextFloat();
        System.out.format("a nota de %s é %.2f \n", nome, nota);
        
    }
    
}
