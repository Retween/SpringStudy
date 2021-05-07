package intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("appContext3.xml");

        Dog dog = context.getBean("dog", Dog.class);

        dog.say();

        context.close();

    }
}
