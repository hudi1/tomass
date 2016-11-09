package org.tahom.repository.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.tahom.repository.model.Game;
import org.tahom.repository.model.Groups;
import org.tahom.repository.model.Participant;
import org.tahom.repository.type.model.Score;

@Pojo
@SuppressWarnings("all")
public class GroupParticipant implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_GROUP = "GROUP";
  
  public final static String ORDER_BY_PARTICIPANT = "PARTICIPANT";
  
  public final static String ORDER_BY_RANK = "RANK";
  
  public GroupParticipant() {
  }
  
  public GroupParticipant(final Groups group, final Participant participant, final Integer points, final Score score) {
    super();
    setGroup(group);
    setParticipant(participant);
    setPoints(points);
    setScore(score);
  }
  
  private Integer id;
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(final Integer id) {
    this.id = id;
  }
  
  public GroupParticipant _setId(final Integer id) {
    this.id = id;
    return this;
  }
  
  private Groups group;
  
  public Groups getGroup() {
    return this.group;
  }
  
  public void setGroup(final Groups group) {
    this.group = group;
  }
  
  public GroupParticipant _setGroup(final Groups group) {
    this.group = group;
    return this;
  }
  
  private Participant participant;
  
  public Participant getParticipant() {
    return this.participant;
  }
  
  public void setParticipant(final Participant participant) {
    this.participant = participant;
  }
  
  public GroupParticipant _setParticipant(final Participant participant) {
    this.participant = participant;
    return this;
  }
  
  private Integer points;
  
  public Integer getPoints() {
    return this.points;
  }
  
  public void setPoints(final Integer points) {
    this.points = points;
  }
  
  public GroupParticipant _setPoints(final Integer points) {
    this.points = points;
    return this;
  }
  
  private Score score;
  
  public Score getScore() {
    return this.score;
  }
  
  public void setScore(final Score score) {
    this.score = score;
  }
  
  public GroupParticipant _setScore(final Score score) {
    this.score = score;
    return this;
  }
  
  private Integer rank;
  
  public Integer getRank() {
    return this.rank;
  }
  
  public void setRank(final Integer rank) {
    this.rank = rank;
  }
  
  public GroupParticipant _setRank(final Integer rank) {
    this.rank = rank;
    return this;
  }
  
  private Integer secondaryRank;
  
  public Integer getSecondaryRank() {
    return this.secondaryRank;
  }
  
  public void setSecondaryRank(final Integer secondaryRank) {
    this.secondaryRank = secondaryRank;
  }
  
  public GroupParticipant _setSecondaryRank(final Integer secondaryRank) {
    this.secondaryRank = secondaryRank;
    return this;
  }
  
  private boolean temp;
  
  public boolean isTemp() {
    return this.temp;
  }
  
  public void setTemp(final boolean temp) {
    this.temp = temp;
  }
  
  public GroupParticipant _setTemp(final boolean temp) {
    this.temp = temp;
    return this;
  }
  
  private List<Game> games = new java.util.ArrayList<Game>();
  
  public List<Game> getGames() {
    return this.games;
  }
  
  public void setGames(final List<Game> games) {
    this.games = games;
  }
  
  public GroupParticipant _setGames(final List<Game> games) {
    this.games = games;
    return this;
  }
  
  private boolean onlyIds_;
  
  public boolean isOnlyIds_() {
    return this.onlyIds_;
  }
  
  public void setOnlyIds_(final boolean onlyIds_) {
    this.onlyIds_ = onlyIds_;
  }
  
  public GroupParticipant _setOnlyIds_(final boolean onlyIds_) {
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
  
  public GroupParticipant _setIds_(final List<Integer> ids_) {
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
    GroupParticipant other = (GroupParticipant) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public String toString() {
    return "GroupParticipant [id=" + id + ", points=" + points + ", score=" + score + ", rank=" + rank + ", secondaryRank=" + secondaryRank + ", temp=" + temp + "]";
  }
  
  public String toStringFull() {
    return "GroupParticipant [id=" + id + ", group=" + group + ", participant=" + participant + ", points=" + points + ", score=" + score + ", rank=" + rank + ", secondaryRank=" + secondaryRank + ", temp=" + temp + ", games=" + games + ", onlyIds_=" + onlyIds_ + ", ids_=" + ids_ + "]";
  }
  
  public enum Attribute {
    rank,
    
    secondaryRank,
    
    temp;
  }
  
  private Set<String> nullValues_ =  new java.util.HashSet<String>();
  
  public void setNull_(final GroupParticipant.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }
  
  public GroupParticipant _setNull_(final GroupParticipant.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final GroupParticipant.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }
  
  public GroupParticipant _clearNull_(final GroupParticipant.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }
  
  public GroupParticipant _setNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }
  
  public GroupParticipant _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public Boolean isNull_(final GroupParticipant.Attribute attribute) {
    if (attribute == null)
    	throw new IllegalArgumentException();
    return nullValues_.contains(attribute.name());
  }
  
  public Boolean isNull_(final String attrName) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    return nullValues_.contains(attrName);
  }
  
  public Boolean isDef_(final String attrName, final Boolean isAttrNotNull) {
    if (attrName == null)
    	throw new IllegalArgumentException();
    if (nullValues_.contains(attrName))
    	return true;
    if (isAttrNotNull != null)
    	return isAttrNotNull;
    return false;
  }
  
  public void clearAllNull_() {
    nullValues_ = new java.util.HashSet<String>();
  }
  
  public enum Association {
    group,
    
    participant,
    
    games;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final GroupParticipant.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public GroupParticipant _setInit_(final GroupParticipant.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final GroupParticipant.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public GroupParticipant _clearInit_(final GroupParticipant.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public GroupParticipant _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public GroupParticipant _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final GroupParticipant.Association association) {
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
    
    group,
    
    participant,
    
    points,
    
    score,
    
    rank,
    
    secondaryRank,
    
    temp,
    
    games,
    
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
  
  public void setOp_(final String operator, final GroupParticipant.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }
  
  public GroupParticipant _setOp_(final String operator, final GroupParticipant.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final GroupParticipant.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }
  
  public GroupParticipant _clearOp_(final GroupParticipant.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }
  
  public GroupParticipant _setOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }
  
  public GroupParticipant _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final GroupParticipant.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }
  
  public GroupParticipant _setNullOp_(final GroupParticipant.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }
  
  public GroupParticipant _setNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
}
