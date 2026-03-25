

package portfoliojavaa;

import java.util.Scanner;


public class CalculadoraSimples {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o priemiro numero: ");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo numero:  ");
        double num2 = scan.nextDouble();
        
        System.out.println("Escolha a opracao: 1-Soma, 2-subtraca, 3-Multiplicacao, 4-Divisao  ");
        int opcao = scan.nextInt();
        
        switch(opcao){
            
            case 1:
                System.out.println("Resultado da operacao: "+ (num1+ num2));   
                break;
            case 2:
                System.out.println("Resultado da operacao:  "+ (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado da operacao:  "+ (num1 * num2));
                break;
            case 4:
                if (num2 == 0){
                    System.out.println("Nao e possivel dividir por zero");
                }
                else{
                    System.out.println("Resultado da operacacao "+ (num1 / num2)); 
                }
                break;
            default:
                System.out.println("Opcao invalida ");
            
                
        }
    }
}
