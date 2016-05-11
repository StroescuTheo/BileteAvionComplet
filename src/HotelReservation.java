public class HotelReservation {

	private int NoDays;
	private float Price;
	private String BedType;
	private int NoRooms;

	public void Afisare()
	{
		System.out.println("NoDays:"+NoDays);
		System.out.println("Price:"+Price);
		System.out.println("BedType:"+BedType);
		System.out.println("NoRooms:"+NoRooms);
	}
	public HotelReservation(int NoDays,float Price,String BedType,int NoRooms)
	{
		this.NoDays=NoDays;
		this.Price=Price;
		this.BedType=BedType;
		this.NoRooms=NoRooms;
	}
	public float UpdatePrice(String BedType, int NoDays)
	{
		float TotalPrice= this.Price;
		if(BedType=="King") TotalPrice*=2.5;
		TotalPrice*=NoDays;
		return TotalPrice;
	}
	public int getNoDays() {
		return NoDays;

	}

	public void setNoDays(int NoDays) {
		this.NoDays=NoDays;

	}

	public float getPrice() {
		return Price;

	}

	public void setPrice(float Price) {
		this.Price=Price;

	}

	public String getBedType() {
		return BedType;

	}

	public void setBedType(String BedType) {
		this.BedType=BedType;

	}

	public int getNoRooms() {
		return NoRooms;

	}

	public void setNoRooms(int NoRooms) {
		this.NoRooms=NoRooms;

	}

	public HotelReservation() {

	}
}
