package org.tahom.repository.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.tahom.repository.model.Participant;
import org.tahom.repository.model.PlayingFormat;
import org.tahom.repository.model.Stage;
import org.tahom.repository.model.TournamentStatus;
import org.tahom.repository.model.User;

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
  
  private String country;
  
  public String getCountry() {
    return this.country;
  }
  
  public void setCountry(final String country) {
    this.country = country;
  }
  
  public Tournament _setCountry(final String country) {
    this.country = country;
    return this;
  }
  
  private String city;
  
  public String getCity() {
    return this.city;
  }
  
  public void setCity(final String city) {
    this.city = city;
  }
  
  public Tournament _setCity(final String city) {
    this.city = city;
    return this;
  }
  
  private String address;
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(final String address) {
    this.address = address;
  }
  
  public Tournament _setAddress(final String address) {
    this.address = address;
    return this;
  }
  
  private byte[] logo;
  
  public byte[] getLogo() {
    return this.logo;
  }
  
  public void setLogo(final byte[] logo) {
    this.logo = logo;
  }
  
  public Tournament _setLogo(final byte[] logo) {
    this.logo = logo;
    return this;
  }
  
  private LocalDateTime registrationFrom;
  
  public LocalDateTime getRegistrationFrom() {
    return this.registrationFrom;
  }
  
  public void setRegistrationFrom(final LocalDateTime registrationFrom) {
    this.registrationFrom = registrationFrom;
  }
  
  public Tournament _setRegistrationFrom(final LocalDateTime registrationFrom) {
    this.registrationFrom = registrationFrom;
    return this;
  }
  
  private LocalDate tournamentDate;
  
  public LocalDate getTournamentDate() {
    return this.tournamentDate;
  }
  
  public void setTournamentDate(final LocalDate tournamentDate) {
    this.tournamentDate = tournamentDate;
  }
  
  public Tournament _setTournamentDate(final LocalDate tournamentDate) {
    this.tournamentDate = tournamentDate;
    return this;
  }
  
  private LocalDateTime registrationTo;
  
  public LocalDateTime getRegistrationTo() {
    return this.registrationTo;
  }
  
  public void setRegistrationTo(final LocalDateTime registrationTo) {
    this.registrationTo = registrationTo;
  }
  
  public Tournament _setRegistrationTo(final LocalDateTime registrationTo) {
    this.registrationTo = registrationTo;
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
  
  private List<User> admin = new java.util.ArrayList<User>();
  
  public List<User> getAdmin() {
    return this.admin;
  }
  
  public void setAdmin(final List<User> admin) {
    this.admin = admin;
  }
  
  public Tournament _setAdmin(final List<User> admin) {
    this.admin = admin;
    return this;
  }
  
  private List<Participant> participants = new java.util.ArrayList<Participant>();
  
  public List<Participant> getParticipants() {
    return this.participants;
  }
  
  public void setParticipants(final List<Participant> participants) {
    this.participants = participants;
  }
  
  public Tournament _setParticipants(final List<Participant> participants) {
    this.participants = participants;
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
    return "Tournament [id=" + id + ", name=" + name + ", status=" + status + ", country=" + country + ", city=" + city + ", address=" + address + ", logo=" + logo + ", registrationFrom=" + registrationFrom + ", tournamentDate=" + tournamentDate + ", registrationTo=" + registrationTo + ", visible=" + visible + "]";
  }
  
  public String toStringFull() {
    return "Tournament [id=" + id + ", name=" + name + ", status=" + status + ", playingFormat=" + playingFormat + ", country=" + country + ", city=" + city + ", address=" + address + ", logo=" + logo + ", registrationFrom=" + registrationFrom + ", tournamentDate=" + tournamentDate + ", registrationTo=" + registrationTo + ", visible=" + visible + ", admin=" + admin + ", participants=" + participants + ", stages=" + stages + ", onlyIds_=" + onlyIds_ + ", ids_=" + ids_ + "]";
  }
  
  public enum Attribute {
    playingFormat,
    
    country,
    
    city,
    
    address,
    
    logo,
    
    registrationFrom,
    
    tournamentDate,
    
    registrationTo;
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
    
    admin,
    
    participants,
    
    stages;
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
    
    country,
    
    city,
    
    address,
    
    logo,
    
    registrationFrom,
    
    tournamentDate,
    
    registrationTo,
    
    visible,
    
    admin,
    
    participants,
    
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
