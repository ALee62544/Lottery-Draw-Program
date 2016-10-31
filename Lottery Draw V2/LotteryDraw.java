import java.util.Scanner;

     public class LotteryDraw
     {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("--------------------------------------------------------------------");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("Welcome to the Lottery Draw Program!");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("You will enter a total of seven numbers (including a bonus) and if it matches, you'll a win prize!");
            System.out.println("However! You can only enter numbers between 1 and 49 only!");
            System.out.println("The bonus ball has to match with your bonus number, anything else can match regardless of the order");
            System.out.println("Good luck and have fun!");
            System.out.println("Type !P for the prize list or press Enter to skip this part");
            String PLIST = sc.nextLine();
            
             if (PLIST.contains("!P")) {
            System.out.println("-----------------PRIZE LIST-----------------");
            System.out.println("3 matching numbers = £10");
            System.out.println("4 matching numbers = £100");
            System.out.println("5 matching numbers = £10,000");
            System.out.println("5 matching numbers + bonus ball = £100,000");
            System.out.println("6 matching numbers = £1,000,000");
            System.out.println("--------------------------------------------");
        }
           
            System.out.println("--------------------------------------------------------------------");
            
            //User's numbers
            System.out.println("Enter your first number!");
            int num1 = sc.nextInt();
            
            //Number check for 1-49
            while (num1 > 49 || num1 < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            num1 = sc.nextInt();
        }
            
            System.out.println("Enter your second number!");
            int num2 = sc.nextInt();
            
             while (num2 > 49 || num2 < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            num2 = sc.nextInt();
        }
            
            System.out.println("Third's a charm!");
            int num3 = sc.nextInt();
            
            while (num3 > 49 || num3 < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            num3 = sc.nextInt();
        }
            
            System.out.println("And your fourth number!");
            int num4 = sc.nextInt();
            
            while (num4 > 49 || num4 < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            num4 = sc.nextInt();
        }
        
            System.out.println("Least but not last, your fifth number!");
            int num5 = sc.nextInt();
            
            while (num5 > 49 || num5 < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            num5 = sc.nextInt();
        }
            
            System.out.println("And lastly, your final number!");
            int num6 = sc.nextInt();
            
             while (num6 > 49 || num6 < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            num6 = sc.nextInt();
        }
        
            System.out.println("Enter your lucky bonus number!");
            int BONUS = sc.nextInt();
            
            while (BONUS > 49 || BONUS < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            BONUS = sc.nextInt();
        }
            
            //Lottery's numbers
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Rolling numbers...");
            int rngnum1 = 1 + (int)(Math.random() * 49);
            int rngnum2 = 1 + (int)(Math.random() * 49);
            int rngnum3 = 1 + (int)(Math.random() * 49);
            int rngnum4 = 1 + (int)(Math.random() * 49);
            int rngnum5 = 1 + (int)(Math.random() * 49);
            int rngnum6 = 1 + (int)(Math.random() * 49);
            int rngBONUS = 1 + (int)(Math.random() * 49);
            System.out.println("Number roll complete!");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Your winning numbers were: " + rngnum1 + ", " + rngnum2 + ", " + rngnum3 + ", " + rngnum4 + ", " + rngnum5 + ", " + rngnum6 + ", *" + rngBONUS);
            System.out.println("Your chosen numbers were: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6 + ", *" + BONUS);
            System.out.println("--------------------------------------------------------------------");
            
            //Prize counter
            int k = 0; 
            int bonus = 10;
            
            if (num1 == rngnum1 || num1 == rngnum2 || num1 == rngnum3 || num1 == rngnum4 || num1 == rngnum5 || num1 == rngnum6 || num1 == rngBONUS) {
                System.out.println("You've matched one number!");
                k++;
            }
            else {
                System.out.println("No numbers matched so far!");
        }
        
           if (num2 == rngnum1 || num2 == rngnum2 || num2 == rngnum3 || num2 == rngnum4 || num2 == rngnum5 || num2 == rngnum6 || num2 == rngBONUS) {
                System.out.println("You've matched one number!");
                k++;
            }
            else {
                System.out.println("No numbers matched so far!");
        }
        
           if (num3 == rngnum1 || num3 == rngnum2 || num3 == rngnum3 || num3 == rngnum4 || num3 == rngnum5 || num3 == rngnum6 || num3 == rngBONUS) {
                System.out.println("You've matched one number!");
                k++;
            }
            else {
                System.out.println("No numbers matched so far!");
        }
        
           if (num4 == rngnum1 || num4 == rngnum2 || num4 == rngnum3 || num4 == rngnum4 || num4 == rngnum5 || num4 == rngnum6 || num4 == rngBONUS) {
                System.out.println("You've matched one number!");
                k++;
            }
            else {
                System.out.println("No numbers matched so far!");
        }
        
           if (num5 == rngnum1 || num5 == rngnum2 || num5 == rngnum3 || num5 == rngnum4 || num5 == rngnum5 || num5 == rngnum6 || num5 == rngBONUS) {
                System.out.println("You've matched one number!");
                k++;
            }
            else {
                System.out.println("No numbers matched so far!");
        }
        
           if (num6 == rngnum1 || num6 == rngnum2 || num6 == rngnum3 || num6 == rngnum4 || num6 == rngnum5 || num6 == rngnum6 || num6 == rngBONUS) {
                System.out.println("You've matched one number!");
                k++;
            }
            else {
                System.out.println("No numbers matched so far!");
        }
        
           if (BONUS == rngBONUS) {
                System.out.println("You've matched a bonus number! Lucky you!");
                System.out.println("--------------------------------------------------------------------");
                k = k + bonus;
            }
            else {
                System.out.println("No numbers matched so far!");
                System.out.println("--------------------------------------------------------------------");
        }
        
            //Winning prize list
            if (k == 3) {
                System.out.println("Congratulations! You've won a hefty £10!");
            }
            else if (k == 4) {
                System.out.println("Congratulations! You've won £100! Spend it wisely");
            }
            else if (k == 5) {
                System.out.println("Congratulations! You've won (almost) half an average year's salary! £10,000!");
            }
            else if (k == 6) {
                System.out.println("CONGRATULATIONS! You might as well retire now. You've won £1,000,000");
            }
            else if (k == 15) {
                System.out.println("CONGRATULATIONS! You've won the BONUS AWARD! A £100,000 to you!");
            }
            else if (k == 16) {
                System.out.println("WOW! INCREDIBLE! You've managed to match every single number! You'll still get £1,000,000 though!");
            }
            else {
                System.out.println("Sorry! Looks like you're out of luck today. Try again sometime, okay?");
        }
    }
}


    

            