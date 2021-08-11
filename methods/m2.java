package methods;

public class m2 {
   int max(int x, int y) 
   {
       if (x<y) {
           return y;
       } else {
           return x;    
       }
   }
   public static void main(String[] args) {
       int a = 10 , b = 34;
       m2 mp = new m2();
       System.out.println(mp.max(a,b));
   }
}
