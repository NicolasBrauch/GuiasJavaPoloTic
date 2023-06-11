/*Escribir un algoritmo que imprima el listado de los números primos
menores que 200. Aclaración: el número 1 no es primo. */
package guia2;

public class Ejercicio6 {

    public static void main(String[] args) {
        int vector[]=new int[200];
        int controlador_primo =0;
        
        
        for(int n=1;n<=199;n++){
            for(int j=2;j<=n;j++){
                if( n%j==0){
                    controlador_primo++;  
                }
            }
            
            if(controlador_primo==1){
                vector[n]=n;
                controlador_primo=0;
            }else{
                controlador_primo=0;
            }    
        }
        
        
        System.out.println("Numeros primos menores a 200");
        System.out.println("----------------------------------------------");
        for(int i=0;i<=199;i++){
            if (vector[i]!=0){
                System.out.println(vector[i]);
            }
        }
         
    }
    
}
