package Main;

import consoleAppTest.messangerClass;
import consoleAppTest.writterLog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

/**
 * Created by User on 04.07.2016.z
 */
public class main {
    public static void main (String [] args){
        System.out.println("Let's START!");
        ApplicationContext context = new ClassPathXmlApplicationContext("buildSpring.xml");
        System.out.println(context.getDisplayName());
        writterLog logObj = (writterLog) context.getBean("writter");
        logObj.getLogString();
        
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println( name );
        }
        messangerClass obj = (messangerClass) context.getBean("messanger");
        obj.getMessage();
        obj.setMessage("Ok. Fine)");
        obj.getMessage();
    }
}
