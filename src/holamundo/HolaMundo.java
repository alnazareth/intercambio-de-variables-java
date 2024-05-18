
package holamundo;


public class HolaMundo {

 
    public static void main(String[] args) {
       
      //intercambio de variables
        int num1=5;
        int num2=4;
        int aux;
        
        System.out.println("El valor de Num1 es:" +num1+" y el valor de Num2 es:" +num2);
        
        
        aux=num1;
        num1=num2;
        num2=aux;
                
        System.out.println("Interfambio aplicado");
        
                
        System.out.println("El valor de Num1 ahora es:" +num1+" y el valor de Num2 ahora es:" +num2);
        

    }
    
}
