package hibernate_test;

import hibernate_test.entity.NewEmployee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {


    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(NewEmployee.class)
                .buildSessionFactory();

        try{
            Session session = sessionFactory.getCurrentSession();
           // NewEmployee newEmployee = new NewEmployee("Xenia","Goncharova","Apteka \"Aprel'\"", 34000);
            session.beginTransaction();
            NewEmployee emp =session.get(NewEmployee.class,14);
            session.delete(emp);
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
