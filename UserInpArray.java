import java.util.Scanner;
public class UserInpArray {
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter size");
        int size = scan.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();5
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+ " ");
        }

        scan.close();
    }
}


