
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Component teakwondo = new Leaf("Women's Teakwondo", "China", 10, 20);
		Component waterpolo = new Leaf("Waterpolo", "China", 10, 20);
		Component artisticGymnastics = new Leaf("Artistic Gymnastics", "China", 20, 50);
		Component shooting = new Leaf("Men's Shooting", "China", 10, 40);
		Component cycling = new Leaf("Cycling", "Germany", 10, 20);
		Component tennis = new Leaf("Tennis", "Germany", 10, 20);
		Component tableTennis = new Leaf("Table Tennis", "Germany", 20, 40);
		Component football = new Leaf("Football", "Germany", 10, 30);
		Component alpineSki = new Leaf("Alpine Ski", "Italy", 5, 10);
		Component swimmingTeam = new Leaf("Swimming Team", "Italy", 5, 10);

		Composite olympicsTeams = new Composite("OlympicsTeams"); // Olympic

		Composite asiaTeam = new Composite("Asia Team");
		Composite chinaTeam = new Composite("China Team");
		Composite afghanistanTeam = new Composite("Afghanistan Team"); // Asia
		Composite aWomensTeam = new Composite("Womens Team");
		Composite aMensTeam = new Composite("Mens Team");

		Composite europeTeam = new Composite("EuropeTeam"); // Europe

		Composite germanyTeam = new Composite("Germany"); // Germany
		Composite gMenTeam = new Composite("German Men Team");
		Composite gWomenTeam = new Composite("German Wommen Team");

		Composite italyTeam = new Composite("Italy");
		Composite iMenTeam = new Composite("Italy Men Team"); // Italy
		Composite iWomenTeam = new Composite("Italy Women Team");

		olympicsTeams.addComponent(europeTeam); // Europe

		europeTeam.addComponent(germanyTeam); // Germany
		germanyTeam.addComponent(gMenTeam);
		gMenTeam.addComponent(football);
		gMenTeam.addComponent(tableTennis);
		germanyTeam.addComponent(gWomenTeam);
		gWomenTeam.addComponent(cycling);
		gWomenTeam.addComponent(tennis);

		europeTeam.addComponent(italyTeam); // Italy
		italyTeam.addComponent(iWomenTeam);
		iWomenTeam.addComponent(alpineSki);
		italyTeam.addComponent(iMenTeam);
		iMenTeam.addComponent(swimmingTeam);

		olympicsTeams.addComponent(asiaTeam); // Asia

		asiaTeam.addComponent(chinaTeam); // china
		asiaTeam.addComponent(afghanistanTeam);
		chinaTeam.addComponent(aWomensTeam);
		aWomensTeam.addComponent(teakwondo);
		aWomensTeam.addComponent(waterpolo);
		aWomensTeam.addComponent(artisticGymnastics);
		chinaTeam.addComponent(aMensTeam);
		aMensTeam.addComponent(shooting);

		gMenTeam.showOlympics(); //4a
		System.out.println("");
		germanyTeam.showName(); //4b
		System.out.println("");
		asiaTeam.showName(); //4c
		System.out.println("");
//		olympicsTeams.showOlympics(); //4d
		

	}

}
