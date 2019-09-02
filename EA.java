import java.util.Scanner;
 
 public class EA{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("Please input the first integer then press 'Enter'");
       int a = input.nextInt();
       System.out.println("Please input the second integer then press 'Enter'");
       int  b = input.nextInt();

       int c = gcd(a, b);
        System.out.printf("gcd(%d, %d) = %d\n", a, b, c);
    }

    public static int gcd(int a, int b){
        while(a != b){
            if(a > b){
                a = a - b;
            }
            else{
                b = b -a;
            }
        }

        return a;
    }
}
