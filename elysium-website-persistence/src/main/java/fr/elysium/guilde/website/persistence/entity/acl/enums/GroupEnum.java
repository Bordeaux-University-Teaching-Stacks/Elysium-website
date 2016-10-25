package fr.elysium.guilde.website.persistence.entity.acl.enums;

/**
 * Default groups
 * @author airouche_m
 *
 */
public enum GroupEnum {

	GUEST(1,"GUEST");
	
	private int key;
	
	private String value;
	
	private GroupEnum(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
	
}
