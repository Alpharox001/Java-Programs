import java.util.Scanner;
public class TwoThreeMul {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter size");
        int size = scan.nextInt();        //taking user input for size of array

        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {       // loop for taking user input for creating array
            array[i] = scan.nextInt();            
        }

        System.out.print("Array before : ");
        for (int i = 0; i < size; i++) {         
            System.out.print(array[i]+ " ");
        }
        
        for (int i = 0; i < size/2; i++) {
            array[i] *= 2;
            
        }
        
        for (int i = size / 2; i <= size - 1 ; i++) {
            array[i] *= 3;
            
        }
        
        System.out.println();
        System.out.print("Array after : ");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        } 
        
        scan.close();
    }
}
