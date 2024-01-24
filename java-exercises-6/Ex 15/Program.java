/* Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order. */

import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int[] vectA = new int[10];
        int[] vectB = new int[10];

        System.out.println("Enter 10 random digits:");
        for (int i = 0; i < vectA.length; i++){
            vectA[i] = sc.nextInt();
            vectB[9 - i] = vectA[i];
        }
        
        for (int i : vectA) {
            System.out.printf("%d ", i);
        }
        System.out.println("");
        for (int i : vectB) {
            System.out.printf("%d ", i);
        }
        sc.close();
    }
}
