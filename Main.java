import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = scn.nextInt();
        int ans = n*n + x*x;
        System.out.println(ans);
    }
}