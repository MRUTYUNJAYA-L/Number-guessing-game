import javax.swing.*;

public class main{
    public static void main(String args[]){
        int computern=(int)(Math.random()*100+1);
        int userAnswer=0;
        System.out.println("The correct guess would be:"+computern);
        int count=1;
        while(userAnswer!=computern){
            String response= JOptionPane.showInputDialog(null,"Enter a guess between  1 and 100","Guessing game",3);
            userAnswer=Integer.parseInt(response);
            JOptionPane.showMessageDialog(null," "+determineGuess(userAnswer,computern,count));

        }
    }
    public static String determineGuess(int userAnswer,int computerNumber,int count){
        if(userAnswer<=0|| userAnswer>100)
            return "Your guess is invalid";
        else if ((userAnswer==computerNumber))
            return "Correct! \n Total Guesses:"+count;
        else if(userAnswer>computerNumber)
            return ("Your guess is too high, try again,\n Try Number:"+count);
        else if (userAnswer<computerNumber)
            return "Your guess is too low, try again.\n try number:"+count;
        else
            return "your guess is incorrect \n Try number:"+count;

    }
}