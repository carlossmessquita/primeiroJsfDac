package bd;

import java.util.ArrayList;
import java.util.List;

import entidade.Jogador;

public class BancoDeDados {
	
	private static List<Jogador> banco = new ArrayList<Jogador>();
	
	public static void create(Jogador j) {
		banco.add(j);
	}
	
	public static void select() {}
	

}
