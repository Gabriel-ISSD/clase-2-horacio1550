package Problemas_ejercicios_clase2;

public class problema_1 {
    public static void main(String[] args) {
        int aleatorio = 1 + (int) (Math.random() * 1000);
        int contador = 0;
        System.out.println("El numero generado es: "+aleatorio);
        if (aleatorio == 0) {
             contador = 1;

        } else {
            while (aleatorio > 0) {
                aleatorio = aleatorio / 10;
                contador++;
            }
        }
        System.out.println("el numero tiene " + contador + " digitos");
    }
}
