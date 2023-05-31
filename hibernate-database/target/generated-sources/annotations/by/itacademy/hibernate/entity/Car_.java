package by.itacademy.hibernate.entity;

import java.time.LocalDate;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Car.class)
public abstract class Car_ {

	public static volatile SingularAttribute<Car, Owner> owner;
	public static volatile SingularAttribute<Car, LocalDate> year;
	public static volatile SingularAttribute<Car, EngineType> engineType;
	public static volatile SingularAttribute<Car, String> model;
	public static volatile SingularAttribute<Car, Long> id;
	public static volatile SingularAttribute<Car, Double> engineCapacity;

	public static final String OWNER = "owner";
	public static final String YEAR = "year";
	public static final String ENGINE_TYPE = "engineType";
	public static final String MODEL = "model";
	public static final String ID = "id";
	public static final String ENGINE_CAPACITY = "engineCapacity";

}

