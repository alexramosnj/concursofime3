
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {

        int tamanioMatriz = 5;
        int cantidadElementos = tamanioMatriz*tamanioMatriz;
        boolean fin = false;
        int elementoMatriz = 1;
        int renglon = 0; 
        int columna = 0;
        int[][] matriz = new int[tamanioMatriz][tamanioMatriz];
        String direccion = "Derecha";

        for(int i = 0; i < tamanioMatriz; i++){
            for(int j = 0; j < tamanioMatriz; j++){
                System.out.print(matriz[i][j] + " ");
                if(j == tamanioMatriz - 1){
                    // System.out.println("");
                    System.out.print("\n");
                }
            }
        }
        System.out.println("--------------");

        while (fin == false) {

            //Derecha
            if(direccion == "Derecha"){
                for(int i = columna; i < tamanioMatriz; i++){
                    matriz[renglon][i] = elementoMatriz;
                    if(elementoMatriz == cantidadElementos){
                        fin = true;
                        break;
                    }
                    else{
                        elementoMatriz++;
                    }
                    if(i + 1 == tamanioMatriz || matriz[renglon][i + 1] != 0){
                        columna = i;
                        renglon++;
                        direccion = "Abajo";
                        break;
                    }
                }
            }
            //Abajo
            if(direccion == "Abajo"){
                for(int i = renglon; i < tamanioMatriz; i++){
                    matriz[i][columna] = elementoMatriz;
                    if(elementoMatriz == cantidadElementos){
                        fin = true;
                        break;
                    }
                    else{
                        elementoMatriz++;
                    }
                    if(i + 1 == tamanioMatriz || matriz[i + 1][columna] != 0){
                        renglon = i;
                        columna--;
                        direccion = "Izquierda";
                        break;
                    }
                }
            }
            //Izquierda
            if(direccion == "Izquierda"){
                for(int i = columna; i >= 0; i--){
                    matriz[renglon][i] = elementoMatriz;
                    if(elementoMatriz == cantidadElementos){
                        fin = true;
                        break;
                    }
                    else{
                        elementoMatriz++;
                    }
                    if(i - 1 < 0 || matriz[renglon][i - 1] != 0){
                        columna = i;
                        renglon--;
                        direccion = "Arriba";
                        break;
                    }
                }
            }
            //Arriba
            if(direccion == "Arriba"){
                for(int i = renglon; i >= 0; i--){
                    matriz[i][columna] = elementoMatriz;
                    if(elementoMatriz == cantidadElementos){
                        fin = true;
                        break;
                    }
                    else{
                        elementoMatriz++;
                    }
                    if(i - 1 < 0 || matriz[i - 1][columna] != 0){
                        renglon = i;
                        columna++;
                        direccion = "Derecha";
                        break;
                    }
                }
            }           
        }

        for(int i = 0; i < tamanioMatriz; i++){
            for(int j = 0; j < tamanioMatriz; j++){
                if(matriz[i][j] < 10){
                    System.out.print("0" + matriz[i][j] + " ");
                }
                else{
                    System.out.print(matriz[i][j] + " ");
                }
                
                if(j == tamanioMatriz - 1){
                    System.out.print("\n");
                }
            }
        }
    }
}
