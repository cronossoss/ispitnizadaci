package Cvece;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;


public class AplikacijaCvece {
	
	ArrayList<Sobno> ls = new ArrayList<Sobno>();
	ArrayList<Drvenasto> ls1 = new ArrayList<Drvenasto>();

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplikacijaCvece window = new AplikacijaCvece();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AplikacijaCvece() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 691, 444);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		ArrayList<Sobno> ls = new ArrayList<Sobno>();
		ArrayList<Drvenasto> ls1 = new ArrayList<Drvenasto>();
		
		JLabel lblNaziv = new JLabel("Naziv:");
		lblNaziv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNaziv.setBounds(10, 25, 50, 20);
		frame.getContentPane().add(lblNaziv);
		
		JLabel lblGodina = new JLabel("Godina:");
		lblGodina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblGodina.setBounds(10, 50, 50, 20);
		frame.getContentPane().add(lblGodina);
		
		JLabel lblCena = new JLabel("Cena:");
		lblCena.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCena.setBounds(10, 75, 50, 20);
		frame.getContentPane().add(lblCena);
		
		textField = new JTextField();
		textField.setBounds(60, 25, 90, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(60, 50, 90, 20);
		frame.getContentPane().add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(60, 231, 90, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblVrsta = new JLabel("Vrsta:");
		lblVrsta.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVrsta.setBounds(10, 125, 50, 20);
		frame.getContentPane().add(lblVrsta);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Sobno", "Drvenasto"}));
		comboBox.setBounds(60, 126, 90, 20);
		frame.getContentPane().add(comboBox);
		
		JCheckBox chckbxOtrovno = new JCheckBox("Otrovno");
		chckbxOtrovno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxOtrovno.setBounds(60, 186, 97, 23);
		frame.getContentPane().add(chckbxOtrovno);
		
		JLabel lblVisina = new JLabel("Visina:");
		lblVisina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVisina.setBounds(10, 230, 50, 20);
		frame.getContentPane().add(lblVisina);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(60, 75, 90, 20);
		frame.getContentPane().add(textField_2);
		
		JButton btnUnos = new JButton("Unos");
		btnUnos.setBounds(37, 262, 89, 23);
		frame.getContentPane().add(btnUnos);
		
		
		JLabel lblMinimalnaCena = new JLabel("Minimalna cena:");
		lblMinimalnaCena.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMinimalnaCena.setBounds(10, 314, 100, 20);
		frame.getContentPane().add(lblMinimalnaCena);
		
		JLabel lblMaximalnaCena = new JLabel("Maximalna cena:");
		lblMaximalnaCena.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMaximalnaCena.setBounds(10, 345, 100, 20);
		frame.getContentPane().add(lblMaximalnaCena);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(105, 315, 90, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(105, 346, 90, 20);
		frame.getContentPane().add(textField_5);
		
		JButton btnIspis = new JButton("Ispis");
		btnIspis.setBounds(383, 200, 89, 23);
		frame.getContentPane().add(btnIspis);
		
		JButton btnIzbor = new JButton("Izbor");
		btnIzbor.setBounds(383, 376, 89, 23);
		frame.getContentPane().add(btnIzbor);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(175, 11, 479, 183);
		frame.getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(206, 234, 448, 131);
		frame.getContentPane().add(textArea_1);
		
		
			btnUnos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String n = textField.getText();
					String g = textField_1.getText();
					String c = textField_2.getText().trim();
					Boolean o=chckbxOtrovno.isSelected();
					String vi=textField_3.getText();
					String v=((String)comboBox.getSelectedItem());
					if(v.equals("Sobno")){
					try {
						int god = Integer.parseInt(g);
						double ce = Double.parseDouble(c);
						Sobno s = new Sobno(n, god, ce,o);
						ls.add(s);

					} catch (Exception ex) {
						JOptionPane.showMessageDialog(null,"Pogresan format!!!");
					}
					}
					else
						try {
							int god = Integer.parseInt(g);
							double ce = Double.parseDouble(c);
							double vis=Double.parseDouble(vi);
							Drvenasto s = new Drvenasto(n, god, ce,vis);
							ls1.add(s);

						} catch (Exception ex) {
							JOptionPane.showMessageDialog(null,"Pogresan format!!!");
						}
						
				}
			});
			
				btnIspis.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea.setText(null);
					textArea.setText("Drvenasto cveæe koje živi duže od 5 godina je:\n");	
						for(Drvenasto g:ls1)
							if(g.getGod()>5)
							textArea.append("\n "+g.getNaziv());
				}
			});
			
			btnIzbor.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double min=Double.parseDouble(textField_4.getText());
					double max=Double.parseDouble(textField_5.getText());
					textArea_1.setText(null);
					textArea_1.setText("Cvece u zadatom intervalu je:\n");	
						for(Drvenasto c:ls1)
							if(c.getCena()>min && c.getCena()<max)
							textArea_1.append("\n "+c);
						for(Sobno c:ls)
							if(c.getCena()>min && c.getCena()<max)
							textArea_1.append("\n "+c);
				}
			});
	}
}
