
import java.util.Scanner;
public class demo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x;
        String s;
            
        x = scan.nextInt();
        scan.nextLine();
        s = scan.nextLine();
          

           
        scan.close();
        System.out.println("Integer: "+s);
        System.out.println("String: "+x);
    }
}