package by.itacademy.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ServiceStationAddress {
    @OneToOne
    @JoinColumn(name = "service_station_id")
    private ServiceStation serviceStation;
    private String city;
    private String street;
    private String house;
    private String email;
    private String phoneNumber;
}
