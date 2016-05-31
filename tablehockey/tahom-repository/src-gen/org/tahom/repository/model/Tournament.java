package org.tahom.repository.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.tahom.repository.model.FinalStanding;
import org.tahom.repository.model.PlayingFormat;
import org.tahom.repository.model.Stage;
import org.tahom.repository.model.TournamentRating;
import org.tahom.repository.model.TournamentStatus;

@Pojo
@SuppressWarnings("all")
public class Tournament implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_PLAYING_FORMAT = "PLAYING_FORMAT";
  
  public Tournament() {
  }
  
  public Tournament(final String name, final TournamentStatus status, final Boolean visible) {
    super();
    setName(name);
    setStatus(status);
    setVisible(visible);
  }
  
  private Integer id;
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(final Integer id) {
    this.id = id;
  }
  
  public Tournament _setId(final Integer id) {
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
  
  public Tournament _setName(final String name) {
    this.name = name;
    return this;
  }
  
  private TournamentStatus status;
  
  public TournamentStatus getStatus() {
    return this.status;
  }
  
  public void setStatus(final TournamentStatus status) {
    this.status = status;
  }
  
  public Tournament _setStatus(final TournamentStatus status) {
    this.status = status;
    return this;
  }
  
  private PlayingFormat playingFormat;
  
  public PlayingFormat getPlayingFormat() {
    return this.playingFormat;
  }
  
  public void setPlayingFormat(final PlayingFormat playingFormat) {
    this.playingFormat = playingFormat;
  }
  
  public Tournament _setPlayingFormat(final PlayingFormat playingFormat) {
    this.playingFormat = playingFormat;
    return this;
  }
  
  private Boolean visible;
  
  public Boolean getVisible() {
    return this.visible;
  }
  
  public void setVisible(final Boolean visible) {
    this.visible = visible;
  }
  
  public Tournament _setVisible(final Boolean visible) {
    this.visible = visible;
    return this;
  }
  
  private List<FinalStanding> finalStandings = new java.util.ArrayList<FinalStanding>();
  
  public List<FinalStanding> getFinalStandings() {
    return this.finalStandings;
  }
  
  public void setFinalStandings(final List<FinalStanding> finalStandings) {
    this.finalStandings = finalStandings;
  }
  
  public Tournament _setFinalStandings(final List<FinalStanding> finalStandings) {
    this.finalStandings = finalStandings;
    return this;
  }
  
  private List<Stage> stages = new java.util.ArrayList<Stage>();
  
  public List<Stage> getStages() {
    return this.stages;
  }
  
  public void setStages(final List<Stage> stages) {
    this.stages = stages;
  }
  
  public Tournament _setStages(final List<Stage> stages) {
    this.stages = stages;
    return this;
  }
  
  private List<TournamentRating> tournamentRatings = new java.util.ArrayList<TournamentRating>();
  
  public List<TournamentRating> getTournamentRatings() {
    return this.tournamentRatings;
  }
  
  public void setTournamentRatings(final List<TournamentRating> tournamentRatings) {
    this.tournamentRatings = tournamentRatings;
  }
  
  public Tournament _setTournamentRatings(final List<TournamentRating> tournamentRatings) {
    this.tournamentRatings = tournamentRatings;
    return this;
  }
  
  private boolean onlyIds_;
  
  public boolean isOnlyIds_() {
    return this.onlyIds_;
  }
  
  public void setOnlyIds_(final boolean onlyIds_) {
    this.onlyIds_ = onlyIds_;
  }
  
  public Tournament _setOnlyIds_(final boolean onlyIds_) {
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
  
  public Tournament _setIds_(final List<Integer> ids_) {
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
    Tournament other = (Tournament) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public String toString() {
    return "Tournament [id=" + id + ", name=" + name + ", status=" + status + ", visible=" + visible + "]";
  }
  
  public String toStringFull() {
    return "Tournament [id=" + id + ", name=" + name + ", status=" + status + ", playingFormat=" + playingFormat + ", visible=" + visible + ", finalStandings=" + finalStandings + ", stages=" + stages + ", tournamentRatings=" + tournamentRatings + ", onlyIds_=" + onlyIds_ + ", ids_=" + ids_ + "]";
  }
  
  public enum Attribute {
    playingFormat;
  }
  
  private Set<String> nullValues_ =  new java.util.HashSet<String>();
  
  public void setNull_(final Tournament.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }
  
  public Tournament _setNull_(final Tournament.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final Tournament.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }
  
  public Tournament _clearNull_(final Tournament.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }
  
  public Tournament _setNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }
  
  public Tournament _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public Boolean isNull_(final Tournament.Attribute attribute) {
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
    playingFormat,
    
    finalStandings,
    
    stages,
    
    tournamentRatings;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final Tournament.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public Tournament _setInit_(final Tournament.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final Tournament.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public Tournament _clearInit_(final Tournament.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public Tournament _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public Tournament _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final Tournament.Association association) {
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
    
    status,
    
    playingFormat,
    
    visible,
    
    finalStandings,
    
    stages,
    
    tournamentRatings,
    
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
  
  public void setOp_(final String operator, final Tournament.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }
  
  public Tournament _setOp_(final String operator, final Tournament.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final Tournament.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }
  
  public Tournament _clearOp_(final Tournament.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }
  
  public Tournament _setOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }
  
  public Tournament _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final Tournament.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }
  
  public Tournament _setNullOp_(final Tournament.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }
  
  public Tournament _setNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
}
