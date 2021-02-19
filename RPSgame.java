import java.util.Scanner;


public class RPSgame {

    public static void main(String[] args) 
    {
        
        System.out.print("Enter player name: ");
        
        Scanner sc = new Scanner(System.in);
        
        String playerName = sc.nextLine();

        Player player1 = new Player(playerName);
        Player player2 = new Player("Computer");
        
        System.out.println("Enter what hand you would like to choose: Rock, Paper, or Scissors");
        
        String playerHand = sc.next();
        
        player1.setHandName(playerHand);

        
        System.out.println(player1.getName() + " shows "
                + player1.getHandName());
        System.out.println(player2.getName() + " shows "
                + player2.showHand());

        System.out.println(findWinner(player1, player2) + "  wins!");

    }

   
    
    
    
    
    
    
    
    
    
    
    
    public static String findWinner(Player player1, Player player2) {

        String winner = "No one";

        switch(player1.getHandName()){
            
            case "Rock": switch(player2.getHandName()){
                case "Paper": winner = player2.getName();
                break;
                
                case "Scissors": winner = player1.getName();
                break;
            }
            break;
                
                
            case "Paper": switch(player2.getHandName()){
                
                case "Rock": winner = player1.getName();
                break;
                
                case "Scissors": winner = player2.getName();
                break;
                
            }
            break;
            
            
            case "Scissors": switch(player2.getHandName()){
                    
                case "Rock": winner = player2.getName();
                    break;
                    
                case "Paper": winner = player1.getName();
                    break;
                
             }
            break;
            
            
      
        }
       
 
 
        return winner;
    }

}










class Player {

    private String name;
    private int hand;
    private String handName;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHand() {
        return hand;
    }
    
    public String getHandName()
    {
        return handName;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setHand(int hand)
    {
        this.hand = hand;
    }
    
    public void setHandName(String handName)
    {
        this.handName = handName;
    }

    
    
    
    public String showHand() {

        hand = (int) (Math.random() * 3 + 1);
        handName = Integer.toString(hand);
        
        switch(hand){
            
            case 1: handName = "Rock";
            break;
            
            case 2: handName = "Paper";
            break;
            
            case 3: handName = "Scissors";
            break;
        }
        
 
        return handName;
    }
}