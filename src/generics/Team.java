package generics;



import java.util.ArrayList;
import java.util.List;

public class Team<T> {

	private String teamName;
	private List<T> teamMembers = new ArrayList<>();
	private int totalWins;
	private int totalLosses;
	private int totalDraws;

	public Team(String teamname) {
		super();
		teamName = teamname;
	}

	public void addTeamMember(T t) {

		if (!teamMembers.contains(t)) {

			teamMembers.add(t);
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
