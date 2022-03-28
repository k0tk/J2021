package game;

import java.util.Scanner;

public class BlacJak {

	public static void main(String[] args) {
		System.out.println("Game is started!");
        Scanner sc = new Scanner(System.in);
        int compLexlv1 = 0; //3-hard 2 middle 1 easy bot1
        System.out.println("1 - easy");
        System.out.println("2 - midle");
        System.out.println("3 - hard");
        System.out.println("Input mode:");

        compLexlv1 = sc.nextInt();
        int totalBotPoints;
        int totalUserPoints;
        int firstCardPoints, secondCardPoints, nextCardPoints;
        // User logic
        System.out.println("User:");
        firstCardPoints = (int) (Math.random() * 10) + 1;
        System.out.println("1st Card: " + firstCardPoints);
        
        secondCardPoints = (int) (Math.random() * 10) + 1;
        System.out.println("2nd Card: " + secondCardPoints);
        totalUserPoints = firstCardPoints + secondCardPoints;
        
        boolean stopFlag;
        System.out.println("Want next card?  Yes(1) / No(2)");
        stopFlag = sc.nextInt() != 1; // expected 1 or something else (not 1)
        
        while (!stopFlag) {
            // 1 . generate next card
            nextCardPoints = (int) (Math.random() * 10) + 1;
            System.out.println("Card: " + nextCardPoints);
            // 2. calculate total
            totalUserPoints = totalUserPoints + nextCardPoints;
            // 3. Ask user again
            System.out.println("Want next card?  Yes(1) / No(2)");
            stopFlag = sc.nextInt() != 1; // expected 1 or something else (not 1)
        }
        System.out.println("User points: " + totalUserPoints);
        
        
        // Bot logic starts here
        System.out.println("Bot logic is started");
        int firstBotCardPoints = (int) (Math.random() * 10) + 1;
        int secondBotCardPoints = (int) (Math.random() * 10) + 1;
        totalBotPoints = firstBotCardPoints + secondBotCardPoints;
        if(compLexlv1==1) {
        
        while(totalBotPoints < 14  ) {  
            int botNextCard = (int) (Math.random() * 10) + 1;
            totalBotPoints = totalBotPoints + botNextCard;
            System.out.println("Next card for bot");
            
            
            
        } 
        }else if(compLexlv1 == 2) { // middle lvl
            while(totalBotPoints < 14 || totalBotPoints < totalUserPoints) {
                System.out.println("Next card for bot");
                int botNextCard = (int) (Math.random() * 10) + 1;
                totalBotPoints = totalBotPoints + botNextCard;
        
        }
        }else if(compLexlv1 == 3) {
            while(totalBotPoints < 14 || (totalBotPoints < totalUserPoints && totalUserPoints<22)) {
                
                int botNextCard = (int) (Math.random() * 10) + 1;
              
                if(totalBotPoints + botNextCard <22) {
                    totalBotPoints = totalBotPoints + botNextCard;
                }
            }
        }
    
        //Results
        if(totalUserPoints > 21 && totalBotPoints > 21) {
            System.out.println("No winers!");
        } else if(totalUserPoints > 21) {
            System.out.println("Bot won! =[");
        } else if(totalBotPoints > 21) {
            System.out.println("User won! =]");
        } else {
            if(totalBotPoints > totalUserPoints) {
                System.out.println("Bot won! =[");
            } else if(totalUserPoints > totalBotPoints) {
                System.out.println("User won! =]");
            } else {
                System.out.println("No winers!");
            }
        }
        
        
        System.out.println("END.");
    }

}