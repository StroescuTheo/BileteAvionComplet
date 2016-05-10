public class Route {

	private String Departure;
	private String Arrival;
	private String Stops;
	private Airport ADeparture;
	private Airport AArrival;

	public void Afisare()
	{
		System.out.println("Departure:"+Departure);
		System.out.println("Arrival:"+Arrival);
		System.out.println("Stops:"+Stops);
		System.out.println("Airport:"+ADeparture);
		System.out.println("Airport:"+AArrival);
	}
	public Route(String Departure,String Arrival,String Stops , Airport ADeparture , Airport AArrival)
	{
		this.Departure=Departure;
		this.Arrival=Arrival;
		this.Stops=Stops;
		this.AArrival=AArrival;
		this.ADeparture=ADeparture;
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

	public Airport getADeparture() {
		return ADeparture;		//throw new UnsupportedOperationException();
	}

	public void setADeparture(Airport ADeparture) {
		this.ADeparture=ADeparture;//throw new UnsupportedOperationException();
	}
	
	public Airport getAAirport() {
		return AArrival;		//throw new UnsupportedOperationException();
	}

	public void setAAirport(Airport AArrival) {
		this.AArrival=AArrival;//throw new UnsupportedOperationException();
	}
	
	public Route() {
		//throw new UnsupportedOperationException();
	}
}
