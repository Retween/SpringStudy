package hibernate_many_to_many;

import hibernate_many_to_many.Entity.Child;
import hibernate_many_to_many.Entity.Section;
import hibernate_one_to_many_uni.Entity.Department;
import hibernate_one_to_many_uni.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Set;


public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration().configure()
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()
        ) {
//            Section section1 = new Section("Twerk");
//            Child child1 = new Child("Yrik", 14);
//            Child child2 = new Child("Olya", 16);
//            Child child3 = new Child("Ira", 15);
//
//            section1.addChild(child1);
//            section1.addChild(child2);
//            section1.addChild(child3);

//            Section section1 = new Section("Basketball");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Guitar");
//            Child child = new Child("Ernest", 12);
//
//            child.addSection(section1);
//            child.addSection(section2);
//            child.addSection(section3);


            session.beginTransaction();

//            session.persist(section1);
//            session.save(child);

//            Section section = session.get(Section.class,1);
//            System.out.println(section);
//            System.out.println(section.getChildren());

//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());

//            Section section = session.get(Section.class, 1);
//            session.delete(section);

//            Section section = session.get(Section.class, 9);
//            session.delete(section);

            Child child = session.get(Child.class, 4);
            session.delete(child);


            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
