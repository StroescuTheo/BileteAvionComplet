public class Route {

	private String Departure;
	private String Arrival;
	private String Stops;

	public void Afisare()
	{
		System.out.println("Departure:"+Departure);
		System.out.println("Arrival:"+Arrival);
		System.out.println("Stops:"+Stops);
	}
	public Route(String Departure,String Arrival,String Stops)
	{
		this.Departure=Departure;
		this.Arrival=Arrival;
		this.Stops=Stops;
	}
	public String getDeparture() {
		return Departure;
		//throw new UnsupportedOperationException();
	}

	public void setDeparture(String Departure) {
		this.Departure=Departure;//throw new UnsupportedOperationException();
	}

	public String getArrival() {
		return Arrival;		//throw new UnsupportedOperationException();
	}

	public void setArrival(String Arrival) {
		this.Arrival=Arrival;//throw new UnsupportedOperationException();
	}

	public String getStops() {
		return Stops;
		//throw new UnsupportedOperationException();
	}

	public void setStops(String Stops) {
		this.Stops=Stops;//throw new UnsupportedOperationException();
	}

	public Route() {
		//throw new UnsupportedOperationException();
	}
}
