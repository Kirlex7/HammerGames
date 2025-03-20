package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class VentanaMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public VentanaMenu(String username) {
		setTitle("Tienda de Videojuegos HammerGammes\r\n");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaMenu.class.getResource("/resources/logo.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 383);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnHammerGames = new JMenu("HammerGames");
		menuBar.add(mnHammerGames);
		
		JMenuItem mntmInsertarVideojuego = new JMenuItem("Insertar");
		mntmInsertarVideojuego.setIcon(new ImageIcon(VentanaMenu.class.getResource("/resources/anadir (1) (1).png")));
		mnHammerGames.add(mntmInsertarVideojuego);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.setIcon(new ImageIcon(VentanaMenu.class.getResource("/resources/busqueda-de-lupa.png")));
		mnHammerGames.add(mntmConsultar);
		
		JMenuItem mntmVenta = new JMenuItem("Venta");
		mntmVenta.setIcon(new ImageIcon(VentanaMenu.class.getResource("/resources/carro.png")));
		mnHammerGames.add(mntmVenta);
		
		JMenuItem mntmAdministrar = new JMenuItem("Administrar");
		mntmAdministrar.setIcon(new ImageIcon(VentanaMenu.class.getResource("/resources/administrador.png")));
		mnHammerGames.add(mntmAdministrar);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar Sesión");
		mntmCerrarSesion.setIcon(new ImageIcon(VentanaMenu.class.getResource("/resources/cerrar-sesion.png")));
		mnHammerGames.add(mntmCerrarSesion);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(VentanaMenu.class.getResource("/resources/logo.png")));
		lblLogo.setBounds(245, 94, 124, 158);
		contentPane.add(lblLogo);
		
		JLabel lblBienvenida = new JLabel("New label");
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setForeground(new Color(0, 0, 0));
		lblBienvenida.setFont(new Font("Roboto", Font.BOLD, 20));
		lblBienvenida.setBounds(245, 59, 135, 24);
		lblBienvenida.setText("Bienvenid@");
		contentPane.add(lblBienvenida);
		
		JLabel lblNewLabel = new JLabel("Hola sergio");
		lblNewLabel.setBounds(99, 165, 87, 14);
		contentPane.add(lblNewLabel);
	}
}
