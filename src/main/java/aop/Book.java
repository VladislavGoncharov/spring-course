package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("М.Ф. Достоевкий")
    private String author;
    @Value("Преступление и наказание")
    private String name;
    @Value("1866")
    private int yearsOfPublication;

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYearsOfPublication() {
        return yearsOfPublication;
    }
}
