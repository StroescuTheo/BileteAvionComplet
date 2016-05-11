//import static org.junit.Assert.*;

import org.junit.Test;

public class AirlineTest extends Airline {

	@Test
	public void test() {
		Airline a[] = { new Airline("BlueAir","0123","Emma","Elicopter",320, new Route()) ,
				new Airline("BlueAir","3210","Marius","Elicopter",130, new Route()) ,
				new Airline("BlueAir","4563","Alin","Elicopter",56, new Route()),
				new Airline("BlueAir","9854","Alex","Elicopter",2 ,new Route())} ;
		Airline.sortare(a); 
		for(int i=0;i<4;i++)
			a[i].Afisare();
		for(int i=0;i<4;i++)
			System.out.println(a[i].getName()+a[i].getPhone()+a[i].getPilotName()+a[i].getPlaneModel()+a[i].getPlaneNo());

	}

}
