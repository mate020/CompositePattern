
public class Leaf implements Component {
//hallo
	String name;
	String team;
	int medals;
	int members;

	public Leaf(String name, String team, int medals, int members) {
		super();
		this.name = name;
		this.team = team;
		this.medals = medals;
		this.members = members;
	}

	@Override
	public void showName() {
		System.out.println("Nation: " + team);
		System.out.println("Team: " + name + ", " + "Number of Athletes: " + members + ", " + "Number of Medals: " + medals);
		System.out.println("");
	}
	

	@Override
	public void showOlympics() {
		System.out.println("Nation: "+ team+", Team: " + name +  ", Number of Athletes: " + members);
		
	}

}
