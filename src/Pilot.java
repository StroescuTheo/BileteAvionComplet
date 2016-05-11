import org.junit.Test;

public class Pilot {

	@Test
	public void test() {
		Flight f[] = {new Flight(120,"12:45","12:30",4,"14:45","10 libere", new Airline()),
				new Flight(130,"13:45","13:30",3,"14:40","2 libere", new Airline())};
		Airline a[] = {new Airline("BlueAir","0123425625","Ionel Marin","elicopter",234, new Route()),
				new Airline("BlueAir","0123425625","Viorel Marte","elicopter",135, new Route())};
		for(int i=0;i<=1;i++)
		{
			System.out.println("Pentru zborul cu numarul: "+f[i].getNumber()+"\nPilotul se numeste: "+a[i].getPilotName());
			System.out.println("Compania este: "+a[i].getName()+"\nCe decoleaza de la poarte: "+f[i].getGate());
		}

	}

}

