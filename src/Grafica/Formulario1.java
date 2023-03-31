package Grafica;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Cursor;
import java.awt.Window.Type;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class Formulario1 extends javax.swing.JFrame implements ActionListener, KeyListener, MouseListener {

	
		private JPanel contentPane;
		private JTextField textUsuario;
		private JPasswordField jpassClave;
		private JButton btnIngresar;
		private JLabel lblLogo;
		private JLabel lblEscudo;
		private JButton btnSalir;
		private JPasswordField passwordField;
		private JLabel lblVer;
		private JLabel lblOcultar;
		
		

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Formulario1 frame = new Formulario1();
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
		public Formulario1() {
			
			setFont(new Font("Arial", Font.PLAIN, 16));
			setVisible(true);
			setTitle("INGRESAR");
			setResizable(false);
			setIconImage(Toolkit.getDefaultToolkit().getImage(Formulario1.class.getResource("/Imagenes/icons8-marvel-48.png")));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 681, 417);
			//setExtendedState(Frame.MAXIMIZED_BOTH); para extenderlo a pantalla completa
			setLocationRelativeTo(null);//centrar la ventana
			contentPane = new JPanel();
			contentPane.setForeground(Color.BLACK);
			contentPane.setBackground(new Color(255, 235, 205));
			contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblUsuario = new JLabel("USUARIO:");
			lblUsuario.setForeground(Color.WHITE);
			lblUsuario.setFont(new Font("Arial", Font.BOLD, 16));
			lblUsuario.setBounds(57, 212, 89, 16);
			contentPane.add(lblUsuario);
			
			JLabel lblcontraseña = new JLabel("CONTRASEÑA:");
			lblcontraseña.setForeground(Color.WHITE);
			lblcontraseña.setFont(new Font("Arial", Font.BOLD, 16));
			lblcontraseña.setBounds(30, 250, 139, 16);
			contentPane.add(lblcontraseña);
			
			textUsuario = new JTextField();
			textUsuario.addKeyListener(this);
			textUsuario.setCaretColor(Color.WHITE);
			textUsuario.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			textUsuario.setForeground(Color.WHITE);
			textUsuario.setBackground(Color.BLACK);
			textUsuario.setFont(new Font("Arial", Font.BOLD, 12));
			textUsuario.setBounds(158, 209, 300, 26);
			contentPane.add(textUsuario);
			textUsuario.setColumns(10);
			
			jpassClave = new JPasswordField();
			jpassClave.setCaretColor(Color.WHITE);
			jpassClave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			jpassClave.setColumns(10);
			jpassClave.setForeground(Color.WHITE);
			jpassClave.setBackground(Color.BLACK);
			jpassClave.setFont(new Font("Arial", Font.BOLD, 14));
			jpassClave.setBounds(158, 246, 300, 26);
			contentPane.add(jpassClave);
			
			btnIngresar = new JButton("INGRESAR");
			btnIngresar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnIngresar.setForeground(Color.BLUE);
			btnIngresar.setBackground(Color.WHITE);
			btnIngresar.setFont(new Font("Arial", Font.BOLD, 13));
			btnIngresar.addActionListener(new ActionListener() {
				private int intentos;

				public void actionPerformed(ActionEvent e) {//crear eventos
					
					char[] clave = jpassClave.getPassword();
					String claveFinal = new String (clave);
					
					
					if(textUsuario.getText().equals("Ariel") && claveFinal.equals("123")) {
						dispose();//para cerrar la ventana actual
						JOptionPane.showMessageDialog(null, "Bienvenido al sistema", "Ingresaste", JOptionPane.INFORMATION_MESSAGE);
					//aqui pondria a donde quiero que accdeda 
					}else if(intentos==3) {	
						JOptionPane.showMessageDialog(null, "Has excedido el número de intentos","Modificar datos", JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}else{
						JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrectos, intenta nuevamente \n Quedan " + (3 - intentos) + " intentos");
						textUsuario.setText("");//borramos el usuario o contraseña equivocados
						jpassClave.setText("");
						textUsuario.requestFocus();//dejamos el campo vacio 
						intentos= 1+intentos ;
					}
				}
			});
			btnIngresar.setBounds(216, 341, 117, 29);
			contentPane.add(btnIngresar);
			
			lblLogo = new JLabel("");
			lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
			lblLogo.setIcon(new ImageIcon(Formulario1.class.getResource("/Imagenes/pngwing.com (2) (1).png")));
			lblLogo.setBounds(216, 6, 292, 187);
			contentPane.add(lblLogo);
			
			lblEscudo = new JLabel("");
			lblEscudo.setIcon(new ImageIcon(Formulario1.class.getResource("/Imagenes/pngwing.com (4) (1).png")));
			lblEscudo.setBounds(457, 176, 117, 160);
			contentPane.add(lblEscudo);
			
			btnSalir = new JButton("SALIR");
			btnSalir.addActionListener(this);
			btnSalir.setForeground(Color.BLUE);
			btnSalir.setFont(new Font("Arial", Font.BOLD, 13));
			btnSalir.setBounds(399, 341, 117, 29);
			contentPane.add(btnSalir);
			
			passwordField = new JPasswordField();
			passwordField.setForeground(Color.WHITE);
			passwordField.setFont(new Font("Arial", Font.BOLD, 14));
			passwordField.setColumns(10);
			passwordField.setCaretColor(Color.WHITE);
			passwordField.setBackground(Color.BLACK);
			passwordField.setBounds(158, 286, 300, 26);
			contentPane.add(passwordField);
			
			JLabel lblcontraseña_1 = new JLabel("CONTRASEÑA:");
			lblcontraseña_1.setForeground(Color.WHITE);
			lblcontraseña_1.setFont(new Font("Arial", Font.BOLD, 16));
			lblcontraseña_1.setBounds(30, 290, 139, 16);
			contentPane.add(lblcontraseña_1);
			
			lblVer = new JLabel("");
			lblVer.addMouseListener(this);
			lblVer.setIcon(new ImageIcon(Formulario1.class.getResource("/Imagenes/ver (1).png")));
			lblVer.setForeground(Color.WHITE);
			lblVer.setBounds(470, 250, 31, 16);
			contentPane.add(lblVer);
			
			lblOcultar = new JLabel("");
			lblOcultar.addMouseListener(this);
			lblOcultar.setIcon(new ImageIcon(Formulario1.class.getResource("/Imagenes/visible.png")));
			lblOcultar.setForeground(Color.WHITE);
			lblOcultar.setBounds(470, 250, 31, 16);
			contentPane.add(lblOcultar);
			
			JLabel lblFondoAzul = new JLabel("");
			lblFondoAzul.setFont(new Font("Arial", Font.BOLD, 14));
			lblFondoAzul.setForeground(SystemColor.control);
			lblFondoAzul.setIcon(new ImageIcon(Formulario1.class.getResource("/Imagenes/fondoAzul.jpg")));
			lblFondoAzul.setBounds(0, 0, 701, 389);
			contentPane.add(lblFondoAzul);
		}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnSalir) {
			doBtnSalirActionPerformed(e);
		}
	}
	protected void doBtnSalirActionPerformed(ActionEvent e) {
		System.exit(0);
	}
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
	}
	public void keyTyped(KeyEvent e) {
		if (e.getSource() == textUsuario) {
			doTextUsuarioKeyTyped(e);
		}
	}
	protected void doTextUsuarioKeyTyped(KeyEvent e) {
		if(textUsuario.getText().length()>=20) {
			e.consume();
			Toolkit.getDefaultToolkit().beep();
		}
	}
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == lblOcultar) {
			doLblOcultarMouseClicked(e);
		}
		if (e.getSource() == lblVer) {
			doLblVerMouseClicked(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void doLblVerMouseClicked(MouseEvent e) {
		lblVer.setVisible(false);
		lblOcultar.setVisible(true);
		jpassClave.setEchoChar((char) 0);
		
	}
	protected void doLblOcultarMouseClicked(MouseEvent e) {
		lblVer.setVisible(true);
		lblOcultar.setVisible(false);
		jpassClave.setEchoChar('*'); 
	}
	}
