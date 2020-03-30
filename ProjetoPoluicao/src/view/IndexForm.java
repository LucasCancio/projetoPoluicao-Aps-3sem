package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import controller.IndexController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JDesktopPane;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Component;

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
				_indexController.abrirRankMorte();
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
				_indexController.abrirRankPoluicao();
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
		
		
      
		ImageIcon imgIcon = new ImageIcon(IndexForm.class.getResource("/assets/img/Polui\u00E7\u00E3oBackground.jpg"));
		Image image = imgIcon.getImage(); // transform it 
		Image newimg = image.getScaledInstance(349, 222,  java.awt.Image.SCALE_DEFAULT); // scale it the smooth way  
		imgIcon = new ImageIcon(newimg);	
	}
}