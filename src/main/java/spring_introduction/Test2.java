package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test2 {


    public static void main(String[] args) {
     AnnotationConfigApplicationContext context =
             new AnnotationConfigApplicationContext(MyConfig.class);

     Person person = context.getBean("personBean",Person.class);

        System.out.println(person.getAge());
        System.out.println(person.getName());

     context.close();
    }
}
