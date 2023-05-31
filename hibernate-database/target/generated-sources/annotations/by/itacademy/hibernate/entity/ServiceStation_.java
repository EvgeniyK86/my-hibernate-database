package by.itacademy.hibernate.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ServiceStation.class)
public abstract class ServiceStation_ {

	public static volatile SingularAttribute<ServiceStation, ServicesList> servicesList;
	public static volatile SingularAttribute<ServiceStation, String> serviceStationName;
	public static volatile SingularAttribute<ServiceStation, Long> id;
	public static volatile SingularAttribute<ServiceStation, ServiceStationAddress> serviceStationAddress;

	public static final String SERVICES_LIST = "servicesList";
	public static final String SERVICE_STATION_NAME = "serviceStationName";
	public static final String ID = "id";
	public static final String SERVICE_STATION_ADDRESS = "serviceStationAddress";

}

