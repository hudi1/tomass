package org.tahom.repository.dao.impl;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.tahom.repository.dao.GroupParticipantDao;
import org.tahom.repository.model.GroupParticipant;

@SuppressWarnings("all")
public class GroupParticipantDaoImpl implements GroupParticipantDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public GroupParticipantDaoImpl() {
  }
  
  public GroupParticipantDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public GroupParticipantDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public GroupParticipant insert(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert groupParticipant: " + groupParticipant + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertGroupParticipant = sqlEngineFactory.getCheckedCrudEngine("INSERT_GROUP_PARTICIPANT");
    int count = sqlInsertGroupParticipant.insert(sqlSession, groupParticipant, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert groupParticipant result: " + count + " " + groupParticipant);
    }
    return (count > 0) ? groupParticipant : null;
  }
  
  public GroupParticipant insert(final GroupParticipant groupParticipant, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), groupParticipant, sqlControl);
  }
  
  public GroupParticipant insert(final SqlSession sqlSession, final GroupParticipant groupParticipant) {
    return insert(sqlSession, groupParticipant, null);
  }
  
  public GroupParticipant insert(final GroupParticipant groupParticipant) {
    return insert(groupParticipant, null);
  }
  
  public GroupParticipant get(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + groupParticipant + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineGroupParticipant = sqlEngineFactory.getCheckedCrudEngine("GET_GROUP_PARTICIPANT");
    //sqlControl = getMoreResultClasses(groupParticipant, sqlControl);
    GroupParticipant groupParticipantGot = sqlGetEngineGroupParticipant.get(sqlSession, GroupParticipant.class, groupParticipant, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get groupParticipant result: " + groupParticipantGot);
    }
    return groupParticipantGot;
  }
  
  public GroupParticipant get(final GroupParticipant groupParticipant, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), groupParticipant, sqlControl);
  }
  
  public GroupParticipant get(final SqlSession sqlSession, final GroupParticipant groupParticipant) {
    return get(sqlSession, groupParticipant, null);
  }
  
  public GroupParticipant get(final GroupParticipant groupParticipant) {
    return get(groupParticipant, null);
  }
  
  public int update(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update groupParticipant: " + groupParticipant + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineGroupParticipant = sqlEngineFactory.getCheckedCrudEngine("UPDATE_GROUP_PARTICIPANT");
    int count = sqlUpdateEngineGroupParticipant.update(sqlSession, groupParticipant, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update groupParticipant result count: " + count);
    }
    return count;
  }
  
  public int update(final GroupParticipant groupParticipant, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), groupParticipant, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final GroupParticipant groupParticipant) {
    return update(sqlSession, groupParticipant, null);
  }
  
  public int update(final GroupParticipant groupParticipant) {
    return update(groupParticipant, null);
  }
  
  public int delete(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete groupParticipant: " + groupParticipant + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineGroupParticipant = sqlEngineFactory.getCheckedCrudEngine("DELETE_GROUP_PARTICIPANT");
    int count = sqlDeleteEngineGroupParticipant.delete(sqlSession, groupParticipant, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete groupParticipant result count: " + count);
    }
    return count;
  }
  
  public int delete(final GroupParticipant groupParticipant, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), groupParticipant, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final GroupParticipant groupParticipant) {
    return delete(sqlSession, groupParticipant, null);
  }
  
  public int delete(final GroupParticipant groupParticipant) {
    return delete(groupParticipant, null);
  }
  
  public List<GroupParticipant> list(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list groupParticipant: " + groupParticipant + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineGroupParticipant = sqlEngineFactory.getCheckedQueryEngine("SELECT_GROUP_PARTICIPANT");
    //sqlControl = getMoreResultClasses(groupParticipant, sqlControl);
    List<GroupParticipant> groupParticipantList = sqlEngineGroupParticipant.query(sqlSession, GroupParticipant.class, groupParticipant, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list groupParticipant size: " + ((groupParticipantList != null) ? groupParticipantList.size() : "null"));
    }
    return groupParticipantList;
  }
  
  public List<GroupParticipant> list(final GroupParticipant groupParticipant, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), groupParticipant, sqlControl);
  }
  
  public List<GroupParticipant> list(final SqlSession sqlSession, final GroupParticipant groupParticipant) {
    return list(sqlSession, groupParticipant, null);
  }
  
  public List<GroupParticipant> list(final GroupParticipant groupParticipant) {
    return list(groupParticipant, null);
  }
  
  public int query(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl, final SqlRowProcessor<GroupParticipant> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query groupParticipant: " + groupParticipant + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineGroupParticipant = sqlEngineFactory.getCheckedQueryEngine("SELECT_GROUP_PARTICIPANT");
    //sqlControl = getMoreResultClasses(groupParticipant, sqlControl);
    int rownums = sqlEngineGroupParticipant.query(sqlSession, GroupParticipant.class, groupParticipant, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query groupParticipant size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final GroupParticipant groupParticipant, SqlControl sqlControl, final SqlRowProcessor<GroupParticipant> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), groupParticipant, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final GroupParticipant groupParticipant, final SqlRowProcessor<GroupParticipant> sqlRowProcessor) {
    return query(sqlSession, groupParticipant, null, sqlRowProcessor);
  }
  
  public int query(final GroupParticipant groupParticipant, final SqlRowProcessor<GroupParticipant> sqlRowProcessor) {
    return query(groupParticipant, null, sqlRowProcessor);
  }
  
  public List<GroupParticipant> listFromTo(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl) {
    if (sqlControl == null || sqlControl.getFirstResult() == null || sqlControl.getMaxResults() == null || groupParticipant == null)
    	return list(sqlSession, groupParticipant, sqlControl);
    
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list groupParticipant: " + groupParticipant + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineGroupParticipant = sqlEngineFactory.getCheckedQueryEngine("SELECT_GROUP_PARTICIPANT");
    //sqlControl = getMoreResultClasses(groupParticipant, sqlControl);
    groupParticipant.setOnlyIds_(true);
    java.util.Set<String> initAssociations = groupParticipant.getInitAssociations_();
    groupParticipant.setInitAssociations_(new java.util.HashSet<String>());
    final java.util.List<java.lang.Integer> ids_ = sqlEngineGroupParticipant.query(sqlSession, java.lang.Integer.class, groupParticipant, sqlControl);
    groupParticipant.setInitAssociations_(initAssociations);
    
    List<GroupParticipant> groupParticipantList = new java.util.ArrayList<GroupParticipant>();
    if (!ids_.isEmpty()) {
    	org.sqlproc.engine.impl.SqlStandardControl sqlc = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	sqlc.setFirstResult(0);
    	sqlc.setMaxResults(0);
    	sqlc.setOrder(null);
    	final Map<java.lang.Integer, GroupParticipant> map = new java.util.HashMap<java.lang.Integer, GroupParticipant>();
    	final SqlRowProcessor<GroupParticipant> sqlRowProcessor = new SqlRowProcessor<GroupParticipant>() {
    		@Override
    		public boolean processRow(GroupParticipant result, int rownum) throws org.sqlproc.engine.SqlRuntimeException {
    			map.put(result.getId(), result);
    			return true;
    		}
    	};
    	sqlEngineGroupParticipant.query(sqlSession, GroupParticipant.class, new GroupParticipant()._setIds_(ids_), sqlc, sqlRowProcessor);
    	for (java.lang.Integer id : ids_)
    		groupParticipantList.add(map.get(id));
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list groupParticipant size: " + ((groupParticipantList != null) ? groupParticipantList.size() : "null"));
    }
    return groupParticipantList;
  }
  
  public List<GroupParticipant> listFromTo(final GroupParticipant groupParticipant, SqlControl sqlControl) {
    return listFromTo(sqlSessionFactory.getSqlSession(), groupParticipant, sqlControl);
  }
  
  public List<GroupParticipant> listFromTo(final SqlSession sqlSession, final GroupParticipant groupParticipant) {
    return listFromTo(sqlSession, groupParticipant, null);
  }
  
  public List<GroupParticipant> listFromTo(final GroupParticipant groupParticipant) {
    return listFromTo(groupParticipant, null);
  }
  
  public int count(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count groupParticipant: " + groupParticipant + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineGroupParticipant = sqlEngineFactory.getCheckedQueryEngine("SELECT_GROUP_PARTICIPANT");
    //sqlControl = getMoreResultClasses(groupParticipant, sqlControl);
    int count = sqlEngineGroupParticipant.queryCount(sqlSession, groupParticipant, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final GroupParticipant groupParticipant, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), groupParticipant, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final GroupParticipant groupParticipant) {
    return count(sqlSession, groupParticipant, null);
  }
  
  public int count(final GroupParticipant groupParticipant) {
    return count(groupParticipant, null);
  }
}
