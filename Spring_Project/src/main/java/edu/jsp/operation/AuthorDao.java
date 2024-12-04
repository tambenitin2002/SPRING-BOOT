package edu.jsp.operation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class AuthorDao {
    public void saveAuthor(Author author) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(author);
            transaction.commit();
        }
    }

    public List<Author> getAllAuthors() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Author", Author.class).list();
        }
    }
}
