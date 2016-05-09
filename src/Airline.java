public class Airline {

	private String Name;
	private String Phone;
	private String PilotName;
	private String PlaneModel;
	private int PlaneNo;

	public void Afisare() //This is just a simple test, to see that we wokr
	{//acknoledge
		
		System.out.println("Name:"+Name);
		System.out.println("Phone:"+Phone);
		System.out.println("PilotName:"+PilotName);
		System.out.println("PlaneModel:"+PlaneModel);
		System.out.println("PlaneNo:"+PlaneNo);
	}
	public Airline(String Name,String Phone,String PilotName,String PlaneModel,int PlaneNo)
	{
		this.Name=Name;
		this.Phone=Phone;
		this.PilotName=PilotName;
		this.PlaneModel=PlaneModel;
		this.PlaneNo=PlaneNo;
	}
	public static  void sortare (Airline a[])
	{
	boolean sort=false;
	int j=1;
	while(!sort)
	 {
		sort=true;
		for(int i=0;i<4-j;i++)
		{
			if(a[i].getPlaneNo()<a[i+1].getPlaneNo())
			{
				Airline Aux=a[i];
				a[i]=a[i+1];
				a[i+1]=Aux;
				sort=false;
				
			}
		}
		j++;
	 }
	}
	public String getName() {
		//throw new UnsupportedOperationException();
	return Name;
	}

	public void setName(String Name) {
		this.Name=Name;
//		throw new UnsupportedOperationException();
	}

	public String getPhone() {
		return Phone;
//		throw new UnsupportedOperationException();
	}

	public void setPhone(String Phone) {
		this.Phone=Phone;
		
	//	throw new UnsupportedOperationException();
	}

	public String getPilotName() {
		return PilotName;
		
//		throw new UnsupportedOperationException();
	}

	public void setPilotName(String PilotName) {
	this.PilotName=PilotName;//	throw new UnsupportedOperationException();
	}

	public String getPlaneModel() {
		return PlaneModel;
//		throw new UnsupportedOperationException();
	}

	public void setPlaneModel(String PlaneModel) {
		this.PlaneModel=PlaneModel;
//		throw new UnsupportedOperationException();
	}

	public int getPlaneNo() {
		return PlaneNo;
//		throw new UnsupportedOperationException();
	}

	public void setPlaneNo(int PlaneNo) {
		this.PlaneNo=PlaneNo;
//		throw new UnsupportedOperationException();
	}

	public Airline() {
		
//		throw new UnsupportedOperationException();
	}
	
}
