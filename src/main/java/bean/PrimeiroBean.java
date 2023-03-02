package bean;

import javax.faces.bean.ManagedBean;

import bd.BancoDeDados;
import entidade.Jogador;

@ManagedBean
public class PrimeiroBean {
	private Jogador jogador;

	public String salvar() {
		BancoDeDados.create(jogador);;
		return null;
	}
	
	public Jogador getJogador() {
		BancoDeDados.select();
		return jogador;
	}

	
	public void setNome(Jogador jogador) {
		this.jogador = jogador;
	}
	
	
}
