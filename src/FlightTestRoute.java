

import org.junit.Test;

public class FlightTestRoute {

	@Test
	public void test() {
		Airport a[] = {new Airport("Henry Coanda","Bucuresti",2,4),
				new Airport("JKF","New York",1,5),
				new Airport("Odiseea Albastra","Roma",7,3),
				new Airport("BlueCost","Praga",2,4),
				new Airport("GrandA","Madrid",4,5),
				new Airport("Ortopa","Londra",6,6)};

		Route r[] = {new Route("Bucuresti","Viena","fara opriri", a[0], a[2]),
				new Route("Bucuresti","Madrid","fara opriri",a[0], a[4]),
				new Route("Bucuresti","Roma","fara opriri", a[0],a[2]),
				new Route("Bucuresti","Praga","fara opriri", a[0],a[3]),
				new Route("Bucuresti","New York","oprire la Londra", a[0], a[1]),
				new Route("Bucuresti","Londra","fara opriri", a[0], a[5])};

		Airline e[] = { new Airline("BlueAir","01234534","Emma","Elico990",320, r[2]) ,
				new Airline("BlueAir","3210352","Marius","Boing302",130, r[4]) ,
				new Airline("BlueAir","4563232","Alin","Jet404",56, r[0]),
				new Airline("BlueAir","9854232","Alex","Boing402",2 , r[0]),
				new Airline("BlueAir","9858542","Iulian","Snipper32", 2 , r[3])} ;

		Flight f[] = {new Flight(12,"12:45","12:30",4,"14:45","6 libere", e[0]),
				new Flight(11,"12:45","12:30",2,"14:45","65 libere",e[2]),
				new Flight(13,"12:45","12:30",7,"14:45","34 libere",e[3]),
				new Flight(14,"12:45","12:30",3,"14:45","7 libere", e[1]),
				new Flight(15,"12:45","12:30",9,"14:45","8 libere", e[4])};


		boolean sort=false;
		int j=1;
		while(!sort)
		{
			sort=true;
			for(int i=0;i<4-j;i++)
			{
				if(Integer.parseInt(f[i].getDepartureTime().replaceAll("[^0-9]", ""))>Integer.parseInt(f[i+1].getDepartureTime().replaceAll("[^0-9]", "")))
				{
					Flight Aux=f[i];
					f[i]=f[i+1];
					f[i+1]=Aux;
					sort=false;

				}
			}
			j++;
		}
		for(int i =0; i<=4; i++)
			f[i].Afisare();

	}

}
