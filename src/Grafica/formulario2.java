package Grafica;

import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.personas;

import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import java.awt.Cursor;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class formulario2 extends JFrame implements ActionListener, KeyListener {

	private JPanel contentPane;
	private JTextField textApellido;
	private JTextField textNif;
	private JTextField textNombre;
	private JTextField textTelefono;
	private JTextField textCorreo;
	private JTextField textBuscar;
	private JButton btnInsertar;
	public ArrayList<personas>lista_personas;
	private JButton btnLimpiar;
	private JButton btnBuscar;
	private JButton btnSalir;
	private JButton btnValidar;
	private JLabel lblNif;
	private JLabel lblNewLabel_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulario2 frame = new formulario2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void ValidacionCaracteres(java.awt.event.KeyEvent e) {
		if(e.getKeyChar()>=33 && e.getKeyChar()<=64
			||e.getKeyChar()>=91 && e.getKeyChar()<=96
			||e.getKeyChar()>=123 && e.getKeyChar()<=208
			||e.getKeyChar()>=210 && e.getKeyChar()<=240
			||e.getKeyChar()>=242 && e.getKeyChar()<=255)
		{
			e.consume();
			JOptionPane.showMessageDialog(this,"No se permiten caracteres especiales");
		}
		System.out.println("soy la letra: " + e.getKeyChar() + "y mi numero ASCII corresponde a: " + e.getKeyChar() + 0);
	}
	
	public void validarCorreo(java.awt.event.KeyEvent e) {
		if(e.getKeyChar()>=32 && e.getKeyChar()<=44
			||e.getKeyChar()==47
			||e.getKeyChar()>=58 && e.getKeyChar()<=63
			||e.getKeyChar()>=91 && e.getKeyChar()<=94
			||e.getKeyChar()==96 
			||e.getKeyChar()>=123 && e.getKeyChar()<=255) {
			
			e.consume();
			JOptionPane.showMessageDialog(this,"No se permite ese caractere en especifico");
			
		}
			
		
	}

	/**
	 * Create the frame.
	 */
	public formulario2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(formulario2.class.getResource("/Imagenes/icons8-marvel-96.png")));
		setFont(new Font("Arial", Font.BOLD, 16));
		setLocation(new Point(0, 300));
		lista_personas= new ArrayList<personas>();
		setLocationRelativeTo(null);
		setTitle("REGISTRARSE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 452);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCapitanAmerica = new JLabel("New label");
		lblCapitanAmerica.setIcon(new ImageIcon(formulario2.class.getResource("/Imagenes/pngwing.com (6) (1).png")));
		lblCapitanAmerica.setBounds(0, 6, 147, 389);
		contentPane.add(lblCapitanAmerica);
		
		lblNif = new JLabel("NIF:");
		lblNif.setFont(new Font("Arial", Font.BOLD, 16));
		lblNif.setForeground(Color.WHITE);
		lblNif.setBounds(142, 79, 61, 16);
		contentPane.add(lblNif);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setForeground(Color.WHITE);
		lblNombre.setFont(new Font("Arial", Font.BOLD, 16));
		lblNombre.setBounds(142, 107, 87, 16);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("APELLIDO:");
		lblApellido.setForeground(Color.WHITE);
		lblApellido.setFont(new Font("Arial", Font.BOLD, 16));
		lblApellido.setBounds(142, 135, 87, 16);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setForeground(Color.WHITE);
		lblTelefono.setFont(new Font("Arial", Font.BOLD, 16));
		lblTelefono.setBounds(142, 163, 104, 16);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("CORREO:");
		lblCorreo.setForeground(Color.WHITE);
		lblCorreo.setFont(new Font("Arial", Font.BOLD, 16));
		lblCorreo.setBounds(142, 191, 87, 16);
		contentPane.add(lblCorreo);
		
		btnInsertar = new JButton("INSERTAR");
		btnInsertar.addActionListener(this);
		btnInsertar.setIcon(new ImageIcon(formulario2.class.getResource("/Imagenes/icons8-insert-clip-30.png")));
		btnInsertar.setForeground(Color.BLUE);
		btnInsertar.setBounds(77, 385, 138, 26);
		contentPane.add(btnInsertar);
		
		btnLimpiar = new JButton("LIMPIAR");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setIcon(new ImageIcon(formulario2.class.getResource("/Imagenes/icons8-servicio-de-limpieza-30.png")));
		btnLimpiar.setForeground(Color.BLUE);
		btnLimpiar.setBounds(225, 386, 117, 25);
		contentPane.add(btnLimpiar);
		
		btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(this);
		btnBuscar.setIcon(new ImageIcon(formulario2.class.getResource("/Imagenes/icons8-busca-mas-24.png")));
		btnBuscar.setForeground(Color.BLUE);
		btnBuscar.setBounds(352, 385, 112, 26);
		contentPane.add(btnBuscar);
		
		
		btnValidar = new JButton("VALIDAR");
		btnValidar.addActionListener(this);
		btnValidar.setIcon(new ImageIcon(formulario2.class.getResource("/Imagenes/icons8-someter-para-aprobacion-24.png")));
		btnValidar.setForeground(Color.BLUE);
		btnValidar.setBounds(493, 59, 117, 36);
		contentPane.add(btnValidar);
		
		textApellido = new JTextField();
		textApellido.addKeyListener(this);
		textApellido.setCaretColor(Color.WHITE);
		textApellido.setForeground(Color.WHITE);
		textApellido.setBackground(Color.BLACK);
		textApellido.setBounds(241, 131, 223, 26);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		textNif = new JTextField();
		textNif.addKeyListener(this);
		textNif.setCaretColor(Color.WHITE);
		textNif.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		textNif.setForeground(Color.WHITE);
		textNif.setColumns(10);
		textNif.setBackground(Color.BLACK);
		textNif.setBounds(241, 75, 223, 26);
		contentPane.add(textNif);
		
		textNombre = new JTextField();
		textNombre.addKeyListener(this);
		textNombre.setCaretColor(Color.WHITE);
		textNombre.setForeground(Color.WHITE);
		textNombre.setColumns(10);
		textNombre.setBackground(Color.BLACK);
		textNombre.setBounds(241, 103, 223, 26);
		contentPane.add(textNombre);
		
		textTelefono = new JTextField();
		textTelefono.setCaretColor(Color.WHITE);
		textTelefono.setForeground(Color.WHITE);
		textTelefono.setColumns(10);
		textTelefono.setBackground(Color.BLACK);
		textTelefono.setBounds(241, 159, 223, 26);
		contentPane.add(textTelefono);
		
		textCorreo = new JTextField();
		textCorreo.addKeyListener(this);
		textCorreo.setCaretColor(Color.WHITE);
		textCorreo.setForeground(Color.WHITE);
		textCorreo.setColumns(10);
		textCorreo.setBackground(Color.BLACK);
		textCorreo.setBounds(241, 187, 223, 26);
		contentPane.add(textCorreo);
		
		JLabel lblAvengers = new JLabel("New label");
		lblAvengers.setIcon(new ImageIcon(formulario2.class.getResource("/Imagenes/pngwing.com (7) (1).png")));
		lblAvengers.setBounds(289, 6, 138, 68);
		contentPane.add(lblAvengers);
		
		textBuscar = new JTextField();
		textBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		textBuscar.setCaretColor(Color.WHITE);
		textBuscar.setForeground(Color.WHITE);
		textBuscar.setColumns(10);
		textBuscar.setBackground(Color.BLACK);
		textBuscar.setBounds(477, 385, 133, 26);
		contentPane.add(textBuscar);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setIcon(new ImageIcon(formulario2.class.getResource("/Imagenes/icons8-salir-redondeado-24.png")));
		btnSalir.setForeground(Color.BLUE);
		btnSalir.setBounds(493, 99, 117, 37);
		contentPane.add(btnSalir);
		
		JLabel lblAviso = new JLabel("Campos obligatorios (*)");
		lblAviso.setFont(new Font("Dialog", Font.BOLD, 14));
		lblAviso.setForeground(Color.RED);
		lblAviso.setBounds(254, 59, 186, 16);
		contentPane.add(lblAviso);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(formulario2.class.getResource("/Imagenes/NvTf (1).gif")));
		lblNewLabel_1.setBounds(142, 219, 468, 159);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setIcon(new ImageIcon(formulario2.class.getResource("/Imagenes/fondoAzul.jpg")));
		lblNewLabel.setBounds(0, 0, 641, 430);
		contentPane.add(lblNewLabel);
	}
	public void listar() {
		DefaultListModel<personas> modelo = new DefaultListModel<personas>();
		for(int i=0; i<lista_personas.size();i++) {
			modelo.addAll(lista_personas);
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnValidar) {
			doBtnValidarActionPerformed(e);
		}
		if (e.getSource() == btnSalir) {
			doBtnSalirActionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			doBtnBuscarActionPerformed(e);
		}
		if (e.getSource() == btnLimpiar) {
			doBtnLimpiarActionPerformed(e);
		}
		if (e.getSource() == btnInsertar) {
			doBtnInsertarActionPerformed(e);
		}
	}
	protected void doBtnInsertarActionPerformed(ActionEvent e) {
		//creo las variables
		String nif= textNif.getText();
		String nombre= textNombre.getText();
		String apellido= textApellido.getText();
		String telefono= textTelefono.getText();
		String correo= textCorreo.getText();
		
		personas persona= new personas(nif,nombre,apellido,telefono,correo);
		lista_personas.add(persona);
		JOptionPane.showMessageDialog(null,"Se agregó correctamente", "AGREGAR", JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	protected void doBtnLimpiarActionPerformed(ActionEvent e) {
		textNif.setText("");
		textNombre.setText("");
		textApellido.setText("");
		textTelefono.setText("");
		textCorreo.setText("");
		textBuscar.setText("");
		
	}
	
	protected void doBtnBuscarActionPerformed(ActionEvent e) {
		
			String buscar=textBuscar.getText();
			System.out.print("Nif:" + lista_personas.get(0).getNif() + "\n");
			System.out.print("Nombre:"+ lista_personas.get(0).getNombre() + "\n" );
			System.out.print("Apellido:"+ lista_personas.get(0).getApellido() + "\n" );
			System.out.print("Telefono:" + lista_personas.get(0).getNif() + "\n" );
			System.out.print("Correo:" + lista_personas.get(0).getNif()  );
		
	}
	protected void doBtnSalirActionPerformed(ActionEvent e) {
		System.exit(0);
	}
	protected void doBtnValidarActionPerformed(ActionEvent e) {
		
		
			if(textNif.getText().trim().isEmpty()) {
				JOptionPane.showMessageDialog(null,"Complete el campo NIF","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
			}
			
			else if(textNombre.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Complete el campo NOMBRE","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
				
			}
			else if(textApellido.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Complete el campo APELLIDO","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
				
			}
			else if(textTelefono.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Complete el campo TELEFONO","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
			
			}
			else if(textCorreo.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"Complete el campo CORREO","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
				
			}
			
			
			else {
				JOptionPane.showMessageDialog(null,"Se valido correctamente","VALIDADO",JOptionPane.INFORMATION_MESSAGE);
				
				Formulario1 p = new Formulario1();
				p.setVisible(true);
				
			}
			
			
	}
	
	
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == textApellido) {
			doTextApellidoKeyTyped(e);
		}
		if (e.getSource() == textCorreo) {
			doTextCorreoKeyTyped(e);
		}
		if (e.getSource() == textNif) {
			doTextNifKeyTyped(e);
		}
		if (e.getSource() == textNombre) {
			doTextNifKeyTyped(e);
		}
	}
	protected void doTextNifKeyTyped(KeyEvent e) {
		ValidacionCaracteres(e);
	}
	

	protected void doTextCorreoKeyTyped(KeyEvent e) {
		validarCorreo(e);
	}
	
	protected void doTextApellidoKeyTyped(KeyEvent e) {
		ValidacionCaracteres(e);
	}
	
	protected void doTextNombreKeyTyped(KeyEvent e) {
		ValidacionCaracteres(e);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
