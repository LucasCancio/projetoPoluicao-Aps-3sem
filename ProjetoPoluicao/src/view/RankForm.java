package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import controller.RankController;
import enums.RankType;

import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class RankForm extends JFrame {

	private JPanel contentPane;
	
	private JTable tbRank;
	
	private RankController _rankController;

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public RankForm(RankType rankType) throws Exception {
		setResizable(false);
		_rankController= new RankController(rankType);
		createFrame();
	}
	public void createFrame() throws Exception {		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 681, 372);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		tbRank = _rankController.getTabela();
		tbRank.setVisible(true);
        JScrollPane scroll = new JScrollPane();
        scroll.setViewportView(tbRank);
        this.getContentPane().add(scroll);
		
		JLabel lblTitulo = new JLabel(_rankController.getTituloRank());
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBackground(new Color(0, 153, 204));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 28));
		contentPane.add(lblTitulo, BorderLayout.NORTH);
	}

}
