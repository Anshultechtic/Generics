package generics;

public class Main {

	interface Player{}

	record BaseballPlayer(String name, String position) implements Player {

		public String getName() {

			return name;
		}

	}

	public static void main(String[] args) {

		BaseBallTeam ourTeam = new BaseBallTeam("Our Team");
		BaseBallTeam theirTeam = new BaseBallTeam("Their Team");

		SportsTeam ourTeam1 = new SportsTeam("Our Team");
		SportsTeam theirTeam1 = new SportsTeam("Their Team");




		var player1 = new BaseballPlayer("Harbhajhan Singh","Bowler");
		var player2 = new BaseballPlayer("Tonny Singh","Keeper");
		ourTeam.addTeamMember(player1);
		ourTeam.addTeamMember(player2);
		ourTeam.listTeamMembers();



	}

	public static void setScoreResult(BaseBallTeam ourTeam, BaseBallTeam theirTeam, int ourScore, int theirScore) {

		String message = ourTeam.setScore(ourScore, theirScore);
		theirTeam.setScore(theirScore, ourScore);
		System.out.printf("%s %s %s %n", ourTeam.toString(), message, theirTeam.toString());

	}

}
