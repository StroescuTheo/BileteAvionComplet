public class Room {

	private int RoomNo;
	private String RoomType;

	public void Afisare()
	{
		System.out.println("RoomNo:"+RoomNo);
		System.out.println("RoomType:"+RoomType);
	}
	public Room(int RoomNo,String RoomType)
	{
		this.RoomNo=RoomNo;
		this.RoomType=RoomType;

	}
	public void  RoomEQ(Room r)
	{
		this.RoomNo=r.getRoomNo();
		this.RoomType=r.getRoomType();
	}
	public int getRoomNo() {
		return RoomNo;

	}

	public void setRoomNo(int RoomNo) {
		this.RoomNo=RoomNo;
	}

	public String getRoomType() {
		return RoomType;

	}

	public void setRoomType(String RoomType) {
		this.RoomType=RoomType;
	}


	public void setAttribute(int attribute) {

	}

	public Room() {
		this.RoomNo=1;
		this.RoomType="Normal";

	}
}
