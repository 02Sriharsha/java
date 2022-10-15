import java.util.*;

class Book{
    int id;
    String name , author, publisher;
    int quantity;

    public Book(int id , String name , String author , String publisher , int quantity){
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class BookExampleLinkedList {
    public static void main(String[] args) {
        LinkedList<Book> list = new LinkedList<Book>();

        Book b1 = new Book(101,"python","harsha","shekhar",10);
        Book b2 = new Book(102,"java","harshitha","madhu",20);
        Book b3 = new Book(103,"c++","gowtham","latha",5);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        for(Book i : list){
            System.out.println(i.id +" "+ i.name+" " +i.author+" "+i.publisher+" "+i.quantity);
        }
    }
}
