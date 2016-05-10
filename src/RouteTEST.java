

import org.junit.Test;

public class RouteTEST {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Route a[] = {new Route("Bucuresti","Viena","fara opriri"),new Route("Bucuresti","Madrid","fara opriri"),new Route("Bucuresti","Roma","fara opriri"),new Route("Bucuresti","Praga","fara opriri"),new Route("Bucuresti","New York","oprire la Londra"),new Route("Bucuresti","Londra","fara opriri")};
		for(int i=0;i<5;i++)
			System.out.println("Departire: "+a[i].getDeparture()+"\nArrival: "+a[i].getArrival()+"\nStopt:"+a[i].getStops()+"\n");
	}

}
