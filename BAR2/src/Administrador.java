import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;


public class Administrador {

	JFrame frame;
	private JTextField txtAadeAquLa;
	private JLabel lblAadeLaCategora;
	private JLabel lblNombre;
	private JButton button_1;
	private JButton button_5;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JButton button_2;
	private JTextField textField_1;
	private JTextField textField_4;
	public ConexionBBDD conexion;
	Producto p;
	Integer IDPRODUCTO;
	String NOMBRE;
	double PRECIO;
	Integer CANTIDAD_RESTANTE;
	Categoria c;
	Integer IDCATEGORIA;
	String TIPO_PRODUCTO;

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
	public Administrador() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		conexion = new ConexionBBDD();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 825, 624);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("VER PRODUCTOS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListaCategoriasProductos window = new ListaCategoriasProductos();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 26, 790, 44);
		btnNewButton.setFont(new Font("The Next Font", Font.PLAIN, 25));
		btnNewButton.setForeground(Color.BLUE);
		frame.getContentPane().add(btnNewButton);
		
		txtAadeAquLa = new JTextField();
		txtAadeAquLa.setBounds(10, 190, 166, 21);
		txtAadeAquLa.setFont(new Font("The Next Font", Font.PLAIN, 25));
		txtAadeAquLa.setForeground(new Color(0, 0, 0));
		txtAadeAquLa.setText("");
		frame.getContentPane().add(txtAadeAquLa);
		txtAadeAquLa.setColumns(10);
		
		lblAadeLaCategora = new JLabel("PRODUCTOS");
		lblAadeLaCategora.setBounds(329, 110, 158, 44);
		lblAadeLaCategora.setFont(new Font("The Next Font", Font.PLAIN, 25));
		lblAadeLaCategora.setForeground(new Color(0, 0, 0));
		frame.getContentPane().add(lblAadeLaCategora);
		
		lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(261, 165, 73, 21);
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("The Next Font", Font.PLAIN, 15));
		frame.getContentPane().add(lblNombre);
		
		button_1 = new JButton("ELIMINAR");
		button_1.setBounds(245, 281, 314, 32);
		button_1.setForeground(Color.RED);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NOMBRE = textField.getText();
				Producto p = new Producto(IDPRODUCTO, NOMBRE, PRECIO, CANTIDAD_RESTANTE);
				conexion = new ConexionBBDD();
				conexion.ConsultaBorrarProducto(p);
				
			}
		});
		button_1.setFont(new Font("The Next Font", Font.PLAIN, 20));
		frame.getContentPane().add(button_1);
		
		button_5 = new JButton("VOLVER");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				VentanaPrincipal window = new VentanaPrincipal();
				window.frame.setVisible(true);
			}
		});
		button_5.setBounds(10, 537, 242, 38);
		button_5.setFont(new Font("The Next Font", Font.PLAIN, 30));
		button_5.setBackground(SystemColor.menu);
		frame.getContentPane().add(button_5);
		
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
		
		JLabel lblCategoria = new JLabel("ID PRODUCTO");
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
		
		JButton button = new JButton("MODIFICAR");
		button.setForeground(Color.ORANGE);
		button.setFont(new Font("The Next Font", Font.PLAIN, 20));
		button.setBounds(245, 252, 314, 32);
		frame.getContentPane().add(button);
		
		button_2 = new JButton("AÑADIR");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IDPRODUCTO = Integer.valueOf(txtAadeAquLa.getText());
				NOMBRE = textField.getText();
				PRECIO = Double.valueOf(textField_2.getText());
				CANTIDAD_RESTANTE = Integer.valueOf(textField_3.getText());
				conexion = new ConexionBBDD();
				Producto p = new Producto(IDPRODUCTO, NOMBRE, PRECIO, CANTIDAD_RESTANTE); 
				conexion.ConsultaInsertarProducto(p);
				
				
				
			}
		});
		button_2.setForeground(Color.GREEN);
		button_2.setFont(new Font("The Next Font", Font.PLAIN, 20));
		button_2.setBounds(245, 222, 314, 32);
		frame.getContentPane().add(button_2);
		
		
		
		JLabel lblIdCategoria = new JLabel("ID CATEGORIA");
		lblIdCategoria.setForeground(Color.BLACK);
		lblIdCategoria.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblIdCategoria.setBounds(232, 351, 108, 21);
		frame.getContentPane().add(lblIdCategoria);
		
		JLabel lblCategorias = new JLabel("CATEGORIAS");
		lblCategorias.setForeground(new Color(0, 0, 0));
		lblCategorias.setFont(new Font("The Next Font", Font.PLAIN, 25));
		lblCategorias.setBounds(321, 312, 166, 44);
		frame.getContentPane().add(lblCategorias);
		
		JLabel lblNombre_1 = new JLabel("NOMBRE");
		lblNombre_1.setForeground(Color.BLACK);
		lblNombre_1.setFont(new Font("The Next Font", Font.PLAIN, 15));
		lblNombre_1.setBounds(486, 351, 108, 21);
		frame.getContentPane().add(lblNombre_1);
		
		textField_1 = new JTextField();
		textField_1.setText("");
		textField_1.setForeground(Color.BLACK);
		textField_1.setFont(new Font("The Next Font", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(211, 383, 166, 21);
		frame.getContentPane().add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.setText("");
		textField_4.setForeground(Color.BLACK);
		textField_4.setFont(new Font("The Next Font", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(433, 383, 166, 21);
		frame.getContentPane().add(textField_4);
		
		JButton button_3 = new JButton("A\u00D1ADIR");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TIPO_PRODUCTO = textField_4.getText();
				conexion = new ConexionBBDD();
				Categoria c = new Categoria(IDCATEGORIA, TIPO_PRODUCTO);
				conexion.ConsultaInsertarCategoria(c);
			}
		});
		button_3.setForeground(Color.GREEN);
		button_3.setFont(new Font("The Next Font", Font.PLAIN, 20));
		button_3.setBounds(245, 415, 314, 32);
		frame.getContentPane().add(button_3);
		
		JButton button_7 = new JButton("ELIMINAR");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				conexion = new ConexionBBDD();
				TIPO_PRODUCTO = textField_4.getText();
				Categoria c = new Categoria(IDCATEGORIA, TIPO_PRODUCTO);
				conexion.ConsultaBorrarCategoria(c);
				
				
				
			}
		});
		button_7.setForeground(Color.RED);
		button_7.setFont(new Font("The Next Font", Font.PLAIN, 20));
		button_7.setBounds(245, 478, 314, 32);
		frame.getContentPane().add(button_7);
		
		JButton button_4 = new JButton("MODIFICAR");
		button_4.setForeground(Color.ORANGE);
		button_4.setFont(new Font("The Next Font", Font.PLAIN, 20));
		button_4.setBounds(245, 444, 314, 38);
		frame.getContentPane().add(button_4);
		
		JButton btnVerCategorias = new JButton("VER CATEGORIAS");
		btnVerCategorias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaSoloCategorias window = new ListaSoloCategorias();
				window.frame.setVisible(true);
			}
		});
		btnVerCategorias.setForeground(Color.BLUE);
		btnVerCategorias.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnVerCategorias.setBounds(10, 70, 790, 44);
		frame.getContentPane().add(btnVerCategorias);
	}
}
