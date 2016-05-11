public class Hotel {

	private String Name;
	private int Stars;
	private Room  Rooms[];

	public String getName() {
		return Name;

	}


	public void setName(String Name) {
		this.Name=Name;

	}

	public Room[] getRoom()
	{
		return this.Rooms;
	}

	public Room[] getRooms() {
		return Rooms;

	}


	public void setRooms(Room[] Rooms) {
		this.Rooms=Rooms;

	}

	public int getStars() {
		return Stars;

	}

	public Room ReturnAnyRoomAvailable(Room roomss[])
	{




		for( int i=0;i<roomss.length;i++)
		{


			if(roomss[i].getRoomNo()!=0)
				return roomss[i];

		}
		return new Room();
	}
	public void setStars(int Stars) {
		this.Stars=Stars;

	}

	public Hotel BestHotels(Hotel [] h)
	{
		sortare(h);
		return h[0];
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

	}
	public Hotel(String Name,int Stars)
	{
		this.Name=Name;
		this.Stars=Stars;

	}
	public Hotel(String Name,int Stars, Room [] rooms)
	{

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
