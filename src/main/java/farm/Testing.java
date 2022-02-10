package farm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {

    public static void main(String[] args) {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextTwo.xml");

      Farmer farmer = context.getBean("myFarmer", Farmer.class);
      farmer.sayMyAnimal();
        System.out.println(farmer.getAge());
        System.out.println(farmer.getSurname());

    }


}
