public class Airline {

	private String Name;
	private String Phone;
	private String PilotName;
	private String PlaneModel;
	private int PlaneNo;
	private Route Ruta;

	public void Afisare() 
	{
		System.out.println("Airline detailes : ");
		System.out.println("Name:"+Name);
		System.out.println("Phone:"+Phone);
		System.out.println("PilotName:"+PilotName);
		System.out.println("PlaneModel:"+PlaneModel);
		System.out.println("PlaneNo:"+PlaneNo);
		Ruta.Afisare();
	}
	public Airline(String Name,String Phone,String PilotName,String PlaneModel,int PlaneNo, Route Ruta)
	{
		this.Name=Name;
		this.Phone=Phone;
		this.PilotName=PilotName;
		this.PlaneModel=PlaneModel;
		this.PlaneNo=PlaneNo;
		this.Ruta = Ruta ;
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

		return Name;
	}

	public void setName(String Name) {
		this.Name=Name;

	}

	public String getPhone() {
		return Phone;

	}

	public void setPhone(String Phone) {
		this.Phone=Phone;


	}

	public String getPilotName() {
		return PilotName;


	}

	public void setPilotName(String PilotName) {
		this.PilotName=PilotName;
	}

	public String getPlaneModel() {
		return PlaneModel;

	}

	public void setPlaneModel(String PlaneModel) {
		this.PlaneModel=PlaneModel;

	}

	public int getPlaneNo() {
		return PlaneNo;

	}

	public void setPlaneNo(int PlaneNo) {
		this.PlaneNo=PlaneNo;

	}
	public Route getRoute() {
		return Ruta;

	}

	public void setRoute(Route Ruta) {
		this.Ruta=Ruta;

	}
	public Airline() {


	}

}
