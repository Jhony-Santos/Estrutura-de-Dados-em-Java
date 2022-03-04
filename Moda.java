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
        return valorModa;
    }


    public static void main(String[]args){

        int numbers[] ={8,8,8,3,21,8,1,8,8,8,3,31,3,3,3,3};//length=6;
        Moda moda = new Moda();
        System.out.println(moda.findModa(numbers));
        //System.out.println(moda.calculateFrequency(numbers,5));




    }


}
