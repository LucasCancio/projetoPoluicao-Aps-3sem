package util.Tables.Models;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Rank;

public abstract class RankTableModel extends AbstractTableModel {
	
	protected List<Rank> ranks;
	protected ArrayList<String> colunas;

	public RankTableModel(List<Rank> ranks) {
		this.ranks = ranks;
		this.setColunas();
	}

	public RankTableModel() {
		this.ranks = new ArrayList<Rank>();
		this.setColunas();
	}

	public void setColunas() {
		colunas = new ArrayList<String>();
		colunas.add("Posição");
	}

	public int getRowCount() {
		return ranks.size();
	}

	public int getColumnCount() {
		return colunas.toArray().length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		return colunas.get(columnIndex);
	}

	public void setValueAt(Rank aValue, int rowIndex) {
		Rank rank = ranks.get(rowIndex);

		rank.setPosicao(aValue.getPosicao());

		//fireTableCellUpdated(rowIndex, 0);

	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Rank rank = ranks.get(rowIndex);

		switch (columnIndex) {
		case 0:
			rank.setPosicao(Integer.parseInt(aValue.toString()));

		default:
			System.err.println("Índice da coluna inválido");
		}
		//fireTableCellUpdated(rowIndex, columnIndex);
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		Rank rankselecionado = ranks.get(rowIndex);
		Object valueObject = null;
		switch (columnIndex) {
		case 0:
			valueObject = rankselecionado.getPosicao();
			break;
		default:
			System.err.println("Índice inválido para propriedade do bean RankTableModel.class");
		}

		return valueObject;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	public Rank getRank(int indiceLinha) {
		return ranks.get(indiceLinha);
	}

	public void addRank(Rank rank) {
		ranks.add(rank);

		int ultimoIndice = getRowCount() - 1;

		fireTableRowsInserted(ultimoIndice, ultimoIndice);
	}

	public void removeRank(int indiceLinha) {
		ranks.remove(indiceLinha);

		fireTableRowsDeleted(indiceLinha, indiceLinha);
	}

	public void addListaDeRanks(List<Rank> novosRanks) {

		int tamanhoAntigo = getRowCount();
		ranks.addAll(novosRanks);
		fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
	}

	public void limpar() {
		ranks.clear();
		fireTableDataChanged();
	}

	public boolean isEmpty() {
		return ranks.isEmpty();
	}
}