public class ReturnIndilces {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6};
        int target = 9;

        System.out.print("The Array is : ");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("The target to find is : "+target);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                
                if(array[i] + array[i+1] == target){
                    System.out.println("Answer" + array[i]);
                }else{
                    System.out.println("Try Again");
                }
            }
        }
    }
}
