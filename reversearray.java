

public class reversearray {
    public static void main(String[] args) {
        
        int[] arr = new int[] {1,2,3,4,5,6};
        System.out.print("the array before reversing is : ");
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("The array after reversing is : ");
        
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + " ");    
        } 
    }
}



