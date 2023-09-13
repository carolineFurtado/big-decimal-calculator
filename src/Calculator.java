import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigDecimal num1;
        BigDecimal num2;
        String operador;


        System.out.println("Digite o  primeiro numero: ");
        num1 = scanner.nextBigDecimal();

        System.out.println("Digite a operacao (+, -, *, /): ");
        operador = scanner.next();

        System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextBigDecimal();

        System.out.printf("O resultado da operacao e: %s%n", realizarCalculo(num1, num2, operador));

    }

    private static Object realizarCalculo(BigDecimal num1, BigDecimal num2, String operador) {


        switch (operador) {
            case "+" -> {
                System.out.println(num1.add(num2));
                return num1.add(num2);
            }
            case "-" -> {
                System.out.println(num1.subtract(num2));
                return num1.subtract(num2);
            }
            case "*" -> {
                System.out.println(num1.multiply(num2));
                return num1.multiply(num2);
            }
            case "/" -> {
                System.out.println(num1.divide(num2, MathContext.DECIMAL32));
                return num1.divide(num2, MathContext.DECIMAL32);
            }
            default -> throw new IllegalArgumentException();
        }

    }
}






