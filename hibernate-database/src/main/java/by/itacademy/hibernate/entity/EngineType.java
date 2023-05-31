package by.itacademy.hibernate.entity;

import java.util.Arrays;
import java.util.Optional;

public enum EngineType {
    БЕНЗИН,
    ДИЗЕЛЬ,
    ГАЗ;

    public static Optional<EngineType> find(String engineType) {
        return Arrays.stream(values())
                .filter(it -> it.name().equals(engineType))
                .findFirst();
    }
}
