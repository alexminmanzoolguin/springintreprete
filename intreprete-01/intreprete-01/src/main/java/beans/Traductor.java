package beans;

public class Traductor {
	private IntrepreteEspaņol interprete;
	private String nombre;
	public void hablar() {
	this.interprete.saludar();
	System.out.println(nombre);
	this.interprete.despedirse();
	}
	public IntrepreteEspaņol getIntreprete() {
	return this.interprete;
	}
	public void setInterprete(IntrepreteEspaņol interprete) {
	this.interprete = interprete;
	}
	
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	
}
