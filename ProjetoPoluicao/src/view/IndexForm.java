package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controller.IndexController;

public class IndexForm extends JFrame {
	
	public static JPanel contentPane;
	
	private final static IndexController _indexController= new IndexController();
	
	public static JFormattedTextField txtDtNasc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndexForm frame = new IndexForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public IndexForm() {
		setResizable(false);
		setBackground(new Color(0, 153, 204));
		createFrame();		
	}
	
	/**
	 * Create the frame.
	 */
	private void createFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		JPanel pnHome = new JPanel();
		pnHome.setBackground(new Color(0, 153, 204));
		pnHome.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel label_3 = new JLabel("Polui\u00E7\u00E3o Mundial");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Consolas", Font.BOLD, 43));
		pnHome.add(label_3);
		
		JPanel pnMenu = new JPanel();
		pnMenu.setBackground(new Color(0, 153, 204));
		pnMenu.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton button = new JButton("Resumo");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_indexController.abrirResumo();
			}
		});
		button.setFont(new Font("Nirmala UI", Font.BOLD, 14));
		pnMenu.add(button);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(0, 153, 204));
		pnMenu.add(label);
		
		JButton button_1 = new JButton("Rank de Mortes");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					_indexController.abrirRankMorte();
 				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		pnMenu.add(button_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(new Color(0, 153, 204));
		pnMenu.add(label_1);
		
		JButton button_2 = new JButton("Rank de Polui\u00E7\u00E3o");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					_indexController.abrirRankPoluicao();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		pnMenu.add(button_2);
		
		JLabel label_2 = new JLabel("");
		label_2.setBackground(new Color(0, 153, 204));
		pnMenu.add(label_2);
		
		JButton button_3 = new JButton("Solu\u00E7\u00F5es");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				_indexController.abrirSolucao();
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		pnMenu.add(button_3);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		contentPane.add(pnHome);
		contentPane.add(pnMenu);
	}
}