package Problemas_ejercicios_clase2;
import java.util.Scanner;
public class Problema_2 {
    public static void main(String[] args){
    Scanner teclado=new Scanner(System.in);
    double altura;
    double suma=0;          //double para sumar la altura con decimales 1.70.1.20 etc.
    int contador=0;
    int cantidad;

    System.out.print("Ingrese cantidad de personas: ");
    cantidad=teclado.nextInt();

    while (contador<cantidad){
        System.out.print("Ingrese altura de la persona: ");
        altura=teclado.nextDouble();    //nextdouble para leer numeros con decimal
        suma=suma+ altura;
        contador++;
    }
double promedio= suma /cantidad;
System.out.println("La altura promedio es: "+promedio);


    }

}
