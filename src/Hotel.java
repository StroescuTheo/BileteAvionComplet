public class Hotel {

	private String Name;
	private int Stars;
	private Room  Rooms[];

	public String getName() {
		return Name;
//		throw new UnsupportedOperationException();
	}
	

	public void setName(String Name) {
		this.Name=Name;
//		throw new UnsupportedOperationException();
	}
	
	public Room[] getRoom()
	{
		return this.Rooms;
	}

	public Room[] getRooms() {
		return Rooms;
//		throw new UnsupportedOperationException();
	}
	

	public void setRooms(Room[] Rooms) {
		this.Rooms=Rooms;
//		throw new UnsupportedOperationException();
	}
	
	public int getStars() {
		return Stars;
//		throw new UnsupportedOperationException();
	}

	public Room ReturnAnyRoomAvailable(Room roomss[])
	{
		
		//System.out.println("teeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeest");
	//	System.out.println("Length:"+(this.getRoom()).length +" dsa");
		//this.Rooms[0].Afisare();
		for( int i=0;i<roomss.length;i++)
		{
			//System.out.println("teeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeest");
			//				
			if(roomss[i].getRoomNo()!=0)
				return roomss[i];
			
		}
		return new Room();
	}
	public void setStars(int Stars) {
		this.Stars=Stars;
//		throw new UnsupportedOperationException();
	}

	public void BestHotels()
	{
		//TODO Complete thiswith something
	}
	public void Afisare()
	{
		System.out.println("Nume:"+Name);
		System.out.println("Stars:"+Stars);
		
	}
	public void AfisareR()
	{
		System.out.println("Nume:"+Name);
		System.out.println("Stars:"+Stars);
		for(int i=0; i<=Rooms.length ; i++)
		Rooms[i].Afisare();
	}
	public Hotel() {
		
		for(int i=0;i<Rooms.length;i++)
			this.Rooms[i]= new Room();
		//throw new UnsupportedOperationException();
	}
	public Hotel(String Name,int Stars)
	{
		this.Name=Name;
		this.Stars=Stars;
		
	}
	public Hotel(String Name,int Stars, Room [] rooms)
	{
		//System.out.println("test hit////////////////////////////////////////"+rooms.length);
		this.Name=Name;
		this.Stars=Stars;
		for(int i=0;i<rooms.length;i++)
		{
			rooms[i].Afisare();
			this.Rooms[i].RoomEQ(rooms[i]);
		}
		
	}
	public void AddRooms(Room [] rooms)
	{
		for(int i=0;i<rooms.length;i++)
		{
			this.Rooms[i].RoomEQ(rooms[i]);
		}
		
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
