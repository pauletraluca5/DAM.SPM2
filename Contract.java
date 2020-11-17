package spm2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class Contract {
	public Integer id_contract;
	public Date data_contract;
	public Integer perioada_contract;
	public String clauza;
	public Client client;
	//public List<Contract> contracte= new ArrayList<Contract>();
	//public List<Client> clienti = new ArrayList<Client>();
	
	/*public List<Contract> getContracte() {
		return contracte;
	}
	public void setContracte(List<Contract> contracte) {
		this.contracte = contracte;
	}
	
	public List<Client> getClienti() {
		return clienti;
	}
	public void setClienti(List<Client> clienti) {
		this.clienti = clienti;
	}*/
	public Integer getId_contract() {
		return id_contract;
	}
	public void setId_contract(Integer id_contract) {
		this.id_contract = id_contract;
	}
	public Date getData_contract() {
		return data_contract;
	}
	public void setData_contract(Date data_contract) {
		this.data_contract = data_contract;
	}
	public Integer getPerioada_contract() {
		return perioada_contract;
	}
	public void setPerioada_contract(Integer perioada_contract) {
		this.perioada_contract = perioada_contract;
	}
	public String getClauza() {
		return clauza;
	}
	
	public void setClauza(String clauza) {
		this.clauza = clauza;
	}
	
	/*public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}*/
	
	public Contract(Integer id_contract, Date data_contract, Integer perioada_contract,Client client, String clauza) {
		super();
		this.id_contract = id_contract;
		this.data_contract = data_contract;
		this.perioada_contract = perioada_contract;
		this.clauza = clauza;
		this.client = client;
	}
	public Contract() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((id_contract == null) ? 0 : id_contract.hashCode());
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
		Contract other = (Contract) obj;
		if (id_contract == null) {
			if (other.id_contract != null)
				return false;
		} else if (!id_contract.equals(other.id_contract))
			return false;
		return true;
	}
	*/
	
	
	public String toString() {
		
		return "Clientul " + client + " are contractul cu numarul " + this.getId_contract() + "din data "+ this.getData_contract();
	}
	
	
	
	//metode
	//public void adaugaContract(Contract contract) {
	//	this.contracte.add(contract);
	
	
	}
	
	
	


