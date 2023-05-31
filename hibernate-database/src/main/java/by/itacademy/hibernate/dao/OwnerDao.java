package by.itacademy.hibernate.dao;

import by.itacademy.hibernate.entity.*;
import com.querydsl.jpa.impl.JPAQuery;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

import java.util.List;



@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class OwnerDao {
    private static final OwnerDao INSTANCE = new OwnerDao();

    public List<Owner> findAll(Session session) {
        return session.createQuery("select o from Owner o", Owner.class).list();
        //return new JPAQuery<Owner>(session).select(owner).from(owner).fetch();
    }

    public List<Owner> findById(Session session, Integer id) {
        return session.createQuery("select o from Owner o" +
                        " where o.id=:id", Owner.class)
                .setParameter("id", id).list();
    }

    public List<Car> findAllCarByOwnerId(Session session, Integer id) {
        return session.createQuery("select o.cars from Owner o " +
                        "where o.id=:id", Car.class)
                .setParameter("id", id).list();
    }

    public static OwnerDao getInstance() {
        return INSTANCE;
    }
}
