package prueba;
import beans.IntrepreteEspañol;
import beans.Traductor;
public class PruebaInterprete {
public static void main(String[] args) {
Traductor traductor = new Traductor();
IntrepreteEspañol interprete = new
IntrepreteEspañol();
// El interprete se inyecta manualmente
// Y solamente puede recibir un interprete
// en Español
// No un interprete en Inglés u otros idiomas
traductor.setInterprete(interprete);
traductor.setNombre("Lenin Lemus");
traductor.hablar();
}
}