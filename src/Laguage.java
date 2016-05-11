public class Laguage {

	private float Weight;
	private String PossesorName;
	private String Phone;
	private boolean Fragility;
	private String Destination;
	private boolean Lost;
	static final int MaxWeight=120; 
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

	}

	public void setWeight(float Weight) {
		this.Weight=Weight;

	}

	public String getPossesorName() {
		return PossesorName;

	}

	public void setPossesorName(String PossesorName) {
		this.PossesorName=PossesorName;

	}

	public String getPhone() {
		return Phone;

	}

	public void setPhone(String Phone) {
		this.Phone=Phone;

	}

	public boolean getFragility() {
		return Fragility;

	}

	public void setFragility(boolean Fragility) {
		this.Fragility=Fragility;

	}

	public String getDestination() {
		return Destination;

	}

	public void setDestination(String Destination) {
		this.Destination=Destination;

	}

	public boolean getLost() {
		return Lost;


	}

	public void setLost(boolean Lost) {
		this.Lost=Lost;
	}

	public Laguage() {

	}
}
