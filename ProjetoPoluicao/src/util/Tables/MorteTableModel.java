package util.Tables;

import java.util.ArrayList;
import java.util.List;

import model.Rank;
import model.RankMorte;

public class MorteTableModel extends RankTableModel {

	public MorteTableModel(List<Rank> ranks) {
	       this.ranks = ranks;
	       this.setColunas();
	   }

	public MorteTableModel(){
	    this.ranks = new ArrayList<Rank>();
	    this.setColunas();
	   }
	
	@Override
	public void setColunas() {
		super.setColunas();
		super.colunas.add("País");
		super.colunas.add("Qtde por cada 100 mil habitantes");		
	}

	public void setValueAt(RankMorte aValue, int rowIndex) {
		super.setValueAt(aValue, rowIndex);
		RankMorte rank = (RankMorte) ranks.get(rowIndex);
		
		rank.setPais(aValue.getPais());
		rank.setMortes(aValue.getMortes());
		
		fireTableCellUpdated(rowIndex, 1);
		fireTableCellUpdated(rowIndex, 2);

	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		RankMorte rank = (RankMorte) ranks.get(rowIndex);
		
		switch (columnIndex) {
		case 1:
			rank.setPais(aValue.toString());		
		case 2:
			rank.setMortes(Integer.parseInt(aValue.toString()));

		default:
			super.setValueAt(aValue, rowIndex, columnIndex);
		}
		//fireTableCellUpdated(rowIndex, columnIndex);
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		RankMorte rankselecionado = (RankMorte) ranks.get(rowIndex);
		Object valueObject = null;
		switch (columnIndex) {
		case 1:
			valueObject = rankselecionado.getPais();			
			break;
		case 2:
			valueObject = rankselecionado.getMortes();
			break;
		default:
			super.getValueAt(rowIndex, columnIndex);
		}

		return valueObject;
	}

}
