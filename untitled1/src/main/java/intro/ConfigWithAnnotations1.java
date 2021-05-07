package intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContext3.xml");

//        Cat cat = context.getBean("cat",Cat.class);
//        cat.say();

        System.out.println();
        Person person = context.getBean("personBean", Person.class);

        person.callYourPet();

        context.close();
    }
}
