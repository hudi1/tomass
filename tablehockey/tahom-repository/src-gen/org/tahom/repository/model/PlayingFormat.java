package org.tahom.repository.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.tahom.repository.model.PlayingFormatSortType;
import org.tahom.repository.model.Tournament;

@Pojo
@SuppressWarnings("all")
public class PlayingFormat implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public PlayingFormat() {
  }
  
  public PlayingFormat(final String name, final Integer finalPromoting, final Integer lowerPromoting, final Integer winPoints, final Integer playOffFinal, final Integer playOffLower, final Integer minPlayersInGroup, final PlayingFormatSortType sortType, final String description) {
    super();
    setName(name);
    setFinalPromoting(finalPromoting);
    setLowerPromoting(lowerPromoting);
    setWinPoints(winPoints);
    setPlayOffFinal(playOffFinal);
    setPlayOffLower(playOffLower);
    setMinPlayersInGroup(minPlayersInGroup);
    setSortType(sortType);
    setDescription(description);
  }
  
  private Integer id;
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(final Integer id) {
    this.id = id;
  }
  
  public PlayingFormat _setId(final Integer id) {
    this.id = id;
    return this;
  }
  
  private String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(final String name) {
    this.name = name;
  }
  
  public PlayingFormat _setName(final String name) {
    this.name = name;
    return this;
  }
  
  private Integer finalPromoting;
  
  public Integer getFinalPromoting() {
    return this.finalPromoting;
  }
  
  public void setFinalPromoting(final Integer finalPromoting) {
    this.finalPromoting = finalPromoting;
  }
  
  public PlayingFormat _setFinalPromoting(final Integer finalPromoting) {
    this.finalPromoting = finalPromoting;
    return this;
  }
  
  private Integer lowerPromoting;
  
  public Integer getLowerPromoting() {
    return this.lowerPromoting;
  }
  
  public void setLowerPromoting(final Integer lowerPromoting) {
    this.lowerPromoting = lowerPromoting;
  }
  
  public PlayingFormat _setLowerPromoting(final Integer lowerPromoting) {
    this.lowerPromoting = lowerPromoting;
    return this;
  }
  
  private Integer winPoints;
  
  public Integer getWinPoints() {
    return this.winPoints;
  }
  
  public void setWinPoints(final Integer winPoints) {
    this.winPoints = winPoints;
  }
  
  public PlayingFormat _setWinPoints(final Integer winPoints) {
    this.winPoints = winPoints;
    return this;
  }
  
  private Integer playOffFinal;
  
  public Integer getPlayOffFinal() {
    return this.playOffFinal;
  }
  
  public void setPlayOffFinal(final Integer playOffFinal) {
    this.playOffFinal = playOffFinal;
  }
  
  public PlayingFormat _setPlayOffFinal(final Integer playOffFinal) {
    this.playOffFinal = playOffFinal;
    return this;
  }
  
  private Integer playOffLower;
  
  public Integer getPlayOffLower() {
    return this.playOffLower;
  }
  
  public void setPlayOffLower(final Integer playOffLower) {
    this.playOffLower = playOffLower;
  }
  
  public PlayingFormat _setPlayOffLower(final Integer playOffLower) {
    this.playOffLower = playOffLower;
    return this;
  }
  
  private Integer minPlayersInGroup;
  
  public Integer getMinPlayersInGroup() {
    return this.minPlayersInGroup;
  }
  
  public void setMinPlayersInGroup(final Integer minPlayersInGroup) {
    this.minPlayersInGroup = minPlayersInGroup;
  }
  
  public PlayingFormat _setMinPlayersInGroup(final Integer minPlayersInGroup) {
    this.minPlayersInGroup = minPlayersInGroup;
    return this;
  }
  
  private PlayingFormatSortType sortType;
  
  public PlayingFormatSortType getSortType() {
    return this.sortType;
  }
  
  public void setSortType(final PlayingFormatSortType sortType) {
    this.sortType = sortType;
  }
  
  public PlayingFormat _setSortType(final PlayingFormatSortType sortType) {
    this.sortType = sortType;
    return this;
  }
  
  private String description;
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(final String description) {
    this.description = description;
  }
  
  public PlayingFormat _setDescription(final String description) {
    this.description = description;
    return this;
  }
  
  private List<Tournament> tournaments = new java.util.ArrayList<Tournament>();
  
  public List<Tournament> getTournaments() {
    return this.tournaments;
  }
  
  public void setTournaments(final List<Tournament> tournaments) {
    this.tournaments = tournaments;
  }
  
  public PlayingFormat _setTournaments(final List<Tournament> tournaments) {
    this.tournaments = tournaments;
    return this;
  }
  
  private boolean onlyIds_;
  
  public boolean isOnlyIds_() {
    return this.onlyIds_;
  }
  
  public void setOnlyIds_(final boolean onlyIds_) {
    this.onlyIds_ = onlyIds_;
  }
  
  public PlayingFormat _setOnlyIds_(final boolean onlyIds_) {
    this.onlyIds_ = onlyIds_;
    return this;
  }
  
  private List<Integer> ids_ = new java.util.ArrayList<Integer>();
  
  public List<Integer> getIds_() {
    return this.ids_;
  }
  
  public void setIds_(final List<Integer> ids_) {
    this.ids_ = ids_;
  }
  
  public PlayingFormat _setIds_(final List<Integer> ids_) {
    this.ids_ = ids_;
    return this;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (obj == null)
    	return false;
    if (getClass() != obj.getClass())
    	return false;
    PlayingFormat other = (PlayingFormat) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public String toString() {
    return "PlayingFormat [id=" + id + ", name=" + name + ", finalPromoting=" + finalPromoting + ", lowerPromoting=" + lowerPromoting + ", winPoints=" + winPoints + ", playOffFinal=" + playOffFinal + ", playOffLower=" + playOffLower + ", minPlayersInGroup=" + minPlayersInGroup + ", sortType=" + sortType + ", description=" + description + "]";
  }
  
  public String toStringFull() {
    return "PlayingFormat [id=" + id + ", name=" + name + ", finalPromoting=" + finalPromoting + ", lowerPromoting=" + lowerPromoting + ", winPoints=" + winPoints + ", playOffFinal=" + playOffFinal + ", playOffLower=" + playOffLower + ", minPlayersInGroup=" + minPlayersInGroup + ", sortType=" + sortType + ", description=" + description + ", tournaments=" + tournaments + ", onlyIds_=" + onlyIds_ + ", ids_=" + ids_ + "]";
  }
  
  public enum Association {
    tournaments;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final PlayingFormat.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public PlayingFormat _setInit_(final PlayingFormat.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final PlayingFormat.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public PlayingFormat _clearInit_(final PlayingFormat.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public PlayingFormat _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public PlayingFormat _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final PlayingFormat.Association association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations_.contains(association.name());
  }
  
  public Boolean toInit_(final String association) {
    if (association == null)
    	throw new IllegalArgumentException();
    return initAssociations_.contains(association);
  }
  
  public void clearAllInit_() {
    initAssociations_ = new java.util.HashSet<String>();
  }
  
  public enum OpAttribute {
    id,
    
    name,
    
    finalPromoting,
    
    lowerPromoting,
    
    winPoints,
    
    playOffFinal,
    
    playOffLower,
    
    minPlayersInGroup,
    
    sortType,
    
    description,
    
    tournaments,
    
    onlyIds_,
    
    ids_;
  }
  
  private Map<String, String> operators_ =  new java.util.HashMap<String, String>();
  
  public Map<String, String> getOperators_() {
    return operators_;
  }
  
  public String getOp_(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    return operators_.get(attrName);
  }
  
  public void setOp_(final String operator, final PlayingFormat.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }
  
  public PlayingFormat _setOp_(final String operator, final PlayingFormat.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final PlayingFormat.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }
  
  public PlayingFormat _clearOp_(final PlayingFormat.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }
  
  public PlayingFormat _setOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }
  
  public PlayingFormat _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final PlayingFormat.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }
  
  public PlayingFormat _setNullOp_(final PlayingFormat.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }
  
  public PlayingFormat _setNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
}
