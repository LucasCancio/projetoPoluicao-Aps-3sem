package enums;

public enum RankType {
	RANK_MORTE(0,"Rank de Mortes"),
	RANK_POLUICAO(1,"Rank de Poluição");
	
	public int getValorRank() {
		return valorRank;
	}

	public String getTitulo() {
		return titulo;
	}

	private int valorRank;
	private String titulo;
	
	RankType(int valorRank,String titulo) {
        this.valorRank = valorRank;
        this.titulo=titulo;
    }
}
