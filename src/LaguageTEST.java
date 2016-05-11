

import org.junit.Test;

public class LaguageTEST {

	@Test
	public void test() {

		Laguage l = new Laguage(40,"Popescu Popescu","0123210230",true,"Bucuresti",false);
		System.out.println("Weight: "+l.getWeight());
		System.out.println("Name: "+l.getPossesorName());
		System.out.println("Phone: "+l.getPhone());
		System.out.println("Fragility: "+l.getFragility());
		System.out.println("Destination: "+l.getDestination());
		System.out.println("Lost: "+l.getLost());
	}

}
