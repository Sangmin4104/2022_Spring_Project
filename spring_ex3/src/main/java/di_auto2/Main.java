package di_auto2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import di_sample1.Performer;

public class Main {

public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("auto2.xml");
		
		
		TestA testa =   ctx.getBean("a", TestA.class);
		
		testa.getB().display();
		testa.getC().display();

	}
}
