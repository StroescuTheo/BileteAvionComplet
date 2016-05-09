

import org.junit.Test;

public class AirportTest {

	@Test
	public void test() {
		Airport a1 = new Airport("Bucuresti","Coanda",2,4);
		a1.Afisare();
		Airport a2 = new Airport("Bucuresti","Coanda",1,5);
		a2.Afisare();
		Airport a3 = new Airport("Bucuresti","Coanda",3,5);
		a3.Afisare();
		//fail("Not yet implemented");
	}

}