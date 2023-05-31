package by.itacademy.hibernate.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QOwner is a Querydsl query type for Owner
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QOwner extends EntityPathBase<Owner> {

    private static final long serialVersionUID = 1840740552L;

    public static final QOwner owner = new QOwner("owner");

    public final SetPath<Car, QCar> cars = this.<Car, QCar>createSet("cars", Car.class, QCar.class, PathInits.DIRECT2);

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ownerName = createString("ownerName");

    public final StringPath passportNo = createString("passportNo");

    public final StringPath phoneNumber = createString("phoneNumber");

    public final EnumPath<OwnerStatus> status = createEnum("status", OwnerStatus.class);

    public QOwner(String variable) {
        super(Owner.class, forVariable(variable));
    }

    public QOwner(Path<? extends Owner> path) {
        super(path.getType(), path.getMetadata());
    }

    public QOwner(PathMetadata metadata) {
        super(Owner.class, metadata);
    }

}

