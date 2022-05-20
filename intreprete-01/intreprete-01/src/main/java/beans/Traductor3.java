package beans;

public class Traductor3 {
	private interpreteFrancia interprete;
	private String nombre;
	public void hablar() {
	this.interprete.saludar();
	System.out.println(nombre);
	this.interprete.despedirse();
	}
	public interpreteFrancia getIntreprete() {
	return this.interprete;
	}
	public void setInterprete(interpreteFrancia interprete) {
	this.interprete = interprete;
	}
	
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	
}
