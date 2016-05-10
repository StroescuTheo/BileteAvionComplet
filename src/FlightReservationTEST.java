

import org.junit.Test;

public class FlightReservationTEST {

	@Test
	public void test() {
		FlightReservation f[] = {new FlightReservation(11,200,450),new FlightReservation(12,260,600),new FlightReservation(13,300,150),new FlightReservation(14,400,350)};
		for(int i=0;i<3;i++)
			System.out.println("FlightNo: "+f[i].getFlightNo()+"\nNoOfSeats: "+f[i].getNoOfSeats()+"\nPrice:"+f[i].getPrice());
		//fail("Not yet implemented");
	}

}
