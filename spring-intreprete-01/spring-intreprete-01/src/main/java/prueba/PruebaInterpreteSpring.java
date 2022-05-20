package prueba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import beans.Traductor;
public class PruebaInterpreteSpring {
private static BeanFactory factory;

public static void main(String[] args) {
factory = new
ClassPathXmlApplicationContext("applicationContext.xml");
Traductor traductor1 = (Traductor)
factory.getBean("traductorEspanol"); traductor1.hablar();
System.out.println();
Traductor traductor2 = (Traductor)
factory.getBean("traductorIngles"); traductor2.hablar();
Traductor traductor3 = (Traductor)
factory.getBean("traductorRuso"); traductor3.hablar();
Traductor traductor4 = (Traductor)
factory.getBean("traductorFrancia"); traductor4.hablar();
Traductor traductor5 = (Traductor)
factory.getBean("traductorAllego"); traductor5.hablar();
}
}