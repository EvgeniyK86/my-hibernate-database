package by.itacademy.hibernate.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QServicesList is a Querydsl query type for ServicesList
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QServicesList extends BeanPath<ServicesList> {

    private static final long serialVersionUID = -1934606745L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QServicesList servicesList = new QServicesList("servicesList");

    public final NumberPath<Long> numberOfFree = createNumber("numberOfFree", Long.class);

    public final NumberPath<Long> numberOfServices = createNumber("numberOfServices", Long.class);

    protected QServices services;

    protected QServiceStation serviceStation;

    public QServicesList(String variable) {
        this(ServicesList.class, forVariable(variable), INITS);
    }

    public QServicesList(Path<? extends ServicesList> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QServicesList(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QServicesList(PathMetadata metadata, PathInits inits) {
        this(ServicesList.class, metadata, inits);
    }

    public QServicesList(Class<? extends ServicesList> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.services = inits.isInitialized("services") ? new QServices(forProperty("services"), inits.get("services")) : null;
        this.serviceStation = inits.isInitialized("serviceStation") ? new QServiceStation(forProperty("serviceStation"), inits.get("serviceStation")) : null;
    }

    public QServices services() {
        if (services == null) {
            services = new QServices(forProperty("services"));
        }
        return services;
    }

    public QServiceStation serviceStation() {
        if (serviceStation == null) {
            serviceStation = new QServiceStation(forProperty("serviceStation"));
        }
        return serviceStation;
    }

}

