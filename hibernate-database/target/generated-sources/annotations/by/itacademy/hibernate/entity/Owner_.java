package by.itacademy.hibernate.entity;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Owner.class)
public abstract class Owner_ {

	public static volatile SingularAttribute<Owner, String> passportNo;
	public static volatile SetAttribute<Owner, Car> cars;
	public static volatile SingularAttribute<Owner, String> phoneNumber;
	public static volatile SingularAttribute<Owner, String> ownerName;
	public static volatile SingularAttribute<Owner, Long> id;
	public static volatile SingularAttribute<Owner, String> email;
	public static volatile SingularAttribute<Owner, OwnerStatus> status;

	public static final String PASSPORT_NO = "passportNo";
	public static final String CARS = "cars";
	public static final String PHONE_NUMBER = "phoneNumber";
	public static final String OWNER_NAME = "ownerName";
	public static final String ID = "id";
	public static final String EMAIL = "email";
	public static final String STATUS = "status";

}

