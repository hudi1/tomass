package org.tahom.repository.model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import org.sqlproc.engine.annotation.Pojo;

@Pojo
@SuppressWarnings("all")
public class TournamentAdmin implements Serializable {
  private final static long serialVersionUID = 1L;
  
  public final static String ORDER_BY_ID = "ID";
  
  public final static String ORDER_BY_TOURNAMENT_ID = "TOURNAMENT_ID";
  
  public final static String ORDER_BY_USER_ID = "USER_ID";
  
  public TournamentAdmin() {
  }
  
  public TournamentAdmin(final Integer tournamentId, final Integer userId) {
    super();
    setTournamentId(tournamentId);
    setUserId(userId);
  }
  
  private Integer id;
  
  public Integer getId() {
    return this.id;
  }
  
  public void setId(final Integer id) {
    this.id = id;
  }
  
  public TournamentAdmin _setId(final Integer id) {
    this.id = id;
    return this;
  }
  
  private Integer tournamentId;
  
  public Integer getTournamentId() {
    return this.tournamentId;
  }
  
  public void setTournamentId(final Integer tournamentId) {
    this.tournamentId = tournamentId;
  }
  
  public TournamentAdmin _setTournamentId(final Integer tournamentId) {
    this.tournamentId = tournamentId;
    return this;
  }
  
  private Integer userId;
  
  public Integer getUserId() {
    return this.userId;
  }
  
  public void setUserId(final Integer userId) {
    this.userId = userId;
  }
  
  public TournamentAdmin _setUserId(final Integer userId) {
    this.userId = userId;
    return this;
  }
  
  private boolean onlyIds_;
  
  public boolean isOnlyIds_() {
    return this.onlyIds_;
  }
  
  public void setOnlyIds_(final boolean onlyIds_) {
    this.onlyIds_ = onlyIds_;
  }
  
  public TournamentAdmin _setOnlyIds_(final boolean onlyIds_) {
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
  
  public TournamentAdmin _setIds_(final List<Integer> ids_) {
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
    TournamentAdmin other = (TournamentAdmin) obj;
    if (id == null || !id.equals(other.id))
    	return false;
    return true;
  }
  
  @Override
  public String toString() {
    return "TournamentAdmin [id=" + id + ", tournamentId=" + tournamentId + ", userId=" + userId + "]";
  }
  
  public String toStringFull() {
    return "TournamentAdmin [id=" + id + ", tournamentId=" + tournamentId + ", userId=" + userId + ", onlyIds_=" + onlyIds_ + ", ids_=" + ids_ + "]";
  }
  
  public enum OpAttribute {
    id,
    
    tournamentId,
    
    userId,
    
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
  
  public void setOp_(final String operator, final TournamentAdmin.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), operator);
  }
  
  public TournamentAdmin _setOp_(final String operator, final TournamentAdmin.OpAttribute... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final TournamentAdmin.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.remove(attribute.name());
  }
  
  public TournamentAdmin _clearOp_(final TournamentAdmin.OpAttribute... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setOp_(final String operator, final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, operator);
  }
  
  public TournamentAdmin _setOp_(final String operator, final String... attributes) {
    setOp_(operator, attributes);
    return this;
  }
  
  public void clearOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.remove(attribute);
  }
  
  public TournamentAdmin _clearOp_(final String... attributes) {
    clearOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final TournamentAdmin.OpAttribute... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (OpAttribute attribute : attributes)
    	operators_.put(attribute.name(), "is null");
  }
  
  public TournamentAdmin _setNullOp_(final TournamentAdmin.OpAttribute... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void setNullOp_(final String... attributes) {
    if (attributes == null)
    	throw new IllegalArgumentException();
    for (String attribute : attributes)
    	operators_.put(attribute, "is null");
  }
  
  public TournamentAdmin _setNullOp_(final String... attributes) {
    setNullOp_(attributes);
    return this;
  }
  
  public void clearAllOps_() {
    operators_ = new java.util.HashMap<String, String>();
  }
}
