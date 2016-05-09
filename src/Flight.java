public class Flight {

	private int Number;
	private String DepartureTime;
	private String BoardingTime;
	private int Gate;
	private String ArrivalTime;
	private String Seats;

	public void Afisare()
	{
		System.out.println("Number:"+Number);
		System.out.println("DepartureTime:"+DepartureTime);
		System.out.println("BoardingTime:"+BoardingTime);
		System.out.println("Gate:"+Gate);
		System.out.println("ArrivalTime:"+ArrivalTime);
		System.out.println("Seats:"+Seats);
	}
	public Flight(int Number,String DepartureTime,String BoardingTime,String ArrivalTime,int Gate,String Seats)
	{
		this.Number=Number;
		this.DepartureTime=DepartureTime;
		this.BoardingTime=BoardingTime;
		this.Gate=Gate;
		this.ArrivalTime=ArrivalTime;
		this.Seats=Seats;
	}
	public int getNumber() {
		return Number;
//		throw new UnsupportedOperationException();
	}

	public void setNumber(int Number) {
		this.Number=Number;
//		throw new UnsupportedOperationException();
	}

	public String getDepartureTime() {
		return DepartureTime;
//		throw new UnsupportedOperationException();
	}

	public void setDepartureTime(String DepartureTime) {
		this.DepartureTime=DepartureTime;
		
//		throw new UnsupportedOperationException();
	}

	public String getBoardingTime() {
		return BoardingTime;
//		throw new UnsupportedOperationException();
	}

	public void setBoardingTime(String BoardingTime) {
		this.BoardingTime=BoardingTime;
//		throw new UnsupportedOperationException();
	}

	public int getGate() {
		return Gate;
//		throw new UnsupportedOperationException();
	}

	public void setGate(int Gate) {
		this.Gate=Gate;
//		throw new UnsupportedOperationException();
	}

	public String getArrivalTime() {
		return ArrivalTime;
//		throw new UnsupportedOperationException();
	}

	public void setArrivalTime(String ArrivalTime) {
		this.ArrivalTime=ArrivalTime;
//		throw new UnsupportedOperationException();
	}

	public String getSeats() {
		return Seats;
//		throw new UnsupportedOperationException();
	}

	public void setSeats(String Seats) {
		this.Seats=Seats;
//		throw new UnsupportedOperationException();
	}

	public Flight() {
		
		//throw new UnsupportedOperationException();
	}
}
