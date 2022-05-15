// print alternate elments in an array

public class alternateNumInArr {  

    public static void main(String[] args) {  
          
       int arr[] = new int[] {1, 2, 3, 4, 5};  
        System.out.println("The new alternate element position: ");  
         
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.println(arr[i]);  
        }  
    }  
}
