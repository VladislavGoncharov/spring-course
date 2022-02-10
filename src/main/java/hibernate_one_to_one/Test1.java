package hibernate_one_to_one;

import hibernate_one_to_many.entity.Department;
import hibernate_one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {


        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();

            session.beginTransaction();

            Department dept = session.get(Department.class,2);
            System.out.println(dept);
            System.out.println(dept.getEmployees());


            session.getTransaction().commit();

        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
