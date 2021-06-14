public class SumAverageInt {
    // Write a program called SumAverageInt to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average.

    private static int sum(){
        int sum = 0;
        for(int i = 1; i < 101; i++){
            sum += i;
        }
        return sum;
    }
    private static int average(){
        return sum()/100;
    }
    public static void main(String[] args) {
        System.out.println("Sum for numbers 1 to 100 is: " + sum());
        System.out.println("Average for numbers 1 to 100 is: " + average());
    }
}
