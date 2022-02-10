package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
//                .addAnnotatedClass(ChildSection.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try{
            session = sessionFactory.getCurrentSession();




            session.beginTransaction();

            session.getTransaction().commit();
            System.out.println("DONE!!!");

        }finally {
            session.close();
            sessionFactory.close();
        }

    }
}
