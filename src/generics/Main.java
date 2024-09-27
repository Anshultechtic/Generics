package generics;

public class Main {

	interface Player{}

	record BaseballPlayer(String name, String position) implements Player {



	}

	record FootballPlayer(String name, String position) implements Player {



	}

	record CricketPlayer(String name, String position) implements Player {



	}






	public static void main(String[] args) {



//		SportsTeam sportFootball = new SportsTeam("FootballTeam ");

//		BaseballPlayer bplayer3 = new BaseballPlayer("Harbhajhan Singh","Bowler");
//		FootballPlayer fplayer3 = new FootballPlayer("Harbhajhan Singh","Bowler");

//		sportFootball.addTeamMember(bplayer3);
//		sportFootball.addTeamMember(fplayer3);
//		sportFootball.listTeamMembers();

		Team<BaseballPlayer> footballPlayerTeam= new Team<>("Messi :");
		Team<CricketPlayer> cricketPlayerTeam = new Team<>("Ganguly :");
		BaseballPlayer baseballPlayer = new BaseballPlayer("Alex Jordan","Mid Fielder");
		CricketPlayer cricketPlayer = new CricketPlayer( "Harbhajhan Singh","Bowler");
		footballPlayerTeam.addTeamMember(baseballPlayer);
		cricketPlayerTeam.addTeamMember(cricketPlayer);
		cricketPlayerTeam.listTeamMembers();
		footballPlayerTeam.listTeamMembers();
		setScoreResult(cricketPlayerTeam,footballPlayerTeam,5,6);





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
	public static void setScoreResult(Team ourTeam, Team theirTeam, int ourScore, int theirScore) {

		String message = ourTeam.setScore(ourScore, theirScore);
		theirTeam.setScore(theirScore, ourScore);
		System.out.printf("%s %s %s %n", ourTeam, message, theirTeam);

	}





}
