package Problemas_ejercicios_clase2;
import java.util.Scanner;
public class Problema_4 {
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);

        int numero, cantidad,contador=0,contadorPar=0;
        System.out.print("Ingrese cantidad de numeros a informar: ");
        cantidad=teclado.nextInt();

        while (contador <cantidad){
            System.out.print("Ingrese los numeros enteros: ");
            numero= teclado.nextInt();
            contador++;

            if (numero%2==0){
                contadorPar++;
            }
        }
     System.out.println("La cantidad de numeros pares es: "+contadorPar);
    }
}
