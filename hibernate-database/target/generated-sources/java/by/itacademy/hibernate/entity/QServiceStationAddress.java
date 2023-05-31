package by.itacademy.hibernate.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QServiceStationAddress is a Querydsl query type for ServiceStationAddress
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QServiceStationAddress extends BeanPath<ServiceStationAddress> {

    private static final long serialVersionUID = -1200677302L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QServiceStationAddress serviceStationAddress = new QServiceStationAddress("serviceStationAddress");

    public final StringPath city = createString("city");

    public final StringPath email = createString("email");

    public final StringPath house = createString("house");

    public final StringPath phoneNumber = createString("phoneNumber");

    protected QServiceStation serviceStation;

    public final StringPath street = createString("street");

    public QServiceStationAddress(String variable) {
        this(ServiceStationAddress.class, forVariable(variable), INITS);
    }

    public QServiceStationAddress(Path<? extends ServiceStationAddress> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QServiceStationAddress(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QServiceStationAddress(PathMetadata metadata, PathInits inits) {
        this(ServiceStationAddress.class, metadata, inits);
    }

    public QServiceStationAddress(Class<? extends ServiceStationAddress> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.serviceStation = inits.isInitialized("serviceStation") ? new QServiceStation(forProperty("serviceStation"), inits.get("serviceStation")) : null;
    }

    public QServiceStation serviceStation() {
        if (serviceStation == null) {
            serviceStation = new QServiceStation(forProperty("serviceStation"));
        }
        return serviceStation;
    }

}

