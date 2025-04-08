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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		mntmInsertarVideojuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsertarUsuario iu = new InsertarUsuario();
				nuevoPanel(iu);
			}
		});
		mntmInsertarVideojuego.setIcon(null);
		mnHammerGames.add(mntmInsertarVideojuego);
		
		JMenuItem mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.setIcon(null);
		mnHammerGames.add(mntmConsultar);
		
		JMenuItem mntmVenta = new JMenuItem("Venta");
		mntmVenta.setIcon(null);
		mnHammerGames.add(mntmVenta);
		
		JMenuItem mntmAdministrar = new JMenuItem("Administrar");
		mntmAdministrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InsertarEmpleado ie = new InsertarEmpleado();
				nuevoPanel(ie);
			}
		});
		mntmAdministrar.setIcon(null);
		mnHammerGames.add(mntmAdministrar);
		
		JMenuItem mntmCerrarSesion = new JMenuItem("Cerrar Sesión");
		mntmCerrarSesion.setIcon(null);
		mnHammerGames.add(mntmCerrarSesion);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setIcon(new ImageIcon(VentanaMenu.class.getResource("/resources/logo.png")));
		contentPane.add(lblLogo, "name_1897432051289900");
		
		JLabel lblBienvenida = new JLabel("New label");
		lblBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida.setForeground(new Color(0, 0, 0));
		lblBienvenida.setFont(new Font("Roboto", Font.BOLD, 20));
		lblBienvenida.setText("Bienvenid@");
		contentPane.add(lblBienvenida, "name_1897432073403000");
		
		
	}
	
	public void nuevoPanel(JPanel panelActual) {
		contentPane.removeAll();
		contentPane.add(panelActual);
		contentPane.repaint();
		contentPane.revalidate();
	}
}
