package spm2;

public class Suport {
	public Integer id_suport;
	public Garantie id_garantie;
	public String problema;
	
	
	public Integer getId_suport() {
		return id_suport;
	}
	public void setId_suport(Integer id_suport) {
		this.id_suport = id_suport;
	}
	
	public Garantie getId_garantie() {
		return id_garantie;
	}

	public void setId_garantie(Garantie id_garantie) {
		this.id_garantie = id_garantie;
	}
	
	public String getProblema() {
		return problema;
	}
	public void setProblema(String problema) {
		this.problema = problema;
	}
	public Suport(Integer id_suport, Garantie id_garantie, String problema) {
		super();
		this.id_suport = id_suport;
		this.id_garantie = id_garantie;
		this.problema = problema;
	}
	public Suport() {
		super();
		// TODO Auto-generated constructor stub
	}
}
