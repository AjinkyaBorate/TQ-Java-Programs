package oops.inheritance;
/*1.Create a class Game having the method rules() and noOfPlayers().
 *  Create a class BasketBall, Soccer, Cricket
	which are child class of Game. Override the above methods and use dynamic method dispatch
	to show the rules and noofPlayers according to the object passed 
*/
class Game{
	public void rules() {
		System.out.println("Rules: ");
	}
	public void noOfPlayers() {
		System.out.println("Number of players: ");
	}
}
class Basketball extends Game{
	@Override
	public void rules() {
		System.out.println("Rules: ");
		System.out.println("Scoring\r\n"
				+ "A field goal is worth two points, unless it's made from behind the three-point line, in which case it's worth three points. \r\n"
				+ "Moving the ball\r\n"
				+ "Players move the ball by dribbling (bouncing it while walking or running) or passing it to a teammate. \r\n"
				+ "Fouls\r\n"
				+ "A player is ejected from the game after one disqualifying foul or two unsportsmanlike fouls. A player is also no longer allowed to play if they have five personal or technical fouls. \r\n"
				+ "");
	}
	@Override
	public void noOfPlayers() {
		System.out.println("Number of players: 5");
	}

}

class Soccer extends Game {
	@Override
	public void rules() {
		System.out.println("Rules: ");
		System.out.println("Number of players\r\n"
				+ "Each team in soccer has a maximum of 11 players, including one goalkeeper. A match cannot start or continue if a team has fewer than seven players. \r\n"
				+ "Substitutions\r\n"
				+ "The number of substitutions allowed depends on the league and level of play. The names of substitutes must be given to the referee before the match starts. \r\n"
				+ "Equipment\r\n"
				+ "Players must wear the same colored jersey or shirt. Shin guards are required for all youth programs, and soccer cleats must be used if cleats are worn. \r\n"
				+ "Kick-offs\r\n" + "Kick-offs occur at the start of each half and after a goal is scored. \r\n" + "");
	}
	@Override
	public void noOfPlayers() {
		System.out.println("Number of players: 11");
	}
}

class Cricket extends Game {
	@Override
	public void rules() {
		System.out.println("Rules: ");
		System.out.println("Field: The field is oval, with a rectangular pitch in the middle. \r\n"
				+ "Wickets: Two sets of three sticks, called wickets, are placed at each end of the pitch. \r\n"
				+ "Turns: Teams take turns batting and fielding, with each turn called an innings. \r\n"
				+ "Scoring: Batsmen score runs by running between the wickets. \r\n"
				+ "Overs: A bowler delivers six balls (deliveries) in an over.");
	}
	@Override
	public void noOfPlayers() {
		System.out.println("Number of players: 11");
	}
}
public class Games {
	public static void main(String[] args) {
		//Dynamic Method Dispatch date:26/09/2024
		Game bb=new Basketball();
		Game sc=new Soccer();
		Game cr=new Cricket();
		
		System.out.println("Basketball:------------------------------------------------------------");
		bb.noOfPlayers();
		bb.rules();
		System.out.println("Soccer:------------------------------------------------------------");
		sc.noOfPlayers();
		sc.rules();
		System.out.println("Cricket:------------------------------------------------------------");
		cr.noOfPlayers();
		cr.rules();
	}
	
}
