

import org.junit.Test;

public class HotelTest {

	@Test
	public void test() {
		Room r[] = {new Room(1,"economic,smoking room,balconi,double"),
				new Room(2,"economic,no smoking room,fara balcon,single"),
				new Room(3,"economic,smoking room,balconi,family"),
				new Room(3,"economic,smoking room,balconi,family")};
		Hotel v[] = { new Hotel("Blue",3) , new Hotel("Green",4) , new Hotel("Arrow",5) , new Hotel("Flash",2)} ;
		Hotel.sortare(v); 
		for(int i=0;i<4;i++)
		{
			v[i].Afisare();
			System.out.println("Name: "+v[i].getName()+"\nStars: "+v[i].getStars());
			r[i].Afisare();
			System.out.println();
			System.out.println("////////////////////////////");
			System.out.println();
		}

	}

}
