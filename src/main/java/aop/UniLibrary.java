package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary {

    public void getBook() {
        System.out.println("getBook: берем книгу");
        System.out.println("-----------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("addBook: добавляем книгу");
        System.out.println("-----------------------------------------");
    }

    public String returnBook() {
        System.out.println("returnBook: возвращаем книгу");
        return "Война и мир";
    }

    public void getMagazine() {
        System.out.println("getMagazine: берем журнал");
        System.out.println("-----------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("returnMagazine: возвращаем журнал");
        System.out.println("-----------------------------------------");
    }

    public void addMagazine() {
        System.out.println("addMagazine: добавляем журнал");
        System.out.println("-----------------------------------------");
    }

}
