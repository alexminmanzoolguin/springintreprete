package beans;

public class Traductor {
	private IntrepreteEspa�ol interprete;
	private String nombre;
	public void hablar() {
	this.interprete.saludar();
	System.out.println(nombre);
	this.interprete.despedirse();
	}
	public IntrepreteEspa�ol getIntreprete() {
	return this.interprete;
	}
	public void setInterprete(IntrepreteEspa�ol interprete) {
	this.interprete = interprete;
	}
	
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	
}
