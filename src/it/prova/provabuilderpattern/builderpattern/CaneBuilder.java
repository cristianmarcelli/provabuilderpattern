package it.prova.provabuilderpattern.builderpattern;

import it.prova.provabuilderpattern.model.Cane;

public final class CaneBuilder {

	private Long id;

	private String razza;

	private String pelo;

	private int eta;

	public CaneBuilder(Long id) {
		super();
		this.id = id;
	}

	public CaneBuilder razza(String razza) {
		this.razza = razza;
		return this;
	}

	public CaneBuilder pelo(String pelo) {
		this.pelo = pelo;
		return this;
	}

	public CaneBuilder eta(int eta) {
		this.eta = eta;
		return this;
	}

	public Cane build() {
		return new Cane(id, razza, pelo, eta);
	}

	public static CaneBuilder newBuilder(Long id) {
		return new CaneBuilder(id);
	}
	
}