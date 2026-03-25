
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import proyectoProgII.*;
import proyectoProgII.Main;

@SuppressWarnings("unused")
public class Display extends JFrame {

    private static final long serialVersionUID = -153992171408026711L;
    JFrame main;
    JButton btn1, btn2, btn3, btn4, btn5, btn6;
    JLabel barra, titulo, imagen,rest, comida, feria, menu, best;
    JTextField campo1, campo2, campo3, campo4, campo5, campo6;
    JMenuBar menuBar;
    LDobleF A;
    ColaMa M;
    JTable tabla;

    public Display() {
        main = new JFrame();
        titulo = new JLabel();
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        campo1 = new JTextField();
        campo2 = new JTextField();
        campo3 = new JTextField();
        campo4 = new JTextField();
        campo5 = new JTextField();
        campo6 = new JTextField();
        imagen = new JLabel();
        barra = new JLabel();
        rest = new JLabel();
        comida = new JLabel();
        feria= new JLabel();
        menu = new JLabel();
        best = new JLabel();
        A = Main.getListaFerias();
        M = Main.getColaMacrodritritos();
        JMenuBar menuBar = new JMenuBar();
        JMenu Menu = new JMenu("Menu");
        JMenu AcercaMenu = new JMenu("Acerca");
        JMenuItem usuario = new JMenuItem("Usuario");
        JMenuItem coordinanor = new JMenuItem("Coordinador");
        JMenuItem emprendedor = new JMenuItem("Emprendedor");
        JMenuItem salir = new JMenuItem("Salir");
       
        main.setSize(1400, 900);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setVisible(true);
        main.setLayout(null);
        main.setTitle("Feria Cultural de Mil Colores GAMLP");
        main.getContentPane().setBackground(Color.white);
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
      
        ;
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
		// Tablas
		
		tabla = new JTable();
		tabla.setBounds(700, 700, 190, 50);
		tabla.setBackground(Color.white);
		tabla.setForeground(Color.black);
		tabla.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabla.setRowHeight(30);
		JScrollPane sp5 = new JScrollPane(tabla);
		sp5.setBounds(700, 700, 190, 50);
        
        
        // Botones
		
		btn1.setBounds(370, 115, 230, 50);
        btn1.setText("Encuentra tu restaurante favorito");
        btn1.setBorder(null);
        btn1.setBackground(null);
        btn1.setContentAreaFilled(false);
        btn1.setOpaque(false);
        btn1.setForeground(Color.white);
        btn1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        btn1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            	 
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            	 btn1.setBackground(Color.LIGHT_GRAY);
            	 btn1.setBorder(new LineBorder(Color.white, 1));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	btn1.setBackground(null);
           	 	btn1.setBorder(null);
            }
        });
        
        btn1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) // btn3
        	{	int sw=0;
        		String x;
            	x = campo1.getText();
            	NodoF f=A.getP();
        		while (f!=null)
        		{
        			LDobleEm E=f.getEmprendedores();
        			NodoEm em=E.getP();
        			while (em!=null)
        			{
        				if (em.getEmprendedor().getNombreEmprendimiento().equals(x))
        					{
        					JOptionPane.showMessageDialog(btn1, "Feria: "+f.getFeria().getLugar()+" - Fecha: "+f.getFeria().getFecha());
        					sw=1;
        					}
        				em=em.getSig();
        			}
        			
        			f=f.getSig();
        		}
        		
				if (sw == 0)
					JOptionPane.showMessageDialog(btn1, "No se encontro el restaurante");
        	}
	     });
		
        btn2.setBounds(820, 115, 240, 50);
        btn2.setText("Mayores ingresos de restaurantes");
        btn2.setBorder(null);
        btn2.setBackground(null);
        btn2.setContentAreaFilled(false);
        btn2.setOpaque(false);
        btn2.setForeground(Color.white);
        btn2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn2.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {		
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setBackground(Color.LIGHT_GRAY);
				btn2.setBorder(new LineBorder(Color.white, 1));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setBackground(null);
				btn1.setBorder(null);
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) // btn1
        {	
				int sw=0;
				String x;
				x = campo2.getText();
				int may = 0;
				LDobleEm aux=new LDobleEm();
	            NodoF f = A.getP();
	            while (f != null) 
	            {
	                if (f.getFeria().getIdFeria().equals(x)) 
	                {
	                    NodoEm e1 = f.getEmprendedores().getP();
	                    while (e1 != null) 
	                    {
	                    	may = Main.mayorIngresos(f.getEmprendedores().getP(), 0);
	                    	if (Main.sumaingresos(e1.getEmprendimiento().getCl().getP()) == may) 
	                        {
	                    		aux.adicionar(e1.getEmprendedor(), e1.getEmprendimiento().getEmprendimiento(), null, null);
	           
	                            sw = 1;
	                        }
	                        e1 = e1.getSig();
	                    }
	                }
	                f = f.getSig();
	            }
	            if (sw==1)
	            	showT3(aux, x, may);
	            else
	            	JOptionPane.showMessageDialog(btn2, "No se encontro la comida");
	            	
        	}
        });
				
	 
        btn3.setBounds(370, 340, 150, 50);
        btn3.setText("Encuentra las Ferias");
        btn3.setBorder(null);
        btn3.setBackground(null);
        btn3.setContentAreaFilled(false);
        btn3.setOpaque(false);
        btn3.setForeground(Color.white);
        btn3.setFont(new Font("Tahoma", Font.PLAIN, 15));

        btn3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            	 
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            	 btn3.setBackground(Color.LIGHT_GRAY);
            	 btn3.setBorder(new LineBorder(Color.white, 1));
            }

            @Override
            public void mouseExited(MouseEvent e) {
            	btn3.setBackground(null);
           	 	btn3.setBorder(null);
            }
        });
        
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) // btn2
		{	
			int sw=0;
			LDobleF aux=new LDobleF();
			String x;
			M=Main.getColaMacrodritritos();
			x = campo3.getText();
			NodoF w=A.getP();
			while (w != null) 
			{	
				if (x.equals(Main.nomMacro(M, w.getFeria().getIdMacroDistrito())))
				{
					aux.adicionar(w.getFeria(),null);
					sw=1;
				}
				w = w.getSig();
			}
			if (sw==0)
				JOptionPane.showMessageDialog(btn3, "No se encontro la feria");
			else
				showT2(aux,x);
		 }
		});

        
		btn4.setBounds(820, 340, 150, 50);
		btn4.setText("Descubre los menus");
		btn4.setBackground(null);
		btn4.setBorder(null);
		btn4.setContentAreaFilled(false);
		btn4.setOpaque(false);
		btn4.setForeground(Color.white);
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		btn4.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btn4.setBackground(Color.LIGHT_GRAY);
				btn4.setBorder(new LineBorder(Color.white, 1));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btn4.setBackground(null);
				btn4.setBorder(null);
			}
		});
		
		btn4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) // btn5
            {	int sw=0;
                String x;
                x = campo4.getText();
    			NodoF f=A.getP();
    			while (f != null) 
    			{
    				NodoEm em=f.getEmprendedores().getP();
    				while (em != null) 
    				{
    					
    					if (em.getEmprendedor().getNombreEmprendimiento().equals(x)) 
    					{
    						showT5(em.getEmprendimiento());
    						sw = 1;
    					}
    					em = em.getSig();
    				}
    				f = f.getSig();
    			}
                
                if (sw == 0)
                    JOptionPane.showMessageDialog(btn4, "No se encontro el menu");   
            }
        });
		
		 btn5.setBounds(670, 570, 260, 50);
	        btn5.setText("Mover emprendimiento a otra feria");
	        btn5.setBackground(null);
	        btn5.setBorder(null);
	        btn5.setContentAreaFilled(false);
	        btn5.setOpaque(false);
	        btn5.setForeground(Color.white);
	        btn5.setFont(new Font("Tahoma", Font.PLAIN, 15));
	        
			btn5.addMouseListener(new MouseListener() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
				}

				@Override
				public void mousePressed(MouseEvent e) {
				}

				@Override
				public void mouseReleased(MouseEvent e) {

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					btn5.setBackground(Color.LIGHT_GRAY);
					btn5.setBorder(new LineBorder(Color.white, 1));
				}

				@Override
				public void mouseExited(MouseEvent e) {
					btn5.setBackground(null);
					btn5.setBorder(null);
				}
			});
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) // btn4
				{
					String x,y;
					x = campo5.getText();
					y = campo6.getText();
					
					Main.moverEm(A, x, y);
					
					int sw=0;
	            	NodoF f=A.getP();
	        		while (f!=null)
	        		{
	        			LDobleEm E=f.getEmprendedores();
	        			NodoEm em=E.getP();
	        			while (em!=null)
	        			{
	        				if (em.getEmprendedor().getNombreEmprendimiento().equals(x))
	        					{
	        					JOptionPane.showMessageDialog(btn5, "Feria: "+f.getFeria().getLugar()+" - Fecha: "+f.getFeria().getFecha());
	        					sw=1;
	        					}
	        				em=em.getSig();
	        			}
	        			
	        			f=f.getSig();
	        		}
	        		
					if (sw == 0)
						JOptionPane.showMessageDialog(btn5, "No se encontro el restaurante");
				}
			});

        titulo.setBounds(390, 35, 900, 50);
        titulo.setText("Feria Cultural de Mil Colores GAMLP");
        titulo.setFont(new Font("Agency FB", Font.BOLD, 40));
        titulo.setForeground(new Color(26, 82, 118));

        main.add(btn1);
        main.add(btn2);
        main.add(btn3);
        main.add(btn4);
        main.add(btn5);
        main.add(titulo);
        main.add(imagen);
        main.add(campo1);
        main.add(campo2);
        main.add(campo3);
        main.add(campo4);
        main.add(campo5);
        main.add(campo6);
        main.add(barra);
        main.add(rest);
        main.add(comida);
        main.add(feria);
        main.add(menu);
        main.add(best);
        main.setJMenuBar(menuBar);
        
        
       
      
        // campo de texto
        
        campo1.setBounds(475, 200, 190, 50);
        campo1.setText("Buscar restaurante ...");
        campo1.setForeground(Color.gray);
        campo1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		campo1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				campo1.setText("");
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		
		campo1.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				btn1.doClick();  
            }
        });
	
     
        campo2.setBounds(925, 200, 190, 50);
        campo2.setText("Codigo de Feria ...");
        campo2.setForeground(Color.gray);
        campo2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        campo2.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				campo2.setText("");
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
		});
        campo2.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				btn2.doClick();  
            }
        });
        
        campo3.setBounds(475, 420, 190, 50);
        campo3.setText("Buscar ferias..."); 
        campo3.setForeground(Color.gray);
        campo3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        campo3.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				campo3.setText("");
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
        
        campo3.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				btn3.doClick();  
            }
        });
	
        campo4.setBounds(925, 420, 190, 50);
        campo4.setText("Buscar menu ...");
        campo4.setForeground(Color.gray);
        campo4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        campo4.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				campo4.setText("");
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
        
        campo4.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				btn4.doClick();  
            }
        });
        
        campo5.setBounds(550, 620, 230, 50);
        campo5.setText("Nombre del emprendimiento ...");
        campo5.setForeground(Color.gray);
        campo5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        campo5.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
     
        campo6.setBounds(835, 620, 230, 50);
        campo6.setText("Codigo de la feria ...");
        campo6.setForeground(Color.gray);
        campo6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        campo6.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});

        // imagenes
        imagen.setBounds(30, 0, 300, 200);
        imagen.setIcon(new ImageIcon("src/gui/logo.png"));
        barra.setBounds(0, 0, 300, 800);
        barra.setIcon(new ImageIcon("src/gui/barra.png"));
        rest.setBounds(350, 10, 360, 400);
        rest.setIcon(new ImageIcon("src/gui/rest.png"));
        comida.setBounds(800, 10, 360, 400);
        comida.setIcon(new ImageIcon("src/gui/comida.png"));
        feria.setBounds(350, 230, 360, 400);
        feria.setIcon(new ImageIcon("src/gui/feria.png"));
        menu.setBounds(800, 230, 360, 400);
        menu.setIcon(new ImageIcon("src/gui/menu.png"));
        best.setBounds(330, 440, 900, 400);
        best.setIcon(new ImageIcon("src/gui/addfer.png"));
       
    }

	// ventana emergente al hacer click en el boton
    private void Jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(btn2, "Bienvenido a la Feria de MilColores GAMLP");
    }
    
	public void showT1(LDobleEm a, String x)
	{
		String[] columnNames = { "Nombre", "Especialidad" };
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);

		NodoEm em = a.getP();
		while (em != null) {
			model.addRow(new Object[] { em.getEmprendedor().getNombreEmprendimiento(),
					em.getEmprendedor().getEspedialidad() });
			em = em.getSig();
		}

		JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new java.awt.Dimension(400, 200));

		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		headerRenderer.setHorizontalAlignment(JLabel.CENTER);
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
		}

		JOptionPane.showMessageDialog(null, scrollPane, "Emprendimientos de " + x, JOptionPane.INFORMATION_MESSAGE);
	}    
    
    public void showT2(LDobleF a, String x)
	{
		// titulo de la tabla
		String[] columnNames = { "Lugar", "Fecha","Hora" };
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);

		NodoF f = a.getP();
		while (f != null) 
		{
            model.addRow(new Object[] { f.getFeria().getLugar(), f.getFeria().getFecha(), f.getFeria().getHora() });
            f = f.getSig();
        }
		
	

		JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new java.awt.Dimension(400, 200));

		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		headerRenderer.setHorizontalAlignment(JLabel.CENTER);
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) 
		{
			table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
		}

		JOptionPane.showMessageDialog(null, scrollPane, "Ferias de " + x, JOptionPane.INFORMATION_MESSAGE);
	}
    
    public void showT3(LDobleEm a, String x, int may)
        {
    	    String[] columnNames = { "Nombre", "Especialidad", "Ingresos" };
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);

            NodoEm em = a.getP();
            while (em != null) 
            {
                    model.addRow(new Object[] { em.getEmprendedor().getNombreEmprendimiento(),
                    em.getEmprendedor().getEspedialidad(), may });
                
                em = em.getSig();
            }

            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setPreferredSize(new java.awt.Dimension(400, 200));

            DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
            headerRenderer.setHorizontalAlignment(JLabel.CENTER);
            for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) 
            {
                table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
            }

            JOptionPane.showMessageDialog(null, scrollPane, "Emprendimientos de " + x, JOptionPane.INFORMATION_MESSAGE);
            
        }
    
    
    public void showT5(NodoE a) 
	{
		//titulo de la tabla
		String[] columnNames = { "Plato", "Precio" };
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);

		CCircularM aux = new CCircularM();
		CCircularM m = a.getMenu();
		while (!m.esvacia()) {
			Plato p = m.eliminar();
			model.addRow(new Object[] { p.getNombre(), p.getPrecio() });
			aux.adicionar(p);
		}
		m.vaciar(aux);

		JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new java.awt.Dimension(400, 200));
		
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
	    headerRenderer.setHorizontalAlignment(JLabel.CENTER);
	    for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
	        table.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
	    }
	    
		JOptionPane.showMessageDialog(null, scrollPane, "Menu de " +a.getEmprendimiento().getNombreEmprendimiento(), JOptionPane.INFORMATION_MESSAGE);
	}

}