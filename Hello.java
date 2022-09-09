package hell;
import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		
		int x = 0;
Scanner input = new Scanner(System.in);
int n = (int)(Math.random()*3);

System.out.println("Enter your move, for quit the game type exit");
String s=input.nextLine();

switch(s){
case "scissors":x= 0; break;
case "Scissors":x= 0; break;
case "rock":x=1; break;
case "Rock":x=1; break;
case "Paper":x=2; break;
case "paper":x=2; break;
default : System.out.println("You entered a invalid value"); break;
}
if((x==0&&n==1)||(x==1&&n==2)||(x==2&&n==0)) {
	System.out.printf("%s","You just lost :'(");
}
else if((x==1&&n==0)||(x==2&&n==1)||(x==0&&n==2)) {
System.out.printf("%s", "You just won the game ,congratulations");

	
}
	}
}
