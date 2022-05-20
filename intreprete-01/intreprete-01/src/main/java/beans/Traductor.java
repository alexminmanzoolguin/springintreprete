package beans;

public class Traductor {
	private IntrepreteEspañol interprete;
	private String nombre;
	public void hablar() {
	this.interprete.saludar();
	System.out.println(nombre);
	this.interprete.despedirse();
	}
	public IntrepreteEspañol getIntreprete() {
	return this.interprete;
	}
	public void setInterprete(IntrepreteEspañol interprete) {
	this.interprete = interprete;
	}
	
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	
}
