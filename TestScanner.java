package p1;
import java.util.Scanner;
class TestScanner{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Emp_ID, Salary, Name, Status, Grade");
        System.out.printf("Emp_ID=%d, Salary=%.1f, Name=%s, Status=%b, Grade=%c",sc.nextInt(),sc.nextDouble(),sc.next(),sc.nextBoolean(),sc.next().charAt(0));

        sc.close();
    }
}