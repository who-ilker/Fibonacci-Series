import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many elements of the Fibonacci series do you want to see : ");
        int N = scanner.nextInt();
        printFibonacciSeries(N);
    }
    static void printFibonacciSeries (int N){
        int n1 = 0, n2 = 1;
        int nextNumber;

        if(N == 1)
            System.out.print(n1);
        else if(N >= 2)
            System.out.print(n1+" "+n2);

        for(int i = 3; i <= N; ++i){
            nextNumber = n1 + n2;
            System.out.print(" "+nextNumber);
            n1 = n2;
            n2 = nextNumber;
            // 0    1           1         2
            //n1   n2          next
        }
    }
}