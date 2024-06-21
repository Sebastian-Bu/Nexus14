import java.util.Scanner;

/**
 * Sum
 */
public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce 2 numbers: ");
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();

        System.out.println("The sum of the 2 numbers is : " + sum(no1, no2));

        scanner.close();
    }


    public static int sum(int no1 , int no2){
        return no1 + no2;
    }
}