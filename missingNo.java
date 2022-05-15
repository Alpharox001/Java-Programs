//find missing no in arr

class missingNo {

    public static void main(String[] args) {
  
      int[] input = {7, 9, 9, 9, 1, 2, 3, 5, 1, 5};
  
  
      int[] register = new int[input.length];
  
      for (int i : input) {
        register[i] = 1;
      }

      System.out.println("missing numbers in given array");
  
      for (int i = 1; i < register.length; i++) {
        if (register[i] == 0) {
          System.out.println(i);
        }
      }
    }
  
}