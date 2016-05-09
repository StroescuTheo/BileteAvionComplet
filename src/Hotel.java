public class Hotel {

	private String Name;
	private int Stars;

	public String getName() {
		return Name;
//		throw new UnsupportedOperationException();
	}

	public void setName(String Name) {
		this.Name=Name;
//		throw new UnsupportedOperationException();
	}

	public int getStars() {
		return Stars;
//		throw new UnsupportedOperationException();
	}

	public void setStars(int Stars) {
		this.Stars=Stars;
//		throw new UnsupportedOperationException();
	}

	public void BestHotels()
	{
		
	}
	public void Afisare()
	{
		System.out.println("Nume:"+Name);
		System.out.println("Stars:"+Stars);
	}
	public Hotel() {
		//throw new UnsupportedOperationException();
	}
	public Hotel(String Name,int Stars)
	{
		this.Name=Name;
		this.Stars=Stars;
		
	}
	public void getAttribute() {
		//throw new UnsupportedOperationException();
	}
	public static  void sortare (Hotel v[])
	{
	boolean sort=false;
	int j=1;
	while(!sort)
	 {
		sort=true;
		for(int i=0;i<4-j;i++)
		{
			if(v[i].getStars()<v[i+1].getStars())
			{
				Hotel Aux=v[i];
				v[i]=v[i+1];
				v[i+1]=Aux;
				sort=false;
				
			}
		}
		j++;
	 }
	}
}
