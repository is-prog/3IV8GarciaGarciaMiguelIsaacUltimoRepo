package CruddeBarbiesxd;

import javax.swing.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Image;
import java.awt.event.*;
import java.io.IOException;
import java.awt.Color;

public class VentanaPrincipal implements ActionListener{
	ArrayList<Barbie> BarbiesTodas = new ArrayList();
	CrudBarbies objCrud = new CrudBarbies();
	JFrame Ventana = new JFrame("Crud de Barbies e Interface Garcia Garcia Miguel Isaac 3IV8");
	JPanel panelVENTANA, panelxd ,pneldeDATOS;
	boolean tryycatch = true,barbiesitua1 = true,barbiesitua2 = true;
	String situacion, adjetivobarbie1, adjetivobarbie2;
	String lenguajes, gafas, mascota, especialidad, Estado, Ocupacion, Materia, Escuela;
	int cedula, cocastomadas;
	
	//componentes de panelxd
	private JLabel etiqueta1, etiqueta2;
	private JLabel imgProgramadora, imgVeterinaria, imgAlbañil, imgMaestra, imgAMLOver;
	private JButton bottProgramadora, bottVeterinaria, bottAlbañil, bottMaestra, bottAMLOver, bottRegresar,bottMostrar;
	private ImageIcon iconProgra,iconoVete,iconoAlba,iconoMaes,iconoAMLO;
	
