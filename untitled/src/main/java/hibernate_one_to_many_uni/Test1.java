package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.Entity.Department;
import hibernate_one_to_many_uni.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()) {

//            Department dep = new Department("HR", 2000, 12000);
//            Employee emp1 = new Employee("Eroi", "Doe", 304);
//            Employee emp2 = new Employee("Misha", "Trak", 1000);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);

            session.beginTransaction();
            {


//                session.save(dep);
                Department dep = session.get(Department.class,3);
                session.delete(dep);
//                System.out.println(dep);
//                System.out.println(dep.getEmployees());

            }
            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
