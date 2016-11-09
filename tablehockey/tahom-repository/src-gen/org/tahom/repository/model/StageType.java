package org.tahom.repository.model;

import java.util.Map;

@SuppressWarnings("all")
public enum StageType {
  PO("PO"),
  
  RR("RR");
  private static Map<String, StageType> identifierMap =  identifierMapBuild();
  
  public static Map<String, StageType> identifierMapBuild() {
    Map<String, StageType> _identifierMap = new java.util.HashMap<String, StageType>();
    for (StageType value : StageType.values()) {
    	_identifierMap.put(value.getValue(), value);
    }
    return _identifierMap;
  }
  
  private String value;
  
  private StageType(final String value) {
    this.value = value;
  }
  
  public static StageType fromValue(final String value) {
    StageType result = identifierMap.get(value);
    if (result == null) {
    	throw new IllegalArgumentException("No StageType for value: " + value);
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
