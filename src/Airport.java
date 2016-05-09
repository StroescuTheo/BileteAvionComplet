public class Airport {

	private String Location;
	private String Name;
	private int Gate;
	private int Terminal;

	public void Afisare()
	{
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
//		throw new UnsupportedOperationException();
	}

	public void setLocation(String Location) {
		this.Location=Location;
//		throw new UnsupportedOperationException();
	}

	public String getName() {
		//throw new UnsupportedOperationException();
		return Name;
	}

	public void setName(String Name) {
		this.Name=Name;
//		throw new UnsupportedOperationException();
	}

	public int getGate() {
		return Gate;
//		throw new UnsupportedOperationException();
	}

	public void setGate(int Gate) {
		this.Gate=Gate;//throw new UnsupportedOperationException();
	}

	public int getTerminal() {
		return Terminal;
		//throw new UnsupportedOperationException();
	}

	public void setTerminal(int Terminal) {
		this.Terminal=Terminal;
//		throw new UnsupportedOperationException();
	}

	public Airport() {
		//throw new UnsupportedOperationException();
	}
}
