//arrange names in alphabetical order

import java.util.Arrays;

class Alphabetical {
    public static void main(String[] args){
        
        int n = 4;
        
        String names[] = { "Rick", "Morty", "Homer", "Bart" };
        
        Arrays.sort(names);
        
        System.out.println("The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}
    

