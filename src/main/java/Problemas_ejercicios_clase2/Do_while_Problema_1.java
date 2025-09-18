package Problemas_ejercicios_clase2;
import java.util.Scanner;
public class Do_while_Problema_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int suma = 0, valor;
        do {
            System.out.print("Ingrese el numero a sumar: (o ingrese 9999 para finalizar: ");
            valor = teclado.nextInt();
            if (valor!=9999) {
                suma = suma + valor;
            }

        } while (valor != 9999);
        if (suma ==0){
            System.out.println("El monto es igual a 0");
        } else{
            if (suma>0){
                System.out.print("El monto es mayor a 0 Total: "+suma);
            }else {
            System.out.println("El monto es menor a 0  Total: "+suma);}

        }
    }
}
