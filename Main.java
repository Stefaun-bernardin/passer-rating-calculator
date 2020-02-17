import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   double ATT = 17;
   double COMP = 15;
   double TD = 3;
   double INT = 0;
   double YDS= 223;

   double a = (COMP/ATT -.3) *5;
   double b = (YDS/ATT-3)*.25;
   double c = (TD/ATT)*20;
   double d = 2.375 - (INT/ATT*25);

   double PR = ((a+b+c+d) /6)*100;

   Scanner scan = new Scanner(System.in);

   System.out.print("Enter the full name of the quarterback: ");
   String name = scan.next();

   System.out.println("The passer raing for " + name + " is "+ PR);

  }
}