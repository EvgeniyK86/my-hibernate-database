package by.itacademy.hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Owner")
public class Owner implements BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String passportNo;
    private String ownerName;
    private String email;
    private String phoneNumber;
    private OwnerStatus status;
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
    private Set<Car> cars = new HashSet<>();
    public void addCar(Car car) {
        cars.add(car);
        car.setOwner(this);
    }
}
