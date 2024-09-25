package generics;

import java.util.ArrayList;
import java.util.List;

import generics.Main.BaseballPlayer;

public class BaseBallTeam {

	private String teamName;
	private List<BaseballPlayer> teamMembers = new ArrayList<>();
	private int totalWins;
	private int totalLosses;
	private int totalDraws;

	public BaseBallTeam(String teamname) {
		super();
		teamName = teamname;
	}

	public void addTeamMember(BaseballPlayer player) {

		if (!teamMembers.contains(player)) {
			System.out.println(" is already on this team");
			teamMembers.add(player);
		} else {
			System.out.println(" is already on this team");
		}
	}

	public void listTeamMembers() {

		System.out.println(teamName + "Roster");
		System.out.println(teamMembers);

	}

	public int rankings() {

		return (totalLosses * 2) + totalDraws + 1;
	}

	public String setScore(int ourScore, int theirScore) {

		String message = "lost to";
		if (ourScore > (theirScore)) {
			totalWins++;
			message = "beat";
		} else if (ourScore == theirScore) {
			totalDraws++;
			message = "drew with";
		} else {
			totalLosses++;

		}
		return message;

	}

	@Override
	public String toString() {

		return teamName + ("(Ranked " + rankings() + ")");
	}
	
	
	
	
	
	
	
	

}
