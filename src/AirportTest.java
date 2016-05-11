

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
		for(int i=1;i<2;i++)
		{
			System.out.println(a1.getLocation()+a1.getName()+a1.getGate()+a1.getTerminal());
			System.out.println(a2.getLocation()+a2.getName()+a2.getGate()+a2.getTerminal());
			System.out.println(a3.getLocation()+a3.getName()+a3.getGate()+a3.getTerminal());
		}


	}

}