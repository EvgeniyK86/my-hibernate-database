package by.itacademy.hibernate.dao;

import by.itacademy.hibernate.entity.Car;
import by.itacademy.hibernate.entity.Owner;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CarDao {
    private static final CarDao INSTANCE = new CarDao();

    public List<Car> findAll(Session session) {
        return session.createQuery("select c from Car c", Car.class).list();

    }

    public List<Car> findById(Session session, Integer id) {
        return session.createQuery("select c from Car c" +
                        " where c.id=:id", Car.class)
                .setParameter("id", id).list();
    }

    public static CarDao getInstance() {
        return INSTANCE;
    }
}
