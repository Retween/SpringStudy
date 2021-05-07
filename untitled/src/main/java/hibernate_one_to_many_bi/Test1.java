package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.Entity.Department;
import hibernate_one_to_many_bi.Entity.Employee;
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

//            Department dep = new Department("IWcT", 1000, 1200);
//            Employee emp1 = new Employee("Eroi", "Doe", 304);
//            Employee emp2 = new Employee("Misha", "Trak", 1000);
//            Employee emp3 = new Employee("Ira", "Belka", 1000);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);

            session.beginTransaction();

//            session.save(dep);


            System.out.println("get department");
            Department dep = session.get(Department.class, 4);

            System.out.println("show department");
            System.out.println(dep);

            System.out.println("download employees");
            dep.getEmployees().get(0);

//            Employee employee = session.get(Employee.class,3);
//            session.delete(employee);

            session.getTransaction().commit();

            System.out.println("show employees from department");
            System.out.println(dep.getEmployees());

            System.out.println("Done!");
        }
    }
}
