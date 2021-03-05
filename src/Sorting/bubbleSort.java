package Sorting;
//Is an algorithm whose performance degrades quickly
public class bubbleSort {

    public static void main(String[] args) {


        int[] intArray = { 1,5,6,98,23,45,63,11,23 };

        //the lastUnsortedIndex is the last index for the unsorted portion
        //need to loop from end to 0
        for (int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            //here we need to go from 0 to the unsorted portion
            for (int i = 0; i<lastUnsortedIndex; i++)
            {
                //need to compare the values at i and i +1
                if(intArray[i] > intArray[i+1] ){

                    //call the swap function here
                    swap(intArray, i , i+1);


                }

            }
        }

        for (int i = 0; i < intArray.length; i++  ){
            System.out.println(intArray[i]);
        }




    }

    public static void swap(int[] array, int i, int j)
    {
        //check if they are the same
        if (i == j){
            return;
        }
        //create a temp varaible to store i
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;


    }





}


