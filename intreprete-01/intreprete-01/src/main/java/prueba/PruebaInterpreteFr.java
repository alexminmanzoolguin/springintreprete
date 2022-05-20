package prueba;


import beans.interpreteFrancia;
import beans.Traductor3;
public class PruebaInterpreteFr {

	public static void main(String[] args) {
		Traductor3 traductor = new Traductor3();
		interpreteFrancia interprete = new
		interpreteFrancia();
		// El interprete se inyecta manualmente
		
		// un interprete en francia u otros idiomas
		traductor.setInterprete(interprete);
		traductor.setNombre("yazmin manzo");
		traductor.hablar();

	}

}
