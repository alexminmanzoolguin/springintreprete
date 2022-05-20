package beans;

public class Traductor1 {
	private InterpreteIngles interprete;
	private String nombre;
	public void hablar() {
	this.interprete.saludar();
	System.out.println(nombre);
	this.interprete.despedirse();
	}
	public InterpreteIngles getIntreprete() {
	return this.interprete;
	}
	public void setInterprete(InterpreteIngles interprete) {
	this.interprete = interprete;
	}
	
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
}
