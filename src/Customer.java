public class Customer {

	private String Name;
	private String Surname;
	private String SSN;
	private String Adress;
	private String Phone;
	private String Email;
	private Reservation Reservation;
	private Laguage Laguage;
	private int Varsta;

	public void Afisare()
	{
		System.out.println("Name:"+Name);
		System.out.println("Surname:"+Surname);
		System.out.println("SSN:"+SSN);
		System.out.println("Adress:"+Adress);
		System.out.println("Phone:"+Phone);
		System.out.println("Email:"+Email);
		//System.out.println("Reservation: ") ;this.getReservation().Afisare();
		//System.out.println("Laguage: "); this.getLaguage().Afisare();
		System.out.println("Varsta:"+Varsta);

	}
	public Customer(String Name,String Surname,String SSN,String Adress,String Phone,String Email,Reservation Reservation,Laguage Laguage,int Varsta)
	{
		this.Name=Name;
		this.Phone=Phone;
		this.Surname=Surname;
		this.SSN=SSN;
		this.Adress=Adress;
		this.Email=Email;
		this.Reservation=Reservation;
		this.Laguage=Laguage;
		this.Varsta=Varsta;
	}
	public String getName() {
		return Name;


	}

	public void setName(String Name) {
		this.Name=Name;

	}

	public String getSurname() {
		return Surname;

	}

	public void setSurname(String Surname) {
		this.Surname=Surname;

	}

	public String getSSN() {
		return SSN;

	}

	public void setSSN(String SSN) {
		this.SSN=SSN;

	}

	public String getAdress() {
		return Adress;

	}

	public void setAdress(String Adress) {
		this.Adress=Adress;

	}

	public String getPhone() {
		return Phone;

	}

	public void setPhone(String Phone) {
		this.Phone=Phone;

	}

	public String getEmail() {
		return Email;

	}

	public void setEmail(String Email) {
		this.Email=Email;

	}

	public Reservation getReservation() {
		return Reservation;

	}

	public void setReservation(Reservation Reservation) {
		this.Reservation=Reservation;

	}

	public Laguage getLaguage() {
		return Laguage;

	}

	public void setLaguage(Laguage Laguage) {
		this.Laguage=Laguage;

	}

	public Customer() {


	}
	public int getVarsta() {

		return Varsta;
	}

	public void setVarsta(int Varsta) {
		this.Varsta=Varsta;

	}

	public boolean VarstaCheck(int Varsta){
		return (Varsta>18)?true:false;
	}
	public void CalcVarsta(Customer x){
		if(!x.VarstaCheck(x.Varsta))
		{
			x.Reservation = new Reservation();
			System.out.println("C`est Ne pas possible");
		}
	}

}
