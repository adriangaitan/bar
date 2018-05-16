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
import java.awt.SystemColor;
import javax.swing.JScrollPane;

public class Pedidos {

	JFrame frame;
	private JTextField textField;
	private JLabel lblTotalComanda;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;
	private JTable table_2;
	private JTable table_1;
	private JButton btnVerMesas;
	private JButton btnVerProductos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
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
		lblIntroducirNDe.setBounds(34, 11, 197, 28);
		lblIntroducirNDe.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblIntroducirNDe.setBackground(new Color(240, 240, 240));
		frame.getContentPane().add(lblIntroducirNDe);
		
		textField = new JTextField();
		textField.setBounds(184, 49, 47, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblTotalComanda = new JLabel("TOTAL COMANDA");
		lblTotalComanda.setBounds(312, 320, 177, 28);
		lblTotalComanda.setForeground(Color.RED);
		lblTotalComanda.setFont(new Font("The Next Font", Font.PLAIN, 20));
		frame.getContentPane().add(lblTotalComanda);
		
		btnNewButton = new JButton("AÑADIR");
		btnNewButton.setBounds(24, 87, 207, 47);
		btnNewButton.setForeground(Color.GREEN);
		btnNewButton.setFont(new Font("The Next Font", Font.PLAIN, 25));
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("COBRAR");
		button.setBounds(473, 450, 149, 45);
		button.setFont(new Font("The Next Font", Font.PLAIN, 25));
		frame.getContentPane().add(button);
		
		button_1 = new JButton("TICKET");
		button_1.setBounds(173, 449, 149, 47);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setFont(new Font("The Next Font", Font.PLAIN, 25));
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("VOLVER");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				VentanaPrincipal window = new VentanaPrincipal();
				window.frame.setVisible(true);
			}
		});
		button_2.setBounds(24, 542, 242, 47);
		button_2.setFont(new Font("The Next Font", Font.PLAIN, 30));
		button_2.setBackground(SystemColor.menu);
		frame.getContentPane().add(button_2);
		
		JLabel lblAadirPedido = new JLabel("A\u00D1ADIR PEDIDO");
		lblAadirPedido.setBounds(24, 145, 125, 28);
		lblAadirPedido.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblAadirPedido.setBackground(SystemColor.menu);
		frame.getContentPane().add(lblAadirPedido);
		
		JLabel lblCategoria = new JLabel("CATEGORIA");
		lblCategoria.setBounds(24, 184, 108, 28);
		lblCategoria.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblCategoria.setBackground(SystemColor.menu);
		frame.getContentPane().add(lblCategoria);
		
		JLabel lblNombreProducto = new JLabel("NOMBRE PRODUCTO");
		lblNombreProducto.setBounds(24, 223, 161, 28);
		lblNombreProducto.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblNombreProducto.setBackground(SystemColor.menu);
		frame.getContentPane().add(lblNombreProducto);
		
		textField_2 = new JTextField();
		textField_2.setBounds(184, 147, 47, 24);
		textField_2.setColumns(10);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(184, 186, 47, 24);
		textField_3.setColumns(10);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(184, 225, 47, 24);
		textField_4.setColumns(10);
		frame.getContentPane().add(textField_4);
		
		JLabel lblMesas = new JLabel("MESAS");
		lblMesas.setBounds(361, 11, 56, 28);
		lblMesas.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblMesas.setBackground(SystemColor.menu);
		frame.getContentPane().add(lblMesas);
		
		JLabel lblProductos = new JLabel("PRODUCTOS");
		lblProductos.setBounds(613, 11, 108, 28);
		lblProductos.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblProductos.setBackground(SystemColor.menu);
		frame.getContentPane().add(lblProductos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(521, 49, 269, 216);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"IDPRODUCTO", "NOMBRE", "PRECIO", "CANTIDAD_RESTANTE"
			}
		));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(259, 49, 252, 216);
		frame.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"IDMESA", "NUMERO_SILLAS", "UBICACION_SILLAS"
			}
		));
		scrollPane_1.setViewportView(table_1);
		
		JButton button_4 = new JButton("A\u00D1ADIR");
		button_4.setBounds(24, 262, 207, 47);
		button_4.setForeground(Color.GREEN);
		button_4.setFont(new Font("The Next Font", Font.PLAIN, 25));
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
		
		btnVerMesas = new JButton("VER MESAS");
		btnVerMesas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConexionBBDD Prueba1 = new ConexionBBDD();
				table_1.setModel(Prueba1.ConsultaMesas());
			}
		});
		btnVerMesas.setForeground(Color.BLUE);
		btnVerMesas.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnVerMesas.setBounds(259, 263, 252, 44);
		frame.getContentPane().add(btnVerMesas);
		
		btnVerProductos = new JButton("VER PRODUCTOS");
		btnVerProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConexionBBDD Prueba1 = new ConexionBBDD();
				table.setModel(Prueba1.ConsultaTablaCategorias());
			}
		});
		btnVerProductos.setForeground(Color.BLUE);
		btnVerProductos.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnVerProductos.setBounds(521, 263, 269, 44);
		frame.getContentPane().add(btnVerProductos);
		
		JLabel lblIdMesa = new JLabel("ID MESA");
		lblIdMesa.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblIdMesa.setBackground(SystemColor.menu);
		lblIdMesa.setBounds(34, 45, 149, 28);
		frame.getContentPane().add(lblIdMesa);
	}
}
