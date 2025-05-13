package spring.spring_java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Greeting greeting1 = (Greeting)context.getBean("greeting");
//		System.out.println("hello"+ greeting1.getName());
//		greeting1.setName("TCSer");
//		Greeting greeting2 = (Greeting)context.getBean("greeting");
//		System.out.println("hello"+ greeting1.getName());
//		System.out.println("hello"+ greeting2.getName());
////		((Object) context).registerShutdownHooks()	
		

		
		TextEditor textEditor = (TextEditor)context.getBean("textEditor");
		textEditor.spellCheck();
		System.out.println("end");
		
	
	}
}