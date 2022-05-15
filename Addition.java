//Addition Of Two numbers

import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        int num1, num2, result;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first no. : ");
        num1 = scan.nextInt();
        System.out.print("Enter second no. : ");
        num2 = scan.nextInt();

        scan.close();
        result = num1 + num2;

        System.out.println("result is = " +result);
    }
}
