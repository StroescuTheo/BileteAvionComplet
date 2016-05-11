//import static org.junit.Assert.*;

import org.junit.Test;

public class PilotTESTPasager {

	@Test
	public void test() {
		
		String a1="Alex";
		String a2="Oancea";
		String a3="Alex";
		String a4="Mihaila";
		
	   Customer c[]= {new Customer(),new Customer()};
	   Airline a[]={new Airline() ,new Airline() };
	   Flight f[]={new Flight(), new Flight()};
	   c[0].setName(a1);
	   c[1].setName(a2);
	   a[0].setName(a3);
	   a[1].setName(a4);
	   f[0].setNumber(44);
	   f[1].setNumber(28);
	   
	   for(int i=0; i<2; i++)
		   if(c[i].getName() == a[i].getName())
			    System.out.println("Pilotul cu numele "+c[i].getName()+" a fost si pasager al zborului: "+f[i].getNumber());
		   else
			   System.out.println("Pilotul cu numele "+c[i].getName()+" nu a fost niciodata pasager .");
		
		
	//	fail("Not yet implemented");
	}

}
