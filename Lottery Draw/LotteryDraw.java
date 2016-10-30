import java.util.Scanner;

     public class LotteryDraw
     {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner (System.in);
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("Welcome to the Lottery Draw Program!");
            System.out.println("You will enter a total of seven numbers (including a bonus) and if it matches, you'll a win prize!");
            System.out.println("However! You can only enter numbers between 1 and 49 only!");
            System.out.println("Good luck and have fun!");
            System.out.println("Type !P for the prize list or press Enter to skip this part");
            String PLIST = sc.nextLine();
            
             if (PLIST.contains("!P")) {
            System.out.println("-------------PRIZE LIST--------------");
            System.out.println("3 numbers = £10");
            System.out.println("4 numbers = £100");
            System.out.println("5 numbers = £10,000");
            System.out.println("5 numbers + bonus ball = £100,000");
            System.out.println("6 numbers = £1,000,000");
            System.out.println("-------------------------------------");
        }
           
            //User's numbers
            System.out.println("Enter your first number!");
            int num1 = sc.nextInt();
            System.out.println("Enter your second number!");
            int num2 = sc.nextInt();
            System.out.println("Third's a charm!");
            int num3 = sc.nextInt();
            System.out.println("And your fourth number!");
            int num4 = sc.nextInt();
            System.out.println("Least but not last, your fifth number!");
            int num5 = sc.nextInt();
            System.out.println("And lastly, your final number!");
            int num6 = sc.nextInt();
            System.out.println("Enter your lucky bonus number!");
            int BONUS = sc.nextInt();
            
            //Number check for 1-49
        while (num1 > 49 && num1 < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            num1 = sc.nextInt();
        }
        
         while (num2 > 49 && num2 < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            num2 = sc.nextInt();
        }
       
         while (num3 > 49 && num3 < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            num3 = sc.nextInt();
        }
        
        while (num4 > 49 && num4 < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            num4 = sc.nextInt();
        }
        
        while (num5 > 49 && num5 < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            num5 = sc.nextInt();
        }
        
        while (num6 > 49 && num6 < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            num6 = sc.nextInt();
        }
        
        while (BONUS > 49 && BONUS < 1) {
            System.out.println("INVALID! Enter numbers between 1 and 49 ONLY");
            BONUS = sc.nextInt();
        }
        
            //Lottery's numbers
            System.out.println("Rolling numbers...");
            int rngnum1 = (int)Math.random() * 49;
            int rngnum2 = (int)Math.random() * 49;
            int rngnum3 = (int)Math.random() * 49;
            int rngnum4 = (int)Math.random() * 49;
            int rngnum5 = (int)Math.random() * 49;
            int rngnum6 = (int)Math.random() * 49;
            int rngBONUS = (int)Math.random() * 49;
            System.out.println("Number roll complete!");
            
            //Prize counter
            int k = 0; 
            int bonus = 10;
            
            if (num1 == rngnum1) {
                System.out.println("You've matched one number with #1!");
                k++;
            }
            else {
                System.out.println("No numbers matched so far!");
        }
        
           if (num2 == rngnum2) {
                System.out.println("You've matched one number with #2!");
                k++;
            }
            else {
                System.out.println("No numbers matched so far!");
        }
        
           if (num3 == rngnum3) {
                System.out.println("You've matched one number with #3!");
                k++;
            }
            else {
                System.out.println("No numbers matched so far!");
        }
        
           if (num4 == rngnum4) {
                System.out.println("You've matched one number with #4!");
                k++;
            }
            else {
                System.out.println("No numbers matched so far!");
        }
        
           if (num5 == rngnum5) {
                System.out.println("You've matched one number with #5!");
                k++;
            }
            else {
                System.out.println("No numbers matched so far!");
        }
        
           if (num6 == rngnum6) {
                System.out.println("You've matched one number with #6!");
                k++;
            }
            else {
                System.out.println("No numbers matched so far!");
        }
        
         if (BONUS == rngBONUS) {
                System.out.println("You've matched a bonus number! Lucky you!");
                k = k + bonus;
            }
            else {
                System.out.println("No numbers matched so far!");
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
            else {
                System.out.println("Sorry! Looks like you're out of luck today. Try again sometime, okay?");
        }
    }
}


    

            