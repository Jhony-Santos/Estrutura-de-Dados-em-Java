package Ordenacao;

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

public class QuickSort {

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    static int partition(int[] arr, int low, int high)
    {

        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot)
            {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }


    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high)
        {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to print an array
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver Code
    public static void main(String[] args)
    {

        /*int[] arr = { 25, 57, 48, 37, 12, 92, 86, 33 };
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);*/


        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho da array que desejar: ");

        int tamanho_array= scan.nextInt();
        int [] array= new int[tamanho_array];

        Random random = new Random();

        for (int i =0; i< array.length;i++){
            array[i]=random.nextInt(1000);

        }

        int [] array_ordenado_decrescente = array.clone();


        System.out.print("Array totalmente desordenado: ");
        printArray(array,tamanho_array);


        quickSort(array, 0, tamanho_array - 1);
        System.out.print("Array ordenado: ");
        printArray(array,tamanho_array);


        int[] array2 = new int[tamanho_array];


        int tamanho=tamanho_array;


        for(int i=0; i<array.length; i++){

            array2[tamanho-1]=array[i];
            tamanho = tamanho - 1;
        }

        System.out.print("Conjunto ordenado em ordem decrescente: ");
        printArray(array2,tamanho_array);




        int [] array3 = array.clone();

        double porcentagem = tamanho_array * 0.05;



        for(double i=0;i<=porcentagem; i++){

            int x = random.nextInt(tamanho_array);
            int y = random.nextInt(tamanho_array);

            int aux;
            aux=array3[x];
            array3[x]=array3[y];
            array3[y]=aux;
        }



        System.out.println("5% a 10% das chaves fora de posição: ");
        printArray(array3,tamanho_array);

        System.out.println(porcentagem);





    }


}
