/**
 * Declares an alpha array of 50 int elements
 * a program that initialises the array
 * so that the first 25 elements are equal to the square of
 * the index variable and the last 25 elements are equal to three times the
 * index variable.
 * Output the array, so that 10 element per line are printed.
 * @author (Heaven IKe)
 * @version (15/10/2022)
 */

public class ArrayProcessing
{
    //main method
    public static void main(String[] args)
    {
        // alpha array
        int [] alpha = new int[50];

        // for loops to initialise the array
        // first 25 elements are equal to the square of the index variable
        for (int i = 0; i <= 24 ;i++){
            alpha[i] = i * i;
        }
        // last 25 elements are equal to three times the index variable
        for (int i = 25; i < alpha.length ;i++){
            alpha[i] = i * 3;
        }
        // output the array
        // 10 element per line
        for (int i = 0; i < alpha.length; ++i){
            if (alpha[i] % 10 == 0){
                System.out.println();
                System.out.print(alpha[i] + " ");
            }
            else {
                System.out.print(alpha[i] + " ");
            }


        }









    }//end of main method

}//end of ArrayProcessing
