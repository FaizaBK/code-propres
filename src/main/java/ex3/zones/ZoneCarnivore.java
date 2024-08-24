package ex3.zones;


public class ZoneCarnivore extends Zone {

	@Override
	public double calculerKgsNourritureParJour() {
		return compterAnimaux() * 10;
	}
}