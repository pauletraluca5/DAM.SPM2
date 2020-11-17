package spm2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Garantie {
	public Integer id_garantie;
	public Contract id_contract;
	public String conditii;
	public Date data_inceput_garantie;
	public Date data_incheiere_garantie;
	public List<Suport> cereriSuport= new ArrayList<Suport>();
	
	
	public Date getData_inceput_garantie() {
		return data_inceput_garantie;
	}
	public void setData_inceput_garantie(Date data_inceput_garantie) {
		this.data_inceput_garantie = data_inceput_garantie;
	}
	
	public Integer getId_garantie() {
		return id_garantie;
	}
	public void setId_garantie(Integer id_garantie) {
		this.id_garantie = id_garantie;
	}
	public Contract getId_contract() {
		return id_contract;
	}
	public void setId_contract(Contract id_contract) {
		this.id_contract = id_contract;
	}

	public String getConditii() {
		return conditii;
	}
	public void setConditii(String conditii) {
		this.conditii = conditii;
	}
	public Date getData_incheiere_garantie() {
		return data_incheiere_garantie;
	}
	public void setData_incheiere_garantie(Date data_incheiere_garantie) {
		this.data_incheiere_garantie = data_incheiere_garantie;
	}
	
	public List<Suport> getCereriSuport() {
		return cereriSuport;
	}
	public void setCereriSuport(List<Suport> cereriSuport) {
		this.cereriSuport = cereriSuport;
	}
	public Garantie(Integer id_garantie, Contract id_contract, String conditii, Date data_inceput_garantie,
			Date data_incheiere_garantie) {
		super();
		this.id_garantie = id_garantie;
		this.id_contract = id_contract;
		this.conditii = conditii;
		this.data_inceput_garantie = data_inceput_garantie;
		this.data_incheiere_garantie = data_incheiere_garantie;
	}
	public Garantie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((id_garantie == null) ? 0 : id_garantie.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Garantie other = (Garantie) obj;
		if (id_garantie == null) {
			if (other.id_garantie != null)
				return false;
		} else if (!id_garantie.equals(other.id_garantie))
			return false;
		return true;
	}
	
	
 public void adaugaCerereSuport(Suport cerereSuport) {
	 
		this.cereriSuport.add(cerereSuport);
		
 }
	
}
