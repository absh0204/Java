package junit;

public class Main {
    public static double multiply(double a, double b){
        return a*b;
    }
    public static void main(String[] args) {
        for(double i=1.1 ;i<5;i=i+1){
            System.out.print(multiply(i,i+1)+" ");
        }
    }
}