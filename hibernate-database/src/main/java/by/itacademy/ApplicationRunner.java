package by.itacademy;

import by.itacademy.hibernate.entity.Owner;
import by.itacademy.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.transaction.Transactional;

@Transactional
public class ApplicationRunner {
    public static void main(String[] args) {



        SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

        try (Session session = sessionFactory.openSession()) {

            session.beginTransaction();

            var owner = session.find(Owner.class, 1L);
            System.out.println(owner.getOwnerName());
            session.getTransaction().commit();
        }
    }
}
