package by.itacademy.utils;

import by.itacademy.hibernate.entity.*;
import lombok.Cleanup;
import lombok.experimental.UtilityClass;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@UtilityClass
public class TestDataImporter {

    public void importData(SessionFactory sessionFactory) {
        @Cleanup Session session = sessionFactory.openSession();
        ServiceStation sto = saveServiceStation(session, "СТО");
        ServiceStation firstHelp = saveServiceStation(session, "Первая автомобильная помощь");
        ServiceStation petro = saveServiceStation(session, "У Петровича");

        Car car1 = saveCar(session, "Reno", 1.6, EngineType.ДИЗЕЛЬ, LocalDate.of(2022, 12, 12));
        Car car2 = saveCar(session, "Audi", 1.6, EngineType.ДИЗЕЛЬ, LocalDate.of(2022, 12, 12));
        Car car3 = saveCar(session, "BMW", 1.6, EngineType.ДИЗЕЛЬ, LocalDate.of(2022, 12, 12));

        Owner firstOwner = saveOwner(session,
                "1234567", "Николай Носов", "jack@mail.com", "+375-29-123-45-67", OwnerStatus.SILVER,
                car1);
        Owner secondOwner = saveOwner(session,
                "1234567", "Иван Иванов", "jack@mail.com", "+375-29-123-45-67", OwnerStatus.GOLD,
                car2);
        Owner thirdOwner = saveOwner(session,
                "1234567", "Петр Петров", "jack@mail.com", "+375-29-123-45-67", OwnerStatus.PLATINUM,
                car3);

        Services oil = saveService(session, "Замена масла", 50, Duration.ofHours(2l));
        Services diagnostic = saveService(session, "Диагностика", 50, Duration.ofHours(2l));
    }

    public Services saveService(Session session, String type, Integer cost, Duration duration) {
        Services services = Services.builder()
                .typeOfService(type)
                .cost(cost)
                .duration(duration)
                .build();
        session.save(services);
        return services;
    }

    public ServiceStation saveServiceStation(Session session, String name) {
        ServiceStation serviceStation = ServiceStation.builder()
                .serviceStationName(name)
                .build();
        session.save(serviceStation);
        return serviceStation;
    }

    public Car saveCar(Session session,
                       String model,
                       Double engine,
                       EngineType engineType,
                       LocalDate date) {
        Car car = Car.builder()
                .model(model)
                .engineCapacity(engine)
                .engineType(engineType)
                .year(date).build();
        session.save(car);
        return car;
    }

    public Owner saveOwner(Session session,
                           String passportNo,
                           String name,
                           String email,
                           String phone,
                           OwnerStatus status,
                           Car car) {
        Owner owner = Owner.builder()
                .passportNo(passportNo)
                .ownerName(name)
                .email(email)
                .phoneNumber(phone)
                .status(status)
                .build();
        owner.addCar(car);
        session.save(owner);
        return owner;
    }
}

