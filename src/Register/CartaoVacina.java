package Register;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Actions.Leitor;
import Model.Animal;
import Model.Vacina;
import View.Menu;

public class CartaoVacina {
	
	private Leitor leitor = new Leitor();
	private Menu menu = new Menu();
	private Vacina vacina;
	private int op;
	private String id;
	
	private List<String> vacinasBovinas = Arrays.asList("BRUCELOSE", "BOTULISMO", "CLOSTRIDIOSES", "FEBRE AFTOSA", "IBR, BVD", "LAPTOSPIROSE", "RAIVA BOVINA");
	private List<String> vacinasSuinas = Arrays.asList("DOENÇA DE AUJESKY", "ERISIPELA", "LEPTOSPIROSE", "PARVOVIROSE", "PLEURIPNEUMONIA", "PNEUMONIA POR MICIPLASMA", "RINITE ATRÓFICA");

	public void agendarVacina(Registro r) {
		
		System.out.println("______VACINA______");
		
		System.out.print("DATA DA APLICAÇÃO: ");
		String data = leitor.getTexto();
		
		System.out.print("INFORME O ID DO ANIMAL QUE SE DESEJA VACINAR:");
		id = leitor.getTexto();
		
		if (id.startsWith("B")) {// BOVINO
			// SELECIONANDO VACINAS DA LISTA
			for(Animal a: r.getListaDeBovinos()) {
				if(a.getId().equals(id)) {
					String nomeVacina = vacinasBovinas.get(vacinaBoi());

					vacina = new Vacina(id, nomeVacina, data);
					
					a.vacinasTomadas.add(vacina);
				}
			}

		} else {// SUINO
			// SELECIONANDO VACINAS DA LISTA
			for(Animal a: r.getListaDeSuinos()) {
				if(a.getId().equals(id)) {
					String nomeVacina = vacinasSuinas.get(vacinaPorco());

					vacina = new Vacina(id, nomeVacina, data);
					
					a.vacinasTomadas.add(vacina);
				}
			}
		}
	}
	
	
	public int vacinaBoi() {
		System.out.println("ESCOLHA UMA VACINA PARA APLICAR NO BOI...");
		
		for (String vacinaBoi: vacinasBovinas) {
			System.out.println("[" + vacinasBovinas.indexOf(vacinaBoi) + "] " + vacinaBoi);
		}
		op = menu.opcaoInvalida(1, 6, op);	// VALIDAÇÃO DA ENTRADA DO USUARIO
		
		return op;
	}
	
	
	public int vacinaPorco() {
		System.out.println("ESCOLHA UMA VACINA PARA APLICAR NO PORCO...");

		
		for (String vacinaSuino: vacinasSuinas) {
			System.out.println("[" + vacinasSuinas.indexOf(vacinaSuino) + "] " + vacinaSuino);
		}
		
		op = menu.opcaoInvalida(1, 7, op);	// VALIDAÇÃO DA ENTRADA DO USUARIO
		
		return op;
	}
	

}
