package org.tahom.repository.model;

import java.util.Map;

@SuppressWarnings("all")
public enum PlayingFormatSortType {
  CZ("CZ"),
  
  INFO("INFO"),
  
  SK("SK");
  private static Map<String, PlayingFormatSortType> identifierMap =  identifierMapBuild();
  
  public static Map<String, PlayingFormatSortType> identifierMapBuild() {
    Map<String, PlayingFormatSortType> _identifierMap = new java.util.HashMap<String, PlayingFormatSortType>();
    for (PlayingFormatSortType value : PlayingFormatSortType.values()) {
    	_identifierMap.put(value.getValue(), value);
    }
    return _identifierMap;
  }
  
  private String value;
  
  private PlayingFormatSortType(final String value) {
    this.value = value;
  }
  
  public static PlayingFormatSortType fromValue(final String value) {
    PlayingFormatSortType result = identifierMap.get(value);
    if (result == null) {
    	throw new IllegalArgumentException("No PlayingFormatSortType for value: " + value);
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
