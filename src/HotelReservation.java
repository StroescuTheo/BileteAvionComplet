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
		System.out.println();
	}
	public HotelReservation(int NoDays,float Price,String BedType,int NoRooms)
	{
		this.NoDays=NoDays;
		this.Price=Price;
		this.BedType=BedType;
		this.NoRooms=NoRooms;
	}
	public float UpdatePrice(String BedType, int NoDays) //Calculeaza costul total al sederi
	{
		float TotalPrice= this.Price;
		if(BedType=="King") TotalPrice*=2.5;
		TotalPrice*=NoDays;
		return TotalPrice;
	}
	public int getNoDays() {
		return NoDays;
		//throw new UnsupportedOperationException();
	}

	public void setNoDays(int NoDays) {
		this.NoDays=NoDays;
		//throw new UnsupportedOperationException();
	}

	public float getPrice() {
		return Price;
		//throw new UnsupportedOperationException();
	}

	public void setPrice(float Price) {
		this.Price=Price;
		//throw new UnsupportedOperationException();
	}

	public String getBedType() {
		return BedType;
		//throw new UnsupportedOperationException();
	}

	public void setBedType(String BedType) {
		this.BedType=BedType;
		//throw new UnsupportedOperationException();
	}

	public int getNoRooms() {
		return NoRooms;
		//throw new UnsupportedOperationException();
	}

	public void setNoRooms(int NoRooms) {
		this.NoRooms=NoRooms;
		//throw new UnsupportedOperationException();
	}

	public HotelReservation() {
		//throw new UnsupportedOperationException();
	}
}
