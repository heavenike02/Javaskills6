/**
 *a program that prompts the user to enter a class size and then student
 * names followed by their test score. The program outputs the following
 * information:
 * Use	two	arrays	of	the	same	size:	one	for	names	and	one	for	test	scores.	A	student
 * name	and	the	corresponding test	score	are	elements	of	two	different	arrays,	but
 * have	the	same	index
 * @author (Heaven IKe)
 * @version (15/10/2022)
 */
//importing  scanner
import java.util.Scanner;
public class TestScores
{


    //main method
    public static void main(String[] args)
    {
        //variables and arrays
        int classSize;
        double classAverage;
        String outputStr;
        int highestScore = 0;

        // declaring scanner
        Scanner input = new Scanner(System.in);

        //prompting user to enter class size
        System.out.println("Enter class size: (In digits)");
        classSize = input.nextInt();

        // verify it's a positive integer
        while (classSize <= 0){
            System.out.println("Enter class size: (In digits)");
            classSize = input.nextInt();
        }

        //Creating string array
        String[] nameArray = new String[classSize];
        //Creating score array
        int[] scoreArray = new int[classSize];
        // user prompt to enter name and score for each student
        // using for loop to cycle through the index of the arrays
        for (int i = 0; i < classSize; i++) {
            outputStr = String.format("Enter Student %s (Name , Score) :", i+1);
            System.out.println(outputStr);
            //Adding student  name  to array
            nameArray[i] = input.next();
            //Adding student score to array
            scoreArray[i] = input.nextInt();
        }
        //getting scoreArray average
        int sum = 0;
        for (int i = 0; i < scoreArray.length; i++) {
            sum += scoreArray[i];
        }
        classAverage = sum / classSize;

        System.out.printf("List of students below the below the class average %s :", classAverage);

        //finding scores below average in scoreArray
        for (int i = 0; i < scoreArray.length; i++) {
            //`if score is below average
            if (scoreArray[i] < classAverage) {
                //print student name
                System.out.println(nameArray[i]);

            }
        }
        //finding the highest score in scoreArray
        for (int i = 0; i < scoreArray.length; i++) {
            if (scoreArray[i] > highestScore) {
                highestScore = scoreArray[i];
            }

        }
        System.out.printf("List of students with the highest score  %s :", highestScore);
        //finding the names that match the high score
        for (int i = 0; i < scoreArray.length; i++) {
            if (scoreArray[i] == highestScore) {
                //print student name
                System.out.print("\n" + nameArray[i]);
            }
        }




    }//end of main method
}//end of TestScores