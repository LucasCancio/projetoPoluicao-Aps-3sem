package util.Tables.Models;

import java.util.ArrayList;
import java.util.List;

import model.Rank;
import model.RankPoluicao;

public class PoluicaoTableModel extends RankTableModel {
	public PoluicaoTableModel(List<Rank> ranks) {
	       this.ranks = ranks;
	       this.setColunas();
	   }

	public PoluicaoTableModel(){
	    this.ranks = new ArrayList<Rank>();
	    this.setColunas();
	   }
	
	@Override
	public void setColunas() {
		super.setColunas();
		//super.colunas.add("Rank");
		super.colunas.add("País");
		super.colunas.add("CO2(Toneladas/Milhões)");		
	}

	public void setValueAt(RankPoluicao aValue, int rowIndex) {
		super.setValueAt(aValue, rowIndex);
		RankPoluicao rank = (RankPoluicao) ranks.get(rowIndex);

		rank.setPosicao(aValue.getPosicao());
		rank.setCidade(aValue.getCidade());
		rank.setPoluicao(aValue.getPoluicao());	

		fireTableCellUpdated(rowIndex, 1);
		fireTableCellUpdated(rowIndex, 2);

	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {	
		RankPoluicao rank = (RankPoluicao) ranks.get(rowIndex);

		switch (columnIndex) {
		case 1:
			rank.setCidade(aValue.toString());		
		case 2:
			rank.setPoluicao(Integer.parseInt(aValue.toString()));

		default:
			super.setValueAt(aValue, rowIndex, columnIndex);
		}
		fireTableCellUpdated(rowIndex, columnIndex);
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {	
		RankPoluicao rankselecionado = (RankPoluicao) ranks.get(rowIndex);
		Object valueObject = null;
		switch (columnIndex) {
		case 1:
			valueObject = rankselecionado.getCidade();
			break;
		case 2:
			valueObject = rankselecionado.getPoluicao();
			break;
		default:
			valueObject = super.getValueAt(rowIndex, columnIndex);
		}

		return valueObject;
	}
}
