package fr.elysium.guilde.website.persistence.entity.avatar;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * <b>Alliance</b> is the alliance faction
 * 
 * @author Meidi
 * 
 */
@Entity
@DiscriminatorValue("ALLIANCE")
public class Alliance extends Faction {

}
