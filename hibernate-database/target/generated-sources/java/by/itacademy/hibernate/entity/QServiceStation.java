package by.itacademy.hibernate.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QServiceStation is a Querydsl query type for ServiceStation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QServiceStation extends EntityPathBase<ServiceStation> {

    private static final long serialVersionUID = -928756150L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QServiceStation serviceStation = new QServiceStation("serviceStation");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    protected QServicesList servicesList;

    protected QServiceStationAddress serviceStationAddress;

    public final StringPath serviceStationName = createString("serviceStationName");

    public QServiceStation(String variable) {
        this(ServiceStation.class, forVariable(variable), INITS);
    }

    public QServiceStation(Path<? extends ServiceStation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QServiceStation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QServiceStation(PathMetadata metadata, PathInits inits) {
        this(ServiceStation.class, metadata, inits);
    }

    public QServiceStation(Class<? extends ServiceStation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.servicesList = inits.isInitialized("servicesList") ? new QServicesList(forProperty("servicesList"), inits.get("servicesList")) : null;
        this.serviceStationAddress = inits.isInitialized("serviceStationAddress") ? new QServiceStationAddress(forProperty("serviceStationAddress"), inits.get("serviceStationAddress")) : null;
    }

    public QServicesList servicesList() {
        if (servicesList == null) {
            servicesList = new QServicesList(forProperty("servicesList"));
        }
        return servicesList;
    }

    public QServiceStationAddress serviceStationAddress() {
        if (serviceStationAddress == null) {
            serviceStationAddress = new QServiceStationAddress(forProperty("serviceStationAddress"));
        }
        return serviceStationAddress;
    }

}

