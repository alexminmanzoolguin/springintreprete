package prueba;
	import beans.InterpreteIngles;
		import beans.Traductor1;
public class PruebaIntrepreteIn {

	public static void main(String[] args) {
		Traductor1 traductor = new Traductor1();
		InterpreteIngles interprete = new
		InterpreteIngles();
		// El interprete se inyecta manualmente
		
		// un interprete en Ingl�s u otros idiomas
		traductor.setInterprete(interprete);
		traductor.setNombre("lourdes pe�a");
		traductor.hablar();
		}
		
}