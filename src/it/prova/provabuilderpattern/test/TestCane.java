package it.prova.provabuilderpattern.test;

import it.prova.provabuilderpattern.builderpattern.CaneBuilder;
import it.prova.provabuilderpattern.model.Cane;

public class TestCane {
	public static void main(String[] args) {

		Cane canePerTest = CaneBuilder.newBuilder(1L).razza("Golden retriever").pelo("Lungo").eta(4).build();

		System.out.println(canePerTest);

	}

}