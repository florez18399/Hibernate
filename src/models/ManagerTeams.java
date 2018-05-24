package models;

import java.util.ArrayList;

public class ManagerTeams {
	private ArrayList<Team> teams;
	private String nameLeague;

	public ManagerTeams(ArrayList<Team> teams, String nameLeague) {
		this.teams = teams;
		this.nameLeague = nameLeague;
	}

	public void addTeam(Team team) {
		teams.add(team);
	}

	public void addPlayerToTeam(Player player, Team team) {
		team.getListPlayers().add(player);
	}

	public ManagerTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}

	public ArrayList<Team> getTeams() {
		return teams;
	}

	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}

	public String getNameLeague() {
		return nameLeague;
	}

	public void setNameLeague(String nameLeague) {
		this.nameLeague = nameLeague;
	}

}
