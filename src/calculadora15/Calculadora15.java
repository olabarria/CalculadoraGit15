package calculadora15;
/**
 * Clase CalculadoraGITXX
 * Esta clase realiza operaciones básicas de cálculo, como sumar, restar, multiplicar y dividir. 
 */   
  @author Olabarria
  @version 1.0


public class Calculadora15 {


    
    public static int sumar(int a, int b) {
        return a + b;
    }

    
    public static int restar(int a, int b) {
        return a - b;
    }

    
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    
    public static double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero");
            return 0; 
        }
        return (double) a / b;
    }

    
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }

    
    public static int modulo(int a, int b) {
        return a % b;
    }
}


