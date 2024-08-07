import java.util.*;
class Marks{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Subject 1 Mark : ");
        int mark1 = input.nextInt();

        System.out.print("Enter Subject 2 Mark : ");
        int mark2 = input.nextInt();

        System.out.print("Enter Subject 3 Mark : ");
        int mark3 = input.nextInt();

        System.out.print("Enter Subject 4 Mark : ");
        int mark4 = input.nextInt();

        System.out.print("Enter Subject 5 Mark : ");
        int mark5 = input.nextInt();

        int total = (mark1+mark2+mark3+mark4+mark5);
            System.out.println("Total Mark Is : "+total );

        double average = ((double)total/5);
        System.out.println("Average Is : "+average );

        if (average>=(double)75){
            System.out.println("Result Is : Pass");
        }else
            System.out.println("Result Is : Fail");

    }
}