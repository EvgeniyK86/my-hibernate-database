package by.itacademy.hibernate.dao;

import by.itacademy.hibernate.entity.ServiceStation;
import org.hibernate.SessionFactory;

public class ServiceStationRepository extends RepositoryBase<Long, ServiceStation> {
    public ServiceStationRepository(SessionFactory sessionFactory) {
        super(sessionFactory, ServiceStation.class);
    }
}
