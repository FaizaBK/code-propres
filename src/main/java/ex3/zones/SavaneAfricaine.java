package ex3.zones;

public class SavaneAfricaine extends Zone {

	@Override
	public double calculerKgsNourritureParJour() {
		return compterAnimaux() * 10;
	}
}