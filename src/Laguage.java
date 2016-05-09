public class Laguage {

	private float Weight;
	private String PossesorName;
	private String Phone;
	private boolean Fragility;
	private String Destination;
	private boolean Lost;
	static final int MaxWeight=120; //#define equivalent
	public void Afisare()
	{
		System.out.println("Weight:"+Weight);
		System.out.println("PossesorName:"+PossesorName);
		System.out.println("Phone:"+Phone);
		System.out.println("Fragility:"+Fragility);
		System.out.println("Destination:"+Destination);
		System.out.println("Lost:"+Lost);
	}
	public Laguage(float Weight,String PossesorName,String Phone,boolean Fragility,String Destination,boolean Lost)
	{
		this.Weight=Weight;
		this.PossesorName=PossesorName;
		this.Phone=Phone;
		this.Fragility=Fragility;
		this.Destination=Destination;
		this.Lost=Lost;
	}
	
	public void ShipBack()
	{
		if(this.Weight<=MaxWeight)
		{
			System.out.println("This Laguage is to be shipped to"+this.getPossesorName() +" in "+this.getDestination());
			
		}
	}
	
	public float getWeight() {
		return Weight;
		//throw new UnsupportedOperationException();
	}

	public void setWeight(float Weight) {
		this.Weight=Weight;
		//throw new UnsupportedOperationException();
	}

	public String getPossesorName() {
		return PossesorName;
		//throw new UnsupportedOperationException();
	}

	public void setPossesorName(String PossesorName) {
		this.PossesorName=PossesorName;
		//throw new UnsupportedOperationException();
	}

	public String getPhone() {
		return Phone;
		//throw new UnsupportedOperationException();
	}

	public void setPhone(String Phone) {
		this.Phone=Phone;
		//throw new UnsupportedOperationException();
	}

	public boolean getFragility() {
		return Fragility;
		//throw new UnsupportedOperationException();
	}

	public void setFragility(boolean Fragility) {
		this.Fragility=Fragility;
		//throw new UnsupportedOperationException();
	}

	public String getDestination() {
		return Destination;
		//	throw new UnsupportedOperationException();
	}

	public void setDestination(String Destination) {
		this.Destination=Destination;
		//throw new UnsupportedOperationException();
	}

	public boolean getLost() {
		return Lost;
		
		//throw new UnsupportedOperationException();
	}

	public void setLost(boolean Lost) {
		this.Lost=Lost;//throw new UnsupportedOperationException();
	}

	public Laguage() {
		//throw new UnsupportedOperationException();
	}
}
