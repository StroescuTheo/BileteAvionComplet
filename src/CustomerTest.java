

import org.junit.Test;

public class CustomerTest {

	@Test
	public void test() {
		int n = 19;
		String a1="Alex";
		String a2="Oancea";
		String a3="123456";
		String a4="Dristor";
		String a5="0123542658";
		String a6="neicuana@gmail.com";
		Reservation r =new Reservation();
		Laguage l = new Laguage();
		Customer abc = new Customer();
		abc.setName(a1);
		abc.setAdress(a4);
		abc.setEmail(a6);
		abc.setLaguage(l);
		abc.setPhone(a3);
		abc.setReservation(r);
		abc.setSSN(a5);
		abc.setSurname(a2);
		abc.setVarsta(n);
		abc.CalcVarsta(abc);
		
		//fail("Not yet implemented");
	}

}
