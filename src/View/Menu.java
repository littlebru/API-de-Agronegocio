package View;

import Actions.FormatadorData;
import Actions.Leitor;
import Register.Registro;
import Actions.Leitor;

public class Menu {
	Leitor leitor = new Leitor();
	FormatadorData fd = new FormatadorData();	
	
	int op;
	
	public int opcaoInvalida(int min, int max, int opcao) {
		
		System.out.println("INFORME SUA OPÇÃO: ");
		opcao = leitor.getValorInteiro();
		
		while(opcao < min || opcao > max) {
			System.out.println("VALOR INVÁLIDO! ESCOLHA NOVAMENTE.");
			
			System.out.print("OPÇÃO: ");
			opcao = leitor.getValorInteiro();
		}
		
		return opcao;
	}

	public int menuTelaInicial() {			
			System.out.println("-------------------------");
			System.out.println("   AGROTECH	\n\n");
			System.out.println("______MENU______\n");
			System.out.println("[1] SEÇÃO DE CADASTRO");
			System.out.println("[2] SEÇÃO DE VENDAS");
			System.out.println("[3] VACINAÇÕES");
			System.out.println("[4] RELATÓRIO GERAL\n");
			System.out.println("[0] FECHAR");
			
			op = opcaoInvalida(1, 4, op);	// valores maiores do que as opções
		
		return op;
	}

	
	public int printTipoAnimal() {

			System.out.println("\nSELECIONE O TIPO DE ANIMAL:");
			System.out.println("[1] BOI");
			System.out.println("[2] PORCO");
			
			op = opcaoInvalida(1, 2, op); // valores maiores do que as opções
		
		return op;
	}
	
	public int printTipoDePesoCadastrar() {
			System.out.println("\nQUAL UNIDADE DE PESO DESEJA CADASTRAR:");
			System.out.println("[1] KG");
			System.out.println("[2] @ (ARROBA)");
			
			op = opcaoInvalida(1, 2, op); // valores maiores do que as opções
		
		return op;
	}
	
	public int printValorDeMercado() {
		System.out.println("\nQUAL VALOR DESEJA ATUALIZAR:");
		System.out.println("[1] KG");
		System.out.println("[2] @ (ARROBA)");
		
		op = opcaoInvalida(1, 2, op); // valores maiores do que as opções
	
	return op;
	}
	
	public int printVenderMaisUmAnimal() {
		System.out.println("\nCADASTRAR MAIS ANIMAIS PARA VENDA:");
		System.out.println("[1] SIM");
		System.out.println("[2] NÃO");
		
		op = opcaoInvalida(1, 2, op); // valores maiores do que as opções
		
		return op;
	}
	
	public int printSelecionaListarAnimais() {
		System.out.println("\nLISTAR LOTE DE ANIMAIS A VENDA:");
		System.out.println("[1] SIM");
		System.out.println("[2] NÃO");
		
		op = opcaoInvalida(1, 2, op); // valores maiores do que as opções
		
		return op;
	}
	
	public int ListagemDeCadastrados() {
		System.out.println("\nO QUE PRETENDE LISTAR:");
		System.out.println("[1] BOVINOS");
		System.out.println("[2] SUINOS");
		System.out.println("[3] TODOS");
		
		op = opcaoInvalida(1, 3, op); // valores maiores do que as opções
		
		return op;
	}

	public int fecharPrograma() {
		System.out.println("VOCE SELECIONOU FECHAR O PROGRAMA");
		System.out.println("DESEJA CONTINUAR?");
		System.out.println("[1] SIM");
		System.out.println("[2] CANCELAR");
		
		op = opcaoInvalida(1, 2, op); // valores maiores do que as opções
		
		return op;
	}

	public int selecionaSuinoParaVacinar(int tamanhoDaLista, Registro r) {
		Listagem l = new Listagem();
		
		System.out.println("\nINFORME O ID DO ANIMAL QUE SE DESEJA VACINAR:");
		l.listarSuinos(r.getListaDeSuinos());
		
		op = opcaoInvalida(0, tamanhoDaLista, op); // valores maiores do que as opções
		return op;
	}
	
	
	public int selecionaBovinoParaVacinar(int tamanhoDaLista, Registro r){
		Listagem l = new Listagem();
		
		System.out.println("\nINFORME O ID DO ANIMAL QUE SE DESEJA VACINAR:");
		l.listarBovinos(r.getListaDeBovinos());
		
		op = opcaoInvalida(0, tamanhoDaLista, op); // valores maiores do que as opções
		return op;
	}
	
}