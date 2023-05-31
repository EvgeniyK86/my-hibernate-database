package by.itacademy.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ServicesList {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_station_id")
    private ServiceStation serviceStation;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "services_id")
    private Services services;
    private Long numberOfServices;
    private Long numberOfFree;
}
