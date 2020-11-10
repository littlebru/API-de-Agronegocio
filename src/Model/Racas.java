package Model;

import View.Menu;

import java.util.Arrays;
import java.util.List;

import Actions.Leitor;

public class Racas {
	Leitor leitor = new Leitor();
	Menu menu = new Menu();
	int op;
	
	private List<String> racasBovinas = Arrays.asList("ANGUS", "BRANGUS", "BRAHMAN", "GIR LEITEIRO", "HOLANDÊS", "NELORE", "SINDI"); 
	private List<String> racasSuinas = Arrays.asList("DUROC", "HAMPSHIRE", "LANDRACE", "LARGE WHITE", "PIETRAIN"); 
	
	public String racaBoi() {
		System.out.println("ESCOLHA UMA RAÇA DE GADO...");
		String raca;
	
		for (String racaBoi: racasBovinas) {
			System.out.println("[" + racasBovinas.indexOf(racaBoi) + "] " + racaBoi);
		}
		op = menu.opcaoInvalida(0, 6, op);	// valores maiores do que as opções
		if(op == 0) raca = racasBovinas.get(op);
		else raca = racasBovinas.get(op-1);
		
		return raca;
	}
	
	public String racaPorco() {
		System.out.println("ESCOLHA UMA RAÇA DE PORCO...");
		String raca;
	
		for (String racaPorco: racasSuinas) {
			System.out.println("[" + racasSuinas.indexOf(racaPorco) + "] " + racaPorco);
		}		
		op = menu.opcaoInvalida(0, 4, op);
		if(op == 0) raca = racasBovinas.get(op);
		else raca = racasBovinas.get(op-1);
		
		return raca;
	}
}