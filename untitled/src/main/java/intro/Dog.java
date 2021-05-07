package intro;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog implements Pet {
    //    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @PostConstruct
//    private void init() {
//        System.out.println("init");
//    }
//
//    @PreDestroy
//    private void destroy() {
//        System.out.println("destroy");
//    }

    public Dog() {
        System.out.println("Dog bean");
    }

    public void say() {
        System.out.println("Bark");
    }
}
