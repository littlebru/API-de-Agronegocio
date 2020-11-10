package Application;

import Actions.Leitor;
import Register.CartaoVacina;
import Register.Registro;
import Register.Venda;
import View.Listagem;
import View.Menu;
import View.Relatorio;

public class App {
	
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		Registro r = new Registro();
		Relatorio re = new Relatorio();
		CartaoVacina vacina = new CartaoVacina();
		Leitor leitor;
		Listagem l = new Listagem();		
		Venda v = new Venda();
		int opcaoPrograma, CONT_BOVINO = 0, CONT_SUINO = 0;
		
		do {
			
			opcaoPrograma = menu.menuTelaInicial();
			
			switch(opcaoPrograma) {
			case 0: // SAIR
				int op = menu.fecharPrograma();
				if(op == 1) {
					System.out.println("O PROGRAMA FOI ENCERRADO");
					System.exit(0);
				}
				else {
					continue;
				}
				
				continue;
			case 1:	// CADASTRO DE NOVO ANIMAL 
				
				int tipoAnimal = menu.printTipoAnimal();

				switch(tipoAnimal){
					case 1:
						CONT_BOVINO += 1;
						r.cadastraBovino(CONT_BOVINO);
					break;
					case 2:
						CONT_SUINO += 1;
						r.cadastraSuino(CONT_SUINO);
					break;
				}
				
				break;
			case 2: // SEÇÃO DE VENDAS 
				v.vendeAnimal(r);
				break;
			case 3: // VACINAÇÕES
				vacina.agendarVacina(r);
				break;
			case 4:	// RELATÓRIO GERAL
				re.printRelatorio(r);
				break;
			}
			
		} while(opcaoPrograma != 0);
		
		
	}
	
}
