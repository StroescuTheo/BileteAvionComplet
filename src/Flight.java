public class Flight {

	private int Number;
	private String DepartureTime;
	private String BoardingTime;
	private int Gate;
	private String ArrivalTime;
	private String Seats;
	private Airline Line;

	public void Afisare()
	{
		System.out.println("Flight detailes : ");
		System.out.println("Number:"+Number);
		System.out.println("DepartureTime:"+DepartureTime);
		System.out.println("BoardingTime:"+BoardingTime);
		System.out.println("Gate:"+Gate);
		System.out.println("ArrivalTime:"+ArrivalTime);
		System.out.println("Seats:"+Seats);
		System.out.println();
		Line.Afisare();
		System.out.println();
		System.out.println("//////////////////////////////////////////");
		System.out.println();

	}
	public Flight(int Number,String DepartureTime,String BoardingTime,int Gate,String ArrivalTime,String Seats ,  Airline Line)
	{
		this.Number=Number;
		this.DepartureTime=DepartureTime;
		this.BoardingTime=BoardingTime;
		this.Gate=Gate;
		this.ArrivalTime=ArrivalTime;
		this.Seats=Seats;
		this.Line = Line ;
	}
	public int getNumber() {
		return Number;

	}

	public void setNumber(int Number) {
		this.Number=Number;

	}

	public String getDepartureTime() {
		return DepartureTime;

	}

	public void setDepartureTime(String DepartureTime) {
		this.DepartureTime=DepartureTime;


	}

	public String getBoardingTime() {
		return BoardingTime;

	}

	public void setBoardingTime(String BoardingTime) {
		this.BoardingTime=BoardingTime;

	}

	public int getGate() {
		return Gate;

	}

	public void setGate(int Gate) {
		this.Gate=Gate;

	}

	public String getArrivalTime() {
		return ArrivalTime;

	}

	public void setArrivalTime(String ArrivalTime) {
		this.ArrivalTime=ArrivalTime;

	}

	public String getSeats() {
		return Seats;

	}

	public void setSeats(String Seats) {
		this.Seats=Seats;

	}

	public Airline getAirline() {
		return Line;

	}

	public void setAirline(Airline Line) {
		this.Line=Line;

	}

	public Flight() {


	}
}
