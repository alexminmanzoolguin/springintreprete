package prueba;
import beans.IntrepreteEspa�ol;
import beans.Traductor;
public class PruebaInterprete {
public static void main(String[] args) {
Traductor traductor = new Traductor();
IntrepreteEspa�ol interprete = new
IntrepreteEspa�ol();
// El interprete se inyecta manualmente
// Y solamente puede recibir un interprete
// en Espa�ol
// No un interprete en Ingl�s u otros idiomas
traductor.setInterprete(interprete);
traductor.setNombre("Lenin Lemus");
traductor.hablar();
}
}