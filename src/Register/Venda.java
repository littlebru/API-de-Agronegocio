package Register;

import java.util.ArrayList;
import java.util.List;

import Calculation.CalculaVenda;
import Model.Animal;
import Model.Bovino;
import View.Listagem;
import View.Menu;

public class Venda {
	
	private List<Animal> animaisVendidos = new ArrayList<Animal>();
	private Listagem l = new Listagem();
	
	
	// FUNÇÃO GETTER PARA LISTA DE ANIMAIS
		public List<Animal> getListaDeAnimais(){
			return animaisVendidos;
		}
	
	// ------------------ SEÇÃO DEDICADA A VENDA DO ANIMAL ------------------
		
	// MÉTODO ADICIONA BOVINO NA LISTA DE CADASTRO
	public void vendeAnimal(Registro r) {
		Menu m = new Menu();
		int op = 0;
		boolean cadastrarMaisUmAnimal = false;
		
		int tamanhoLista = r.listaDeAnimais.size();
		
		do {
			l.listagemDeAnimais(r.getListaDeAnimais());
			
			System.out.println("SELECIONE OS ANIMAIS PARA VENDA: ");
			
			op = m.opcaoInvalida(0, tamanhoLista, op);
			
			// CADASTRANDO ANIMAL NA LISTA DE VENDAS
			animaisVendidos.add(r.getListaDeAnimais().get(op));

			// DESCADASTRANDO ANIMAL DA LISTA DE REGISTRO
			r.descadastraAnimal(op);
			
			op = m.printVenderMaisUmAnimal();
			if(op == 1) cadastrarMaisUmAnimal = true;
			else cadastrarMaisUmAnimal = false;
			
		}while(cadastrarMaisUmAnimal);
		
	}
	
	public void imprimeLote() {
		if(animaisVendidos.size() == 1) {
			System.out.println("---------- VENDA UNITÁRIA ----------");
			listaAnimaisVendidos();
		}
		else {
			System.out.println("---------- VENDA DE LOTE ----------");
			listaAnimaisVendidos();
		}
		
		
	}
	
	public void listaAnimaisVendidos() {
		Listagem l = new Listagem();
		l.listagemDeAnimais(animaisVendidos);
	}

}
