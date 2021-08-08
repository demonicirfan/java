package stringMethods;

public class stringMethod {
    public static void main(String[] args) {
         String str = new String("Netbeans");
          
          System.out.println(str.toUpperCase());
          str = str.toLowerCase();
          str=str.replace('N','n');
          System.out.println(str);
        }
}
