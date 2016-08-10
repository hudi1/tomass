package org.tahom.repository.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.tahom.repository.model.Game;
import org.tahom.repository.model.Groups;
import org.tahom.repository.model.Player;

@Pojo
@SuppressWarnings("all")
public class Matchs implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_HOME_PLAYER = "HOME_PLAYER";
  
  public final static String ORDER_BY_AWAY_PLAYER = "AWAY_PLAYER";
  
  public final static String ORDER_BY_GAME = "GAME";
  
  public final static String ORDER_BY_GROUP = "GROUP";
  
  public final static String ORDER_BY_ROUND = "ROUND";
  
  public final static String ORDER_BY_HOCKEY = "HOCKEY";
  
  public Matchs() {
  }
  
  public Matchs(final Groups group) {
    super();
    setGroup(group);
  }
  
  private Integer id;
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(final Integer id) {
    this.id = id;
  }
  
  public Matchs _setId(final Integer id) {
    this.id = id;
    return this;
  }
  
  private Player homePlayer;
  
  public Player getHomePlayer() {
    return this.homePlayer;
  }
  
  public void setHomePlayer(final Player homePlayer) {
    this.homePlayer = homePlayer;
  }
  
  public Matchs _setHomePlayer(final Player homePlayer) {
    this.homePlayer = homePlayer;
    return this;
  }
  
  private Player awayPlayer;
  
  public Player getAwayPlayer() {
    return this.awayPlayer;
  }
  
  public void setAwayPlayer(final Player awayPlayer) {
    this.awayPlayer = awayPlayer;
  }
  
  public Matchs _setAwayPlayer(final Player awayPlayer) {
    this.awayPlayer = awayPlayer;
    return this;
  }
  
  private Game game;
  
  public Game getGame() {
    return this.game;
  }
  
  public void setGame(final Game game) {
    this.game = game;
  }
  
  public Matchs _setGame(final Game game) {
    this.game = game;
    return this;
  }
  
  private Groups group;
  
  public Groups getGroup() {
    return this.group;
  }
  
  public void setGroup(final Groups group) {
    this.group = group;
  }
  
  public Matchs _setGroup(final Groups group) {
    this.group = group;
    return this;
  }
  
  private Integer round;
  
  public Integer getRound() {
    return this.round;
  }
  
  public void setRound(final Integer round) {
    this.round = round;
  }
  
  public Matchs _setRound(final Integer round) {
    this.round = round;
    return this;
  }
  
  private Integer hockey;
  
  public Integer getHockey() {
    return this.hockey;
  }
  
  public void setHockey(final Integer hockey) {
    this.hockey = hockey;
  }
  
  public Matchs _setHockey(final Integer hockey) {
    this.hockey = hockey;
    return this;
  }
  
  private boolean onlyIds_;
  
  public boolean isOnlyIds_() {
    return this.onlyIds_;
  }
  
  public void setOnlyIds_(final boolean onlyIds_) {
    this.onlyIds_ = onlyIds_;
  }
  
  public Matchs _setOnlyIds_(final boolean onlyIds_) {
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
  
  public Matchs _setIds_(final List<Integer> ids_) {
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
    Matchs other = (Matchs) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public String toString() {
    return "Matchs [id=" + id + ", round=" + round + ", hockey=" + hockey + "]";
  }
  
  public String toStringFull() {
    return "Matchs [id=" + id + ", homePlayer=" + homePlayer + ", awayPlayer=" + awayPlayer + ", game=" + game + ", group=" + group + ", round=" + round + ", hockey=" + hockey + ", onlyIds_=" + onlyIds_ + ", ids_=" + ids_ + "]";
  }
  
  public enum Attribute {
    homePlayer,
    
    awayPlayer,
    
    game,
    
    round,
    
    hockey;
  }
  
  private Set<String> nullValues_ =  new java.util.HashSet<String>();
  
  public void setNull_(final Matchs.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }
  
  public Matchs _setNull_(final Matchs.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final Matchs.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }
  
  public Matchs _clearNull_(final Matchs.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }
  
  public Matchs _setNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }
  
  public Matchs _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public Boolean isNull_(final Matchs.Attribute attribute) {
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
    homePlayer,
    
    awayPlayer,
    
    game,
    
    group;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final Matchs.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public Matchs _setInit_(final Matchs.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final Matchs.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public Matchs _clearInit_(final Matchs.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public Matchs _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public Matchs _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final Matchs.Association association) {
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
    
    homePlayer,
    
    awayPlayer,
    
    game,
    
    group,
    
    round,
    
    hockey,
    
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
  
  public void setOp_(final String operator, final Matchs.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }
  
  public Matchs _setOp_(final String operator, final Matchs.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final Matchs.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }
  
  public Matchs _clearOp_(final Matchs.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }
  
  public Matchs _setOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }
  
  public Matchs _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final Matchs.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }
  
  public Matchs _setNullOp_(final Matchs.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }
  
  public Matchs _setNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
}
