package util.Tables;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

import util.Tables.Models.RankTableModel;

//Criar JTable personalizada
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
		this.setCellsAlignment(this, JLabel.CENTER);
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
	    return false;
	}

	public void setCellsAlignment(JTable table, int alignment)
    {
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(alignment);

        TableModel tableModel = table.getModel();

        for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++)
        {
            table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
        }
    }
}
