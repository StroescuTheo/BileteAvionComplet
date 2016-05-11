

import org.junit.Test;

public class RoomTEST {

	@Test
	public void test() {

		Room r1 = new Room(1,"economic,smoking room,balconi,double");
		r1.Afisare();
		Room r2 = new Room(2,"economic,no smoking room,fara balcon,single");
		r2.Afisare();
		Room r3 = new Room(3,"economic,smoking room,balconi,family");
		r3.Afisare();
		System.out.println("\nNumber: "+r1.getRoomNo()+"\nType:"+r1.getRoomType());
		System.out.println("\n\nNumber: "+r2.getRoomNo()+"\nType:"+r2.getRoomType());
		System.out.println("\n\nNumber: "+r3.getRoomNo()+"\nType:"+r3.getRoomType());
	}

}
