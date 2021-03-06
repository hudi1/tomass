package org.tahom.repository.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.tahom.repository.model.GameStatus;
import org.tahom.repository.model.Participant;
import org.tahom.repository.model.Stage;
import org.tahom.repository.type.model.Results;

@Pojo
@SuppressWarnings("all")
public class PlayOffGame implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_HOME_PARTICIPANT = "HOME_PARTICIPANT";
  
  public final static String ORDER_BY_AWAY_PARTICIPANT = "AWAY_PARTICIPANT";
  
  public final static String ORDER_BY_STAGE = "STAGE";
  
  public final static String ORDER_BY_POSITION = "POSITION";
  
  public PlayOffGame() {
  }
  
  public PlayOffGame(final Stage stage, final Integer position) {
    super();
    setStage(stage);
    setPosition(position);
  }
  
  private Integer id;
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(final Integer id) {
    this.id = id;
  }
  
  public PlayOffGame _setId(final Integer id) {
    this.id = id;
    return this;
  }
  
  private Participant homeParticipant;
  
  public Participant getHomeParticipant() {
    return this.homeParticipant;
  }
  
  public void setHomeParticipant(final Participant homeParticipant) {
    this.homeParticipant = homeParticipant;
  }
  
  public PlayOffGame _setHomeParticipant(final Participant homeParticipant) {
    this.homeParticipant = homeParticipant;
    return this;
  }
  
  private Participant awayParticipant;
  
  public Participant getAwayParticipant() {
    return this.awayParticipant;
  }
  
  public void setAwayParticipant(final Participant awayParticipant) {
    this.awayParticipant = awayParticipant;
  }
  
  public PlayOffGame _setAwayParticipant(final Participant awayParticipant) {
    this.awayParticipant = awayParticipant;
    return this;
  }
  
  private GameStatus status;
  
  public GameStatus getStatus() {
    return this.status;
  }
  
  public void setStatus(final GameStatus status) {
    this.status = status;
  }
  
  public PlayOffGame _setStatus(final GameStatus status) {
    this.status = status;
    return this;
  }
  
  private Results result;
  
  public Results getResult() {
    return this.result;
  }
  
  public void setResult(final Results result) {
    this.result = result;
  }
  
  public PlayOffGame _setResult(final Results result) {
    this.result = result;
    return this;
  }
  
  private Stage stage;
  
  public Stage getStage() {
    return this.stage;
  }
  
  public void setStage(final Stage stage) {
    this.stage = stage;
  }
  
  public PlayOffGame _setStage(final Stage stage) {
    this.stage = stage;
    return this;
  }
  
  private Integer position;
  
  public Integer getPosition() {
    return this.position;
  }
  
  public void setPosition(final Integer position) {
    this.position = position;
  }
  
  public PlayOffGame _setPosition(final Integer position) {
    this.position = position;
    return this;
  }
  
  private boolean onlyIds_;
  
  public boolean isOnlyIds_() {
    return this.onlyIds_;
  }
  
  public void setOnlyIds_(final boolean onlyIds_) {
    this.onlyIds_ = onlyIds_;
  }
  
  public PlayOffGame _setOnlyIds_(final boolean onlyIds_) {
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
  
  public PlayOffGame _setIds_(final List<Integer> ids_) {
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
    PlayOffGame other = (PlayOffGame) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public String toString() {
    return "PlayOffGame [id=" + id + ", status=" + status + ", result=" + result + ", position=" + position + "]";
  }
  
  public String toStringFull() {
    return "PlayOffGame [id=" + id + ", homeParticipant=" + homeParticipant + ", awayParticipant=" + awayParticipant + ", status=" + status + ", result=" + result + ", stage=" + stage + ", position=" + position + ", onlyIds_=" + onlyIds_ + ", ids_=" + ids_ + "]";
  }
  
  public enum Attribute {
    homeParticipant,
    
    awayParticipant,
    
    status,
    
    result;
  }
  
  private Set<String> nullValues_ =  new java.util.HashSet<String>();
  
  public void setNull_(final PlayOffGame.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }
  
  public PlayOffGame _setNull_(final PlayOffGame.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final PlayOffGame.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }
  
  public PlayOffGame _clearNull_(final PlayOffGame.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }
  
  public PlayOffGame _setNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }
  
  public PlayOffGame _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public Boolean isNull_(final PlayOffGame.Attribute attribute) {
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
    homeParticipant,
    
    awayParticipant,
    
    stage;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final PlayOffGame.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public PlayOffGame _setInit_(final PlayOffGame.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final PlayOffGame.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public PlayOffGame _clearInit_(final PlayOffGame.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public PlayOffGame _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public PlayOffGame _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final PlayOffGame.Association association) {
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
    
    homeParticipant,
    
    awayParticipant,
    
    status,
    
    result,
    
    stage,
    
    position,
    
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
  
  public void setOp_(final String operator, final PlayOffGame.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }
  
  public PlayOffGame _setOp_(final String operator, final PlayOffGame.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final PlayOffGame.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }
  
  public PlayOffGame _clearOp_(final PlayOffGame.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }
  
  public PlayOffGame _setOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }
  
  public PlayOffGame _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final PlayOffGame.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }
  
  public PlayOffGame _setNullOp_(final PlayOffGame.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }
  
  public PlayOffGame _setNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
}
