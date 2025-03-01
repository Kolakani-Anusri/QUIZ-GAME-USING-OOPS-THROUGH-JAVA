import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
class mcq{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n**LOGIN*");
        System.out.println("Enter user name");
        String name = sc.nextLine();
        System.out.println("\nEnter password");
        String password = sc.nextLine();
        System.out.println("\n***MCQ Quiz*");
        System.out.println("Welcome "+name+" for MCQ quiz");
        System.out.println("Rules:- ");
             System.out.println("Game contain 10 questions");
        System.out.println("Each question contain 30 seconds");
        System.out.println("Each correct answer contain 10 points");
        System.out.println("Enter 1 to start the quiz ");
        System.out.println("Enter 2 to logout");
        int option = sc.nextInt();
        int count = 0;
        if(option == 1){
         // Question 1
        System.out.println("\nQuestion - 1");
        System.out.println("What is the capital of India?");
        System.out.println("1. Hyderabad");
        System.out.println("2. Mumbai");
        System.out.println("3. New Delhi");
        System.out.println("4. Bangalore");
        System.out.print("\nSelect your option (1, 2, 3, or 4): ");
        Timer timer1 = new Timer();
        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nTime's up! Auto-submitting the question...");
                System.out.println("Enter 0 to display next question: ");
            }
									                            	        
 }, 30000);  
        int choice1 = sc.nextInt();
        timer1.cancel();
        int answer1 = 3; // Correct answer is 3 (New Delhi)
        if (choice1 == answer1) {
            count++;
        }
        // Question 2
        System.out.println("\nQuestion - 2");
        System.out.println("Which planet is known as the Red Planet?");
        System.out.println("1. Venus");
        System.out.println("2. Jupiter");
        System.out.println("3. Mars");
        System.out.println("4. Saturn");
        System.out.print("\nSelect your option (1, 2, 3, or 4): ");
        Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nTime's up! Auto-submitting the question...");
                System.out.println("Enter 0 to display next question: ");
            }
									
										              	      
 }, 30000);        
        int choice2 = sc.nextInt();
        timer2.cancel();
        int answer2 = 3;
        if (choice2 == answer2) {
            count++;
        }
        // Question 3
        System.out.println("\nQuestion - 3");
        System.out.println("Who is the author of the famous play Romeo and Juliet?");
        System.out.println("1. Charles Dickens");
        System.out.println("2. William Shakespeare");
        System.out.println("3. Jane Austen");
        System.out.println("4. Leo Tolstoy");
        System.out.print("\nSelect your option (1, 2, 3, or 4): ");
        Timer timer3 = new Timer();
        timer3.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("\nTime's up! Auto-submitting the question...");
                System.out.println("Enter 0 to display next question: ");
            }
									
										              	        
 }, 30000);
        int choice3 = sc.nextInt();
        timer3.cancel();
        int answer3 = 2;
        if (choice3 == answer3) {
            count++;
        }
        // Question 4
        System.out.println("\nQuestion - 4");
        System.out.println("What is the largest mammal on Earth?");
        System.out.println("1. African Elephant");
        System.out.println("2. Blue Whale");
        System.out.println("3. Giraffe");
        System.out.println("4. Polar Bear");
        System.out.print("\nSelect your option (1, 2, 3, or 4): ");
        Timer timer4 = new Timer();
        timer4.schedule(new TimerTask() {
            @Override
            public void run(){
                System.out.println("\nTime's up! Auto-submitting the question...");
                System.out.println("Enter 0 to display next question: ");
            }
											                     },30000);
        int choice4 = sc.nextInt();
        timer4.cancel();
        int answer4 = 2;
        if (choice4 == answer4) {
            count++;
        }
        // Question 5
        System.out.println("\nQuestion - 4");
        System.out.println("What is the currency of Japan?");
        System.out.println("1. Yen");
        System.out.println("2. Dollar");
        System.out.println("3. Euro");
        System.out.println("4. Rupee");
        System.out.print("\nSelect your option (1, 2, 3, or 4): ");
        Timer timer5 = new Timer();
        timer5.schedule(new TimerTask() {
            @Override
            public void run(){
                System.out.println("\nTime's up! Auto-submitting the question...");
                System.out.println("Enter 0 to display next question: ");
            }
        },30000);
    										             	  	   int choice5 = sc.nextInt();
        timer5.cancel();
        int answer5 = 1;
        if (choice5 == answer5) {
            count++;
        }
        // Question 6
        System.out.println("\nQuestion - 6");
        System.out.println("Which gas makes up the majority of Earth's atmosphere?");
        System.out.println("1. Oxygen");
        System.out.println("2. Carbon Dioxide");
        System.out.println("3. Nitrogen");
        System.out.println("4.  Hydrogen");
        System.out.print("\nSelect your option (1, 2, 3, or 4): ");
        Timer timer6 = new Timer();
        timer6.schedule(new TimerTask() {
            @Override
            public void run(){
                System.out.println("\nTime's up! Auto-submitting the question...");
                System.out.println("Enter 0 to display next question: ");
            }
        },30000);

      