	//Componentes de ventanas de crud
	private JTextField txtNombredelaBarbie, txtEdad, txtAdjetivo1, txtAdjetivo2,txtBorrar;
	private JLabel lblNombre, lblEdad, lblAdjetivo1, lblAdjeitvo2 ,lbl1,lblBorrar;
	private JButton bottRegistrar,bottBorrar, bottCancelar,bottRmover, bottActualizar;
	private String nombre, txtguardado,txtguardado1,textoEliminar;
	private int edad;

	
	private JButton bpmGuardar;
	private JTextField txtFullstack,txtLentes;	private String fullstack, lentes;
	private JButton bveteGuardar;
	private JButton bAlbaGuardar;
	private JButton bMissGuardar;
	private JButton bAMLOGuardar;
	private void Panel1(JPanel panel) {
		panel.setBackground(Color.cyan);
		panel.setLayout(null);
		Ventana.add(panel);		
		etiqueta1 = new JLabel("Bienvenido al Crud de Barbies de García García Miguel Isaac");
		etiqueta1.setBounds(310, 10, 680, 20);
		panel.add(etiqueta1);
		etiqueta2 = new JLabel("Elija una de las Barbies por favor:");
		etiqueta2.setBounds(370,40,680,20);
		panel.add(etiqueta2);
		bottProgramadora = new JButton("Programadora");
		bottProgramadora.setBounds(80,310,132,30);
		panel.add(bottProgramadora);
		bottProgramadora.addActionListener(this);		
		bottVeterinaria = new JButton("Veterinaria");
		bottVeterinaria.setBounds(400,310,132,30);
		panel.add(bottVeterinaria);
		bottVeterinaria.addActionListener(this);	
		bottAlbañil = new JButton("Albañil");
		bottAlbañil.setBounds(720,310,132,30);
		panel.add(bottAlbañil);
		bottAlbañil.addActionListener(this);	
		bottMaestra = new JButton("Maestra");
		bottMaestra.setBounds(250,585,132,30);
		panel.add(bottMaestra);
		bottMaestra.addActionListener(this);	
		bottAMLOver = new JButton("AMLOver");
		bottAMLOver.setBounds(575,585,132,30);
		panel.add(bottAMLOver);
		bottAMLOver.addActionListener(this);
		iconProgra = new ImageIcon((getClass().getResource("barbieprogra.jpeg")));
		imgProgramadora = new JLabel();
		imgProgramadora = cargarImagen(iconProgra);
		imgProgramadora.setBounds(80,80,132,200);
		panel.add(imgProgramadora);
		iconoVete = new ImageIcon((getClass().getResource("barbievete.jpg")));
		imgVeterinaria = new JLabel();
		imgVeterinaria = cargarImagen(iconoVete);
		imgVeterinaria.setBounds(400,80,132,200);
		panel.add(imgVeterinaria);
		iconoAlba= new ImageIcon((getClass().getResource("BarbieAlbañilxd.jpg")));
		imgAlbañil = new JLabel();
		imgAlbañil= cargarImagen(iconoAlba);
		imgAlbañil.setBounds(720,80,132,200);
		panel.add(imgAlbañil);
		iconoAMLO= new ImageIcon((getClass().getResource("amlover.jpeg")));
		imgAMLOver = new JLabel();
		imgAMLOver = cargarImagen(iconoAMLO);
		imgAMLOver.setBounds(575,370,132,200);
		panel.add(imgAMLOver);
		iconoMaes= new ImageIcon((getClass().getResource("BarbieMaestra.jpg")));
		imgMaestra = new JLabel();
		imgMaestra= cargarImagen(iconoMaes);
		imgMaestra.setBounds(250,370,132,200);
		panel.add(imgMaestra);
		
		bottMostrar = new JButton("Mostrar CruddeBarbiesxd registradas");
		bottMostrar.setBounds(390,665,200,30);
		panel.add(bottMostrar);
		bottMostrar.addActionListener(this);
		
		panel.updateUI();
		
		
	}

	
	private void pneldeDATOS(JPanel panel) {
		panel.setBackground(Color.cyan);
		panel.setLayout(null);
		Ventana.add(panel);
		lbl1 = new JLabel("Elija la accion que quiere realizar: ");
		lbl1.setBounds(395,10,680,20);
		panel.add(lbl1);
		
		bottRegistrar = new JButton("Registrar");
		bottRegistrar.setBounds(290,60,132,30);
		panel.add(bottRegistrar);
		bottRegistrar.addActionListener(this);
		lblNombre = new JLabel("Ingresa el nombre de la barbie " + situacion + ": ");
		lblNombre.setBounds(300, 160, 400, 10);
		lblNombre.setVisible(false);
		panel.add(lblNombre);
		txtNombredelaBarbie = new JTextField();
		txtNombredelaBarbie.setBounds(300, 190, 400, 30);
		txtNombredelaBarbie.setVisible(false);
		panel.add(txtNombredelaBarbie);
		lblEdad = new JLabel("Ingrese la edad de la barbie "+ situacion + ": ");
		lblEdad.setBounds(300,250,400,10);
		lblEdad.setVisible(false);
		panel.add(lblEdad);
		txtEdad = new JTextField();
		txtEdad.setBounds(300,280,400,30);
		txtEdad.setVisible(false);
		panel.add(txtEdad);
		lblAdjetivo1 = new JLabel("Ingrese " + adjetivobarbie1 + " :");
		lblAdjetivo1.setBounds(300,340,400,10);
		lblAdjetivo1.setVisible(false);
		panel.add(lblAdjetivo1);
		txtAdjetivo1 = new JTextField();
		txtAdjetivo1.setBounds(300,370,400,30);
		txtAdjetivo1.setVisible(false);
		panel.add(txtAdjetivo1);
		lblAdjeitvo2 = new JLabel("Ingrese " + adjetivobarbie2 + " :");
		lblAdjeitvo2.setBounds(300,430,400,10);
		lblAdjeitvo2.setVisible(false);
		panel.add(lblAdjeitvo2);
		txtAdjetivo2 = new JTextField();
		txtAdjetivo2.setBounds(300,460,400,30);
		txtAdjetivo2.setVisible(false);
		panel.add(txtAdjetivo2);
		bpmGuardar = new JButton("Agregar");
		bpmGuardar.setBounds(270,510,200,30);
		bpmGuardar.setVisible(false);
		bpmGuardar.addActionListener(this);
		panel.add(bpmGuardar);
		bveteGuardar = new JButton("Agregar");
		bveteGuardar.setBounds(270,510,200,30);
		bveteGuardar.setVisible(false);
		bveteGuardar.addActionListener(this);
		panel.add(bveteGuardar);
		bAlbaGuardar = new JButton("Agregar");
		bAlbaGuardar.setBounds(270,510,200,30);
		bAlbaGuardar.setVisible(false);
		bAlbaGuardar.addActionListener(this);
		panel.add(bAlbaGuardar);		
		bAMLOGuardar = new JButton("Agregar");
		bAMLOGuardar.setBounds(270,510,200,30);
		bAMLOGuardar.setVisible(false);
		bAMLOGuardar.addActionListener(this);
		panel.add(bAMLOGuardar);
		bMissGuardar = new JButton("Agregar");
		bMissGuardar.setBounds(270,510,200,30);
		bMissGuardar.setVisible(false);
		bMissGuardar.addActionListener(this);
		panel.add(bMissGuardar);
		bottBorrar = new JButton("Eliminar");
		bottBorrar.setBounds(540,60,132,30);
		panel.add(bottBorrar);
		bottBorrar.addActionListener(this);
		lblBorrar = new JLabel(textoEliminar);
		lblBorrar.setBounds(300, 290, 400, 10);
		lblBorrar.setVisible(false);
		panel.add(lblBorrar);
		txtBorrar = new JTextField();
		txtBorrar.setBounds(300, 320, 400, 30);
		txtBorrar.setVisible(false);
		panel.add(txtBorrar);
		bottRmover = new JButton("Remover");
		bottRmover.setBounds(270,510,200,30);
		bottRmover.setVisible(false);
		bottRmover.addActionListener(this);
		panel.add(bottRmover);

	
		bottRegresar = new JButton("Regresar");
		bottRegresar.setBounds(420,610,132,30);
		panel.add(bottRegresar);
		bottRegresar.addActionListener(this);
		

		bottCancelar = new JButton("Cancelar");
		bottCancelar.setBounds(520,510,200,30);
		bottCancelar.setVisible(false);
		panel.add(bottCancelar);
		bottCancelar.addActionListener(this);
		
		
		panel.updateUI();
	}
	

