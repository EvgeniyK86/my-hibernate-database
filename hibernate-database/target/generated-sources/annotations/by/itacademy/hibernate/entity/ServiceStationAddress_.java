package by.itacademy.hibernate.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ServiceStationAddress.class)
public abstract class ServiceStationAddress_ {

	public static volatile SingularAttribute<ServiceStationAddress, String> phoneNumber;
	public static volatile SingularAttribute<ServiceStationAddress, ServiceStation> serviceStation;
	public static volatile SingularAttribute<ServiceStationAddress, String> city;
	public static volatile SingularAttribute<ServiceStationAddress, String> street;
	public static volatile SingularAttribute<ServiceStationAddress, String> house;
	public static volatile SingularAttribute<ServiceStationAddress, String> email;

	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String SERVICE_STATION = "serviceStation";
	public static final String CITY = "city";
	public static final String STREET = "street";
	public static final String HOUSE = "house";
	public static final String EMAIL = "email";

}

