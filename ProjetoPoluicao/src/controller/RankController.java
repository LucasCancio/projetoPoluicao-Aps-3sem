package controller;

import java.util.ArrayList;
import javax.swing.JTable;

import enums.RankType;
import model.Rank;
import model.RankMorte;
import model.RankPoluicao;
import util.LeitorArquivo;
import util.Tables.RankTable;
import util.Tables.Models.MorteTableModel;
import util.Tables.Models.PoluicaoTableModel;
import util.Tables.Models.RankTableModel;

public class RankController {
	private RankType rankType;

	public RankController(RankType rankType) {
		this.rankType = rankType;
	}

	public String getTituloRank() {
		return this.rankType.getTitulo();
	}

	public JTable getTabela() throws Exception {
		LeitorArquivo leitor = new LeitorArquivo();

		ArrayList<String> dados = new ArrayList<String>();
		
		RankTableModel tableModel = getTableModel();
		
		switch (rankType) {
		case RANK_MORTE:
			dados = leitor.lerCSV("bin/assets/dadosMorte.csv");

			break;
		case RANK_POLUICAO:
			dados = leitor.lerCSV("bin/assets/dadosPoluicao.csv");
			break;
		}

		tableModel = adicionarDadosTableModel(dados,tableModel);
		
		RankTable rankTable = new RankTable(tableModel);
		return rankTable;
	}

	private RankTableModel getTableModel() {
		RankTableModel rankTableModel = null;
		
		switch (rankType) {
		case RANK_MORTE:
			rankTableModel = new MorteTableModel();
			break;
		case RANK_POLUICAO:
			rankTableModel = new PoluicaoTableModel();
			break;
		}

		return rankTableModel;
	}

	private RankTableModel adicionarDadosTableModel(ArrayList<String> dados, RankTableModel tableModel) {	
		Rank rank=null;
		
		int n = dados.size();
		int i = 0;
		for (i = 0; i < n; i++) {

			String[] linha = dados.get(i).split(";");
			
			switch (rankType) {
			case RANK_MORTE:
				rank = new RankMorte(
						Integer.parseInt(linha[0]), 
						linha[1], 
						Integer.parseInt(linha[2])
						);			
				break;
			case RANK_POLUICAO:
				rank = new RankPoluicao(
						Integer.parseInt(linha[0]), 
						linha[1], 
						Integer.parseInt(linha[2])
						);			
				break;
			}	
			tableModel.addRank(rank);
		}

		

		return tableModel;
	}

}
