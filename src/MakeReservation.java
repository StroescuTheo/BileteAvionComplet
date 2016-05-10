//import static org.junit.Assert.*;

//import java.io.Console;
import java.util.Random;

import org.junit.Test;

public class MakeReservation {

	
	@Test
	public void test() {
    	 Airport a[]= {new Airport("Roma","Soleni",23,44), new Airport("France","Croisant",11,14), new Airport("Spain","Selerere",76,33),new Airport("Germany","Groaz",43,34)};
    	  Room rooms[]={new Room(34,"Normal"),new Room(35,"Normal"),new Room(36,"King"),new Room(37,"Small"),new Room(38,"Normal")};
		System.out.println("Hello. Welcome to our agency. What is your name?: ");
		String Name="Bob";
		String Surname="Saget";
		String SSN="15156566546";
		String Adress="Street of Sad, Town of Kittens";
		String Phone="03004578965";
		String Email="SomeGuy@gmail.com";
		int Varsta=33;
		
		System.out.println("Nice to meet you "+Name+"\nHere is the rest of your information:");
		Customer c=new Customer(Name,Phone,Surname,SSN,Adress,Email,new Reservation(),new Laguage(),Varsta);
		c.Afisare();
		System.out.print("Please chose one of our perfect Destinations:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i].getLocation());
			if( i<a.length-1)
				System.out.print(",");

				
		}
		System.out.println("");
		Random r=new Random();
		String UserChoise=a[r.nextInt(a.length)].getLocation();
		System.out.println("You chose "+UserChoise);
		
	//	Hotel test=new Hotel("dsa",2,rooms);
		 Hotel h[]= {new Hotel("Sork",5), new Hotel("HonHonOuiOui",1), new Hotel("Gerurnd",3),new Hotel("Nazza",4)};
		
		 
		 
		
		 h[0].sortare(h);	
		 System.out.println("Please Chose from one of the Avaible Hotels in "+UserChoise+": ");
		 for(int i=0;i<h.length;i++)
		 {
			 System.out.print(h[i].getName()+"(");
			 for(int j=0;j<h[i].getStars();j++)
			 {
				 System.out.print("*");
			 }
			 System.out.print(")");
			 if(i<h.length-1)
				 System.out.print(", ");
		 }
		 int intHotel=r.nextInt(h.length);
		 String HotelChoise=h[intHotel].getName();
		 
		// h[0].AddRooms(rooms);
		 
		 System.out.println("");
		 System.out.print("Mr. "+c.getName()+" from "+c.getAdress()+" will be staying at the "+ HotelChoise + " hotel in "+ UserChoise);
		 System.out.println("In room: ");
		 Room x=(h[intHotel].ReturnAnyRoomAvailable());
		 x.Afisare();
//		fail("Not yet implemented");
	}

}
