package by.itacademy.hibernate.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ServicesList.class)
public abstract class ServicesList_ {

	public static volatile SingularAttribute<ServicesList, Long> numberOfFree;
	public static volatile SingularAttribute<ServicesList, ServiceStation> serviceStation;
	public static volatile SingularAttribute<ServicesList, Long> numberOfServices;
	public static volatile SingularAttribute<ServicesList, Services> services;

	public static final String NUMBER_OF_FREE = "numberOfFree";
	public static final String SERVICE_STATION = "serviceStation";
	public static final String NUMBER_OF_SERVICES = "numberOfServices";
	public static final String SERVICES = "services";

}

