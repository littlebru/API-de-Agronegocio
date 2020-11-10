package Model;

import java.util.Date;
import java.util.List;

import Register.CartaoVacina;

public class Bovino extends Animal{
	
	public Bovino() {}

	public Bovino(String id, String raca, double pesoArroba, double pesoKg, String genero, String dataDeNascimento) {
		super(id, raca, pesoArroba, pesoKg, genero, dataDeNascimento);
		
		this.id = id;
		this.raca = raca;
		this.pesoArroba = new Arroba(pesoArroba);
		this.pesoKg = new Quilo(pesoKg);
		this.genero = genero;
		this.dataDeNascimento = dataDeNascimento;
	}
}
