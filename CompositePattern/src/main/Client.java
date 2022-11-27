package main;

public class Client {

	public static void main(String[] args) {
		//// bottom-up Asia Team
		
		Team teakwondo = new Team("Women´s Teakwondo", 4, 4);
		Team waterpolo = new Team("Women´s Waterpolo", 8, 3);
		Team atritisticGymnastics = new Team("Women´s Artistic Gymnastics", 5, 1);
		
		CompositeTeams womenChina = new CompositeTeams("China-Women");
		womenChina.add(teakwondo);
		womenChina.add(waterpolo);
		womenChina.add(atritisticGymnastics);
		
		Team shooting = new Team("Men´s Shooting", 3, 0);
		
		CompositeTeams menChina = new CompositeTeams("China-Men");
		menChina.add(shooting);
		
		// China
		CompositeTeams china = new CompositeTeams("China");
		china.add(womenChina);
		china.add(menChina);
		
		// Afghanistan
		CompositeTeams afghanistan = new CompositeTeams("Afghanistan");
		
		CompositeTeams asia = new CompositeTeams("Asia");
		asia.add(china);
		asia.add(afghanistan);
		
		// bottom-up Europe Team
		
		Team cycling = new Team("Women´s Cycling", 5, 1);
		Team tennis = new Team("Women´s Tennis", 9, 2);
		
		CompositeTeams womenGermany = new CompositeTeams("Germany-Women");
		womenGermany.add(cycling);
		womenGermany.add(tennis);
		
		Team tableTennis = new Team("Men´s Table Tennis", 7, 3);
		Team footballGer = new Team("Men´s Football", 1, 0);
		
		CompositeTeams menGermany = new CompositeTeams("Germany-Man");
		menGermany.add(tableTennis);
		menGermany.add(footballGer);
		
		// Germany
		CompositeTeams germany = new CompositeTeams("Germany");
		germany.add(womenGermany);
		germany.add(menGermany);
		
		// bottom-up Italy Team
		
		Team alpineSky = new Team("Women´s Alpine Sky", 5, 3);
		
		CompositeTeams womenItaly = new CompositeTeams("Italy-Women");
		womenItaly.add(alpineSky);
		
		Team footballIta = new Team("Men´s Football", 1, 1);
		Team swimming = new Team("Men´s Swimming Team", 4, 0);
		
		CompositeTeams menItaly = new CompositeTeams("Italy-Men");
		menItaly.add(footballIta);
		menItaly.add(swimming);
		
		// Italy
		CompositeTeams italy = new CompositeTeams("Italy");
		italy.add(womenItaly);
		italy.add(menItaly);
		
		CompositeTeams europe = new CompositeTeams("Europe");
		europe.add(germany);
		europe.add(italy);
		
		// Africa Team
		CompositeTeams africa = new CompositeTeams("Africa");
		
		// South America Team
		CompositeTeams southAmerica = new CompositeTeams("South America");
		
		// Olympics Team
		CompositeTeams olympics = new CompositeTeams("Olympics Teams");
		olympics.add(asia);
		olympics.add(africa);
		olympics.add(europe);
		olympics.add(southAmerica);
				
		menGermany.printAthletes();
		System.out.println("---------------------------------------------------");
		germany.printGoldMedals();
		System.out.println("---------------------------------------------------");
		asia.printGoldMedals();
		System.out.println("---------------------------------------------------");
		olympics.printAthletes();
	}
}
