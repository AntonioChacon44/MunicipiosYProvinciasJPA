package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import controller.MunicipioController;
import controller.ProvinciaController;
import model.Municipio;
import model.Provincia;

import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana_principal {

	private JFrame frame;
	private JTextField jtfFiltrar;
	private JComboBox<Municipio> jcbSeleccionar;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JTextField jtfNomMuni;
	private JLabel lblNewLabel_3;
	private JComboBox<Provincia> jcbProvincia;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_principal window = new Ventana_principal();
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
	public Ventana_principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 566, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel((String) null);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		jtfFiltrar = new JTextField();
		jtfFiltrar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_jtfFiltrar = new GridBagConstraints();
		gbc_jtfFiltrar.insets = new Insets(0, 0, 5, 5);
		gbc_jtfFiltrar.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfFiltrar.gridx = 1;
		gbc_jtfFiltrar.gridy = 1;
		frame.getContentPane().add(jtfFiltrar, gbc_jtfFiltrar);
		jtfFiltrar.setColumns(10);
		
		btnNewButton_1 = new JButton("Filtrar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				llenarMunicipio();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 1;
		frame.getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		
		jcbSeleccionar = new JComboBox<Municipio>();
		jcbSeleccionar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_jcbSeleccionar = new GridBagConstraints();
		gbc_jcbSeleccionar.insets = new Insets(0, 0, 5, 5);
		gbc_jcbSeleccionar.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbSeleccionar.gridx = 1;
		gbc_jcbSeleccionar.gridy = 2;
		frame.getContentPane().add(jcbSeleccionar, gbc_jcbSeleccionar);
		
		btnNewButton = new JButton("Seleccionar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionarMunicipio();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 2;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		lblNewLabel_1 = new JLabel("Municipio Seleccionado: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		frame.getContentPane().add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 4;
		frame.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNewLabel_2 = new JLabel("Nombre del municipio: ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 0;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfNomMuni = new JTextField();
		jtfNomMuni.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_jtfNomMuni = new GridBagConstraints();
		gbc_jtfNomMuni.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNomMuni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNomMuni.gridx = 1;
		gbc_jtfNomMuni.gridy = 0;
		panel.add(jtfNomMuni, gbc_jtfNomMuni);
		jtfNomMuni.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Provincia del municipio: ");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 1;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jcbProvincia = new JComboBox<Provincia>();
		jcbProvincia.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_jcbProvincia = new GridBagConstraints();
		gbc_jcbProvincia.insets = new Insets(0, 0, 5, 0);
		gbc_jcbProvincia.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbProvincia.gridx = 1;
		gbc_jcbProvincia.gridy = 1;
		panel.add(jcbProvincia, gbc_jcbProvincia);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnGuardar.setFont(new Font("Times New Roman", Font.BOLD, 15));
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.gridx = 1;
		gbc_btnGuardar.gridy = 2;
		panel.add(btnGuardar, gbc_btnGuardar);
	}
	
	private void llenarMunicipio () {
		try {
			jcbSeleccionar.removeAllItems();
		} catch (Exception e) {
		}
		for (Municipio m : MunicipioController.findByNombre(jtfFiltrar.getText())) {
			jcbSeleccionar.addItem(m);
		}
	}
	
	private void llenarProvincia () {
		try {
			jcbProvincia.removeAllItems();
		} catch (Exception e) {	
		}
		for (Provincia p : ProvinciaController.findByNombre()) {
			jcbProvincia.addItem(p);
		}
	}
	
	private void seleccionarMunicipio () {
		llenarProvincia();
		Municipio m = (Municipio) jcbSeleccionar.getSelectedItem();
		jtfNomMuni.setText(m.getNombre());
		jcbProvincia.setSelectedItem(m.getProvincia());
	}
	
	private void guardar() {
		Municipio m = (Municipio) jcbSeleccionar.getSelectedItem();
		Provincia p = (Provincia) jcbProvincia.getSelectedItem();
		m.setNombre(jtfNomMuni.getText());
		m.setProvincia(p);
		MunicipioController.update(m);
 	}

}
