package model;

public class RankPoluicao extends Rank {
	public RankPoluicao(int posicao,String cidade,int poluicao) {
		super(posicao);
		this.setCidade(cidade);
		this.setPoluicao(poluicao);
	}
	
	public String cidade;
	public int poluicao;
	
	//Getters e Setters
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getPoluicao() {
		return poluicao;
	}
	public void setPoluicao(int poluicao) {
		this.poluicao = poluicao;
	}
}
