import java.util.Date;

public class Reservation {

	private Flight Flight;
	private Hotel Hotel;
	private Date ReservationDate;
	private float TotalPrice;
	private String PaymentType;

	public void Afisare()
	{
		System.out.println("Flight:"+Flight);
		System.out.println("Hotel:"+Hotel);
		System.out.println("ReservationDate:"+ReservationDate);
		System.out.println("TotalPrice:"+TotalPrice);
		System.out.println("PaymentType:"+PaymentType);
	}
	public Reservation(Flight Flight,Hotel Hotel,Date ReservationDate,float TotalPrice,String PaymentType)
	{
		this.Flight=Flight;
		this.Hotel=Hotel;
		this.ReservationDate=ReservationDate;
		this.TotalPrice=TotalPrice;
		this.PaymentType=PaymentType;
	}
	public static  void sortare (Reservation r[])
	{
		boolean sort=false;
		int j=1;
		while(!sort)
		{
			sort=true;
			for(int i=0;i<4-j;i++)
			{
				if(r[i].getTotalPrice()<r[i+1].getTotalPrice())
				{
					Reservation Aux=r[i];
					r[i]=r[i+1];
					r[i+1]=Aux;
					sort=false;

				}
			}
			j++;
		}
	}
	public Flight getFlight() {
		return Flight;

	}

	public void setFlight(Flight Flight) {
		this.Flight=Flight;

	}

	public Hotel getHotel() {
		return Hotel;

	}

	public void setHotel(Hotel Hotel) {
		this.Hotel=Hotel;
	}

	public Date getReservationDate() {
		return ReservationDate;

	}

	public void setReservationDate(Date ReservationDate) {
		this.ReservationDate=ReservationDate;
	}

	public float getTotalPrice() {
		return TotalPrice;

	}

	public void setTotalPrice(float TotalPrice) {
		this.TotalPrice=TotalPrice;
	}

	public String getPaymentType() {
		return PaymentType;

	}

	public void setPaymentType(String PaymentType) {
		this.PaymentType=PaymentType;
	}

	public Reservation() {

	}
}
