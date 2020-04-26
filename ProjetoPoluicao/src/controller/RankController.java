package controller;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import enums.RankType;
import model.Rank;
import model.RankMorte;
import model.RankPoluicao;
import util.LeitorArquivo;
import util.Tables.MorteTableModel;
import util.Tables.PoluicaoTableModel;
import util.Tables.RankTable;
import util.Tables.RankTableModel;
import view.RankForm;

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
		Rank rank=null;

		switch (rankType) {
		case RANK_MORTE:
			rank =(RankMorte)leitor.lerCSV("/bin/assests/dadosMorte.csv");
			break;
		case RANK_POLUICAO:
			rank =(RankPoluicao)leitor.lerCSV("/bin/assests/dadosPoluicao.csv");
			break;
		}

		RankTableModel tableModel = getTableModel();
		
		/* Demonstração de uma ideia doq fazer quando pegar os ArrayList >está incompleto<
		 * ArrayList<Rank> ranksCSV= getDados(json); 
		 * 
		 * for (Rank rank : ranksCSV) {
		 * rank = new RankMorte(1, "Brasil", 20); 
		 * rank = new RankPoluicao(0,"São Paulo", 0);
		 * tableModel.addRank(rank); 
		 * }
		 * 
		 */
		
		//ERRO: Não está inserindo a posição dos ranks
		
		//Parte que será retirada depois{
		switch (rankType) {
		case RANK_MORTE:
			rank = new RankMorte(1, "Brasil", 20);
			break;
		case RANK_POLUICAO:
			rank = new RankPoluicao(1, "São Paulo", 0);
			break;
		}		
		tableModel.addRank(rank);
		//}

		
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

	private ArrayList<Rank> getDados(String json) {
		// **Deserializar json para Lista da classe Rank
		// ArrayList<Rank> ranks= new ArrayList<Rank>();
		// ArrayList<Rank> ranks= new ArrayList<RankMorte>();
		// ArrayList<Rank> ranks= new ArrayList<RankPoluicao>();

		return new ArrayList<Rank>();
	}

}
