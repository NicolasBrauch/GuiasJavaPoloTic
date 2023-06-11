/*Escribir un programa que ordene un arreglo de números enteros de
manera ascendente.*/
package guia2;

public class Ejercicio3 {

    public static void main(String[] args) {
        int vector[]={2,6,3,1,4,7,9,5,8};
        
        for(int n=0;n<vector.length-1;n++){
            
            for(int indice=0;indice<vector.length-1;indice++){
            
                if(vector[indice]>vector[indice+1]){
                    int aux=vector[indice+1];
                    vector[indice+1]=vector[indice];
                    vector[indice]=aux;
                } 
            }
        n++;
        }
      
        for(int indice=0;indice<vector.length;indice++){
            System.out.println(vector[indice]);
        }
        
    }
    
}
