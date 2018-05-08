import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;

public class VentanaPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 790, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPedidos = new JButton("PEDIDOS");
		btnPedidos.setForeground(Color.RED);
		btnPedidos.setBackground(Color.WHITE);
		btnPedidos.setFont(new Font("The Next Font", Font.PLAIN, 60));
		btnPedidos.setBounds(10, 11, 754, 429);
		frame.getContentPane().add(btnPedidos);
		
		JButton btnAdmin = new JButton("ADMIN");
		btnAdmin.setFont(new Font("The Next Font", Font.PLAIN, 60));
		btnAdmin.setForeground(Color.BLACK);
		btnAdmin.setBounds(10, 456, 754, 95);
		frame.getContentPane().add(btnAdmin);
	}
}
