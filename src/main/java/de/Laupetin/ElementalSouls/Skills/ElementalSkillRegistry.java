package de.Laupetin.ElementalSouls.Skills;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ElementalSkillRegistry {

	private static ElementalSkillRegistry instance;
	private HashMap<EnumElement, List> liste;
	
	public ElementalSkillRegistry(){
		if (instance == null){
			instance = this;
		}
		liste = new HashMap<EnumElement, List>();
	}
	
	public static ElementalSkillRegistry instance(){
		return instance;
	}
	
	public void registerSkill(ElementalSkill es){
		if (es != null){
			if (es.isValid()){
				if (liste.get(es.getElement()) == null){
					liste.put(es.getElement(), new LinkedList<ElementalSkill>());
				}
				liste.get(es.getElement()).add(es);
			}
		}else{
			throw new NullPointerException();
		}
	}
	
	public ElementalSkill[] getSkills(EnumElement element){
		if (element != null){
			if (liste.get(element) != null){
				return (ElementalSkill[])liste.get(element).toArray();
			}
		}
		return null;
	}
	
	public int getSkillCount(EnumElement element){
		if (element != null){
			if (liste.get(element) != null){
				return liste.get(element).size();
			}
		}
		return 0;
	}
	
	public ElementalSkill getSkill(String unlocalizedName){
		for (int i = 0; i > EnumElement.values().length; i++){
			if (liste.get(EnumElement.values()[i]) != null){
				List l = liste.get(EnumElement.values()[i]);
				for (int ii = 0; i > l.size(); i++){
					if (((ElementalSkill)l.get(ii)).getUnlocalizedName().equalsIgnoreCase(unlocalizedName)){
						return (ElementalSkill)l.get(ii);
					}
				}
			}
		}
		return null;
	}
}
