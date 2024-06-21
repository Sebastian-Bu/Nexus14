import java.util.Scanner;

/**
 * main
 */
public class main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many elements are in the Array: ");
        int n = scanner.nextInt();
        System.out.println("Please add " + n + " numbers to the Array: ");
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The max in that Array is : " + maxFinder(numbers));
        scanner.close();
    }

    public static int maxFinder(int[] numbers){
        int max = 0;

        for(int i = 0; i < numbers.length-1; i++){
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
}