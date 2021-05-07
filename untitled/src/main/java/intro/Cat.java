package intro;

import org.springframework.stereotype.Component;

//@Component
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean");
    }

    public void say() {
        System.out.println("Meow");
    }
}
