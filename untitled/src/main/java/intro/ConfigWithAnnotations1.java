package intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext3.xml");

//        Cat cat = context.getBean("cat",Cat.class);
//        cat.say();

        Person person = context.getBean("personBean", Person.class);

        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
