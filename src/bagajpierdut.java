//import static org.junit.Assert.*;

import org.junit.Test;

public class bagajpierdut {

	@Test
	public void test() {
		Customer c[] = {new Customer("Albu" , "Iulian" , "skdjhfuwr8fg" , "Tunari ", "0728772344" , "iuli@ibm.com" , new Reservation() , new Laguage() , 21),
				         new Customer("Covarnache " , "Mihai" , "ssdhfsiuf9w" , "Pitesti ", "072237426" , "Mihai@ibm.com" , new Reservation() , new Laguage() , 23), 
				         new Customer("Mihaila" , "Ioana" , "djsfy2t" , "Ploiesti ", "072723452" , "Ioana@ibm.com" , new Reservation() , new Laguage() , 20)};
		Laguage l[] = {new Laguage(3 , c[0].getName() , c[0].getPhone() , true , "otopeni" , false),
				        new Laguage( 34 , c[1].getName() , c[1].getPhone() , false , "regie p3" , true),
				          new Laguage(23 , c[2].getName() , c[2].getPhone() , false , "ploiesti" , true) };
	
		for(int i=0; i<=2; i++)
		   c[i].setLaguage(l[i]);
		
		for(int i=0; i<=2; i++)
			if(c[i].getLaguage().getLost() == false )
			 c[i]=new Customer();
			else
				
			{
				System.out.println(c[i].getName()+" "+c[i].getSurname()+" v-a primi un mail pe adresa "+c[i].getEmail()+" in care va fi notificat ca i-a fost gasit bagajul si va fi trimis la destinatie :"+c[i].getLaguage().getDestination()); 
				c[i].Afisare();
				System.out.println();
			}
			  
		
		
	//	fail("Not yet implemented");
	}

}
