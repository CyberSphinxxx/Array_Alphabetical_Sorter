import java.util.Arrays;
import java.util.Scanner;

public class JLG_ArraySorter_ICT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the type of array to be sorted (1 for numeric and 2 for string): ");
        int arrayType = sc.nextInt();

        if (arrayType == 1) {
            System.out.println("Enter the size of the numeric array: ");
            int size = sc.nextInt();

            int[] numArray = new int[size];
            System.out.println("Enter the elements of the numeric array: ");
            for (int i = 0; i < size; i++) {
                numArray[i] = sc.nextInt();
            }

            System.out.println("Original numeric array: " + Arrays.toString(numArray));
            Arrays.sort(numArray);
            System.out.println("Sorted numeric array: " + Arrays.toString(numArray));
        }
            
            else if (arrayType == 2) {
            System.out.println("Enter the size of the string array:");
            int size = sc.nextInt();

            String[] strArray = new String[size];
            System.out.println("Enter the elements of the string array:");
            sc.nextLine();
            for (int i = 0; i < size; i++) {
                strArray[i] = sc.nextLine();
            }

            System.out.println("Original string array: " + Arrays.toString(strArray));
            Arrays.sort(strArray);
            System.out.println("Sorted string array: " + Arrays.toString(strArray));
        }
            else {
            System.out.println("Invalid input. Try again.");
        }
        sc.close();
    }
}
