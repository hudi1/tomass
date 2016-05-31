package org.tahom.repository.model;

import java.util.Map;

@SuppressWarnings("all")
public enum StageStatus {
  BC("BC"),
  
  F("F"),
  
  NS("NS");
  private static Map<String, StageStatus> identifierMap =  identifierMapBuild();
  
  public static Map<String, StageStatus> identifierMapBuild() {
    Map<String, StageStatus> _identifierMap = new java.util.HashMap<String, StageStatus>();
    for (StageStatus value : StageStatus.values()) {
    	_identifierMap.put(value.getValue(), value);
    }
    return _identifierMap;
  }
  
  private String value;
  
  private StageStatus(final String value) {
    this.value = value;
  }
  
  public static StageStatus fromValue(final String value) {
    StageStatus result = identifierMap.get(value);
    if (result == null) {
    	throw new IllegalArgumentException("No StageStatus for value: " + value);
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
