package it.prova.provabuilderpattern.model;


public class Cane {

	private Long id;

	private String razza;

	private String pelo;

	private int eta;

	private Cane() {
	}

	public Cane(Long id, String razza, String pelo, int eta) {
		super();
		this.id = id;
		this.razza = razza;
		this.pelo = pelo;
		this.eta = eta;
	}

	public Cane(String razza, String pelo, int eta) {
		super();
		this.razza = razza;
		this.pelo = pelo;
		this.eta = eta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	@Override
	public String toString() {
		return "Cane [id=" + id + ", razza=" + razza + ", pelo=" + pelo + ", eta=" + eta + "]";
	}

}