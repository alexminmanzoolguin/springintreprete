package beans;

public class Traductor4 {
	private InterpreteGallego interprete;
	private String nombre;
	public void hablar() {
	this.interprete.saludar();
	System.out.println(nombre);
	this.interprete.despedirse();
	}
	public InterpreteGallego getIntreprete() {
	return this.interprete;
	}
	public void setInterprete(InterpreteGallego interprete) {
	this.interprete = interprete;
	}
	
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
}
