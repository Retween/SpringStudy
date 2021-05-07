package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> emps = session.createQuery("from hibernate_test.entity.Employee where " +
                    "name = 'Alex' AND salary>300")
                    .getResultList();
            for (Employee x : emps) {
                System.out.println(x);
            }

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
