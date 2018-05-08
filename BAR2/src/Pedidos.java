import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JScrollPane;

public class Pedidos {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblTotalComanda;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedidos window = new Pedidos();
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
	public Pedidos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.getContentPane().setForeground(Color.RED);
		frame.setBounds(100, 100, 816, 638);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblIntroducirNDe = new JLabel("NUEVA COMANDA");
		lblIntroducirNDe.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblIntroducirNDe.setBackground(new Color(240, 240, 240));
		lblIntroducirNDe.setBounds(24, 47, 197, 28);
		frame.getContentPane().add(lblIntroducirNDe);
		
		textField = new JTextField();
		textField.setBounds(184, 49, 47, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblTotalComanda = new JLabel("TOTAL COMANDA");
		lblTotalComanda.setForeground(Color.RED);
		lblTotalComanda.setFont(new Font("The Next Font", Font.PLAIN, 20));
		lblTotalComanda.setBounds(312, 320, 177, 28);
		frame.getContentPane().add(lblTotalComanda);
		
		btnNewButton = new JButton("AÑADIR");
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("The Next Font", Font.PLAIN, 25));
		btnNewButton.setBounds(24, 87, 207, 47);
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("COBRAR");
		button.setFont(new Font("The Next Font", Font.PLAIN, 25));
		button.setBounds(473, 450, 149, 45);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("TICKET");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setFont(new Font("The Next Font", Font.PLAIN, 25));
		button_1.setBounds(173, 449, 149, 47);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("VOLVER");
		button_2.setFont(new Font("The Next Font", Font.PLAIN, 30));
		button_2.setBackground(SystemColor.menu);
		button_2.setBounds(24, 507, 242, 82);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("CONFIRMAR");
		button_3.setFont(new Font("The Next Font", Font.PLAIN, 30));
		button_3.setBackground(SystemColor.menu);
		button_3.setBounds(548, 507, 242, 82);
		frame.getContentPane().add(button_3);
		
		JLabel lblAadirPedido = new JLabel("A\u00D1ADIR PEDIDO");
		lblAadirPedido.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblAadirPedido.setBackground(SystemColor.menu);
		lblAadirPedido.setBounds(24, 145, 125, 28);
		frame.getContentPane().add(lblAadirPedido);
		
		JLabel lblCategoria = new JLabel("CATEGORIA");
		lblCategoria.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblCategoria.setBackground(SystemColor.menu);
		lblCategoria.setBounds(24, 184, 108, 28);
		frame.getContentPane().add(lblCategoria);
		
		JLabel lblNombreProducto = new JLabel("NOMBRE PRODUCTO");
		lblNombreProducto.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblNombreProducto.setBackground(SystemColor.menu);
		lblNombreProducto.setBounds(24, 223, 161, 28);
		frame.getContentPane().add(lblNombreProducto);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(184, 147, 47, 24);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(184, 186, 47, 24);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(184, 225, 47, 24);
		frame.getContentPane().add(textField_4);
		
		JLabel lblMesas = new JLabel("MESAS");
		lblMesas.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblMesas.setBackground(SystemColor.menu);
		lblMesas.setBounds(290, 11, 56, 28);
		frame.getContentPane().add(lblMesas);
		
		JLabel lblProductos = new JLabel("PRODUCTOS");
		lblProductos.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblProductos.setBackground(SystemColor.menu);
		lblProductos.setBounds(568, 11, 108, 28);
		frame.getContentPane().add(lblProductos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(252, 47, 137, 262);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"IDMESA"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(399, 47, 374, 262);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"IDMESA", "CATEGORIA", "NOMBRE", "PRECIO", "CANTIDAD"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton button_4 = new JButton("A\u00D1ADIR");
		button_4.setForeground(Color.GREEN);
		button_4.setFont(new Font("The Next Font", Font.PLAIN, 25));
		button_4.setBounds(24, 262, 207, 47);
		frame.getContentPane().add(button_4);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(173, 345, 449, 93);
		frame.getContentPane().add(scrollPane_2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"IDMESA", "CANTIDAD"
			}
		));
		scrollPane_2.setViewportView(table_2);
	}
}
