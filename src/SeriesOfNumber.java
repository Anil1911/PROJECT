import java.util.Scanner;

public class SeriesOfNumber {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("Enter the n value :");
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            if(i%5 ==0)
            System.out.println(i);
        }
    }
}
