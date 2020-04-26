package util.Tables;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;

public class RankTable extends JTable {
	public RankTable(RankTableModel rankTableModel) {
		super(rankTableModel);
		this.createTable();
	}

	public RankTable(Object[][] dados, Object[] colunas) {
		super(dados, colunas);
		this.createTable();
	}
	
	private void createTable() {	
		this.getTableHeader().setReorderingAllowed(false);
		this.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
	    return false;
	}

}
