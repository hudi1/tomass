package org.tahom.repository.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.tahom.repository.model.Groups;
import org.tahom.repository.model.PlayOffGame;
import org.tahom.repository.model.StageStatus;
import org.tahom.repository.model.StageType;
import org.tahom.repository.model.Tournament;

@Pojo
@SuppressWarnings("all")
public class Stage implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_NAME = "NAME";
  
  public final static String ORDER_BY_TOURNAMENT = "TOURNAMENT";
  
  public final static String ORDER_BY_COPY_RESULT_STAGE = "COPY_RESULT_STAGE";
  
  public Stage() {
  }
  
  public Stage(final String name, final Integer sequence, final Integer numberOfHockey, final Integer winPoints, final StageType type, final Tournament tournament, final StageStatus status) {
    super();
    setName(name);
    setSequence(sequence);
    setNumberOfHockey(numberOfHockey);
    setWinPoints(winPoints);
    setType(type);
    setTournament(tournament);
    setStatus(status);
  }
  
  private Integer id;
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(final Integer id) {
    this.id = id;
  }
  
  public Stage _setId(final Integer id) {
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
  
  public Stage _setName(final String name) {
    this.name = name;
    return this;
  }
  
  private Integer sequence;
  
  public Integer getSequence() {
    return this.sequence;
  }
  
  public void setSequence(final Integer sequence) {
    this.sequence = sequence;
  }
  
  public Stage _setSequence(final Integer sequence) {
    this.sequence = sequence;
    return this;
  }
  
  private Integer numberOfHockey;
  
  public Integer getNumberOfHockey() {
    return this.numberOfHockey;
  }
  
  public void setNumberOfHockey(final Integer numberOfHockey) {
    this.numberOfHockey = numberOfHockey;
  }
  
  public Stage _setNumberOfHockey(final Integer numberOfHockey) {
    this.numberOfHockey = numberOfHockey;
    return this;
  }
  
  private Integer winPoints;
  
  public Integer getWinPoints() {
    return this.winPoints;
  }
  
  public void setWinPoints(final Integer winPoints) {
    this.winPoints = winPoints;
  }
  
  public Stage _setWinPoints(final Integer winPoints) {
    this.winPoints = winPoints;
    return this;
  }
  
  private StageType type;
  
  public StageType getType() {
    return this.type;
  }
  
  public void setType(final StageType type) {
    this.type = type;
  }
  
  public Stage _setType(final StageType type) {
    this.type = type;
    return this;
  }
  
  private Tournament tournament;
  
  public Tournament getTournament() {
    return this.tournament;
  }
  
  public void setTournament(final Tournament tournament) {
    this.tournament = tournament;
  }
  
  public Stage _setTournament(final Tournament tournament) {
    this.tournament = tournament;
    return this;
  }
  
  private StageStatus status;
  
  public StageStatus getStatus() {
    return this.status;
  }
  
  public void setStatus(final StageStatus status) {
    this.status = status;
  }
  
  public Stage _setStatus(final StageStatus status) {
    this.status = status;
    return this;
  }
  
  private Stage copyResultStage;
  
  public Stage getCopyResultStage() {
    return this.copyResultStage;
  }
  
  public void setCopyResultStage(final Stage copyResultStage) {
    this.copyResultStage = copyResultStage;
  }
  
  public Stage _setCopyResultStage(final Stage copyResultStage) {
    this.copyResultStage = copyResultStage;
    return this;
  }
  
  private List<Groups> groups = new java.util.ArrayList<Groups>();
  
  public List<Groups> getGroups() {
    return this.groups;
  }
  
  public void setGroups(final List<Groups> groups) {
    this.groups = groups;
  }
  
  public Stage _setGroups(final List<Groups> groups) {
    this.groups = groups;
    return this;
  }
  
  private List<PlayOffGame> playOffGames = new java.util.ArrayList<PlayOffGame>();
  
  public List<PlayOffGame> getPlayOffGames() {
    return this.playOffGames;
  }
  
  public void setPlayOffGames(final List<PlayOffGame> playOffGames) {
    this.playOffGames = playOffGames;
  }
  
  public Stage _setPlayOffGames(final List<PlayOffGame> playOffGames) {
    this.playOffGames = playOffGames;
    return this;
  }
  
  private List<Stage> stages = new java.util.ArrayList<Stage>();
  
  public List<Stage> getStages() {
    return this.stages;
  }
  
  public void setStages(final List<Stage> stages) {
    this.stages = stages;
  }
  
  public Stage _setStages(final List<Stage> stages) {
    this.stages = stages;
    return this;
  }
  
  private boolean onlyIds_;
  
  public boolean isOnlyIds_() {
    return this.onlyIds_;
  }
  
  public void setOnlyIds_(final boolean onlyIds_) {
    this.onlyIds_ = onlyIds_;
  }
  
  public Stage _setOnlyIds_(final boolean onlyIds_) {
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
  
  public Stage _setIds_(final List<Integer> ids_) {
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
    Stage other = (Stage) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public String toString() {
    return "Stage [id=" + id + ", name=" + name + ", sequence=" + sequence + ", numberOfHockey=" + numberOfHockey + ", winPoints=" + winPoints + ", type=" + type + ", status=" + status + "]";
  }
  
  public String toStringFull() {
    return "Stage [id=" + id + ", name=" + name + ", sequence=" + sequence + ", numberOfHockey=" + numberOfHockey + ", winPoints=" + winPoints + ", type=" + type + ", tournament=" + tournament + ", status=" + status + ", copyResultStage=" + copyResultStage + ", groups=" + groups + ", playOffGames=" + playOffGames + ", stages=" + stages + ", onlyIds_=" + onlyIds_ + ", ids_=" + ids_ + "]";
  }
  
  public enum Attribute {
    copyResultStage;
  }
  
  private Set<String> nullValues_ =  new java.util.HashSet<String>();
  
  public void setNull_(final Stage.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }
  
  public Stage _setNull_(final Stage.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final Stage.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }
  
  public Stage _clearNull_(final Stage.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }
  
  public Stage _setNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }
  
  public Stage _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public Boolean isNull_(final Stage.Attribute attribute) {
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
    tournament,
    
    copyResultStage,
    
    groups,
    
    playOffGames,
    
    stages;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final Stage.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public Stage _setInit_(final Stage.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final Stage.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public Stage _clearInit_(final Stage.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public Stage _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public Stage _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final Stage.Association association) {
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
    
    sequence,
    
    numberOfHockey,
    
    winPoints,
    
    type,
    
    tournament,
    
    status,
    
    copyResultStage,
    
    groups,
    
    playOffGames,
    
    stages,
    
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
  
  public void setOp_(final String operator, final Stage.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }
  
  public Stage _setOp_(final String operator, final Stage.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final Stage.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }
  
  public Stage _clearOp_(final Stage.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }
  
  public Stage _setOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }
  
  public Stage _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final Stage.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }
  
  public Stage _setNullOp_(final Stage.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }
  
  public Stage _setNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
}
