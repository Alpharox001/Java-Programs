//Java Program to find the number of elements present in an array

class calcNuminArray{  
    public static void main(String args[]){  

        int a[] = {6, 3, 7, 0, 6, 5, 4, 7, 3, 4, 5, 2, 6}; 
        int count=0;           
        
        System.out.println("The entered elements are: ");
        for(int i : a){

            System.out.print(a[i]+" ");
            count++;
        }
        System.out.println("");
        System.out.println("The total no. of elements in an array is "+count);
        
    }
}