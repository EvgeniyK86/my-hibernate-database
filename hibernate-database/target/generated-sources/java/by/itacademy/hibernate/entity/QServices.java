package by.itacademy.hibernate.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QServices is a Querydsl query type for Services
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QServices extends EntityPathBase<Services> {

    private static final long serialVersionUID = -924494295L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QServices services = new QServices("services");

    public final NumberPath<Integer> cost = createNumber("cost", Integer.class);

    public final ComparablePath<java.time.Duration> duration = createComparable("duration", java.time.Duration.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    protected QServicesList servicesList;

    public final StringPath typeOfService = createString("typeOfService");

    public QServices(String variable) {
        this(Services.class, forVariable(variable), INITS);
    }

    public QServices(Path<? extends Services> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QServices(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QServices(PathMetadata metadata, PathInits inits) {
        this(Services.class, metadata, inits);
    }

    public QServices(Class<? extends Services> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.servicesList = inits.isInitialized("servicesList") ? new QServicesList(forProperty("servicesList"), inits.get("servicesList")) : null;
    }

    public QServicesList servicesList() {
        if (servicesList == null) {
            servicesList = new QServicesList(forProperty("servicesList"));
        }
        return servicesList;
    }

}

