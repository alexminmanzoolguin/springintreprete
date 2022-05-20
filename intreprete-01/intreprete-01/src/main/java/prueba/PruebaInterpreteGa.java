package prueba;

import beans.Traductor4;
import beans.InterpreteGallego;

public class PruebaInterpreteGa {
	public static void main(String[] args) {
		Traductor4 traductor = new Traductor4();
		InterpreteGallego interprete = new
		InterpreteGallego();
		// El interprete se inyecta manualmente
		
		// un interprete en francia u otros idiomas
		traductor.setInterprete(interprete);
		traductor.setNombre("alex olguin");
		traductor.hablar();

	}
}
