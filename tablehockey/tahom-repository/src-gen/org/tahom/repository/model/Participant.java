package org.tahom.repository.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.tahom.repository.model.FinalStanding;
import org.tahom.repository.model.GroupParticipant;
import org.tahom.repository.model.PlayOffGame;
import org.tahom.repository.model.Player;
import org.tahom.repository.model.Tournament;

@Pojo
@SuppressWarnings("all")
public class Participant implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_TOURNAMENT = "TOURNAMENT";
  
  public final static String ORDER_BY_PLAYER = "PLAYER";
  
  public Participant() {
  }
  
  public Participant(final Tournament tournament, final Player player) {
    super();
    setTournament(tournament);
    setPlayer(player);
  }
  
  private Integer id;
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(final Integer id) {
    this.id = id;
  }
  
  public Participant _setId(final Integer id) {
    this.id = id;
    return this;
  }
  
  private Tournament tournament;
  
  public Tournament getTournament() {
    return this.tournament;
  }
  
  public void setTournament(final Tournament tournament) {
    this.tournament = tournament;
  }
  
  public Participant _setTournament(final Tournament tournament) {
    this.tournament = tournament;
    return this;
  }
  
  private Player player;
  
  public Player getPlayer() {
    return this.player;
  }
  
  public void setPlayer(final Player player) {
    this.player = player;
  }
  
  public Participant _setPlayer(final Player player) {
    this.player = player;
    return this;
  }
  
  private List<FinalStanding> finalStandings = new java.util.ArrayList<FinalStanding>();
  
  public List<FinalStanding> getFinalStandings() {
    return this.finalStandings;
  }
  
  public void setFinalStandings(final List<FinalStanding> finalStandings) {
    this.finalStandings = finalStandings;
  }
  
  public Participant _setFinalStandings(final List<FinalStanding> finalStandings) {
    this.finalStandings = finalStandings;
    return this;
  }
  
  private List<GroupParticipant> groupParticipants = new java.util.ArrayList<GroupParticipant>();
  
  public List<GroupParticipant> getGroupParticipants() {
    return this.groupParticipants;
  }
  
  public void setGroupParticipants(final List<GroupParticipant> groupParticipants) {
    this.groupParticipants = groupParticipants;
  }
  
  public Participant _setGroupParticipants(final List<GroupParticipant> groupParticipants) {
    this.groupParticipants = groupParticipants;
    return this;
  }
  
  private List<PlayOffGame> playOffGames = new java.util.ArrayList<PlayOffGame>();
  
  public List<PlayOffGame> getPlayOffGames() {
    return this.playOffGames;
  }
  
  public void setPlayOffGames(final List<PlayOffGame> playOffGames) {
    this.playOffGames = playOffGames;
  }
  
  public Participant _setPlayOffGames(final List<PlayOffGame> playOffGames) {
    this.playOffGames = playOffGames;
    return this;
  }
  
  private boolean onlyIds_;
  
  public boolean isOnlyIds_() {
    return this.onlyIds_;
  }
  
  public void setOnlyIds_(final boolean onlyIds_) {
    this.onlyIds_ = onlyIds_;
  }
  
  public Participant _setOnlyIds_(final boolean onlyIds_) {
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
  
  public Participant _setIds_(final List<Integer> ids_) {
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
    Participant other = (Participant) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public String toString() {
    return "Participant [id=" + id + "]";
  }
  
  public String toStringFull() {
    return "Participant [id=" + id + ", tournament=" + tournament + ", player=" + player + ", finalStandings=" + finalStandings + ", groupParticipants=" + groupParticipants + ", playOffGames=" + playOffGames + ", onlyIds_=" + onlyIds_ + ", ids_=" + ids_ + "]";
  }
  
  public enum Association {
    tournament,
    
    player,
    
    finalStandings,
    
    groupParticipants,
    
    playOffGames;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final Participant.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public Participant _setInit_(final Participant.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final Participant.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public Participant _clearInit_(final Participant.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public Participant _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public Participant _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final Participant.Association association) {
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
    
    tournament,
    
    player,
    
    finalStandings,
    
    groupParticipants,
    
    playOffGames,
    
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
  
  public void setOp_(final String operator, final Participant.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }
  
  public Participant _setOp_(final String operator, final Participant.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final Participant.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }
  
  public Participant _clearOp_(final Participant.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }
  
  public Participant _setOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }
  
  public Participant _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final Participant.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }
  
  public Participant _setNullOp_(final Participant.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }
  
  public Participant _setNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
}
