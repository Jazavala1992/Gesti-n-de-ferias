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

public class Coordinador extends JFrame {

	private static final long serialVersionUID = -8383947337415919188L;
	JFrame coor;
	JMenuBar menuBar;
	JLabel barra, titulo, imagen, addfer, addempr, estad, movemp, eliemp ;
	
	public Coordinador() {
        coor = new JFrame();
        barra = new JLabel();
        titulo = new JLabel();
        imagen = new JLabel();
        addfer = new JLabel();
        addempr = new JLabel();
        estad = new JLabel();
        movemp = new JLabel();
        eliemp= new JLabel();
        JMenuBar menuBar = new JMenuBar();
        JMenu Menu = new JMenu("Menu");
        JMenu AcercaMenu = new JMenu("Acerca");
        JMenuItem usuario = new JMenuItem("Usuario");
        JMenuItem coordinanor = new JMenuItem("Coordinador");
        JMenuItem emprendedor = new JMenuItem("Emprendedor");
        JMenuItem salir = new JMenuItem("Salir");
        
        coor.setSize(1400, 900);
        coor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        coor.setVisible(true);
        coor.setLayout(null);
        coor.setTitle("Feria Cultural de Mil Colores GAMLP");
        coor.getContentPane().setBackground(Color.white);
        coor.setExtendedState(MAXIMIZED_BOTH);
        
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
     		
     	coor.setJMenuBar(menuBar);
     	coor.add(imagen);
     	coor.add(barra);
     	coor.add(titulo);
     	coor.add(addfer);
     	coor.add(addempr);
     	coor.add(estad);
     	coor.add(movemp);
     	coor.add(eliemp);
     	
     // imagenes
        imagen.setBounds(30, 0, 300, 200);
        imagen.setIcon(new ImageIcon("src/gui/logo.png"));
        barra.setBounds(0, 0, 300, 800);
        barra.setIcon(new ImageIcon("src/gui/barra.png"));        
        addempr.setBounds(340, 80, 900, 200);
        addempr.setIcon(new ImageIcon("src/gui/addemp.png"));
        addfer.setBounds(340, 270, 900, 200);
        addfer.setIcon(new ImageIcon("src/gui/addfer.png"));
     		
    }
	
	

}
