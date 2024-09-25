package generics;

public class Main {

	record BaseballPlayer(String name, String position) {

		public String getName() {

			return name;
		}

	}

	public static void main(String[] args) {

		BaseBallTeam ourTeam = new BaseBallTeam("Our Team");
		BaseBallTeam theirTeam = new BaseBallTeam("Their Team");
		setScoreResult(ourTeam,theirTeam, 253, 75);
		var player1 = new BaseballPlayer("Harbhajhan Singh","Bowler");
		var player2 = new BaseballPlayer("Tonny Singh","Keeper");




	}

	public static void setScoreResult(BaseBallTeam ourTeam, BaseBallTeam theirTeam, int ourScore, int theirScore) {

		String message = ourTeam.setScore(ourScore, theirScore);
		theirTeam.setScore(theirScore, ourScore);
		System.out.printf("%s %s %s %n", ourTeam.toString(), message, theirTeam.toString());

	}

}
