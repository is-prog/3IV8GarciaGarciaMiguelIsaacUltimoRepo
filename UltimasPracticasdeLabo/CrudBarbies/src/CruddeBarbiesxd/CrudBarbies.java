package CruddeBarbiesxd;

import java.io.*;
import java.util.ArrayList;

public class CrudBarbies {
	/*
	 * CRUD 
	 * Consult 
	 * Register 
	 * Update 
	 * Delete
	 * 
	 */

	ArrayList<Barbie> listadebarbies = new ArrayList();

	public ArrayList<Barbie> leerBarbies() throws IOException, ClassNotFoundException {
		actualizarLista();
		return listadebarbies;
	}

	public void agregarProgramadora(Programadora p) throws IOException, ClassNotFoundException {
		actualizarLista();
		listadebarbies.add(p);
		guardar();
	}

	public void agregarVeterinaria(Veterinaria v) throws IOException, ClassNotFoundException {
		actualizarLista();
		listadebarbies.add(v);
		guardar();
	}

	public void agregarAlbañil(Albañil m) throws IOException, ClassNotFoundException {
		actualizarLista();
		listadebarbies.add(m);
		guardar();
	}

	public void agregarMaestra(Maestra a) throws IOException, ClassNotFoundException {
		actualizarLista();
		listadebarbies.add(a);
		guardar();
	}

	public void agregarAMLOver(AMLOver c) throws IOException, ClassNotFoundException {
		actualizarLista();
		listadebarbies.add(c);
		guardar();
	}

	public Programadora buscarProgramadora(String nombre) throws IOException, ClassNotFoundException {
		Programadora encontrada = new Programadora();

		actualizarLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Barbie barbie = listadebarbies.get(i);
			if(barbie.tipobarbie().equals("Programadora")) {
				Programadora fullstack = (Programadora) listadebarbies.get(i);
				if (fullstack.getNombre().equals(nombre)) {
					return fullstack;
				}
			}
		}

		return encontrada;
	}

	public Veterinaria buscarVeterinaria(int cedulin) throws IOException, ClassNotFoundException {
		Veterinaria encontrada = new Veterinaria();

		actualizarLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Barbie barbie = listadebarbies.get(i);
			if(barbie.tipobarbie().equals("Veterinaria")) {
				Veterinaria vet = (Veterinaria) listadebarbies.get(i);
				if (vet.getCedulaprofesional() == (cedulin)) {
					return vet;
				}
			}
			
		}
		return encontrada;
	}

	public Albañil buscarAlbañil(int cocastomadas) throws IOException, ClassNotFoundException {
		Albañil encontrada = new Albañil();

		actualizarLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Barbie barbie = listadebarbies.get(i);
			if(barbie.tipobarbie().equals("Albañil")) {
				Albañil xd = (Albañil) listadebarbies.get(i);
				if (xd.getCocastomadas() == (cocastomadas)) {
					return xd;
				}
			}
			
		}
		return encontrada;
	}

	public AMLOver buscarAMLOver(String nombre) throws IOException, ClassNotFoundException {
		AMLOver encontrada = new AMLOver();

		actualizarLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Barbie barbie = listadebarbies.get(i);
			if(barbie.tipobarbie().equals("AMLOver")) {
				AMLOver lordmoleculaa = (AMLOver) listadebarbies.get(i);
				if (lordmoleculaa.getNombre().equals(nombre)) {
					return lordmoleculaa;
				}
			}
			
		}
		return encontrada;
	}

	public Maestra buscarMaestra(String Nombre) throws IOException, ClassNotFoundException {
		Maestra encontrada = new Maestra();

		actualizarLista();
		for (int i = 0; i < listadebarbies.size(); i++) {
			Maestra profa = (Maestra) listadebarbies.get(i);
			if (profa.getNombre().equals(Nombre)) {
				encontrada = profa;
			}
		}
		return encontrada;
	}

	public void actualizarProgramadora(Programadora p)throws FileNotFoundException, ClassNotFoundException, IOException {

		actualizarLista();
		Programadora eliminar = buscarProgramadora(p.getNombre());
		listadebarbies.remove(eliminar);
		listadebarbies.add(p);
		guardar();
	}

	public void actualizarVeterinaria(Veterinaria v) throws FileNotFoundException, ClassNotFoundException, IOException {

		actualizarLista();
		Veterinaria eliminar = buscarVeterinaria(v.getCedulaprofesional());
		listadebarbies.remove(eliminar);
		listadebarbies.add(v);
		guardar();

	}

	public void actualizarAlbañil(Albañil m) throws FileNotFoundException, ClassNotFoundException, IOException {

		actualizarLista();
		Albañil eliminar = buscarAlbañil(m.getCocastomadas());
		listadebarbies.remove(eliminar);
		listadebarbies.add(m);
		guardar();

	}

	public void actualizarAMLOver(AMLOver c) throws FileNotFoundException, ClassNotFoundException, IOException {

		actualizarLista();
		AMLOver eliminar = buscarAMLOver(c.getNombre());
		listadebarbies.remove(eliminar);
		listadebarbies.add(c);
		guardar();

	}

	public void actualizarAlbañil(Maestra a) throws FileNotFoundException, ClassNotFoundException, IOException {

		actualizarLista();
		Maestra eliminar = buscarMaestra(a.getNombre());
		listadebarbies.remove(eliminar);
		listadebarbies.add(a);
		guardar();

	}

	public void eliminarProgramadora(Programadora p) throws ClassNotFoundException, IOException {
		actualizarLista();
		listadebarbies.remove(p);
		guardar();
	}

	public void eliminarVeterinaria(Veterinaria v) throws ClassNotFoundException, IOException {
		actualizarLista();
		listadebarbies.remove(v);
		guardar();
	}

	public void eliminarAlbañil(Albañil m) throws ClassNotFoundException, IOException {
		actualizarLista();
		listadebarbies.remove(m);
		guardar();
	}

	public void eliminarAMLOver(AMLOver c) throws ClassNotFoundException, IOException {
		actualizarLista();
		listadebarbies.remove(c);
		guardar();
	}

	public void eliminarMaestra(Maestra a) throws ClassNotFoundException, IOException {
		actualizarLista();
		listadebarbies.remove(a);
		guardar();
	}

	public void eliminarBarbie(String nombre) {

	}

	public void guardar() throws IOException {
		// Para guardar el archivo tenemos que escribir una salida
		FileOutputStream archivo = new FileOutputStream("archivo.dat");
		// tenemos que definir el buffer de salida del archivo
		ObjectOutputStream salida = new ObjectOutputStream(archivo);

		// escribimos los datos del array
		salida.writeObject(listadebarbies);
		// cerramos el flujo
		salida.close();

	}

	public void actualizarLista() throws IOException {
		boolean errores = false;
		do{
			try{
				FileInputStream archivo = new FileInputStream("archivo.dat");
				ObjectInputStream entrada = new ObjectInputStream(archivo);
				listadebarbies = (ArrayList) entrada.readObject();
				entrada.close();
				errores = false;
			}catch(Exception e){
				FileOutputStream archivo1 = new FileOutputStream("archivo.dat");
				ObjectOutputStream salida = new ObjectOutputStream(archivo1);
				ArrayList<Barbie> provicional = new ArrayList();
				salida.writeObject(provicional);
				archivo1.close();
				errores = true;
			}
		}while(errores);
	}
}
