package org.tahom.repository.model;

import java.util.Map;

@SuppressWarnings("all")
public enum TournamentStatus {
  BC("BC"),
  
  F("F"),
  
  NS("NS"),
  
  RC("RC"),
  
  RO("RO");
  private static Map<String, TournamentStatus> identifierMap =  identifierMapBuild();
  
  public static Map<String, TournamentStatus> identifierMapBuild() {
    Map<String, TournamentStatus> _identifierMap = new java.util.HashMap<String, TournamentStatus>();
    for (TournamentStatus value : TournamentStatus.values()) {
    	_identifierMap.put(value.getValue(), value);
    }
    return _identifierMap;
  }
  
  private String value;
  
  private TournamentStatus(final String value) {
    this.value = value;
  }
  
  public static TournamentStatus fromValue(final String value) {
    TournamentStatus result = identifierMap.get(value);
    if (result == null) {
    	throw new IllegalArgumentException("No TournamentStatus for value: " + value);
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
