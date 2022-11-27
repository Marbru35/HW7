package main;

public class Team implements OlympicsTeams {
	
	private String name;
	private int numberAthletes;
	private int numberMedals;
	
	public Team(String name, int athletes, int medals) {
		this.name = name;
		this.numberAthletes = athletes;
		this.numberMedals = medals;
	}

	@Override
	public void printGoldMedals() {
		System.out.println("Team: " + name + ", Number of Gold Medals: " + numberMedals);
	}

	@Override
	public void printAthletes() {
		System.out.println("Team: " + name + ", Number of Athletes: " + numberAthletes);
	}

	// Getter & Setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberAthletes() {
		return numberAthletes;
	}

	public void setNumberAthletes(int numberAthletes) {
		this.numberAthletes = numberAthletes;
	}

	public int getNumberMedals() {
		return numberMedals;
	}

	public void setNumberMedals(int numberMedals) {
		this.numberMedals = numberMedals;
	}

}
