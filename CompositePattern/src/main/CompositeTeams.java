package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CompositeTeams implements OlympicsTeams {
	
	private List<OlympicsTeams> teams = new ArrayList<>();
	private String name;
	
	public CompositeTeams(String name) {
		this.name = name;
		//this.teams.addAll(Arrays.asList(olympicsTeams));
	}
	
	public void add(OlympicsTeams team) {
		this.teams.add(team);
	}
	
	public void remove(OlympicsTeams team) {
		this.teams.add(team);
	}

	@Override
	public void printGoldMedals() {
		System.out.println(this.name);
		for (OlympicsTeams olympics : teams) {
			olympics.printGoldMedals();
		}
	}

	@Override
	public void printAthletes() {
		System.out.println(this.name);
		for (OlympicsTeams olympics : teams) {
			olympics.printAthletes();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
