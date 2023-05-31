package by.itacademy.hibernate;

import by.itacademy.hibernate.dao.OwnerDao;
import by.itacademy.hibernate.entity.Owner;
import by.itacademy.hibernate.util.HibernateUtil;
import by.itacademy.utils.TestDataImporter;
import lombok.Cleanup;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;

@TestInstance(PER_CLASS)
public class OwnerDaoTest {

    private final SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();
    private final OwnerDao ownerDao = OwnerDao.getInstance();

    @BeforeAll
    public void initDb() {
        TestDataImporter.importData(sessionFactory);
        System.out.println();
    }

    @AfterAll
    public void finish() {
        sessionFactory.close();
    }

    @Test
    void findAll() {
        @Cleanup Session session = sessionFactory.openSession();
        session.beginTransaction();

        List<Owner> results = ownerDao.findAll(session);
        assertThat(results).hasSize(5);

        List<String> allNames = results.stream().map(Owner::getOwnerName).collect(toList());
        assertThat(allNames).containsExactlyInAnyOrder("Николай Носов", "Иван Иванов", "Петр Петров");

        session.getTransaction().commit();
    }
}
