package Model;

public class Vacina {
	
	protected String idAnimal;
	protected String nomeVacina;
	protected String dataDeVacinacao;
	
	public String getIdAnimal() {
		return nomeVacina;
	}
	public String getNomeVacina() {
		return nomeVacina;
	}
	public String getDataDeVacinacao() {
		return dataDeVacinacao;
	}
	
	
	
	public Vacina(String idAnimal, String nomeVacina, String dataDeVacinacao) {
		super();
		this.idAnimal = idAnimal;
		this.nomeVacina = nomeVacina;
		this.dataDeVacinacao = dataDeVacinacao;
	}
}
