package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Emprendedor extends JFrame {

	private static final long serialVersionUID = 7234968557268543806L;
    JFrame empre;
	JMenuBar menuBar;
	JLabel barra, titulo, imagen;
	
	public Emprendedor() {
        empre = new JFrame();
        barra = new JLabel();
        titulo = new JLabel();
        imagen = new JLabel();
        JMenuBar menuBar = new JMenuBar();
        JMenu Menu = new JMenu("Menu");
        JMenu AcercaMenu = new JMenu("Acerca");
        JMenuItem usuario = new JMenuItem("Usuario");
        JMenuItem coordinanor = new JMenuItem("Coordinador");
        JMenuItem emprendedor = new JMenuItem("Emprendedor");
        JMenuItem salir = new JMenuItem("Salir");
        
        empre.setSize(1400, 900);
        empre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        empre.setVisible(true);
        empre.setLayout(null);
        empre.setTitle("Feria Cultural de Mil Colores GAMLP");
        empre.getContentPane().setBackground(Color.white);
        empre.setExtendedState(MAXIMIZED_BOTH);
        
        // Menu
        
        Menu.add(usuario);
        Menu.add(coordinanor);
        Menu.add(emprendedor); 
        Menu.addSeparator(); // añade un separador
        Menu.add(salir);
        
        menuBar.add(Menu);
        menuBar.add(AcercaMenu);
        
        // accion al menu
        
     		salir.addActionListener(new ActionListener() {
     			@Override
     			public void actionPerformed(ActionEvent e) {
     				System.exit(0);
     			}
     		});
     		
     		usuario.addActionListener(new ActionListener() {
     			@Override
                 public void actionPerformed(ActionEvent e) {
                     new Display();
                 }
             });
     		
     		coordinanor.addActionListener(new ActionListener() {
     			@Override
                 public void actionPerformed(ActionEvent e) {
                     new Coordinador();
                 }
             });
     		
     		emprendedor.addActionListener(new ActionListener() {
    			@Override
                public void actionPerformed(ActionEvent e) {
                    new Emprendedor();
                }
            });
     		
     	// titulo
     	
     	titulo.setBounds(390, 35, 900, 50);
        titulo.setText("Feria Cultural de Mil Colores GAMLP");
        titulo.setFont(new Font("Agency FB", Font.BOLD, 40));
        titulo.setForeground(new Color(26, 82, 118));
     		
     	empre.setJMenuBar(menuBar);
     	empre.add(imagen);
     	empre.add(barra);
     	empre.add(titulo);
     	
     	
     	
     // imagenes
        imagen.setBounds(30, 0, 300, 200);
        imagen.setIcon(new ImageIcon("src/gui/logo.png"));
        barra.setBounds(0, 0, 300, 800);
        barra.setIcon(new ImageIcon("src/gui/barra.png"));
     		
    }
}
