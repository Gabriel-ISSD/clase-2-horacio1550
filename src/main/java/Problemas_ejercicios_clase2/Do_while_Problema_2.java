package Problemas_ejercicios_clase2;
import java.util.Scanner;
public class Do_while_Problema_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cuenta, saldo = 0, sumatotal = 0;
        do {
            System.out.print("Ingrese numero de cuenta: ");
            cuenta = teclado.nextInt();
            if (cuenta >= 0) {
                System.out.print("Ingrese saldo actual: ");
                saldo = teclado.nextInt();

                if (saldo == 0) {
                    System.out.println("El saldo es nulo");
                } else {
                    if (saldo > 0) {
                        System.out.println("El saldo es Acreedor " + saldo);
                        sumatotal = sumatotal + saldo;
                    } else {
                        System.out.println("El saldo es deudor " + saldo);
                    }
                }

            }

        }while (cuenta >= 0) ;
        System.out.println("La suma total de los saldos acreedores es: " + sumatotal);
    }



    }

