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
		System.out.println("Phone:"+Phone);
		System.out.println("Surname:"+Surname);
		System.out.println("SSN:"+SSN);
		System.out.println("Adress:"+Adress);
		System.out.println("Email:"+Email);
		System.out.println("Reservation:"+Reservation);
		System.out.println("Laguage:"+Laguage);
		System.out.println("Varsta:"+Varsta);
		
	}
	public Customer(String Name,String Phone,String Surname,String SSN,String Adress,String Email,Reservation Reservation,Laguage Laguage,int Varsta)
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
		
		//throw new UnsupportedOperationException();
	}

	public void setName(String Name) {
		this.Name=Name;
//		throw new UnsupportedOperationException();
	}

	public String getSurname() {
		return Surname;
//		throw new UnsupportedOperationException();
	}

	public void setSurname(String Surname) {
		this.Surname=Surname;
//		throw new UnsupportedOperationException();
	}

	public String getSSN() {
		return SSN;
//		throw new UnsupportedOperationException();
	}

	public void setSSN(String SSN) {
		this.SSN=SSN;
//		throw new UnsupportedOperationException();
	}

	public String getAdress() {
		return Adress;
//		throw new UnsupportedOperationException();
	}

	public void setAdress(String Adress) {
		this.Adress=Adress;
//		throw new UnsupportedOperationException();
	}

	public String getPhone() {
		return Phone;
//		throw new UnsupportedOperationException();
	}

	public void setPhone(String Phone) {
		this.Phone=Phone;
//		throw new UnsupportedOperationException();
	}

	public String getEmail() {
		return Email;
//		throw new UnsupportedOperationException();
	}

	public void setEmail(String Email) {
		this.Email=Email;
//		throw new UnsupportedOperationException();
	}

	public Reservation getReservation() {
		return Reservation;
//		throw new UnsupportedOperationException();
	}

	public void setReservation(Reservation Reservation) {
		this.Reservation=Reservation;
//		throw new UnsupportedOperationException();
	}

	public Laguage getLaguage() {
		return Laguage;
//		throw new UnsupportedOperationException();
	}

	public void setLaguage(Laguage Laguage) {
		this.Laguage=Laguage;
//		throw new UnsupportedOperationException();
	}

	public Customer() {
		
		//throw new UnsupportedOperationException();
	}
	public int getVarsta() {
		//throw new UnsupportedOperationException();
	return Varsta;
	}

	public void setVarsta(int Varsta) {
		this.Varsta=Varsta;
//		throw new UnsupportedOperationException();
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
