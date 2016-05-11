public class Route {

	private String Departure;
	private String Arrival;
	private String Stops;
	private Airport ADeparture;
	private Airport AArrival;

	public void Afisare()
	{
		System.out.println("Rout detailes : ");
		System.out.println("Departure:"+Departure);
		System.out.println("Arrival:"+Arrival);
		System.out.println("Stops:"+Stops);


		ADeparture.Afisare();
		AArrival.Afisare();
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

	}

	public void setDeparture(String Departure) {
		this.Departure=Departure;
	}

	public String getArrival() {
		return Arrival;		
	}

	public void setArrival(String Arrival) {
		this.Arrival=Arrival;
	}

	public String getStops() {
		return Stops;

	}

	public void setStops(String Stops) {
		this.Stops=Stops;
	}

	public Airport getADeparture() {
		return ADeparture;		
	}

	public void setADeparture(Airport ADeparture) {
		this.ADeparture=ADeparture;
	}

	public Airport getAAirport() {
		return AArrival;		
	}

	public void setAAirport(Airport AArrival) {
		this.AArrival=AArrival;
	}

	public Route() {

	}
}
