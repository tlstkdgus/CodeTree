import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        if (o == '+') {
            System.out.println(a + " " + o + " " + c + " = " + add(a, c));
        } else if (o == '-') {
            System.out.println(a + " " + o + " " + c + " = " + subtract(a, c));
        } else if (o == '*') {
            System.out.println(a + " " + o + " " + c + " = " + multiply(a, c));
        } else if (o == '/') {
            System.out.println(a + " " + o + " " + c + " = " + divide(a, c));
        } else {
            System.out.println("False");
        }
        
        sc.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;  
    }
}