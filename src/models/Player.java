package models;

public class Player {

	private int idPlayer;
	private String firstName;
	private String lastName;
	private int dorsal;
	private int salary;
	private Team team;

	public Player() {
	}

	public Player(int idPlayer, String firstName, String lastName, int dorsal, int salary, Team team) {
		this.idPlayer = idPlayer;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dorsal = dorsal;
		this.salary = salary;
	}

	public int getIdPlayer() {
		return idPlayer;
	}

	public void setIdPlayer(int idPlayer) {
		this.idPlayer = idPlayer;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

}
