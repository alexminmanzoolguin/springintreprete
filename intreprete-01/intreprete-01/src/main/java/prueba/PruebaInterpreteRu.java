package prueba;

import beans.InterpreteRuso;
import beans.Traductor2;
public class PruebaInterpreteRu {
	public static void main(String[] args) {
		Traductor2 traductor = new Traductor2();
		InterpreteRuso interprete = new
		InterpreteRuso();
		// El interprete se inyecta manualmente
		
		// un interprete en RUSO u otros idiomas
		traductor.setInterprete(interprete);
		traductor.setNombre("Alex Yazmin");
		traductor.hablar();
		}
}
