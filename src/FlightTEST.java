

import org.junit.Test;

public class FlightTEST {

	@Test
	public void test() {
		Flight f[] = {new Flight(12,"12:45","12:30",4,"14:45","6 libere"),new Flight(11,"12:45","12:30",2,"14:45","65 libere"),new Flight(13,"12:45","12:30",7,"14:45","34 libere"),new Flight(14,"12:45","12:30",3,"14:45","7 libere"),new Flight(15,"12:45","12:30",9,"14:45","8 libere")};
		for (int i=0;i<4;i++)
			System.out.println("Number:"+f[i].getNumber()+"\nDeparture: "+f[i].getDepartureTime()+"\nBoarding: "+f[i].getBoardingTime()+"\nGate: "+f[i].getGate()+"\nArrival "+f[i].getArrivalTime()+"\nSeats "+f[i].getSeats());
		//fail("Not yet implemented");
	}

}
