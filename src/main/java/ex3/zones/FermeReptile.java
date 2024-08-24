package ex3.zones;


public class FermeReptile extends Zone {

	@Override
	public double calculerKgsNourritureParJour() {
		return compterAnimaux() * 0.1;
	}
}