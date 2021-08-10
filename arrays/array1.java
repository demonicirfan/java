package arrays;

public class array1 {
    public static void main(String[] args) {
        //syntax
        int A[]=new int[5];
        // arrays in java are object and are created in heap
        // A[] --> refremce (can be anywhere in stack or heap)  int[5] --> [][][][][] object (created in heap)
        System.out.println(A.length);

        int B[]= {1,2,3,4,5};
       
        //for loop in array
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }

        //for each loop
        for (int j : B) {
            System.out.println(j);
        }

        //this is also valid
        int[] D= new int[5];
    }
}