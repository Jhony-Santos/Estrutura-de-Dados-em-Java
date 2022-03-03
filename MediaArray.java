
/*A média aritmética de uma array de números é dada pelo somatório do valor de seus elementos dividido pelo número de elementos.
Escreva um programa que receba uma array e compute sua média */


import java.util.Arrays;
import java.util.Scanner;

public class MediaArray {
    public static void main(String[]args){


        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite o tamanho da array que deseja");
        int tamanhoArray=scanner.nextInt();
        int[] numeros = new int[tamanhoArray];

        int soma=0;

        for(int i=0; i<tamanhoArray;i++)
        {
            System.out.println("Digite um número do tipo inteiro: ");
            numeros[i]= scanner.nextInt();
            soma = soma + numeros[i];

        }

        System.out.println("A media do respectivo array é : " + soma/ numeros.length);

    }
}
