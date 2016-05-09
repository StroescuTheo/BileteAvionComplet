public class Stay {

	private String CheckinTime;
	private String CheckoutTime;

	public void Afisare()
	{
		System.out.println("CheckinTime:"+CheckinTime);
		System.out.println("CheckoutTime:"+CheckoutTime);
	}
	public Stay(String CheckinTime,String CheckoutTime)
	{
		this.CheckinTime=CheckinTime;
		this.CheckoutTime=CheckoutTime;
		
	}
	public void CheckTimeValues() // a #test should be implemented on this.
	{
		
		String numberOnlyCI= this.CheckinTime.replaceAll("[^0-9]", "");
		String numberOnlyCO= this.CheckoutTime.replaceAll("[^0-9]", "");
		int nrCI=Integer.parseInt(numberOnlyCI);
		int nrCO=Integer.parseInt(numberOnlyCO);
		if(nrCI>nrCO)
			System.out.println("Error. Checkin Time cannot be later than Checkout time");
	}
	public String getCheckinTime() {
		return CheckinTime;
		
		//throw new UnsupportedOperationException();
	}

	public void setCheckinTime(String CheckinTime) {
		this.CheckinTime=CheckinTime;//throw new UnsupportedOperationException();
	}

	public String getCheckoutTime() {
		return CheckoutTime;
		//	throw new UnsupportedOperationException();
	}

	public void setCheckoutTime(String CheckoutTime) {
		this.CheckinTime=CheckoutTime;//	throw new UnsupportedOperationException();
	}

	public Stay() {
		//throw new UnsupportedOperationException();
	}
}
