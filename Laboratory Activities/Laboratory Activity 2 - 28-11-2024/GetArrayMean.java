import java.util.*;

public class GetArrayMean {

    public static double getArrayMean(int[] arr){
        int sum = 0;
        double mean;

        for (int num : arr) {
            sum += num;
        }
        mean = (double) sum /arr.length;

        return mean;
    }

    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        double mean;
        int numOfElements;

        System.out.print("Enter number of elements: ");
        numOfElements = console.nextInt();

        int[] num = new int[numOfElements];

        for (int i = 0; i < numOfElements; i++){
            System.out.print("Enter number: ");
             num[i] = console.nextInt();
        }

        System.out.printf("Mean of array is: %.2f%n", getArrayMean(num));


    }
}
