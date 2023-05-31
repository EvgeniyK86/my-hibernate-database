package by.itacademy.hibernate.dao;

import by.itacademy.hibernate.entity.Car;
import by.itacademy.hibernate.entity.Owner;
import by.itacademy.hibernate.entity.ServiceStation;
import by.itacademy.hibernate.entity.Services;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.hibernate.Session;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ServiceStationDao {
    private static final ServiceStationDao INSTANCE = new ServiceStationDao();

    public List<ServiceStation> findAll(Session session) {
        return session.createQuery("select s from ServiceStation s ", ServiceStation.class).list();
        //return new JPAQuery<Owner>(session).select(owner).from(owner).fetch();
    }

    public List<ServiceStation> findById(Session session, Integer id) {
        return session.createQuery("select s from ServiceStation s " +
                        " where s.id=:id", ServiceStation.class)
                .setParameter("id", id).list();
    }

    public List<Services> findAllServicesByServiceStationId(Session session, Integer id) {
        return session.createNativeQuery("select s from services s " +
                        "join services_list s1 on s.id = s1.services.id " +
                        "join service_station s2 on s1.service_station.id " +
                        "where s2.id=:id", Services.class)
                .setParameter("id", id).list();
    }

    public static ServiceStationDao getInstance() {
        return INSTANCE;
    }
}
