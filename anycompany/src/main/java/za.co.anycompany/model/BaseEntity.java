package za.co.anycompany.model;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

/**
 * Customer Entity
 * @author Mandlenkosi Khumalo
 * @date 2021-03-30
 */

@Data
@MappedSuperclass
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = -7176390653391227433L;

    @Id
    private int id;
    private Date createTime;
}
