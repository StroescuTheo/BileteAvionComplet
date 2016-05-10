

import org.junit.Test;

public class HotelTest {

	@Test
	public void test() {
		Hotel v[] = { new Hotel("Blue",3) , new Hotel("Green",4) , new Hotel("Arrow",5) , new Hotel("Flash",2)} ;
        Hotel.sortare(v); 
        for(int i=0;i<4;i++)
        {
        	v[i].Afisare();
        	System.out.println("Name: "+v[i].getName()+"\nStars: "+v[i].getStars());
        }
        	// fail("Not yet implemented");
	}

}
