/*
    EXEMPLO:

    int numbers[] ={1,2,3,4,5,1};//length=6;
    int frequency=2;
    int valorModa=1;


*/

public class Moda {


    public int calculateFrequency(int numbers[], int element)
    {
        int frequency=0;


        for(int i=0; i < numbers.length;i++){

            if( numbers[i] == element)
            {
                frequency++;

            }

        } return frequency;

    }

    // dentro da moda eu calculo a frequencia

    int valorModa=0;
    int frequencia=0;

    public int findModa(int numbers[])
    {
        for (int cont = 0; cont < numbers.length; cont++) {

            int x=calculateFrequency(numbers,numbers[cont]);


            if(x > frequencia)
            {
                frequencia = x;
                valorModa = numbers[cont];
            }
        }

        if(frequencia==1){

            System.out.println("Moda de todos os elementos é igual a 1");
            return -1;
        }
        else{
            return valorModa;
        }
    }


    public static void main(String[]args){

        int numbers[] ={44,25,19,65,21,919,12,78,910,87,85,19,97,2,5,0};//length=6;
        Moda moda = new Moda();
        System.out.println(moda.findModa(numbers));
        //System.out.println(moda.calculateFrequency(numbers,5));




    }


}
