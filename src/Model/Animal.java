package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Register.CartaoVacina;

public abstract class Animal {
	
	protected String id;
	protected String raca;
	public Peso pesoArroba;
	public Peso pesoKg;
	protected String genero;
	protected String dataDeNascimento;
	public List<Vacina> vacinasTomadas= new ArrayList<Vacina>();
	
	public Animal() {}
	
	public Animal(String id, String raca, double pesoArroba, double pesoKg, String genero, String dataDeNascimento) {
		this.id = id;
		this.raca = raca;
		this.pesoArroba = new Arroba(pesoArroba);
		this.pesoKg = new Quilo(pesoKg);
		this.genero = genero;
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public String getId() {
		return id;
	}
	public String getRaca() {
		return raca;
	}
	public String getGenero() {
		return genero;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

}
