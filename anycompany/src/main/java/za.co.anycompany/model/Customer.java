package za.co.anycompany.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Customer Entity
 * @author Mandlenkosi Khumalo
 * @date 2021-03-30
 */

@Data //Use lombok to generate getters and setters
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    private Country country;
    private Date dateOfBirth;
    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Order> orders;
}
