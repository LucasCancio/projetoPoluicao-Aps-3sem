package enums;

public enum Ranks {
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
	
	Ranks(int valorRank,String titulo) {
        this.valorRank = valorRank;
        this.titulo=titulo;
    }
}
