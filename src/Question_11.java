/*
Write a Java program that takes a number as input and prints its multiplication
table upto 10.
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */

public class Question_11 {
    public static void main(String[] args) {
        /* int a = 1; int b = 2; int c = 3; int d = 4; int e = 5; int f = 6; int g = 7;
        int h = 8; int i = 9; int j = 10;

        int k = h*a; int l= h*b; int m = h*c; int n = h*d; int o = h*e; int p = h*f;
        int q = h*g; int r = h*h; int s = h*i; int t = h*j;


        System.out.println("Expected Output:8x1=" + (k));
        System.out.println("Expected Output:8x2=" + (l));
        System.out.println("Expected Output:8x3=" + (m));
        System.out.println("Expected Output:8x4=" + (n));
        System.out.println("Expected Output:8x5=" + (o));
        System.out.println("Expected Output:8x6=" + (p));
        System.out.println("Expected Output:8x7=" + (q));
        System.out.println("Expected Output:8x8=" + (r));
        System.out.println("Expected Output:8x9=" + (s));
        System.out.println("Expected Output:8x10=" + (t));
*/
        int num = 8;
         for(int i = 1; i<=10; i++)
         {
             System.out.println(num + "*" + i + "=" + (num * i));
         }

    }

}
