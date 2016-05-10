//import static org.junit.Assert.*;

import org.junit.Test;

public class DetaliiZbor {

	@Test
	public void test() {
		//fail("Not yet implemented");
		String a1 = "Ion Marian";
		float a2 = 450;
		int a3 = 12;
		String a4 = "12:45";
		String a5 = "14:45";
		String a6 = "Bucuresti";
		String a7 = "Viena";
		Customer cc = new Customer();
		FlightReservation fr = new FlightReservation();
		Flight f = new Flight();
		Route ro = new Route();
		cc.setName(a1);
		fr.setPrice(a2);
		f.setNumber(a3);
		f.setDepartureTime(a4);
		f.setArrivalTime(a5);
		ro.setDeparture(a6);
		ro.setArrival(a7);
		
		System.out.println("Domnule "+cc.getName());
		System.out.println("Ati facut rezervare pentru zborul "+f.getNumber()+" "+ro.getDeparture()+"-"+ro.getArrival());
		System.out.println("Plecare este la ora "+f.getDepartureTime());
		System.out.println("Avionul ajunge la destinatie la ora "+f.getArrivalTime());
		System.out.println("Pretul zborului este "+fr.getPrice()+" EUR");
		System.out.println("Calatorie placuta!");
		
	}

}
