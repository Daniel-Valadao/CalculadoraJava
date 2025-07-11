import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static <printStream> void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("-----Calculadora Simples-----: ");

    System.out.print("Digite o primeiro valor: ");
    double valor1 = scanner.nextDouble();

    System.out.print("Digite o segundo valor: ");
    double valor2 = scanner.nextDouble();

    System.out.print("Escolha a operação (+,-,*,/,%)");
    char operacao = scanner.next().charAt(0);

    double resultado = 0;
    switch (operacao) {
        case '+':
            resultado = valor1 + valor2;
            System.out.println("Resultado: " + resultado);
            break;
        case '-':
            resultado = valor1 - valor2;
            System.out.println("Resultado: " + resultado);
            break;
        case '*':
            resultado = valor1 * valor2;
            System.out.println("Resultado: " + resultado);
            break;
        case '/':
            if (valor2 !=0) {
                resultado = valor1 / valor2;
                System.out.println("Resultado : " + resultado);
            }else
        System.out.println("Erro: Divisão por zero não é permitida.");
        break;
        case '%':
            if (valor2 !=0) {
                resultado = valor1 % valor2;
                System.out.println("O resto da divisão é: " + resultado);
            }else{
                System.out.println("Erro: O Segundo valor deve ser maior que zero.");
        }
            break;
        default:
            System.out.println("Operação inválida. Por favor, escolha +, -, *,/ ou % .");


        }
        scanner.close();
    }
}