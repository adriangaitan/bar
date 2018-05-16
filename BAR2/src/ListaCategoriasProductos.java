import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class ListaCategoriasProductos {

	JFrame frame;
	private JTable table;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public ListaCategoriasProductos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	 void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"IDPRODUCTO", "NOMBRE", "PRECIO", "CANTIDAD_RESTANTE"
			}
		));
		scrollPane.setViewportView(table);
		
		btnListar = new JButton("VER");
		btnListar.setForeground(Color.BLUE);
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ConexionBBDD Prueba1 = new ConexionBBDD();
				table.setModel(Prueba1.ConsultaTablaCategorias());
			}
		});
		scrollPane.setRowHeaderView(btnListar);
	}
}
