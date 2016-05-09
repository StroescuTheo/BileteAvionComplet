public class FlightReservation {

	private int FlightNo;
	private int NoOfSeats;
	private float Price;

	public void Afisare()
	{
		System.out.println("FlightNo:"+FlightNo);
		System.out.println("NoOfSeats:"+NoOfSeats);
		System.out.println("Price:"+Price);
	}
	public FlightReservation(int FlightNo,int NoOfSeats,float Price)
	{
		this.FlightNo=FlightNo;
		this.NoOfSeats=NoOfSeats;
		this.Price=Price;
	}
	public int getFlightNo() {
		return FlightNo;
//		throw new UnsupportedOperationException();
	}

	public void setFlightNo(int FlightNo) {
		this.FlightNo=FlightNo;
//		throw new UnsupportedOperationException();
	}

	public int getNoOfSeats() {
		return NoOfSeats;
//		throw new UnsupportedOperationException();
	}

	public void setNoOfSeats(int NoOfSeats) {
		this.NoOfSeats=NoOfSeats;
//		throw new UnsupportedOperationException();
	}

	public float getPrice() {
		return Price;
//		throw new UnsupportedOperationException();
	}

	public void setPrice(float Price) {
		this.Price=Price;
//		throw new UnsupportedOperationException();
	}

	public FlightReservation() {
//		throw new UnsupportedOperationException();
	}
}
