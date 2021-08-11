package arrays;

public class deleting{
    public static void main(String[] args) {
        int arr[]={5,9,6,10,12,7};
        
        //removing 9 and decreasing the size
        for (int i = 1; i < arr.length-1; i++) {
            arr[i] = arr [i+1];
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
