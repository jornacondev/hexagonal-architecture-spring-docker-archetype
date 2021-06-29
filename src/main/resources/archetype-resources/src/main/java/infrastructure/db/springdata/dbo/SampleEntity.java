#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.infrastructure.db.springdata.dbo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * TODO: Delete this sample class
 */

@Entity
public class SampleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public SampleEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
