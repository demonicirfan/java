package arrays;

public class rotation2 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;

        int n = 6;

        for (int i = 0; i < n; i++ ) 
            System.out.println(arr[i]+",");
        System.out.println("");

        int x = 20;
        int index = 2;

        for (int i = n; i > index; i--) 
            arr[i]=arr[i-1];
        arr[index]=x;

        for (int i = 0; i < n; i++) 
            System.out.println(arr[i]+",");
        System.out.println("");
        
        
    }
}
