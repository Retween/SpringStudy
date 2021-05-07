package intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {

    //    @Autowired
//    @Qualifier("catBean")
    private Pet pet;

    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

    //    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean");
    }

    //    @Autowired
//    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Heh pete");
        pet.say();
    }

}