	private JLabel cargarImagen(ImageIcon icon){
		Image img = icon.getImage();
		//Localizacion (x, 140, 132,200)
	 	Image nuevaImagen = img.getScaledInstance(132, 200, java.awt.Image.SCALE_SMOOTH);
	 	Icon nuevoIcono = new ImageIcon(nuevaImagen);
	 	JLabel lbl = new JLabel();
	 	lbl.setIcon(nuevoIcono); 
	 	
	 	return lbl;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bottProgramadora) {
			panelxd.setVisible(false);
			situacion = "programadora";
			adjetivobarbie1 = "los lenguajes que maneja";
			adjetivobarbie2 = "los lentes que usa";
			textoEliminar = "Ingrese el nombre de la programadora a eliminar:";
			pneldeDATOS = new JPanel();
			pneldeDATOS(pneldeDATOS);
			Ventana.validate();
		}else if(e.getSource() == bottVeterinaria) {
			panelxd.setVisible(false);
			situacion = "veterinaria";
			adjetivobarbie1 = "el animal que cuida";
			adjetivobarbie2 = "su cedula profesional";
			textoEliminar = "Ingrese la cedula de la veterinaria a eliminar:";
			pneldeDATOS = new JPanel();
			pneldeDATOS(pneldeDATOS);
			Ventana.validate();
		}else if(e.getSource() == bottAlbañil) {
			panelxd.setVisible(false);
			situacion = "Albañil";
			adjetivobarbie1 = "Especialidad que tenga (simple, armada, reforzada)";
			adjetivobarbie2 = "El numero de cocas tomadas";
			textoEliminar = "Ingrese el numero de cocas tomadas de la Albañil a eliminar";
			pneldeDATOS = new JPanel();
			pneldeDATOS(pneldeDATOS);
			Ventana.validate();
		}else if(e.getSource() == bottMaestra) {
			panelxd.setVisible(false);
			situacion = "Maestra";
			adjetivobarbie1 = "La materia que imparte";
			adjetivobarbie2 = "el nombre de la Escuela en la que está";
			textoEliminar = "Ingrese el nombre de la Maestra a eliminar:";
			pneldeDATOS = new JPanel();
			pneldeDATOS(pneldeDATOS);
			Ventana.validate();
		}else if(e.getSource() == bottAMLOver) {
			panelxd.setVisible(false);
			situacion = "AMLOver";
			adjetivobarbie1 = "el estado de donde proviene";
			adjetivobarbie2 = "la ocupacion ordinaria";
			textoEliminar = "Ingrese el nombre de la AMLOver a eliminar:";
			pneldeDATOS = new JPanel();
			pneldeDATOS(pneldeDATOS);
			Ventana.validate();
		}else if(e.getSource() == bottMostrar){
			try {
				BarbiesTodas = objCrud.leerBarbies();
				if(BarbiesTodas.size() == 0) {
					JOptionPane.showMessageDialog(Ventana, "no se ha registrado ninguna barbie");
				}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(Ventana, "Ha ocurrido un error");
			}
			for(int i = 0; i < BarbiesTodas.size(); i++) {
				
				Barbie b = BarbiesTodas.get(i);

				if(b.tipobarbie() == "Programadora") {
					Programadora p = (Programadora) BarbiesTodas.get(i);
					JOptionPane.showMessageDialog(Ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				 + "\n" + "Lenguajes que maneja: " + p.getFullstack() + "\n"+ "Los lentes que usa son: " + p.getLentes() + "\n" +"Oficio: " + b.tipobarbie());
				}else if(b.tipobarbie() == "Veterinaria") {
					Veterinaria v = (Veterinaria) BarbiesTodas.get(i);
					JOptionPane.showMessageDialog(Ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				 + "\n" + "Mascota que cuida: " + v.getAnimalito() + "\n"+ "Su cedula profesional es: " + v.getCedulaprofesional() + "\n" +"Oficio: " + b.tipobarbie());
				}else if(b.tipobarbie() == "Albañil") {
					Albañil m = (Albañil) BarbiesTodas.get(i);
					JOptionPane.showMessageDialog(Ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				 + "\n" + "Especialidad: " + m.getEspecialidad() + "\n"+ "Numero de cocas tomadas: " + m.getCocastomadas() + "\n" +"Oficio: " + b.tipobarbie());
				}else if(b.tipobarbie() == "Maestra") {
					Maestra a = (Maestra) BarbiesTodas.get(i);
					JOptionPane.showMessageDialog(Ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				 + "\n" + "La materia que imparte: " + a.getMateria() + "\n"+ "De la escuela: " + a.getEscuela() + "\n" +"Oficio: " + b.tipobarbie());
				}else if(b.tipobarbie() == "AMLOver") {
					AMLOver c = (AMLOver) BarbiesTodas.get(i);
					JOptionPane.showMessageDialog(Ventana, "Barbie " + (i+1) + "\n" + "Nombre: " + b.getNombre() + "\n" + "Edad: " + b.getEdad() 
				 + "\n" + "Proveniente del Estado de: " + c.getEstado() + "\n"+ "Su ocupacion normal es: " + c.getOcupacion() + "\n" +"Oficio: " + b.tipobarbie());
				}
				
			}
			
		}else if(e.getSource() == bottRegresar) {
			panelxd.setVisible(true);
			Ventana.remove(pneldeDATOS);
		}
		
		
		if(e.getSource() == bottRegistrar) {
			mostrarDatosRegistro();
			
		}else if(e.getSource() == bpmGuardar) {
			recabarDatos();
			if(tryycatch && validacionLetras(txtNombredelaBarbie.getText()) && barbiesitua1 && barbiesitua2) {
				
				Programadora p = new Programadora(lenguajes,gafas,nombre,edad);
				try {
					objCrud.agregarProgramadora(p);
				} catch (ClassNotFoundException | IOException e1) {
					JOptionPane.showMessageDialog(Ventana, "Ha ocurrido un error, vuelva a intentar ");
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(Ventana, "Se agrego a la programadora, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Lenguajes que maneja: " + lenguajes + "\n" + "Lentes que utiliza: " + gafas);
				ocultarDatosRegistro();
			}else {
				JOptionPane.showMessageDialog(Ventana, "Invalido");
			}
		}else if(e.getSource() == bveteGuardar) {
			recabarDatos();
			if(tryycatch && validacionLetras(txtNombredelaBarbie.getText()) && barbiesitua1 && barbiesitua2) {
				Veterinaria v = new Veterinaria(cedula,mascota,nombre,edad);
				try {
					objCrud.agregarVeterinaria(v);
				} catch (ClassNotFoundException | IOException e1) {
					JOptionPane.showMessageDialog(Ventana, "Ha ocurrido un error, vuelva a intentar ");
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(Ventana, "Se agrego a la veterinaria, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Animal que cuida: " + mascota + "\n" + "Cedula profesional: " + cedula);
				ocultarDatosRegistro();
			}else {
				JOptionPane.showMessageDialog(Ventana, "Invalido");
			}
		}else if(e.getSource() == bAlbaGuardar) {
			recabarDatos();
			if(tryycatch && validacionLetras(txtNombredelaBarbie.getText()) && barbiesitua1 && barbiesitua2) {
				Albañil m = new Albañil(especialidad,cocastomadas,nombre,edad);
				try {
					objCrud.agregarAlbañil(m);
				} catch (ClassNotFoundException | IOException e1) {
					JOptionPane.showMessageDialog(Ventana, "Ha ocurrido un error, vuelva a intentar ");
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(Ventana, "Se agrego a la Albañil, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Especialidad: " + especialidad + "\n" + "Cocas tomadas: " + cocastomadas);
				ocultarDatosRegistro();
			}else {
				JOptionPane.showMessageDialog(Ventana, "Invalido");
			}
		}else if(e.getSource() == bMissGuardar) {
			recabarDatos();
			Maestra a = new Maestra(Materia,Escuela,nombre,edad);
			try {
				objCrud.agregarMaestra(a);
			} catch (ClassNotFoundException | IOException e1) {
				JOptionPane.showMessageDialog(Ventana, "Ha ocurrido un error, vuelva a intentar ");
				e1.printStackTrace();
			}
			if(tryycatch && validacionLetras(txtNombredelaBarbie.getText()) && barbiesitua1 && barbiesitua2) {
				JOptionPane.showMessageDialog(Ventana, "Se agrego a la Maestra, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Materia que imparte: " + Materia + "\n" + "Escuela en la que esta: " + Escuela);
				ocultarDatosRegistro();
			}else {
				JOptionPane.showMessageDialog(Ventana, "Invalido");
			}
		}else if(e.getSource() == bAMLOGuardar) {
			recabarDatos();
			AMLOver c = new AMLOver(Estado,Ocupacion,nombre,edad);
			try {
				objCrud.agregarAMLOver(c);
				} catch (ClassNotFoundException | IOException e1) {
				JOptionPane.showMessageDialog(Ventana, "Ha ocurrido un error, vuelva a intentar ");
				e1.printStackTrace();
			}
			if(tryycatch && validacionLetras(txtNombredelaBarbie.getText()) && barbiesitua1 && barbiesitua2) {
				JOptionPane.showMessageDialog(Ventana, "Se agrego a la AMLOver, que tiene de datos: " + "\n" + "Nombre: " + nombre + "\n" + "Edad: " + edad 
						+ "\n" + "Proveniente del Estado de: " + Estado + "\n" + "De ordinaria ocupcion: " + Ocupacion);
				ocultarDatosRegistro();
			}else {
				JOptionPane.showMessageDialog(Ventana, "Invalido");
			}
		}else if(e.getSource() == bottCancelar) {
			ocultarDatosRegistro();
		}else if(e.getSource() == bottActualizar) {
			JOptionPane.showMessageDialog(Ventana, "Actualizar no disponible de momento");
		}else if(e.getSource() == bottBorrar) {
			
			txtBorrar.setVisible(true);
			lblBorrar.setVisible(true);
			bottRmover.setVisible(true);
			bottRegistrar.setEnabled(false);
			bottBorrar.setEnabled(false);
			bottCancelar.setVisible(true);
		}else if(e.getSource() == bottRmover) {
			
			if(situacion.equals("programadora")) {
				if(validacionLetras(txtBorrar.getText())) {
					Programadora eliminar = new Programadora();
					try {
						eliminar = objCrud.buscarProgramadora(txtBorrar.getText());
					} catch (ClassNotFoundException | IOException e1) {
						
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(Ventana, "No fue encontrad la Barbie que buscabas");
					}else{
						try {
							objCrud.eliminarProgramadora(eliminar);
							JOptionPane.showMessageDialog(Ventana, "La programadora eliminada fue: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							
							JOptionPane.showMessageDialog(Ventana, "No se ha logrdo eliminaar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(Ventana, "Invalido");
				}
			}else if(situacion.equals("veterinaria")) {
				boolean pasar = true;
				int cedulita = 0;
				try {
					cedulita = Integer.parseInt(txtBorrar.getText());
					pasar =true;
				}catch(Exception a){
					JOptionPane.showMessageDialog(Ventana, "Solo numeros");
					pasar = false;
				}
				if(pasar) {
					Veterinaria eliminar = new Veterinaria();
					try {
						eliminar = objCrud.buscarVeterinaria(cedulita);
					} catch (ClassNotFoundException | IOException e1) {
						
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(Ventana, "No se a encontrado esta barbie");
					}else{
						try {
							objCrud.eliminarVeterinaria(eliminar);
							JOptionPane.showMessageDialog(Ventana, "Se elimino la veterinaria: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							
							JOptionPane.showMessageDialog(Ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(Ventana, "Invalido");
				}
			}else if(situacion.equals("Albañil")) {
				boolean pasar = true;
				int cocastomadas = 0;
				try {
					cocastomadas = Integer.parseInt(txtBorrar.getText());
					pasar =true;
				}catch(Exception a){
					JOptionPane.showMessageDialog(Ventana, "Solo numeros");
					pasar = false;
				}
				if(pasar) {
					Albañil eliminar = new Albañil();
					try {
						eliminar = objCrud.buscarAlbañil(cocastomadas);
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(Ventana, "No se a encontrado la Barbie ingresada");
					}else{
						try {
							objCrud.eliminarAlbañil(eliminar);
							JOptionPane.showMessageDialog(Ventana, "Se elimino la Albañil: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(Ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(Ventana, "Invalido");
				}
			}else if(situacion.equals("Albañil")) {
				if(validacionLetras(txtBorrar.getText())) {
					Maestra eliminar = new Maestra();
					try {
						eliminar = objCrud.buscarMaestra(txtBorrar.getText());
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(Ventana, "No se a encontrado esta barbie");
					}else{
						try {
							objCrud.eliminarMaestra(eliminar);
							JOptionPane.showMessageDialog(Ventana, "Se elimino la Maestra: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(Ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(Ventana, "Invalido");
				}
			}else if(situacion.equals("AMLOver")) {
				if(validacionLetras(txtBorrar.getText())) {
					AMLOver eliminar = new AMLOver();
					try {
						eliminar = objCrud.buscarAMLOver(txtBorrar.getText());
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(eliminar.getNombre() == null) {
						JOptionPane.showMessageDialog(Ventana, "No se a encontrado esta barbie");
					}else{
						try {
							objCrud.eliminarAMLOver(eliminar);
							JOptionPane.showMessageDialog(Ventana, "Se elimino a la AMLOver: " + eliminar.getNombre());
						} catch (ClassNotFoundException | IOException e1) {
							// TODO Auto-generated catch block
							JOptionPane.showMessageDialog(Ventana, "No se pudo eliminar");
						}
					}
				}else{
					JOptionPane.showMessageDialog(Ventana, "Invalido");
				}
			}
		}
	}
	
	public void mostrarDatosRegistro() {
		txtNombredelaBarbie.setVisible(true);
		lblNombre.setVisible(true);
		txtEdad.setVisible(true);
		lblEdad.setVisible(true);
		txtAdjetivo1.setVisible(true);
		lblAdjetivo1.setVisible(true);
		lblAdjeitvo2.setVisible(true);
		txtAdjetivo2.setVisible(true);
		bottRegistrar.setEnabled(false);
		bottBorrar.setEnabled(false);
		//.setEnabled(false);
		bottCancelar.setVisible(true);
		
		if(situacion == "programadora") {
			bpmGuardar.setVisible(true);
		}else if(situacion == "veterinaria") {
			bveteGuardar.setVisible(true);
		}else if(situacion == "Albañil") {
			bAlbaGuardar.setVisible(true);
		}else if(situacion == "Maestra") {
			bMissGuardar.setVisible(true);
		}else if(situacion == "AMLOver") {
			bAMLOGuardar.setVisible(true);
		}
	}
	
	public void ocultarDatosRegistro() {
		txtNombredelaBarbie.setVisible(false);
		txtNombredelaBarbie.setText("");
		lblNombre.setVisible(false);
		txtEdad.setVisible(false);
		txtEdad.setText("");
		lblEdad.setVisible(false);
		txtAdjetivo1.setVisible(false);
		txtAdjetivo1.setText("");
		lblAdjetivo1.setVisible(false);
		lblAdjeitvo2.setVisible(false);
		txtAdjetivo2.setVisible(false);
		txtAdjetivo2.setText("");
		bottRegistrar.setEnabled(true);
		bottBorrar.setEnabled(true);
		//.setEnabled(true);
		bpmGuardar.setVisible(false);
		bMissGuardar.setVisible(false);
		bAlbaGuardar.setVisible(false);
		bAMLOGuardar.setVisible(false);
		bveteGuardar.setVisible(false);
		bottCancelar.setVisible(false);
		txtBorrar.setVisible(false);
		lblBorrar.setVisible(false);
		bottRmover.setVisible(false);
	}
	
	public void recabarDatos(){
		txtguardado1 = txtAdjetivo2.getText();
		txtguardado = txtAdjetivo1.getText();
		if(situacion == "programadora") {
			if(validacionLetras(txtguardado)) {
				lenguajes = txtguardado;
				barbiesitua1 = true;
			}else {
				barbiesitua1 = false;
			}
			if(validacionLetras(txtguardado1)) {
				gafas = txtguardado1;
				barbiesitua2 = true;
			}else {
				barbiesitua2 = false;
			}
			
		}else if(situacion == "veterinaria") {
			if(validacionLetras(txtguardado)) {
				mascota = txtguardado;
				barbiesitua1 = true;
			}else {
				barbiesitua1 = false;
			}
			try {
				cedula = Integer.parseInt(txtguardado1);
				tryycatch = true;
			}catch(Exception e) {
				tryycatch = false;
			}
		}else if(situacion == "Albañil") {
			if(validacionLetras(txtguardado)) {
				especialidad = txtguardado;
				barbiesitua1 = true;
			}else {
				barbiesitua1 = false;
			}
			try {
				cocastomadas = Integer.parseInt(txtguardado1);
				tryycatch = true;
			}catch(Exception e) {
				tryycatch = false;
			}
		}else if(situacion == "Maestra") {
			if(validacionLetras(txtguardado)) {
				Materia = txtguardado;
				barbiesitua1 = true;
			}else {
				barbiesitua1 = false;
			}
			if(validacionLetras(txtguardado1)) {
				Escuela = txtguardado1;
				barbiesitua2 = true;
			}else {
				barbiesitua2 = false;
			}
		}else if(situacion == "AMLOver") {
			if(validacionLetras(txtguardado)) {
				Estado = txtguardado;
				barbiesitua1 = true;
			}else {
				barbiesitua1 = false;
			}
			if(validacionLetras(txtguardado1)) {
				Ocupacion = txtguardado1;
				barbiesitua2 = true;
			}else {
				barbiesitua2 = false;
			}
		}
			
		nombre = txtNombredelaBarbie.getText();
		try {
			edad = Integer.parseInt(txtEdad.getText());
			tryycatch = true;
		}catch(Exception e) {
			tryycatch = false;
		}
	}
	
	public boolean validacionLetras(String l) {
		Pattern pattern = Pattern.compile("[a-z,A-Z]");
	    Matcher matcher = pattern.matcher(l);
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      return true;
	    } else {
	      return false;
	    }
	}
	public void Programa() {
		Ventana.setBounds(0, 0, 950, 750);
		Ventana.setResizable(false);
		Ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ventana.setAlwaysOnTop(true);
		Ventana.setLocationRelativeTo(null);
		
		panelxd = new JPanel();
		Panel1(panelxd);
		Ventana.setVisible(true);

	}


	
}
