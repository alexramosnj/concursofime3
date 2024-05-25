import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {

        int continuar = 1;

        List<String> nombres = new ArrayList<>();
        List<Integer> edades = new ArrayList<>();
        List<Integer> alturas = new ArrayList<>();
        int alturaTotal = 0;
        int edadValida = 0;
        int alturaValida = 0;
        String trucoTrato = "";

        int sustos = 0;
        int dulces = 0;

        
        Scanner scanner = new Scanner(System.in);

        
        try{
            while (continuar == 1) {
                System.out.println("Nombre de la niña o niño:");
                nombres.add(scanner.next());
                System.out.println("Edad:");
                edades.add(scanner.nextInt());
                System.out.println("Altura en centímetros:");
                alturas.add(scanner.nextInt());
                System.out.println("¿Otro niña o niño? (1 para 'Sí', 0 para 'No')");
                continuar = scanner.nextInt();
            }

            System.out.println("¿Truco o Trato?");
            trucoTrato = scanner.next();

            if(trucoTrato.equals("Truco")){
                for (String nombre : nombres) {
                    sustos = sustos + (int)Math.floor(nombre.length() / 2 ) ;                    
                }
                for (int edad : edades) {
                    if(edad % 2 == 0){
                        sustos = sustos + 2;
                    }                   
                }
                for (int altura : alturas) {
                    alturaTotal = alturaTotal + altura;                  
                }
                sustos = sustos + ((int)Math.floor(alturaTotal / 100 ) * 3);     
                System.out.println("Cantidad de sustos: " + sustos);         
            }
            else if(trucoTrato.equals("Trato")){
                for (String nombre : nombres) {
                    dulces = dulces + nombre.length();                    
                }
                for (int edad : edades) {
                    if(edad > 10){
                        edadValida = 10;
                    }       
                    else{
                        edadValida = edad;
                    }
                    dulces = dulces + ((int)Math.floor(edadValida / 3 ));            
                }
                for (int altura : alturas) {
                    dulces = dulces + ((int)Math.floor(Math.min(altura,150) / 50 ) * 2);                 
                }    
                System.out.println("Cantidad de dulces: " + dulces);         
    
            }
            else{
                System.out.println("La opción que seleccionaste no es válida. Por favor vuelve a intentar.");
            }
        }
        catch(Exception ex){
            System.out.println("Algo salió mal. Por favor vuelve a intentar.");
        }            
        
    }
}
