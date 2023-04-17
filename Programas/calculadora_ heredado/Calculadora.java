import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {
        double op1;
        double op2;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Ingrese el primer operando:");
            op1 = entrada.nextDouble();
            System.out.println("Ingrese el segundo operando:");
            op2 = entrada.nextDouble();
        }

        Suma sum = new Suma(op1,op2);
        sum.mostrarResultado();

        Resta resta = new Resta(op1,op2);
        resta.mostrarResultado();

        Multiplicacion multi = new Multiplicacion(op1,op2);
        multi.mostrarResultado();

        Division div = new Division(op1,op2);
        div.mostrarResultado();
    }
}