

import org.junit.Test;

public class AirlineTest {

	@Test
	public void test() {
		Airline a[] = { new Airline("BlueAir","0123","Emma","Elicopter",320) , new Airline("BlueAir","3210","Marius","Elicopter",130) , new Airline("BlueAir","4563","Alin","Elicopter",56) , new Airline("BlueAir","9854","Alex","Elicopter",2)} ;
        Airline.sortare(a); 
        for(int i=0;i<4;i++)
    			a[i].Afisare();
		//fail("Not yet implemented");
	}

}
