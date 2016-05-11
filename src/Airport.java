public class Airport {

	private String Location;
	private String Name;
	private int Gate;
	private int Terminal;

	public void Afisare()
	{
		System.out.println("Airport detailes : ");
		System.out.println("Name:"+Name);
		System.out.println("Location:"+Location);
		System.out.println("Gate:"+Gate);
		System.out.println("Terminal:"+Terminal);
	}
	public Airport(String Name,String Location,int Gate,int Terminal)
	{
		this.Name=Name;
		this.Location=Location;
		this.Gate=Gate;
		this.Terminal=Terminal;
	}
	public String getLocation() {
		return Location;

	}

	public void setLocation(String Location) {
		this.Location=Location;

	}

	public String getName() {

		return Name;
	}

	public void setName(String Name) {
		this.Name=Name;

	}

	public int getGate() {
		return Gate;

	}

	public void setGate(int Gate) {
		this.Gate=Gate;
	}

	public int getTerminal() {
		return Terminal;

	}

	public void setTerminal(int Terminal) {
		this.Terminal=Terminal;

	}

	public Airport() {

	}
}
