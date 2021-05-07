package hibernate_one_to_one;

import hibernate_one_to_one.Entity.Detail;
import hibernate_one_to_one.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

            //            Employee employee = new Employee("Leo", "Panda", "Kdv", 233);
//            Detail detail = new Detail("Moscow", "394845", "ldki@mail.ru");
//            employee.setEmpDetail(detail);

            session.beginTransaction();

//            session.save(employee);

            Employee emp = session.get(Employee.class, 2);
            session.delete(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
