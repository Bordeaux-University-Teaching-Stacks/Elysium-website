package fr.elysium.guilde.website.persistence.repository.avatar;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.avatar.Realm;

/**
 * <b>RealmRepository</b> Data Access Class for Realms
 * 
 * @author Meidi
 *
 */
public interface RealmRepository extends JpaRepository<Realm, Integer> {

}
