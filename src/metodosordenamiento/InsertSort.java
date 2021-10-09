package metodosordenamiento;

public class InsertSort {
    private long   tiempo_inicial, tiempo_final;
    private double tiempo_total;

    public InsertSort() {
        tiempo_inicial = tiempo_final = 0; 
        tiempo_total = 0.0;
    }

    public void ordenar(int arreglo[]) {
        tiempo_inicial = System.nanoTime();
        ordenar(arreglo, 0, 0);
        tiempo_final = System.nanoTime();
        tiempo_total = (double) (tiempo_final - tiempo_inicial) * 1.0e-9;
    }

    public void ordenar(int arreglo[], int aux, int posicion) {
        for (int i = 0 ; i < arreglo.length ; i++) {
            posicion = i;
            aux      = arreglo[i];
    
            while (posicion > 0 && arreglo[posicion - 1] > aux) {
                arreglo[posicion] = arreglo[posicion - 1];
                posicion--;
            }
    
            arreglo[posicion] = aux;
        }
    }

    public double get_tiempo_total() {
        return tiempo_total;
    }    
}
