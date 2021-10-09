package principal;

import metodosordenamiento.Burbuja;
import metodosordenamiento.BurbujaOpt;
import metodosordenamiento.InsertSort;
import metodosordenamiento.MergeSort;
import metodosordenamiento.QuickSort;

public class Principal {
    public static void imprimirArreglo(int arreglo[]) {
        System.out.println();
        for (int i = 0 ; i < arreglo.length ; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arreglo[]  = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int nelementos = arreglo.length;

        int arreglo1[]  = arreglo;
        Burbuja burbuja = new Burbuja();
        burbuja.ordenar(arreglo1);
        imprimirArreglo(arreglo1);
        System.out.println("Tiempo en ordenar arreglo de " + arreglo1.length + " elementos, Burbuja --> " + 
        burbuja.get_tiempo_total() + " s");
        
        int arreglo2[]        = arreglo;
        BurbujaOpt burbujaOpt = new BurbujaOpt();
        burbujaOpt.ordenar(arreglo2);
        imprimirArreglo(arreglo2);
        System.out.println("Tiempo en ordenar arreglo de " + nelementos + " elementos, Burbuja Opt --> " +
        burbujaOpt.get_tiempo_total() + " s");

        int arreglo3[]        = arreglo;
        InsertSort insertSort = new InsertSort();
        insertSort.ordenar(arreglo3);
        imprimirArreglo(arreglo3);
        System.out.println("Tiempo en ordenar arreglo de " + nelementos + " elementos, Insert Sort --> " +
        insertSort.get_tiempo_total() + " s");

        int arreglo4[]      = arreglo;
        MergeSort mergeSort = new MergeSort();
        mergeSort.ordenar(arreglo4);
        imprimirArreglo(arreglo4);
        System.out.println("Tiempo en ordenar arreglo de " + nelementos + " elementos, Merge Sort --> " +
        mergeSort.get_tiempo_total() + " s");

        int arreglo5[]      = arreglo;
        QuickSort quickSort = new QuickSort();
        quickSort.ordenar(arreglo5);
        imprimirArreglo(arreglo5);
        System.out.println("Tiempo en ordenar arreglo de " + nelementos + " elementos, Quick Sort --> " +
        quickSort.get_tiempo_total() + " s");

        System.out.println();
    }
}
