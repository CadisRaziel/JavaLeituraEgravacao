
package ComandosLeituraGravacao;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine(); //pula linha
        String codigoRua = leitor.next();
        System.out.println("Texto que ser� exibido no console");//pula linha
      
        
        
    }
}
