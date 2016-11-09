package org.tahom.repository.dao.impl;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.tahom.repository.dao.MatchsDao;
import org.tahom.repository.model.Matchs;
import org.tahom.repository.model.User;

@SuppressWarnings("all")
public class MatchsDaoImpl implements MatchsDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public MatchsDaoImpl() {
  }
  
  public MatchsDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public MatchsDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Matchs insert(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert matchs: " + matchs + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertMatchs = sqlEngineFactory.getCheckedCrudEngine("INSERT_MATCHS");
    int count = sqlInsertMatchs.insert(sqlSession, matchs, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert matchs result: " + count + " " + matchs);
    }
    return (count > 0) ? matchs : null;
  }
  
  public Matchs insert(final Matchs matchs, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), matchs, sqlControl);
  }
  
  public Matchs insert(final SqlSession sqlSession, final Matchs matchs) {
    return insert(sqlSession, matchs, null);
  }
  
  public Matchs insert(final Matchs matchs) {
    return insert(matchs, null);
  }
  
  public Matchs get(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + matchs + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineMatchs = sqlEngineFactory.getCheckedCrudEngine("GET_MATCHS");
    sqlControl = getMoreResultClasses(matchs, sqlControl);
    Matchs matchsGot = sqlGetEngineMatchs.get(sqlSession, Matchs.class, matchs, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get matchs result: " + matchsGot);
    }
    return matchsGot;
  }
  
  public Matchs get(final Matchs matchs, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), matchs, sqlControl);
  }
  
  public Matchs get(final SqlSession sqlSession, final Matchs matchs) {
    return get(sqlSession, matchs, null);
  }
  
  public Matchs get(final Matchs matchs) {
    return get(matchs, null);
  }
  
  public int update(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update matchs: " + matchs + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineMatchs = sqlEngineFactory.getCheckedCrudEngine("UPDATE_MATCHS");
    int count = sqlUpdateEngineMatchs.update(sqlSession, matchs, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update matchs result count: " + count);
    }
    return count;
  }
  
  public int update(final Matchs matchs, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), matchs, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Matchs matchs) {
    return update(sqlSession, matchs, null);
  }
  
  public int update(final Matchs matchs) {
    return update(matchs, null);
  }
  
  public int delete(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete matchs: " + matchs + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineMatchs = sqlEngineFactory.getCheckedCrudEngine("DELETE_MATCHS");
    int count = sqlDeleteEngineMatchs.delete(sqlSession, matchs, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete matchs result count: " + count);
    }
    return count;
  }
  
  public int delete(final Matchs matchs, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), matchs, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Matchs matchs) {
    return delete(sqlSession, matchs, null);
  }
  
  public int delete(final Matchs matchs) {
    return delete(matchs, null);
  }
  
  public List<Matchs> list(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list matchs: " + matchs + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineMatchs = sqlEngineFactory.getCheckedQueryEngine("SELECT_MATCHS");
    sqlControl = getMoreResultClasses(matchs, sqlControl);
    List<Matchs> matchsList = sqlEngineMatchs.query(sqlSession, Matchs.class, matchs, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list matchs size: " + ((matchsList != null) ? matchsList.size() : "null"));
    }
    return matchsList;
  }
  
  public List<Matchs> list(final Matchs matchs, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), matchs, sqlControl);
  }
  
  public List<Matchs> list(final SqlSession sqlSession, final Matchs matchs) {
    return list(sqlSession, matchs, null);
  }
  
  public List<Matchs> list(final Matchs matchs) {
    return list(matchs, null);
  }
  
  public int query(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl, final SqlRowProcessor<Matchs> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query matchs: " + matchs + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineMatchs = sqlEngineFactory.getCheckedQueryEngine("SELECT_MATCHS");
    sqlControl = getMoreResultClasses(matchs, sqlControl);
    int rownums = sqlEngineMatchs.query(sqlSession, Matchs.class, matchs, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query matchs size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final Matchs matchs, SqlControl sqlControl, final SqlRowProcessor<Matchs> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), matchs, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final Matchs matchs, final SqlRowProcessor<Matchs> sqlRowProcessor) {
    return query(sqlSession, matchs, null, sqlRowProcessor);
  }
  
  public int query(final Matchs matchs, final SqlRowProcessor<Matchs> sqlRowProcessor) {
    return query(matchs, null, sqlRowProcessor);
  }
  
  public List<Matchs> listFromTo(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl) {
    if (sqlControl == null || sqlControl.getFirstResult() == null || sqlControl.getMaxResults() == null || matchs == null)
    	return list(sqlSession, matchs, sqlControl);
    
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list matchs: " + matchs + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineMatchs = sqlEngineFactory.getCheckedQueryEngine("SELECT_MATCHS");
    sqlControl = getMoreResultClasses(matchs, sqlControl);
    matchs.setOnlyIds_(true);
    java.util.Set<String> initAssociations = matchs.getInitAssociations_();
    matchs.setInitAssociations_(new java.util.HashSet<String>());
    final java.util.List<java.lang.Integer> ids_ = sqlEngineMatchs.query(sqlSession, java.lang.Integer.class, matchs, sqlControl);
    matchs.setInitAssociations_(initAssociations);
    
    List<Matchs> matchsList = new java.util.ArrayList<Matchs>();
    if (!ids_.isEmpty()) {
    	org.sqlproc.engine.impl.SqlStandardControl sqlc = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	sqlc.setFirstResult(0);
    	sqlc.setMaxResults(0);
    	sqlc.setOrder(null);
    	final Map<java.lang.Integer, Matchs> map = new java.util.HashMap<java.lang.Integer, Matchs>();
    	final SqlRowProcessor<Matchs> sqlRowProcessor = new SqlRowProcessor<Matchs>() {
    		@Override
    		public boolean processRow(Matchs result, int rownum) throws org.sqlproc.engine.SqlRuntimeException {
    			map.put(result.getId(), result);
    			return true;
    		}
    	};
    	sqlEngineMatchs.query(sqlSession, Matchs.class, new Matchs()._setIds_(ids_), sqlc, sqlRowProcessor);
    	for (java.lang.Integer id : ids_)
    		matchsList.add(map.get(id));
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list matchs size: " + ((matchsList != null) ? matchsList.size() : "null"));
    }
    return matchsList;
  }
  
  public List<Matchs> listFromTo(final Matchs matchs, SqlControl sqlControl) {
    return listFromTo(sqlSessionFactory.getSqlSession(), matchs, sqlControl);
  }
  
  public List<Matchs> listFromTo(final SqlSession sqlSession, final Matchs matchs) {
    return listFromTo(sqlSession, matchs, null);
  }
  
  public List<Matchs> listFromTo(final Matchs matchs) {
    return listFromTo(matchs, null);
  }
  
  public int count(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count matchs: " + matchs + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineMatchs = sqlEngineFactory.getCheckedQueryEngine("SELECT_MATCHS");
    sqlControl = getMoreResultClasses(matchs, sqlControl);
    int count = sqlEngineMatchs.queryCount(sqlSession, matchs, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Matchs matchs, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), matchs, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Matchs matchs) {
    return count(sqlSession, matchs, null);
  }
  
  public int count(final Matchs matchs) {
    return count(matchs, null);
  }
  
  public SqlControl getMoreResultClasses(final Matchs matchs, SqlControl sqlControl) {
    if (sqlControl != null && sqlControl.getMoreResultClasses() != null)
    	return sqlControl;
    java.util.Map<String, Class<?>> moreResultClasses = null;
    if (matchs != null && matchs.toInit_(Matchs.Association.awayPlayer.name())) {
    	if (moreResultClasses == null)
    		moreResultClasses = new java.util.HashMap<String, Class<?>>();
    	moreResultClasses.put("user", User.class);
    }
    if (matchs != null && matchs.toInit_(Matchs.Association.homePlayer.name())) {
    	if (moreResultClasses == null)
    		moreResultClasses = new java.util.HashMap<String, Class<?>>();
    	moreResultClasses.put("user", User.class);
    }
    if (moreResultClasses != null) {
    	sqlControl = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	((org.sqlproc.engine.impl.SqlStandardControl) sqlControl).setMoreResultClasses(moreResultClasses);
    }
    return sqlControl;
  }
}
