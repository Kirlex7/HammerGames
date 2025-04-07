package vista;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

import controlador.GestionBBDD;

import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import modelo.Videojuego;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InsertarUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtName;
	private JTextField txtFecha;
	private JTextField txtPlataforma;
	private JTextField txtPrecio;

	/**
	 * Create the panel.
	 */
	public InsertarUsuario() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JLabel lblName = new JLabel("Nombre");
		lblName.setFont(new Font("Roboto", Font.BOLD, 16));
		lblName.setBounds(289, 63, 75, 14);
		add(lblName);
		
		JLabel lblTitle = new JLabel("Insertar videojuego");
		lblTitle.setFont(new Font("Roboto", Font.BOLD, 14));
		lblTitle.setBounds(39, 272, 176, 19);
		add(lblTitle);
		
		JLabel lblIcono = new JLabel("");
		lblIcono.setHorizontalAlignment(SwingConstants.CENTER);
		lblIcono.setIcon(new ImageIcon(InsertarUsuario.class.getResource("/resources/consola-de-juego (2).png")));
		lblIcono.setBounds(57, 139, 110, 107);
		add(lblIcono);
		
		JLabel lblRecuadroBlanco = new JLabel("");
		lblRecuadroBlanco.setIcon(null);
		lblRecuadroBlanco.setBackground(new Color(0, 255, 255));
		lblRecuadroBlanco.setBounds(0, 0, 239, 660);
		lblRecuadroBlanco.setOpaque(true);
		add(lblRecuadroBlanco);
		
		txtName = new JTextField();
		txtName.setBounds(374, 62, 176, 20);
		add(txtName);
		txtName.setColumns(10);
		
		JLabel lblDate = new JLabel("Fecha Lanzamiento");
		lblDate.setFont(new Font("Roboto", Font.BOLD, 16));
		lblDate.setBounds(289, 104, 161, 14);
		add(lblDate);
		
		JLabel lblGenre = new JLabel("Género");
		lblGenre.setFont(new Font("Roboto", Font.BOLD, 16));
		lblGenre.setBounds(289, 147, 75, 14);
		add(lblGenre);
		
		JLabel lblPlatform = new JLabel("Plataforma");
		lblPlatform.setFont(new Font("Roboto", Font.BOLD, 16));
		lblPlatform.setBounds(289, 192, 132, 14);
		add(lblPlatform);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Roboto", Font.BOLD, 16));
		lblPrecio.setBounds(289, 232, 75, 14);
		add(lblPrecio);
		
		JLabel lblCalification = new JLabel("Calificación");
		lblCalification.setFont(new Font("Roboto", Font.BOLD, 16));
		lblCalification.setBounds(289, 271, 116, 14);
		add(lblCalification);
		
		JLabel lblMultijugador = new JLabel("Multijugador");
		lblMultijugador.setFont(new Font("Roboto", Font.BOLD, 16));
		lblMultijugador.setBounds(289, 306, 122, 29);
		add(lblMultijugador);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Roboto", Font.BOLD, 16));
		lblStock.setBounds(289, 352, 75, 14);
		add(lblStock);
		
		txtFecha = new JTextField();
		txtFecha.setBounds(460, 104, 177, 20);
		add(txtFecha);
		txtFecha.setColumns(10);
		
		txtPlataforma = new JTextField();
		txtPlataforma.setColumns(10);
		txtPlataforma.setBounds(403, 191, 177, 20);
		add(txtPlataforma);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(354, 231, 177, 20);
		add(txtPrecio);
		
		JComboBox<Videojuego.Genero> cbGenero = new JComboBox<>(Videojuego.Genero.values());
		cbGenero.setBounds(374, 145, 102, 22);
		add(cbGenero);
		
		JComboBox cbMultijugador = new JComboBox<>();
		cbMultijugador.setModel(new DefaultComboBoxModel(new String[] {"SI", "NO"}));
		cbMultijugador.setBounds(403, 311, 63, 22);
		add(cbMultijugador);
		
		JComboBox cbStock = new JComboBox();
		cbStock.setModel(new DefaultComboBoxModel(new String[] {"5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60", "65", "70", "75", "80", "85", "90", "95", "100"}));
		cbStock.setBounds(354, 351, 67, 22);
		add(cbStock);
		
		JComboBox<Object> cbCalificacion = new JComboBox<Object>();
		cbCalificacion.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cbCalificacion.setBounds(387, 269, 63, 22);
		add(cbCalificacion);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = txtName.getText();
				int fecha = Integer.parseInt(txtFecha.getText());
				String genero = cbGenero.getSelectedItem().toString();
				String platforma = txtPlataforma.getText();
				int precio = Integer.parseInt(txtPrecio.getText());
				int calificacion = Integer.parseInt(cbCalificacion.getSelectedItem().toString());
				if(cbMultijugador.getSelectedItem().toString().equals("SI")) {
					boolean multijugador = true;
				}else {
					boolean multijugador=false;
				}
				int stock = Integer.parseInt(cbStock.getSelectedItem().toString());
				GestionBBDD.insertarVideojuego(nombre, fecha, genero, platforma, precio, calificacion, getFocusTraversalKeysEnabled(), stock);
			}
		});
		btnInsertar.setBorder(null);
		btnInsertar.setBackground(Color.CYAN);
		btnInsertar.setForeground(Color.BLACK);
		btnInsertar.setBounds(387, 411, 89, 47);
		add(btnInsertar);
		
	}
}
