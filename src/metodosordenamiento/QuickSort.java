package metodosordenamiento;

public class QuickSort {
    private long   tiempo_inicial, tiempo_final;
    private double tiempo_total;

    public QuickSort() { 
        tiempo_inicial = tiempo_final = 0; 
        tiempo_total   = 0.0;
    }
    
    public void ordenar(int arreglo[]) {
        // verificar por lo menos left sea menor que right
        // implementar el metodo de ordenamiento por mezcla
        // verificar que los datos no sean nulos

        if (arreglo != null) {     
            tiempo_inicial = System.nanoTime();
            ordenarQuick(arreglo, 0, arreglo.length - 1);
            // calculamos el tiempo del sistema en milis   
            tiempo_final = System.nanoTime();
        }
        tiempo_total = (double) (tiempo_final - tiempo_inicial) * 1.0e-9;
    }
        
    private void ordenarQuick(int tmpArray[], int izq, int der) {
        // seleccionar el pivote 
        int pivote = tmpArray[izq];
        // realiza la busqueda de izq a derecha
        int i = izq;
        // realiza la busqueda de derecha a izq
        int j = der;
        int aux;
        
        // mientras no se crucen las busquedas ( i y j)
        while (i < j) {
            // buscar elemento mayor al pivote 
            while (tmpArray[i] <= pivote && i < j) i++;
            
            // buscar el elemento menor al pivote
            while(tmpArray[j] > pivote) j--;
                // si no se han cruzado i y j
                // hacer intercambio
            if (i < j) {
            aux         = tmpArray[i];
            tmpArray[i] = tmpArray[j];
            tmpArray[j] = aux;
            }
        }
        // colocar el pivote en su lugar de forma en que tendremos los menores 
        // a su izquierda y los mayores a su derecha
        tmpArray[izq] = tmpArray[j];
        tmpArray[j]   = pivote;
        /// ordenar el sub arreglo izq
        if (izq < j - 1)
            ordenarQuick(tmpArray, izq, j - 1);
            /// ordenar el sub arreglo der
        if (j + 1 < der)
            ordenarQuick(tmpArray, j + 1, der);
    }   

    public double get_tiempo_total() {
        return tiempo_total;
    }
}