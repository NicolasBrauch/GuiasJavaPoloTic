/*Del listado de abajo, determinar qué animal eligió el usuario mediante
la realización de tres preguntas del tipo SI/NO acerca de las tres
características elegidas (herbívoro, mamífero, doméstico). Mostrar el
resultado por pantalla. */
package guia2;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String respuesta[]=new String[3];
        
        String matriz[][]=
        {
        {"Alce","SI","SI","NO"},
        {"Caballo","SI","SI","SI"},
        {"Caracol","SI","NO","NO"},
        {"Condor","NO","NO","NO"},
        {"Gato","NO","SI","SI"},
        {"Leon","NO","SI","NO"},
        {"Piton","NO","NO","SI"},
        {"Tortuga","SI","NO","SI"}
    };  
        
        System.out.println("Contestar si o no");
        System.out.println("Hervivoro?");
        respuesta[0]=leer.next().toUpperCase();
        System.out.println("Mamifero?");
        respuesta[1]=leer.next().toUpperCase();
        System.out.println("Domestico?");
        respuesta[2]=leer.next().toUpperCase();

        int contador=0;
        
         for(int i=0;i<=7;i++){
            for(int j=1;j<=3;j++){
                if(matriz[i][j].equals(respuesta[j-1])){
                    contador++;
                }
            }
            if(contador==3){              
                System.out.println("---------------------------------------");
                System.out.println("El usuario eligio: "+matriz[i][0]);
            }
            contador=0;
        }
    }
}
