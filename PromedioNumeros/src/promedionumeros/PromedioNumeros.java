
package promedionumeros;

import java.util.Scanner;

public class PromedioNumeros {
 
    public static void main(String[] args) {
        int n,s=0,x;
        double p;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar cantidad de elementos:");
        n=teclado.nextInt();
   
        for(int i=1;i<=n;i++)
        { 
         System.out.println("Elemento ["+i+"]=");
         x=teclado.nextInt();
         s=s+x;                
        }   
        p=s/n;
        
         System.out.println("El Promedio es:" +p);                               
    }   
}
