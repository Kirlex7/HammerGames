package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import controlador.GestionBBDD;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import controlador.GestionBBDD;

public class InsertarEmpleado extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtSueldo;
	private JTextField txtUsuario;
	private JTextField txtClave;
	private JComboBox cbPuesto;

	/**
	 * Create the panel.
	 */
	public InsertarEmpleado() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String nombreE = txtNombre.getText();
				 String puestoE = cbPuesto.getSelectedItem().toString();
				 float sueldoE = Float.parseFloat(txtSueldo.getText());
				 int ventasE= 0;
				 String usuarioE = txtUsuario.getText();
				 String claveE= txtClave.getText();
				 GestionBBDD.insertarEmpleado(nombreE, puestoE, sueldoE, ventasE, usuarioE, claveE);
			}
		});
		btnInsertar.setForeground(Color.BLACK);
		btnInsertar.setBackground(Color.CYAN);
		btnInsertar.setBorder(null);
		btnInsertar.setFont(new Font("Roboto", Font.BOLD, 12));
		btnInsertar.setBounds(236, 236, 89, 37);
		
		add(btnInsertar);
		
		JLabel lblIconoUsuario = new JLabel("");
		lblIconoUsuario.setIcon(new ImageIcon(InsertarEmpleado.class.getResource("/resources/agregar-usuario (1).png")));
		lblIconoUsuario.setBounds(55, 62, 81, 84);
		add(lblIconoUsuario);
		
		JLabel lblFondoAzul = new JLabel("");
		lblFondoAzul.setBackground(new Color(0, 255, 255));
		lblFondoAzul.setBounds(0, 0, 180, 674);
		add(lblFondoAzul);
		lblFondoAzul.setOpaque(true);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Roboto", Font.BOLD, 14));
		lblNombre.setBounds(190, 62, 67, 14);
		add(lblNombre);
		
		JLabel lblPuesto = new JLabel("Puesto");
		lblPuesto.setFont(new Font("Roboto", Font.BOLD, 14));
		lblPuesto.setBounds(190, 90, 67, 14);
		add(lblPuesto);
		
		JLabel lblSueldo = new JLabel("Sueldo");
		lblSueldo.setFont(new Font("Roboto", Font.BOLD, 14));
		lblSueldo.setBounds(190, 128, 67, 14);
		add(lblSueldo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(260, 60, 96, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtSueldo = new JTextField();
		txtSueldo.setColumns(10);
		txtSueldo.setBounds(260, 126, 96, 20);
		add(txtSueldo);
		
		cbPuesto = new JComboBox();
		cbPuesto.setModel(new DefaultComboBoxModel(new String[] {"Vendedor", "Gerente ", "Cajero", "Soporte Técnico"}));
		cbPuesto.setBounds(267, 87, 89, 22);
		add(cbPuesto);
		
		JLabel lblTitulo = new JLabel("Insertar Empleado");
		lblTitulo.setFont(new Font("Roboto", Font.BOLD, 16));
		lblTitulo.setBounds(217, 11, 139, 31);
		add(lblTitulo);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Roboto", Font.BOLD, 14));
		lblUsuario.setBounds(190, 166, 67, 14);
		add(lblUsuario);
		
		JLabel Clave = new JLabel("Clave");
		Clave.setFont(new Font("Roboto", Font.BOLD, 14));
		Clave.setBounds(190, 203, 67, 14);
		add(Clave);
		
		txtUsuario = new JTextField();
		txtUsuario.setColumns(10);
		txtUsuario.setBounds(260, 164, 96, 20);
		add(txtUsuario);
		
		txtClave = new JTextField();
		txtClave.setColumns(10);
		txtClave.setBounds(260, 201, 96, 20);
		add(txtClave);

	}
}
