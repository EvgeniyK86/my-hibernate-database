package by.itacademy.hibernate.dao;

import by.itacademy.hibernate.entity.Owner;
import org.hibernate.SessionFactory;

public class OwnerRepository extends RepositoryBase<Long, Owner> {
    public OwnerRepository(SessionFactory sessionFactory) {
        super(sessionFactory, Owner.class);
    }

}
