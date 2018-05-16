import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;


public class ContraseñaAdmin {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContraseñaAdmin window = new ContraseñaAdmin();
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
	public ContraseñaAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.RED);
		frame.setBounds(100, 100, 821, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setFont(new Font("The Next Font", Font.PLAIN, 11));
		textField.setBounds(107, 251, 599, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIntroduceLaContrasea = new JLabel("INTRODUCE LA CONTRASE\u00D1A");
		lblIntroduceLaContrasea.setBackground(Color.WHITE);
		lblIntroduceLaContrasea.setForeground(Color.WHITE);
		lblIntroduceLaContrasea.setFont(new Font("The Next Font", Font.BOLD, 50));
		lblIntroduceLaContrasea.setBounds(27, 73, 753, 145);
		frame.getContentPane().add(lblIntroduceLaContrasea);
		
		JButton btnAtras = new JButton("VOLVER");
		btnAtras.setBackground(new Color(240, 240, 240));
		btnAtras.setFont(new Font("The Next Font", Font.PLAIN, 30));
		btnAtras.setBounds(279, 382, 242, 53);
		frame.getContentPane().add(btnAtras);
	}
}
