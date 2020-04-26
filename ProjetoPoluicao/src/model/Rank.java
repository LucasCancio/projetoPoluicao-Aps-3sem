package model;

public abstract class Rank {

	private int posicao;
	
	public Rank(int posicao) {
		this.setPosicao(posicao);
	}

	// Getters e Setters
	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
}
