import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many names you want : ");
        int length = scan.nextInt();

        String[] names = new String[length];

        for (int i = 0; i < length; i++) {
            System.out.print("Enter Element : ");
            names[i] = scan.next();
        }
        for (int i = 0; i < names.length; i++) {
            
            System.out.print(names[i] + " ");
        }

        scan.close();
    }
}

