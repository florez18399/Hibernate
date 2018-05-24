package models;

import java.util.ArrayList;

//@Entity
public class Team {
	private int idTeam;
	private String name;
	private String country;
	private String stadium;

	// @OneToMany
	private ArrayList<Player> listPlayers;

	public Team() {
	}

	public Team(int idTeam, String name, String country, String stadium) {
		this.idTeam = idTeam;
		this.name = name;
		this.country = country;
		this.stadium = stadium;
		listPlayers = new ArrayList<Player>();
	}

	public int getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStadium() {
		return stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public ArrayList<Player> getListPlayers() {
		return listPlayers;
	}

	public void setListPlayers(ArrayList<Player> listPlayers) {
		this.listPlayers = listPlayers;
	}

}
