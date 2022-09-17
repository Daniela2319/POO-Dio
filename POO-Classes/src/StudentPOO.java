import java.util.Scanner;

import javax.swing.colorchooser.ColorChooserComponentFactory;

// Criando uma Classes Estudante

public class StudentPOO {
   
       public static void main(String[] args) {

        int num;
        System.out.println("Enter an Integer number");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if ( num %2 ==0)
            System.out.println("Entered number is even");
            else
            System.out.println("Enteren number is ordd");
        

            System.out.println(" ");

            int number = 0, reverse = 0;

            System.out.println("Input your number and press anter: ");
            number = input.nextInt();

            for (; number != 0; number = number/10){
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                System.out.println("The reverse of the given number is " + reverse);
            }
       }

       
        
    
}
