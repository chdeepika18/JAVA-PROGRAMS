import java.util.Scanner;
public class TernaryExample{
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Marks:");

        int marks = 70sc.nextInt();

        String result = (marks>=35)? "PASS" : "FAIL";

        System.out.println(result);
    
    }
}