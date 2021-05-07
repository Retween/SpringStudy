package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Мы берем книгу ");
        System.out.println("-------------------------------\n");
    }

    public String returnBook() {
        int a = 3 / 0;
        System.out.println("Мы возвращаем книгу");
        return "War and Peace";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал");
        System.out.println("-------------------------------\n");
    }

    public void returnMagazine() {
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("-------------------------------\n");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("-------------------------------\n");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("-------------------------------\n");
    }

}
