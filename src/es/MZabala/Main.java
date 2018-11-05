package es.MZabala;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido, por favor introduzca un número entre 0 y 9999.");
        int x=sc.nextInt();
        if (x < 0 || x > 9999) {
            System.out.println("Número no válido.");
        }else{
            headandtail(x);
        }
    }

    /*
    Función main que comprueba e inicializa el número a analizar
     */

    private static void headandtail(int x) {
        int u=0,d=0,c=0,m=0;
        for (int i = 0; i <x; i++) {
            u++;
            if(u==10){
                u=0;
                d++;
                if(d==10){
                    d=0;
                    c++;
                    if(c==10){
                        c=0;
                        m++;
                    }
                }
            }
        }
        if(x>1000){
            if(u==m && d==c){
                System.out.println("Sí es capicua");
            }else{
                System.out.println("No es capicua");
            }
        }else{
            if(x>100){
                if(u==c){
                    System.out.println("Sí es capicua");
                }else{
                    System.out.println("No es capicua");
                }
            }else{
                if(x>10){
                    if(u==d){
                        System.out.println("Sí es capicua");
                    }else{
                        System.out.println("No es capicua");
                    }
                }else{
                    System.out.println("Introduzca más de un número, por favor.");
                }
            }
        }
    }

    /*
    Función que separa el número en 4 variables y las compara entre ellas para ver si es capicua
     */

}
