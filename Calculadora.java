import java.util.Scanner;

public class Calculadora {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       double num1, num2;
       char operador;

       System.out.println("Bem-vindo à Calculadora Simples!");
       System.out.println("Por favor, insira a operação no formato: número operador número");
       System.out.println("Operadores suportados: + (soma), - (subtração), * (multiplicação), / (divisão)");

       System.out.print("Digite a expressão: ");
       num1 = scanner.nextDouble();
       operador = scanner.next().charAt(0);
       num2 = scanner.nextDouble();

       double resultado = 0;

       switch (operador) {
           case '+':
               resultado = num1 + num2;
               break;
           case '-':
               resultado = num1 - num2;
               break;
           case '*':
               resultado = num1 * num2;
               break;
           case '/':
               if (num2 != 0) {
                   resultado = num1 / num2;
               } else {
                   System.out.println("Erro: Divisão por zero!");
                   return;
               }
               break;
           default:
               System.out.println("Operador inválido!");
               return;
       }

       System.out.println("O resultado é: " + resultado);
   }
}