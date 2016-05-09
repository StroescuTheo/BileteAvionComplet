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
	public int getRoomNo() {
		return RoomNo;
		//	throw new UnsupportedOperationException();
	}

	public void setRoomNo(int RoomNo) {
		this.RoomNo=RoomNo;//	throw new UnsupportedOperationException();
	}

	public String getRoomType() {
		return RoomType;
		//	throw new UnsupportedOperationException();
	}

	public void setRoomType(String RoomType) {
		this.RoomType=RoomType;//	throw new UnsupportedOperationException();
	}


	public void setAttribute(int attribute) {
		//	throw new UnsupportedOperationException();
	}

	public Room() {
		//	throw new UnsupportedOperationException();
	}
}
