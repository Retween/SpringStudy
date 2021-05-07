package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Преступление")
    private String name;

    @Value("Достоевский")
    private String author;

    @Value("1866")
    private int year;

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }


    public String getName() {
        return name;
    }
}
