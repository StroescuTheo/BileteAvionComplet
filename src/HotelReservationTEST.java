

import org.junit.Test;

public class HotelReservationTEST {

	@Test
	public void test() {
		
		HotelReservation hr[] = {new HotelReservation(3, 450, "dublu", 1) , new HotelReservation(2, 257, "single" , 2) };
		for(int i=0 ; i<2; i++)
			hr[i].Afisare();
		
		//fail("Not yet implemented");
	}

}
