import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculos calculos = new Calculos(); 

        System.out.print("Número 1: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Numero 2: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação(pelos números e não pelos símbolos):");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Sua escolha: ");
        int opcao = scanner.nextInt();

        double resultado = 0;
        boolean operacaoValida = true;

        try {
            switch (opcao) {
                case 1:
                    resultado = calculos.somar(numero1, numero2);
                    break;
                case 2:
                    resultado = calculos.subtrair(numero1, numero2);
                    break;
                case 3:
                    resultado = calculos.multiplicar(numero1, numero2);
                    break;
                case 4:
                    resultado = calculos.dividir(numero1, numero2);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    operacaoValida = false;
            }

            if (operacaoValida) {
                System.out.println("Resultado: " + resultado);
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
