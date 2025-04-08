package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.GestionBBDD;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class VentanaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField passClave;

	/**
	 * Launch the application.
	 */
	public void ejecutador(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaLogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaLogin.class.getResource("/resources/logo.png")));
		setTitle("HammerGames - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 331);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHello = new JLabel("Bienvenido ");
		lblHello.setBounds(354, 61, 124, 43);
		lblHello.setHorizontalAlignment(SwingConstants.CENTER);
		lblHello.setForeground(Color.WHITE);
		lblHello.setFont(new Font("Roboto", Font.BOLD, 20));
		contentPane.add(lblHello);
		
		JLabel lblPanelAzul = new JLabel("");
		lblPanelAzul.setBounds(281, 0, 260, 294);
		lblPanelAzul.setIcon(new ImageIcon(VentanaLogin.class.getResource("/resources/FondoAzul.png")));
		lblPanelAzul.setOpaque(true);
		lblPanelAzul.setBackground(Color.CYAN);
		contentPane.add(lblPanelAzul);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(22, 90, 49, 43);
		lblUsuario.setIcon(
				new ImageIcon(VentanaLogin.class.getResource("/resources/usuario.png")));
		contentPane.add(lblUsuario);

		JLabel lblStatus = new JLabel("");
		lblStatus.setBounds(0, 223, 275, 14);
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblStatus);

		JLabel lblClave = new JLabel("");
		lblClave.setBounds(22, 155, 49, 57);
		lblClave.setIcon(
				new ImageIcon(VentanaLogin.class.getResource("/resources/candado.png")));
		contentPane.add(lblClave);

		JLabel lblUsuariotxt = new JLabel("USUARIO");
		lblUsuariotxt.setBounds(81, 90, 82, 14);
		lblUsuariotxt.setFont(new Font("Roboto", Font.BOLD, 12));
		contentPane.add(lblUsuariotxt);

		JLabel lblClavetxt = new JLabel("CONTRASEÑA");
		lblClavetxt.setBounds(81, 166, 116, 14);
		lblClavetxt.setFont(new Font("Roboto", Font.BOLD, 12));
		contentPane.add(lblClavetxt);

		txtUsuario = new JTextField();
		txtUsuario.setForeground(new Color(0, 0, 0));
		txtUsuario.setBackground(Color.WHITE);
		txtUsuario.setFont(new Font("Roboto", Font.PLAIN, 11));

		txtUsuario.setBounds(81, 113, 102, 20);
		txtUsuario.setForeground(new Color(0, 0, 0));
		txtUsuario.setBackground(Color.WHITE);
		txtUsuario.setFont(new Font("Roboto", Font.PLAIN, 11));
		txtUsuario.setBorder(null);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(74, 248, 89, 35);
		btnLogin.setForeground(Color.BLACK);
		btnLogin.setBackground(Color.CYAN);
		btnLogin.setBorder(null);
		btnLogin.setFont(new Font("Roboto", Font.BOLD, 11));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Aquí puedes agregar la lógica de validación
				String username = txtUsuario.getText();
				char[] password = passClave.getPassword();
				String pass = new String(password);

				if (GestionBBDD.verificarUsuario(username, pass)) {

					lblStatus.setText("¡Logueado con éxito!");

					setVisible(false);

					VentanaMenu menu = new VentanaMenu(username);
					menu.setVisible(true);

				} else {

					lblStatus.setText("Usuario o contraseña incorrectos");
				}

			}
		});
		contentPane.add(btnLogin);

		passClave = new JPasswordField();
		passClave.setBounds(81, 192, 102, 20);
		passClave.setFont(new Font("Roboto", Font.PLAIN, 11));
		passClave.setBorder(null);
		contentPane.add(passClave);
		JLabel lblIniciarSesion = new JLabel("INICIAR SESIÓN");
		lblIniciarSesion.setBounds(22, 33, 190, 20);
		lblIniciarSesion.setFont(new Font("Roboto", Font.BOLD, 20));
		contentPane.add(lblIniciarSesion);
		JSeparator separatorUsuario = new JSeparator();
		separatorUsuario.setBounds(81, 133, 102, 2);
		separatorUsuario.setForeground(Color.BLACK);
		contentPane.add(separatorUsuario);
		JSeparator separatorClave = new JSeparator();
		separatorClave.setBounds(81, 213, 102, 2);
		separatorClave.setForeground(Color.BLACK);
		contentPane.add(separatorClave);

	}
}