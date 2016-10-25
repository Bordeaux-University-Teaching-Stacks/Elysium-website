package fr.elysium.guilde.website.persistence.entity.avatar;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * <b>Horde</b> is the horde faction
 * 
 * @author Meidi
 * 
 */
@Entity
@DiscriminatorValue("HORDE")
public class Horde extends Faction {

}
