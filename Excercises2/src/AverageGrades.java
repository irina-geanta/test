import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/*Write a application that allows the user to enter up to 20 integer grades into an array. Stop the loop by typing in ‐1.
Your main method should call an Average method that returns the average of the grades.
Use the DecimalFormat class to format the average to 2 decimal places.
*/
public class AverageGrades {
    public static double average(int[] array){
        int sum = 0;
        for (int i =0; i<array.length; i++){
            sum += array[i];
        }
        return (double)sum/array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[20];
        int arraySize = 20;
        label:
        while(true){
            System.out.println("Enter up to 20 integer grades (1 - 10). Press -1 to exit");
            for (int i=0; i<20; i++){
                if (scanner.hasNextInt()){
                    int next = scanner.nextInt();
                    if ((next > 0) && (next <= 10)){
                        array [i] = next;
                    } else if (next == -1){
                        arraySize = i;
                        break label;
                    } else {
                        System.out.println("Not a grade. Enter a grade");
                        i = i - 1;
                    }
                } else{
                    System.out.println("Not an int. Existing..");
                    break label;
                }
            }
            break;
        }
        int [] anotherArray = Arrays.copyOf(array, arraySize);
        System.out.println(Arrays.toString(anotherArray));
        DecimalFormat decimal = new DecimalFormat("#.00");
        System.out.println("Average with 2 decimals: " + decimal.format(average(anotherArray)));
        scanner.close();
    }
}
