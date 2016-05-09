

import org.junit.Test;

public class RoomTEST {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Room r1 = new Room(1,"economic,smoking room,balconi,double");
		r1.Afisare();
		Room r2 = new Room(2,"economic,no smoking room,fara balcon,single");
		r2.Afisare();
		Room r3 = new Room(3,"economic,smoking room,balconi,family");
		r3.Afisare();
		
		//Putem pune intrebare gen "Ce fel de camera doriti?
		//Si daca cuvantul tastat se potriveste cu unul din criteriile camerei
		//Sa afiseze camera respectiva plus mesajul 
		//"Ati rezervat camera cu numarul..."
	}

}
