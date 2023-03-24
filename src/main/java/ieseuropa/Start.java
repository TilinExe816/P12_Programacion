package main.java.ieseuropa;

public class Start{
    
    public static double calcularMedia(int[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;
    }

    public static void main(String[] args) {
        int[] numeros = {5, 7, 2, 10, 4};
        double media = calcularMedia(numeros);
        System.out.println("La media de los números es: " + media);
    }
}
