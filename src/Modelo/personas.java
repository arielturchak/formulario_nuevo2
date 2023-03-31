package Modelo;

public class personas {
	private String nif;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	
	
	public personas() {
		this.nif = "";
		this.nombre = "";
		this.apellido = "";
		this.telefono = "";
		this.correo = "";
		
		
	}




	public personas(String nif, String nombre, String apellido, String telefono, String correo) {
		this.nif = nif;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
	}


	public String getNif() {
		return nif;
	}


	public void setNif(String nif) {
		this.nif = nif;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}
	

	@Override
	public String toString() {
		return "NIF=" + nif + "\n" + "NOMBRE=" + nombre + "\n" +"APELLIDO=" + apellido + "\n" + "TELEFONO=" + telefono + "\n" + "CORREO=" + correo + "]";
	}

}
