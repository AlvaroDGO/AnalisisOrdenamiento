package metodosordenamiento;

public class MergeSort {
    private long   tiempo_inicial, tiempo_final;
    private double tiempo_total;
    private int    datos[];

    public MergeSort() {
        tiempo_inicial = tiempo_final = 0; 
        tiempo_total   = 0.0;
    }
    
    public void ordenar(int arreglo[]) {
        datos          = arreglo.clone();
        tiempo_inicial = System.nanoTime();
        ordenar(arreglo, 0, arreglo.length - 1);
        tiempo_final = System.nanoTime();
        tiempo_total = (double) (tiempo_final - tiempo_inicial) * 1.0e-9;
    }
    
    private void ordenar(int tmpArray[], int left, int right) {
        // verificar por lo menos left sea menor que right
        if (left < right) {
            int center = (left + right) / 2;
            ordenar(tmpArray, left, center);
            ordenar(tmpArray, center + 1, right);
            merge(tmpArray, left, center + 1, right);
        }
    }

    private void merge(int tmpArray[], int leftpos, int rightpos, int rightEnd) {
        // establecer unos limites
        int leftEnd = rightpos - 1;
        int tmpPos  = leftpos;
        // calcular un numero de elementos 
        int numElements = rightEnd - leftpos + 1;
        
        // generar los cambios en el arreglo temporal 
        while (leftpos <= leftEnd && rightpos <= rightEnd) {
            if (datos[leftpos] < datos[rightpos]) {
                tmpArray[tmpPos++] = datos[leftpos++];
            } else {
                tmpArray[tmpPos++] = datos[rightpos++];
            }
        }
        // copiar el resto de la primera mitad
        while (leftpos <= leftEnd) {
            tmpArray[tmpPos++] = datos[leftpos++];
        }        
        // copiar el resto de la segunda mitad
         while (rightpos <= rightEnd) {
          tmpArray[tmpPos++] = datos[rightpos++];
        }  
        
        // actualizar el arreglo 
        // recorrer el arreglo
        for (int i = 0 ; i < numElements ; i++, rightEnd--) {
            datos[rightEnd] = tmpArray[rightEnd];
        }
    }

    public double get_tiempo_total() {
        return tiempo_total;
    }
}