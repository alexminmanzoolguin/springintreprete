package beans;

public class Traductor2 {
	private InterpreteRuso interprete;
	private String nombre;
	public void hablar() {
	this.interprete.saludar();
	System.out.println(nombre);
	this.interprete.despedirse();
	}
	public InterpreteRuso getIntreprete() {
	return this.interprete;
	}
	public void setInterprete(InterpreteRuso interprete) {
	this.interprete = interprete;
	}
	
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	
}
