package edu.jsp.BookAuthor;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import edu.jsp.BookAuthor.entity.Author;
import edu.jsp.BookAuthor.entity.Book;
import edu.jsp.BookAuthor.service.AuthorService;
import edu.jsp.BookAuthor.service.BookServices;

@SpringBootApplication
public class BookAuthorApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BookAuthorApplication.class, args);
        AuthorService authorService = context.getBean(AuthorService.class);
        BookServices bookService = context.getBean(BookServices.class);

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Enter 1 to Add Author");
            System.out.println("Enter 2 to Add Book");
            System.out.println("Enter 3 to Find All Books");
            System.out.println("Enter 4 to get pages size");
            System.out.println("Enter 5 to Find Books by Author ID");
            System.out.println("Enter 6 to Find Author by Name");
            System.out.println("Enter 7 to Remove Author by Email");
            System.out.println("Enter 8 to Find Books with Pages Greater than Given Value");
            System.out.println("Enter 9 to Exit");
            System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    Author author = new Author();
                    System.out.println("Enter Author Name: ");
                    author.setName(sc.next());
                    System.out.println("Enter Author Email: ");
                    author.setEmail(sc.next());
                    Author author1 = authorService.addAuthor(author);
                    System.out.println("Author Added Successfully! Author ID: " + author1.getId());
                    break;
                }
                case 2: {
                    Book book = new Book();
                    System.out.println("Enter Book Name: ");
                    book.setName(sc.next());
                    System.out.println("Enter Book Pages: ");
                    book.setPages(sc.nextInt());
                    System.out.println("Enter Book Price: ");
                    book.setPrice(sc.nextDouble());
                    System.out.println("Enter Author ID: ");
                    int authorId = sc.nextInt();
                    Book savedBook = bookService.addBook(authorId, book);
                    if (savedBook != null) {
                        System.out.println("Book Added Successfully! Book ID: " + savedBook.getId());
                    } else {
                        System.out.println("Author not found. Book not added.");
                    }
                    break;
                }
                case 3: {
                    List<Book> books = bookService.findAllBooks();
                    for (Book b : books) {
                        System.out.println(b);
                        System.out.println("-----------------------------------");
                    }
                    break;
                }
                
                case 4: {
                    System.out.println("Enter Page Number: ");
                    List<Book> books = bookService.getBooksByPage(sc.nextInt());

                    if (books != null && !books.isEmpty()) {
                        books.forEach(book -> {
                            System.out.println(book);
                            System.out.println("----------------------------------------------");
                        });
                    } else {
                        System.err.println("PAGE DOESN'T EXIST...");
                    }
                }
                break;

                case 5: {
                    System.out.println("Enter Author ID: ");
                    int authorId = sc.nextInt();
                    List<Book> books = bookService.getBooksByAuthorId(authorId);
                    if (books.isEmpty()) {
                        System.out.println("No books found for this author.");
                    } else {
                        for (Book b : books) {
                            System.out.println(b);
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;
                }
                case 6: {
                    System.out.println("Enter Author Name: ");
                    String name = sc.next();
                    Author author = authorService.getAuthorByName(name);
                    if (author != null) {
                        System.out.println("Author Found: " + author);
                    } else {
                        System.out.println("Author not found.");
                    }
                    break;
                }
                case 7: {
                    System.out.println("Enter Author Email: ");
                    String email = sc.next();
                    int result = authorService.removeAuthorByEmail(email);
                    if (result > 0) {
                        System.out.println("Author removed successfully.");
                    } else {
                        System.out.println("Author not found.");
                    }
                    break;
                }
                case 8: {
                    System.out.println("Enter Minimum Pages: ");
                    int pages = sc.nextInt();
                    List<Book> books = bookService.getBooksByPagesGreaterThan(pages);
                    if (books.isEmpty()) {
                        System.out.println("No books found with pages greater than " + pages);
                    } else {
                        for (Book b : books) {
                            System.out.println(b);
                            System.out.println("-----------------------------------");
                        }
                    }
                    break;
                }
                case 9: {
                    flag = false;
                    System.out.println("Exiting...");
                    break;
                }
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
