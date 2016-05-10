

import org.junit.Test;

public class StayTEST {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Stay s= new Stay("12:45","14:15");
		System.out.println("Checkin: "+s.getCheckinTime()+"\nCheckout:"+s.getCheckoutTime());
		 
	}

}
