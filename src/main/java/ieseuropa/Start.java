package main.java.ieseuropa;
import java.util.Arrays;

public class Start {

    public static double calcularMediana(int[] numeros) {
        Arrays.sort(numeros);
        int longitud = numeros.length;
        if (longitud % 2 == 0) {
            return (double) (numeros[longitud/2 - 1] + numeros[longitud/2]) / 2;
        } else {
            return numeros[longitud/2];
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5, 7, 2, 10, 4, 1};
        double mediana = calcularMediana(numeros);
        System.out.println("La mediana de los números es: " + mediana);
    }
}