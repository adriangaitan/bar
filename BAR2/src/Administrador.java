
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Administrador {

	private JFrame frame;
	private JTextField txtAadeAquLa;
	private JLabel lblAadeLaCategora;
	private JLabel lblNombre;
	private JButton button_1;
	private JButton button_5;
	private JButton button_6;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JButton button_2;
	private JTextField textField_1;
	private JTextField textField_4;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Administrador window = new Administrador();
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
	public Administrador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 825, 624);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("CATEGORIAS Y PRODUCTOS");
		btnNewButton.setBounds(10, 26, 790, 70);
		btnNewButton.setFont(new Font("The Next Font", Font.PLAIN, 25));
		btnNewButton.setForeground(Color.BLACK);
		frame.getContentPane().add(btnNewButton);
		
		txtAadeAquLa = new JTextField();
		txtAadeAquLa.setBounds(10, 190, 166, 21);
		txtAadeAquLa.setFont(new Font("The Next Font", Font.PLAIN, 25));
		txtAadeAquLa.setForeground(new Color(0, 0, 0));
		txtAadeAquLa.setText("");
		frame.getContentPane().add(txtAadeAquLa);
		txtAadeAquLa.setColumns(10);
		
		lblAadeLaCategora = new JLabel("PRODUCTOS");
		lblAadeLaCategora.setBounds(321, 110, 156, 44);
		lblAadeLaCategora.setFont(new Font("The Next Font", Font.PLAIN, 25));
		lblAadeLaCategora.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(lblAadeLaCategora);
		
		lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(261, 165, 73, 21);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("The Next Font", Font.PLAIN, 15));
		frame.getContentPane().add(lblNombre);
		
		button_1 = new JButton("ELIMINAR");
		button_1.setBounds(486, 281, 314, 32);
		button_1.setForeground(Color.RED);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setFont(new Font("The Next Font", Font.PLAIN, 20));
		frame.getContentPane().add(button_1);
		
		button_5 = new JButton("VOLVER");
		button_5.setBounds(10, 493, 242, 82);
		button_5.setFont(new Font("The Next Font", Font.PLAIN, 30));
		button_5.setBackground(SystemColor.menu);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("CONFIRMAR");
		button_6.setBounds(558, 493, 242, 82);
		button_6.setFont(new Font("The Next Font", Font.PLAIN, 30));
		button_6.setBackground(SystemColor.menu);
		frame.getContentPane().add(button_6);
		
		textField = new JTextField();
		textField.setBounds(211, 190, 166, 21);
		textField.setText("");
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("The Next Font", Font.PLAIN, 25));
		textField.setColumns(10);
		frame.getContentPane().add(textField);
		
		textField_2 = new JTextField();
		textField_2.setBounds(433, 190, 166, 21);
		textField_2.setText("");
		textField_2.setForeground(Color.BLACK);
		textField_2.setFont(new Font("The Next Font", Font.PLAIN, 25));
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(634, 190, 166, 21);
		textField_3.setText("");
		textField_3.setForeground(Color.BLACK);
		textField_3.setFont(new Font("The Next Font", Font.PLAIN, 25));
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		
		JLabel lblCategoria = new JLabel("CATEGORIA");
		lblCategoria.setBounds(48, 165, 108, 21);
		lblCategoria.setForeground(Color.BLACK);
		lblCategoria.setFont(new Font("The Next Font", Font.PLAIN, 15));
		frame.getContentPane().add(lblCategoria);
		
		JLabel lblPrecio = new JLabel("PRECIO");
		lblPrecio.setBounds(486, 165, 73, 21);
		lblPrecio.setForeground(Color.BLACK);
		lblPrecio.setFont(new Font("The Next Font", Font.PLAIN, 15));
		frame.getContentPane().add(lblPrecio);
		
		JLabel lblCantidad = new JLabel("CANTIDAD");
		lblCantidad.setBounds(680, 165, 80, 21);
		lblCantidad.setForeground(Color.BLACK);
		lblCantidad.setFont(new Font("The Next Font", Font.PLAIN, 15));
		frame.getContentPane().add(lblCantidad);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 222, 453, 91);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("The Next Font", Font.PLAIN, 25));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"CATEGORIA", "NOMBRE", "PRECIO", "CANTIDAD"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("MODIFICAR");
		button.setForeground(Color.ORANGE);
		button.setFont(new Font("The Next Font", Font.PLAIN, 20));
		button.setBounds(486, 252, 314, 32);
		frame.getContentPane().add(button);
		
		button_2 = new JButton("AÑADIR");
		button_2.setForeground(Color.GREEN);
		button_2.setFont(new Font("The Next Font", Font.PLAIN, 20));
		button_2.setBounds(486, 222, 314, 32);
		frame.getContentPane().add(button_2);
		
		JLabel lblIdCategoria = new JLabel("ID CATEGORIA");
		lblIdCategoria.setForeground(Color.BLACK);
		lblIdCategoria.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblIdCategoria.setBounds(48, 371, 108, 21);
		frame.getContentPane().add(lblIdCategoria);
		
		JLabel lblCategorias = new JLabel("CATEGORIAS");
		lblCategorias.setForeground(new Color(0, 0, 0));
		lblCategorias.setFont(new Font("The Next Font", Font.PLAIN, 25));
		lblCategorias.setBounds(321, 324, 166, 44);
		frame.getContentPane().add(lblCategorias);
		
		JLabel lblNombre_1 = new JLabel("NOMBRE");
		lblNombre_1.setForeground(Color.BLACK);
		lblNombre_1.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblNombre_1.setBounds(48, 417, 108, 21);
		frame.getContentPane().add(lblNombre_1);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("The Next Font", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 391, 166, 21);
		frame.getContentPane().add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.setText("");
		textField_4.setForeground(Color.BLACK);
		textField_4.setFont(new Font("The Next Font", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(10, 439, 166, 21);
		frame.getContentPane().add(textField_4);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(221, 367, 242, 91);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"IDCATEGORIA", "NOMBRE"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton button_3 = new JButton("A\u00D1ADIR");
		button_3.setForeground(Color.GREEN);
		button_3.setFont(new Font("The Next Font", Font.PLAIN, 20));
		button_3.setBounds(486, 365, 314, 32);
		frame.getContentPane().add(button_3);
		
		JButton button_7 = new JButton("ELIMINAR");
		button_7.setForeground(Color.RED);
		button_7.setFont(new Font("The Next Font", Font.PLAIN, 20));
		button_7.setBounds(486, 428, 314, 32);
		frame.getContentPane().add(button_7);
		
		JButton button_4 = new JButton("MODIFICAR");
		button_4.setForeground(Color.ORANGE);
		button_4.setFont(new Font("The Next Font", Font.PLAIN, 20));
		button_4.setBounds(486, 393, 314, 38);
		frame.getContentPane().add(button_4);
	}
}
