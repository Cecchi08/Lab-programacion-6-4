package Vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import paquete.Juego;
import paquete.Jugador;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JScrollPane scrollPane_1;
	private JPanel panel_2;
	private JScrollPane scrollPane_2;
	private JList<Jugador> list; 
	private JList<Jugador> list_2;
	private JPanel panel_3;
	private JPanel panel_5;
	private JLabel lblNewLabel;
	private JTextField textFieldNombre;
	private JLabel lblNewLabel_1;
	private JTextField textFieldAltura;
	private JLabel lblNewLabel_2;
	private JTextField textFieldPeso;
	private JTextField textFieldVelocidad;
	private JLabel lblVelocidad;
	private JLabel lblNewLabel_4;
	private JTextField textFieldFuerza;
	private JLabel lblNewLabel_3;
	private JTextField textFieldDefensa;
	private JLabel lblNewLabel_5;
	private JTextField textFieldAtaque;
	private JPanel panel_4;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JPanel panel_14;
	private JPanel panel_15;
	private JPanel panel_16;
	private JPanel panel_17;
	private JPanel panel_18;
	private JButton btnNewButtonEliminar;
	private JButton btnNewButtonAgregar;
	private JPanel panel_19;
	private JPanel panel_20;
	private JRadioButton rdbtnNewRadioButtonAtaque;
	private JRadioButton rdbtnNewRadioButtonPeso;
	private JRadioButton rdbtnNewRadioButtonFuerza;
	private JRadioButton rdbtnNewRadioButtonAltura;
	private JRadioButton rdbtnNewRadioButtonDefensa;
	private JRadioButton rdbtnNewRadioButtonVelocidad;
	private JButton btnNewButtonEnfrentar;
	private JPanel panel_21;
	private JTextArea textArea;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Juego juego = new Juego();
	private DefaultListModel<Jugador> modeloLista = new DefaultListModel<Jugador>();
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1149, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		scrollPane_1 = new JScrollPane();
		panel.add(scrollPane_1);
		
		list = new JList<Jugador>();
		scrollPane_1.setViewportView(list);
		
		panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		panel_5 = new JPanel();
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_4 = new JPanel();
		panel_5.add(panel_4);
		
		lblNewLabel = new JLabel("Nombre");
		panel_4.add(lblNewLabel);
		
		panel_6 = new JPanel();
		panel_5.add(panel_6);
		
		textFieldNombre = new JTextField();
		panel_6.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		panel_7 = new JPanel();
		panel_5.add(panel_7);
		
		lblNewLabel_1 = new JLabel("Altura");
		panel_7.add(lblNewLabel_1);
		
		panel_8 = new JPanel();
		panel_5.add(panel_8);
		
		textFieldAltura = new JTextField();
		panel_8.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		panel_9 = new JPanel();
		panel_5.add(panel_9);
		
		lblNewLabel_2 = new JLabel("Peso");
		panel_9.add(lblNewLabel_2);
		
		panel_10 = new JPanel();
		panel_5.add(panel_10);
		
		textFieldPeso = new JTextField();
		panel_10.add(textFieldPeso);
		textFieldPeso.setColumns(10);
		
		panel_11 = new JPanel();
		panel_5.add(panel_11);
		
		lblVelocidad = new JLabel("Velocidad");
		panel_11.add(lblVelocidad);
		
		panel_12 = new JPanel();
		panel_5.add(panel_12);
		
		textFieldVelocidad = new JTextField();
		panel_12.add(textFieldVelocidad);
		textFieldVelocidad.setColumns(10);
		
		panel_13 = new JPanel();
		panel_5.add(panel_13);
		
		lblNewLabel_4 = new JLabel("Fuerza");
		panel_13.add(lblNewLabel_4);
		
		panel_14 = new JPanel();
		panel_5.add(panel_14);
		
		textFieldFuerza = new JTextField();
		panel_14.add(textFieldFuerza);
		textFieldFuerza.setColumns(10);
		
		panel_15 = new JPanel();
		panel_5.add(panel_15);
		
		lblNewLabel_3 = new JLabel("Defensa");
		panel_15.add(lblNewLabel_3);
		
		panel_16 = new JPanel();
		panel_5.add(panel_16);
		
		textFieldDefensa = new JTextField();
		panel_16.add(textFieldDefensa);
		textFieldDefensa.setColumns(10);
		
		panel_17 = new JPanel();
		panel_5.add(panel_17);
		
		lblNewLabel_5 = new JLabel("Ataque");
		panel_17.add(lblNewLabel_5);
		
		
		
		panel_18 = new JPanel();
		panel_5.add(panel_18);
		
		textFieldAtaque = new JTextField();
		panel_18.add(textFieldAtaque);
		textFieldAtaque.setColumns(10);
		
		panel_19 = new JPanel();
		panel_5.add(panel_19);
		
		btnNewButtonEliminar = new JButton("Eliminar");
		btnNewButtonEliminar.addActionListener(this);
		panel_19.add(btnNewButtonEliminar);
		
		panel_20 = new JPanel();
		panel_5.add(panel_20);
		
		btnNewButtonAgregar = new JButton("Agregar");
		btnNewButtonAgregar.addActionListener(this);
		panel_20.add(btnNewButtonAgregar);
		
		panel_3 = new JPanel();
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		rdbtnNewRadioButtonAltura = new JRadioButton("Altura");
		buttonGroup.add(rdbtnNewRadioButtonAltura);
		panel_3.add(rdbtnNewRadioButtonAltura);
		
		rdbtnNewRadioButtonPeso = new JRadioButton("Peso");
		buttonGroup.add(rdbtnNewRadioButtonPeso);
		panel_3.add(rdbtnNewRadioButtonPeso);
		
		rdbtnNewRadioButtonVelocidad = new JRadioButton("Velocidad");
		buttonGroup.add(rdbtnNewRadioButtonVelocidad);
		panel_3.add(rdbtnNewRadioButtonVelocidad);
		
		rdbtnNewRadioButtonFuerza = new JRadioButton("Fuerza");
		buttonGroup.add(rdbtnNewRadioButtonFuerza);
		panel_3.add(rdbtnNewRadioButtonFuerza);
		
		rdbtnNewRadioButtonDefensa = new JRadioButton("Defensa");
		buttonGroup.add(rdbtnNewRadioButtonDefensa);
		panel_3.add(rdbtnNewRadioButtonDefensa);
		
		rdbtnNewRadioButtonAtaque = new JRadioButton("Ataque");
		buttonGroup.add(rdbtnNewRadioButtonAtaque);
		panel_3.add(rdbtnNewRadioButtonAtaque);
		
		panel_21 = new JPanel();
		panel_3.add(panel_21);
		
		btnNewButtonEnfrentar = new JButton("Enfrentar");
		btnNewButtonEnfrentar.addActionListener(this);
		panel_21.add(btnNewButtonEnfrentar);
		
		scrollPane_2 = new JScrollPane();
		panel.add(scrollPane_2);
		
		list_2 = new JList<Jugador>();
		scrollPane_2.setViewportView(list_2);
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 80));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		this.list.setModel(modeloLista);
		this.list_2.setModel(modeloLista);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButtonEnfrentar) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButtonAgregar) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButtonEliminar) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Jugador j = this.list.getSelectedValue();
		if (j != null) {
			this.juego.EliminarJugador(j);
			this.actualizaLista();
			this.textArea.append("Se eliminó a " + j.getNombre() + "\n");
		}
	}
	
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		String nombre = this.textFieldNombre.getText();
		double altura = Integer.parseInt(this.textFieldAltura.getText());
		double peso = Integer.parseInt(this.textFieldPeso.getText());
		double velocidad = Integer.parseInt(this.textFieldVelocidad.getText());
		double fuerza = Integer.parseInt(this.textFieldFuerza.getText());
		double defensa = Integer.parseInt(this.textFieldDefensa.getText());
		double Ataque = Integer.parseInt(this.textFieldAtaque.getText());
		
		Jugador j = new Jugador(nombre, altura, peso, velocidad, fuerza, defensa, Ataque);
		this.juego.AgregarJugador(j);
		this.textArea.append("Se agregó a " + j.getNombre() + "\n");
		
		this.actualizaLista();
		
		 
	}
	
	private void actualizaLista() {
		// TODO Auto-generated method stub
		this.modeloLista.clear();
		
		Iterator<Jugador> iterator= this.juego.getjugadores();
		
		while(iterator.hasNext())
			this.modeloLista.addElement(iterator.next());
	}

	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		System.out.println("Boton de enfrentar");
		Jugador j1 = this.list.getSelectedValue();
		Jugador j2 = this.list_2.getSelectedValue();
		String atributo =  "";
		if (this.rdbtnNewRadioButtonAltura.isSelected()) {
			atributo =  "Altura";
		} else if (this.rdbtnNewRadioButtonPeso.isSelected()) {
			atributo =  "Peso";
		} else if (this.rdbtnNewRadioButtonVelocidad.isSelected()) {
			atributo =  "Velocidad";
		} else if (this.rdbtnNewRadioButtonFuerza.isSelected()) {
			atributo =  "Fuerza";
		} else if (this.rdbtnNewRadioButtonDefensa.isSelected()) {
			atributo =  "Defensa";
		} else if (this.rdbtnNewRadioButtonAtaque.isSelected()) {
			atributo =  "Ataque";
		}
		
		Jugador ganador = this.juego.enfrentar(j1, j2, atributo);
		System.out.println(atributo);
		
		String cartelito = "Se enfrentaron: " + j1.getNombre() + "y " + j2.getNombre();
		if (ganador == null) {
			cartelito = cartelito + " EMPATEEE";  
		} else {
			cartelito =cartelito + " GANAAADOR" + ganador.getNombre();
		}
		this.textArea.append(cartelito);
	}
}