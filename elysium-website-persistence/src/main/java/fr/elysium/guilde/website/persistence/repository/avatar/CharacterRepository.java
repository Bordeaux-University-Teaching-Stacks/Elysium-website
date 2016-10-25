package fr.elysium.guilde.website.persistence.repository.avatar;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.elysium.guilde.website.persistence.entity.avatar.Character;

/**
 * <b>CharacterRepository</b> Data Access Class for Character
 * 
 * @author Meidi
 *
 */
public interface CharacterRepository extends JpaRepository<Character, Long> {

}
