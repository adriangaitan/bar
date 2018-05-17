import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JPasswordField;


public class ContraseñaAdmin {

	public JFrame frame;
	private JPasswordField passwordField;

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
		
		JLabel lblIntroduceLaContrasea = new JLabel("INTRODUCE LA CONTRASE\u00D1A");
		lblIntroduceLaContrasea.setBackground(Color.WHITE);
		lblIntroduceLaContrasea.setForeground(Color.WHITE);
		lblIntroduceLaContrasea.setFont(new Font("The Next Font", Font.BOLD, 50));
		lblIntroduceLaContrasea.setBounds(27, 73, 753, 145);
		frame.getContentPane().add(lblIntroduceLaContrasea);
		
		JButton btnAtras = new JButton("VOLVER");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				VentanaPrincipal window = new VentanaPrincipal();
				window.frame.setVisible(true);
			}
		});
		btnAtras.setBackground(new Color(240, 240, 240));
		btnAtras.setFont(new Font("The Next Font", Font.PLAIN, 30));
		btnAtras.setBounds(107, 451, 242, 53);
		frame.getContentPane().add(btnAtras);
		
		JButton btnConfirmar = new JButton("CONFIRMAR");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (passwordField.getText().equals("1234")) {
					frame.setVisible(false);
					Administrador admin = new Administrador();
					admin.frame.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(frame, "Contraseña Incorrecta");
				}
				
			}
		});
		btnConfirmar.setFont(new Font("Dialog", Font.PLAIN, 30));
		btnConfirmar.setBackground(SystemColor.menu);
		btnConfirmar.setBounds(464, 451, 242, 53);
		frame.getContentPane().add(btnConfirmar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(27, 229, 753, 64);
		frame.getContentPane().add(passwordField);
	}
}
