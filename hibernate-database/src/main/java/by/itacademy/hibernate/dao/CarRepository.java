package by.itacademy.hibernate.dao;

import by.itacademy.hibernate.entity.Car;
import by.itacademy.hibernate.entity.Owner;
import org.hibernate.SessionFactory;

public class CarRepository extends RepositoryBase<Long, Car>{
    public CarRepository(SessionFactory sessionFactory) {
        super(sessionFactory, Car.class);
    }

}
