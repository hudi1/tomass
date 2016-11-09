package org.tahom.repository.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.sqlproc.engine.annotation.Pojo;
import org.tahom.repository.model.Player;
import org.tahom.repository.model.PlayerGender;
import org.tahom.repository.model.Tournament;
import org.tahom.repository.model.UserRole;
import org.tahom.repository.type.model.Surname;

@Pojo
@SuppressWarnings("all")
public class User extends Player implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_EMAIL = "EMAIL";
  
  public final static String ORDER_BY_LOGIN = "LOGIN";
  
  public User() {
  }
  
  public User(final String name, final Surname surname, final PlayerGender gender, final String nameAscii, final String surnameAscii, final Boolean verification, final String email, final String login, final String password, final UserRole role, final Boolean validity) {
    super(name,surname,gender,nameAscii,surnameAscii,verification);
    setEmail(email);
    setLogin(login);
    setPassword(password);
    setRole(role);
    setValidity(validity);
  }
  
  private String email;
  
  public String getEmail() {
    return this.email;
  }
  
  public void setEmail(final String email) {
    this.email = email;
  }
  
  public User _setEmail(final String email) {
    this.email = email;
    return this;
  }
  
  private String login;
  
  public String getLogin() {
    return this.login;
  }
  
  public void setLogin(final String login) {
    this.login = login;
  }
  
  public User _setLogin(final String login) {
    this.login = login;
    return this;
  }
  
  private String password;
  
  public String getPassword() {
    return this.password;
  }
  
  public void setPassword(final String password) {
    this.password = password;
  }
  
  public User _setPassword(final String password) {
    this.password = password;
    return this;
  }
  
  private String phone;
  
  public String getPhone() {
    return this.phone;
  }
  
  public void setPhone(final String phone) {
    this.phone = phone;
  }
  
  public User _setPhone(final String phone) {
    this.phone = phone;
    return this;
  }
  
  private UserRole role;
  
  public UserRole getRole() {
    return this.role;
  }
  
  public void setRole(final UserRole role) {
    this.role = role;
  }
  
  public User _setRole(final UserRole role) {
    this.role = role;
    return this;
  }
  
  private Boolean validity;
  
  public Boolean getValidity() {
    return this.validity;
  }
  
  public void setValidity(final Boolean validity) {
    this.validity = validity;
  }
  
  public User _setValidity(final Boolean validity) {
    this.validity = validity;
    return this;
  }
  
  private List<Tournament> administeredTournament = new java.util.ArrayList<Tournament>();
  
  public List<Tournament> getAdministeredTournament() {
    return this.administeredTournament;
  }
  
  public void setAdministeredTournament(final List<Tournament> administeredTournament) {
    this.administeredTournament = administeredTournament;
  }
  
  public User _setAdministeredTournament(final List<Tournament> administeredTournament) {
    this.administeredTournament = administeredTournament;
    return this;
  }
  
  @Override
  public String toString() {
    return "User [email=" + email + ", login=" + login + ", password=" + password + ", phone=" + phone + ", role=" + role + ", validity=" + validity + "]";
  }
  
  public String toStringFull() {
    return "User [email=" + email + ", login=" + login + ", password=" + password + ", phone=" + phone + ", role=" + role + ", validity=" + validity + ", administeredTournament=" + administeredTournament + "]";
  }
  
  public enum Attribute {
    phone,
    
    nickname,
    
    dateOfBirth,
    
    country,
    
    city,
    
    club,
    
    worldRanking,
    
    ithfId;
  }
  
  private Set<String> nullValues_ =  new java.util.HashSet<String>();
  
  public void setNull_(final User.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.add(attribute.name());
  }
  
  public User _setNull_(final User.Attribute... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final User.Attribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (Attribute attribute : attributes)
    	nullValues_.remove(attribute.name());
  }
  
  public User _clearNull_(final User.Attribute... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public void setNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.add(attribute);
  }
  
  public User _setNull_(final String... attributes) {
    setNull_(attributes);
    return this;
  }
  
  public void clearNull_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	nullValues_.remove(attribute);
  }
  
  public User _clearNull_(final String... attributes) {
    clearNull_(attributes);
    return this;
  }
  
  public Boolean isNull_(final User.Attribute attribute) {
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
    administeredTournament,
    
    ithfTournaments,
    
    matchs,
    
    participants;
  }
  
  private Set<String> initAssociations_ =  new java.util.HashSet<String>();
  
  public Set<String> getInitAssociations_() {
    return this.initAssociations_;
  }
  
  public void setInitAssociations_(final Set<String> initAssociations_) {
    this.initAssociations_ = initAssociations_;
  }
  
  public void setInit_(final User.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.add(association.name());
  }
  
  public User _setInit_(final User.Association... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final User.Association... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (Association association : associations)
    	initAssociations_.remove(association.name());
  }
  
  public User _clearInit_(final User.Association... associations) {
    clearInit_(associations);
    return this;
  }
  
  public void setInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.add(association);
  }
  
  public User _setInit_(final String... associations) {
    setInit_(associations);
    return this;
  }
  
  public void clearInit_(final String... associations) {
    if (associations == null)
    	throw new IllegalArgumentException();
    for (String association : associations)
    	initAssociations_.remove(association);
  }
  
  public User _clearInit_(final String... associations) {
    clearInit_(associations);
    return this;
  }
  
  public Boolean toInit_(final User.Association association) {
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
    email,
    
    login,
    
    password,
    
    phone,
    
    role,
    
    validity,
    
    administeredTournament;
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
  
  public void setOp_(final String operator, final User.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }
  
  public User _setOp_(final String operator, final User.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final User.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }
  
  public User _clearOp_(final User.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }
  
  public User _setOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }
  
  public User _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final User.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }
  
  public User _setNullOp_(final User.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }
  
  public User _setNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
}
