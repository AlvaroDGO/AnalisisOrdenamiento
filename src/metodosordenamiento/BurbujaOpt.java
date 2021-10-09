package metodosordenamiento;

public class BurbujaOpt {
    private long   tiempo_inicial, tiempo_final;
    private double tiempo_total;

    public BurbujaOpt() {
        tiempo_inicial = tiempo_final = 0; 
        tiempo_total = 0.0;
    }

    public void ordenar(int arreglo[]) {
        tiempo_inicial = System.nanoTime();
        ordenar(arreglo, 0);
        tiempo_final = System.nanoTime();
        tiempo_total = (double) (tiempo_final - tiempo_inicial) * 1.0e-9;
    }

    public void ordenar(int arreglo[], int aux) {
        for (int i = arreglo.length - 1 ; i > 0 ; i--) {
            for (int j = 0 ; j < i ; j++){
                if (arreglo[j] > arreglo[j + 1]){
                    aux            = arreglo[j];
                    arreglo[j]     = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
    }

    public double get_tiempo_total() {
        return tiempo_total;
    }
}
