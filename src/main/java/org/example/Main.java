package org.example;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
    int x=1;
        while (x<=100) {
            System.out.print(x+"-");
            x=x+1;
        }
    int aleatorio=2+(int)(Math.random()*99);
    int y=2;
    System.out.println("Valores pares entre 2 y "+aleatorio);
    while (y<=aleatorio) {
        System.out.print(y+"-");
        y=y+2;
    }
    }
}