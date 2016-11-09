package org.tahom.repository.model;

import java.util.Map;

@SuppressWarnings("all")
public enum PlayerGender {
  F("F"),
  
  I0("0"),
  
  M("M");
  private static Map<String, PlayerGender> identifierMap =  identifierMapBuild();
  
  public static Map<String, PlayerGender> identifierMapBuild() {
    Map<String, PlayerGender> _identifierMap = new java.util.HashMap<String, PlayerGender>();
    for (PlayerGender value : PlayerGender.values()) {
    	_identifierMap.put(value.getValue(), value);
    }
    return _identifierMap;
  }
  
  private String value;
  
  private PlayerGender(final String value) {
    this.value = value;
  }
  
  public static PlayerGender fromValue(final String value) {
    PlayerGender result = identifierMap.get(value);
    if (result == null) {
    	throw new IllegalArgumentException("No PlayerGender for value: " + value);
    }
    return result;
  }
  
  public String getValue() {
    return value;
  }
  
  public String getName() {
    return name();
  }
}
