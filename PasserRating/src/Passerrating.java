import java.util.Scanner;
public class Passerrating {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double a,b,c,d;
		double ATT, COMP, YDS = 0, TD, INT, PasserRating;
		System.out.print("Enter the player's attempts:");
		ATT = console.nextDouble();
		System.out.print("Enter the player's completions:");
		COMP = console.nextDouble();
		System.out.print("Enter the player's touchdowns:");
		TD = console.nextDouble();
		System.out.println("Enter the player's interceptions:");
		INT = console.nextDouble();
		
		a = ((COMP/ATT)-.3)*5;
		b = ((YDS/ATT)-3)*.25;
		c = (TD/ATT)*20;
		d = 2.375 - ((INT/ATT)*25);
		PasserRating = ((a+b+c+d)/6)*100;
		System.out.print("The player's passer rating is %.1%f"+ PasserRating);
		console.close();

	}

}
