package com.dualitysoftware.magic_companion.model;

public class Sorcery {
	private String name;
	private Mana[] manaCost;
	private String type;
	private String set;
	private String description;
	private int collectorNum;
	
	public Sorcery(String name, String type, String description, Mana[] manaCost, int collectorNum) {
		this.name = name;
		this.type = type;
		this.description = description;
		this.manaCost = manaCost;
		this.collectorNum = collectorNum;
	}

	public String getName() {
		return name;
	}

	public Mana[] getManaCost() {
		return manaCost;
	}

	public String getType() {
		return type;
	}

	public String getSet() {
		return set;
	}

	public String getDescription() {
		return description;
	}

	public int getCollectorNum() {
		return collectorNum;
	}	
}
