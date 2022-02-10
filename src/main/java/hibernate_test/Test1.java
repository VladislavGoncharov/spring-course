package hibernate_test;

import hibernate_test.entity.NewEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {


    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(NewEmployee.class)
                .buildSessionFactory();

        try{

            Session session = sessionFactory.getCurrentSession();
            NewEmployee employee = new NewEmployee("122OldPetya" ,"122OldPetrov","122OldPetrov IT",22);
            session.beginTransaction();
            session.save(employee);
            System.out.println(employee);
            int aydi = employee.getId();
            NewEmployee newEmp = session.get(NewEmployee.class,aydi);
            System.out.println("ID:"+aydi+" ---  "+newEmp);

            session.getTransaction().commit();

        }finally {
            sessionFactory.close();
        }









//        SessionFactory sessionFactory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class)
//                .buildSessionFactory();
//        try{
//            Session session = sessionFactory.getCurrentSession();
//            Employee emp = new Employee("Volga", "Pivo", "PIT", 1500);
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();
//        }finally{
//            sessionFactory.close();
//        }
    }
}
