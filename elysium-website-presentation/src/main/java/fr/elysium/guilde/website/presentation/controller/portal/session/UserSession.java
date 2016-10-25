package fr.elysium.guilde.website.presentation.controller.portal.session;

import fr.elysium.guilde.website.persistence.entity.acl.Group;
import fr.elysium.guilde.website.persistence.entity.acl.User;

/**
 * <b>UserSession</b>
 * @author airouche_m
 *
 */
public class UserSession extends User {

	/**
	 * Implicit constructor
	 */
	public UserSession() {};
	
	/**
	 * Explicit constructor
	 * @param group
	 */
	public UserSession(Group group) {
		this.group = group;
	}

}
