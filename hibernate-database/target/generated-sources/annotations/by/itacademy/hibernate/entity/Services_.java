package by.itacademy.hibernate.entity;

import java.time.Duration;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Services.class)
public abstract class Services_ {

	public static volatile SingularAttribute<Services, Duration> duration;
	public static volatile SingularAttribute<Services, ServicesList> servicesList;
	public static volatile SingularAttribute<Services, Integer> cost;
	public static volatile SingularAttribute<Services, String> typeOfService;
	public static volatile SingularAttribute<Services, Long> id;

	public static final String DURATION = "duration";
	public static final String SERVICES_LIST = "servicesList";
	public static final String COST = "cost";
	public static final String TYPE_OF_SERVICE = "typeOfService";
	public static final String ID = "id";

}

