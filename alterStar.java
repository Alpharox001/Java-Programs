import java.util.Scanner;

public class alterStar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a digit : ");
        int number = scan.nextInt();

            // for (int i = 1; i <= number; i++) {
            //     for (int j = 1; j <= number; j++) {
            //         System.out.print(i);
            //     }
            // }
       
            for (int i = 0; i < number; i++) {
                for (int j = number; j > 0; j--) {
                    for (int k = number; k > i; k--) {
                        System.out.print(j);
                    }
                }
                System.out.println();
            }
        scan.close();
    }
}