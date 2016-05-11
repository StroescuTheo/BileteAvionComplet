

import org.junit.Test;

public class RouteTEST {

	@Test
	public void test() {

		Route a[] = {new Route("Bucuresti","Viena","fara opriri", new Airport(), new Airport()),
				new Route("Bucuresti","Madrid","fara opriri", new Airport(), new Airport()),
				new Route("Bucuresti","Roma","fara opriri", new Airport(),new Airport()),
				new Route("Bucuresti","Praga","fara opriri", new Airport(),new Airport()),
				new Route("Bucuresti","New York","oprire la Londra", new Airport(), new Airport()),
				new Route("Bucuresti","Londra","fara opriri", new Airport(), new Airport())};
		for(int i=0;i<5;i++)
			System.out.println("Departire: "+a[i].getDeparture()+"\nArrival: "+a[i].getArrival()+"\nStopt:"+a[i].getStops()+"\n");
	}

}
