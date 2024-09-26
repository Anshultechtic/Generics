package generics;

public class Main {

	interface Player{}

	record BaseballPlayer(String name, String position) implements Player {

		public String getName() {

			return name;
		}

	}

	record footBallPlayer(String name, String position) implements Player {

		public String getName() {

			return name;
		}

	}






	public static void main(String[] args) {



		SportsTeam<footBallPlayer> football = new SportsTeam<>("footballTeam ");

		BaseballPlayer player3 = new BaseballPlayer("Harbhajhan Singh","Bowler");
		football.addTeamMember(player3);
		football.listTeamMembers();




//		BaseballPlayer player3 = new BaseballPlayer("Harbhajhan Singh","Bowler");
//		BaseballPlayer player2 = new BaseballPlayer("Tonny Singh","Keeper");
//		baseBallTeam.addTeamMember(player1);
//		baseBallTeam.addTeamMember(player2);
//		baseBallTeam.listTeamMembers();



	}

	public static void setScoreResult(BaseBallTeam ourTeam, BaseBallTeam theirTeam, int ourScore, int theirScore) {

		String message = ourTeam.setScore(ourScore, theirScore);
		theirTeam.setScore(theirScore, ourScore);
		System.out.printf("%s %s %s %n", ourTeam.toString(), message, theirTeam.toString());

	}

}