int choice6 = sc.nextInt();
        timer6.cancel();
        int answer6 = 3;
        if (choice6 == answer6) {
            count++;
        }
        // Question 7
        System.out.println("\nQuestion - 7");
        System.out.println("Who was the first woman to fly solo across the Atlantic Ocean?");
        System.out.println("1. Amelia Earhart");
        System.out.println("2. Marie Curie");
        System.out.println("3. Rosa Parks");
        System.out.println("4. Florence Nightingale");
        System.out.print("\nSelect your option (1, 2, 3, or 4): ");
        Timer timer7 = new Timer();
        timer7.schedule(new TimerTask() {
            @Override
            public void run(){
                System.out.println("\nTime's up! Auto-submitting the question...");
                System.out.println("Enter 0 to display next question: ");
            }
        },30000);
        int choice7 = sc.nextInt();
											            timer7.cancel();

        int answer7 = 1;
        if (choice7 == answer7) {
            count++;
        }
        // Question 8
        System.out.println("\nQuestion - 8");
        System.out.println("In which year did Christopher Columbus reach the Americas?");
        System.out.println("1. 1492");
        System.out.println("2. 1510");
        System.out.println("3. 1607");
        System.out.println("4. 1776");
        System.out.print("\nSelect your option (1, 2, 3, or 4): ");
        Timer timer8 = new Timer();
        timer8.schedule(new TimerTask() {
            @Override
            public void run(){
                System.out.println("\nTime's up! Auto-submitting the question...");
                System.out.println("Enter 0 to display next question: ");
            }
        },30000);
        int choice8 = sc.nextInt();
											        timer8.cancel();
        int answer8 = 1;

        if (choice8 == answer8) {
            count++;
        }
        // Question 9
        System.out.println("\nQuestion - 9");
        System.out.println("What is the longest river in the world?");
        System.out.println("1. Mississippi River");
        System.out.println("2. Nile River");
        System.out.println("3. Amazon River");
        System.out.println("4. Yangtze River");
        System.out.print("\nSelect your option (1, 2, 3, or 4): ");
        Timer timer9 = new Timer();
        timer9.schedule(new TimerTask() {
            @Override
            public void run(){
                System.out.println("\nTime's up! Auto-submitting the question...");
                System.out.println("Enter 0 to display next question: ");
            }
        },30000);
        int choice9 = sc.nextInt();
      timer9.cancel();
        int answer9 = 2;
        if (choice9 == answer9) {
            count++;
        }

        // Question 10
        System.out.println("\nQuestion - 10");
        System.out.println("Who is the current Prime Minister of India");
        System.out.println("1.  Narendra Modi");
        System.out.println("2.  Manmohan Singh");
        System.out.println("3.  Rahul Gandhi");
        System.out.println("4.  Atal Bihari Vajpayee");
        System.out.print("\nSelect your option (1, 2, 3, or 4): ");
        Timer timer10 = new Timer();
        timer10.schedule(new TimerTask() {
            @Override
            public void run(){
                System.out.println("\nTime's up! Auto-submitting the question...");
            }
        },30000);
        int choice10 = sc.nextInt();
        timer10.cancel();
  
int answer10 = 1;
        if (choice10 == answer10) {
            count++;
        }
        System.out.println("\nYour score is "+count*10 + " out of 100 points your answered "+count+" questions correctly");
    }
    else
  {
        System.out.println("*LOGOUT*");
    }
    }
}
