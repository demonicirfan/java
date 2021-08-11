package arrays;

public class jaggedArray {
    public static void main(String[] args) {
        int arr[][];
        arr=new int[3][];

        arr[0]=new int[5];
        arr[1]=new int[3];
        arr[2]=new int[8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        for (int x[] : arr) {
            for (int y : x) {
                System.out.print(y+" ");
                
            }
            System.out.println("");

        }
        
    }
}
