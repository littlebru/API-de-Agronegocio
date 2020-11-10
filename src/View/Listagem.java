package View;

import java.util.List;

import Model.Animal;
import Model.Bovino;
import Model.Suino;

public class Listagem {
	
	// METODO DE TESTE
	public void listagemDeAnimais(List<Animal> lista) {
		Menu m = new Menu();
		int op;
		
		op = m.ListagemDeCadastrados();
		
		switch(op) {
		case 1:
			listarBovinos(lista);
			break;
		case 2:
			listarSuinos(lista);
			break;
		case 3:
			listarTodosOsAnimais(lista);
			break;
		}
		
	}
	
	public void listarBovinos(List<Animal> lista) {
		for(Animal a: lista) {
			if(a instanceof Bovino) {
				System.out.println("["+ lista.indexOf(a) +"] "+" ID: " + a.getId());
				System.out.println("Raça: " + a.getRaca());
				System.out.println("Genero: " + a.getGenero());
				System.out.println("Data de Nascimento: " + a.getDataDeNascimento());
				System.out.println("-----PESO-----");
				System.out.println(a.pesoArroba.getPeso() + " @");
				System.out.println(a.pesoKg.getPeso() + " Kg");
				System.out.println("----------------------------------------");

			}
		}
	}
	
	public void listarSuinos(List<Animal> lista) {
		for(Animal a: lista) {
			if(a instanceof Suino) {
				System.out.println("["+ lista.indexOf(a) +"] "+" ID: " + a.getId());
				System.out.println("Raça: " + a.getRaca());
				System.out.println("Genero: " + a.getGenero());
				System.out.println("Data de Nascimento: " + a.getDataDeNascimento());
				System.out.println("-----PESO-----");
				System.out.println(a.pesoArroba.getPeso() + " @");
				System.out.println(a.pesoKg.getPeso() + " Kg");
				System.out.println("----------------------------------------");

			}
		}
	}
	
	public void listarTodosOsAnimais(List<Animal> lista) {
		for(Animal a: lista) {
				System.out.println("["+ lista.indexOf(a) +"] "+" ID: " + a.getId());
				System.out.println("Raça: " + a.getRaca());
				System.out.println("Genero: " + a.getGenero());
				System.out.println("Data de Nascimento: " + a.getDataDeNascimento());
				System.out.println("-----PESO-----");
				System.out.println(a.pesoArroba.getPeso() + " @");
				System.out.println(a.pesoKg.getPeso() + " Kg");
				System.out.println("----------------------------------------");
		}
	}

}
