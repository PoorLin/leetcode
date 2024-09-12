package cert;

public class Cert2 {
    public static void main(String[] args) {
     char letter = 'b';
     int i = 0;
     switch (letter){
         case 'a':
             i++;
             System.out.println('a');

         case 'b':
                 i++;
             System.out.println('b');
         case 'c' | 'd':
                 i++;
             System.out.println("cd");
         case 'e':
             i++;
             System.out.println('e');
         case 'f':
             i++;
             System.out.println('f');

         default:
             System.out.println(letter);
     }
        System.out.println(i);

    }
}
