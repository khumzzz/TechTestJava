package za.co.anycompany.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Customer Entity
 * @author Mandlenkosi Khumalo
 * @date 2021-03-30
 */

@Data //Use lombok to generate getters and setters
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "country")
public class Country extends BaseEntity {
    private String code;
    private String name;
    private double tax;
}
