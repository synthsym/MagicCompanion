package com.dualitysoftware.magic_companion.model;

public class Land {
	private String name;
	private String type;
	private String description;
	private Mana manaType;
	private int collectorNum;
	
	public Land(String name, String type, String description, Mana manaType, int collectorNum) {
		this.name = name;
		this.type = type;
		this.description = description;
		this.manaType = manaType;
		this.collectorNum = collectorNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Mana getManaType() {
		return manaType;
	}
	public void setManaType(Mana manaType) {
		this.manaType = manaType;
	}
	
	public int getCollectorNum() {
		return collectorNum;
	}
	public void setCollectorNum(int collectorNum) {
		this.collectorNum = collectorNum;
	}
}
