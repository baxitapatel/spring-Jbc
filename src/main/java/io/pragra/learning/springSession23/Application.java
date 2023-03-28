package io.pragra.learning.springSession23;

import io.pragra.learning.springSession23.domain.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication

public class Application {
    public static void main(String[] args) {


        //public static void main(String[] args) {
        //	SpringApplication.run(Application.class, args);
        //}

        ApplicationContext context = new AnnotationConfigApplicationContext("io.pragra.learning.springSession23.conf","io.pragra.learning.springSession23.domain");
       /* TorontoRapter bean = context.getBean("raptors", TorontoRapter.class);
        System.out.println(bean);

        Person person = context.getBean("person", Person.class);
        System.out.println(person);

        System.out.println(person.getHobbies().size());

        System.out.println(context.getBean(Employee.class));

        System.out.println(context.getBean(Manager.class));



        System.out.println(context.getBean("lekers", Lekers.class));
*/
        Game bean1 = context.getBean(Game.class);
        System.out.println(bean1.startGame());

    }
}