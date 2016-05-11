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

	}

	public void setFlightNo(int FlightNo) {
		this.FlightNo=FlightNo;

	}

	public int getNoOfSeats() {
		return NoOfSeats;

	}

	public void setNoOfSeats(int NoOfSeats) {
		this.NoOfSeats=NoOfSeats;

	}

	public float getPrice() {
		return Price;

	}

	public void setPrice(float Price) {
		this.Price=Price;

	}

	public FlightReservation() {

	}
}
