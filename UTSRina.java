package utsrina;

public class UTSRina {

    public static void main(String[] args) {
        String var1 = " ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        char[] c = {var1.charAt(18),
         var1.charAt(9),
         var1.charAt(14),
         var1.charAt(1),
         var1.charAt(0),
         var1.charAt(2),
         var1.charAt(1),
         var1.charAt(18),
         var1.charAt(15),
         var1.charAt(11),
         var1.charAt(1),
         var1.charAt(8),
        };
        
        for (int i=0;i<c.length;i++){
            System.out.print(c[i]);
        }
        System.out.println();
    }
    
}
