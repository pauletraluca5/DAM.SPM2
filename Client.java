package spm2;

public class Client {
	public Integer id_client;
	public String nume_client;
	public String email;
	public Integer numar_telefon;
	public Integer getId_client() {
		return id_client;
	}
	public void setId_client(Integer id_client) {
		this.id_client = id_client;
	}
	public String getNume_client() {
		return nume_client;
	}
	public void setNume_client(String nume_client) {
		this.nume_client = nume_client;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getNumar_telefon() {
		return numar_telefon;
	}
	public void setNumar_telefon(Integer numar_telefon) {
		this.numar_telefon = numar_telefon;
	}
	public Client(Integer id_client, String nume_client, String email, Integer numar_telefon) {
		super();
		this.id_client = id_client;
		this.nume_client = nume_client;
		this.email = email;
		this.numar_telefon = numar_telefon;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

}
