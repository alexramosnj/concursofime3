import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {

        int[] listadoNumerosA = {1,6,10,4,9,15,16,5,11};
        int[] listadoNumerosB = {1,6,10,4,9,15,16,5,11};
        List<Integer> listadoNumerosFaltantesB = new ArrayList<Integer>();
        int numeroTemporal = 0;        
        int cantidadElementosListaOrdenada = listadoNumerosA.length;
        int posicionRecorrido = 0;

        //1a forma para ordenar una lista de manera ascendente
        Arrays.sort(listadoNumerosA);
        System.out.println(Arrays.toString(listadoNumerosA));

        //2a forma para ordenar una lista de manera ascendente
        for(int i = 0; i < listadoNumerosB.length - 1; i++){
            for(int j = i + 1; j < listadoNumerosB.length; j++){
                if(listadoNumerosB[i] > listadoNumerosB[j]){
                    numeroTemporal = listadoNumerosB[j];
                    listadoNumerosB[j] = listadoNumerosB[i];
                    listadoNumerosB[i] = numeroTemporal;
                }
            }
        }
        System.out.println(Arrays.toString(listadoNumerosB));

        //Recorrido de lista ordenada para encontrar números faltantes
        for(int i = listadoNumerosA[0]; i < listadoNumerosA[cantidadElementosListaOrdenada - 1]; i++){
            // numeroFaltante = i;
            if(i == listadoNumerosA[posicionRecorrido]){
                posicionRecorrido++;
            }
            else{                
                listadoNumerosFaltantesB.add(i);
            }
        }

        System.out.println(listadoNumerosFaltantesB.toString());
    }
}
