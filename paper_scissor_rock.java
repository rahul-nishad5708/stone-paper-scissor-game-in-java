import java.util.Scanner;

public class paper_scissor_rock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Eneter the no. 0-Scissor,1-paper,2-Rock : ");
            int Game = sc.nextInt();
            
            int randomnum = (int)(Math.random()*2);
            System.out.println(randomnum);
            
            if(randomnum>Game ){
                System.out.println("loss the game.");
            }
            else if(randomnum==Game){
                System.out.println("draw the match");
            }
            else{
                System.out.println("you won the Game.");
            }
        }
            sc.close();
    }
}
