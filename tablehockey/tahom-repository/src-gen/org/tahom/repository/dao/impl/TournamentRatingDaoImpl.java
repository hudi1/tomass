package org.tahom.repository.dao.impl;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.tahom.repository.dao.TournamentRatingDao;
import org.tahom.repository.model.TournamentRating;

@SuppressWarnings("all")
public class TournamentRatingDaoImpl implements TournamentRatingDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public TournamentRatingDaoImpl() {
  }
  
  public TournamentRatingDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public TournamentRatingDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public TournamentRating insert(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert tournamentRating: " + tournamentRating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertTournamentRating = sqlEngineFactory.getCheckedCrudEngine("INSERT_TOURNAMENT_RATING");
    int count = sqlInsertTournamentRating.insert(sqlSession, tournamentRating, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert tournamentRating result: " + count + " " + tournamentRating);
    }
    return (count > 0) ? tournamentRating : null;
  }
  
  public TournamentRating insert(final TournamentRating tournamentRating, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), tournamentRating, sqlControl);
  }
  
  public TournamentRating insert(final SqlSession sqlSession, final TournamentRating tournamentRating) {
    return insert(sqlSession, tournamentRating, null);
  }
  
  public TournamentRating insert(final TournamentRating tournamentRating) {
    return insert(tournamentRating, null);
  }
  
  public TournamentRating get(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + tournamentRating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineTournamentRating = sqlEngineFactory.getCheckedCrudEngine("GET_TOURNAMENT_RATING");
    //sqlControl = getMoreResultClasses(tournamentRating, sqlControl);
    TournamentRating tournamentRatingGot = sqlGetEngineTournamentRating.get(sqlSession, TournamentRating.class, tournamentRating, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get tournamentRating result: " + tournamentRatingGot);
    }
    return tournamentRatingGot;
  }
  
  public TournamentRating get(final TournamentRating tournamentRating, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), tournamentRating, sqlControl);
  }
  
  public TournamentRating get(final SqlSession sqlSession, final TournamentRating tournamentRating) {
    return get(sqlSession, tournamentRating, null);
  }
  
  public TournamentRating get(final TournamentRating tournamentRating) {
    return get(tournamentRating, null);
  }
  
  public int update(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update tournamentRating: " + tournamentRating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineTournamentRating = sqlEngineFactory.getCheckedCrudEngine("UPDATE_TOURNAMENT_RATING");
    int count = sqlUpdateEngineTournamentRating.update(sqlSession, tournamentRating, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update tournamentRating result count: " + count);
    }
    return count;
  }
  
  public int update(final TournamentRating tournamentRating, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), tournamentRating, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final TournamentRating tournamentRating) {
    return update(sqlSession, tournamentRating, null);
  }
  
  public int update(final TournamentRating tournamentRating) {
    return update(tournamentRating, null);
  }
  
  public int delete(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete tournamentRating: " + tournamentRating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineTournamentRating = sqlEngineFactory.getCheckedCrudEngine("DELETE_TOURNAMENT_RATING");
    int count = sqlDeleteEngineTournamentRating.delete(sqlSession, tournamentRating, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete tournamentRating result count: " + count);
    }
    return count;
  }
  
  public int delete(final TournamentRating tournamentRating, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), tournamentRating, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final TournamentRating tournamentRating) {
    return delete(sqlSession, tournamentRating, null);
  }
  
  public int delete(final TournamentRating tournamentRating) {
    return delete(tournamentRating, null);
  }
  
  public List<TournamentRating> list(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list tournamentRating: " + tournamentRating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineTournamentRating = sqlEngineFactory.getCheckedQueryEngine("SELECT_TOURNAMENT_RATING");
    //sqlControl = getMoreResultClasses(tournamentRating, sqlControl);
    List<TournamentRating> tournamentRatingList = sqlEngineTournamentRating.query(sqlSession, TournamentRating.class, tournamentRating, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list tournamentRating size: " + ((tournamentRatingList != null) ? tournamentRatingList.size() : "null"));
    }
    return tournamentRatingList;
  }
  
  public List<TournamentRating> list(final TournamentRating tournamentRating, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), tournamentRating, sqlControl);
  }
  
  public List<TournamentRating> list(final SqlSession sqlSession, final TournamentRating tournamentRating) {
    return list(sqlSession, tournamentRating, null);
  }
  
  public List<TournamentRating> list(final TournamentRating tournamentRating) {
    return list(tournamentRating, null);
  }
  
  public int query(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl, final SqlRowProcessor<TournamentRating> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query tournamentRating: " + tournamentRating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineTournamentRating = sqlEngineFactory.getCheckedQueryEngine("SELECT_TOURNAMENT_RATING");
    //sqlControl = getMoreResultClasses(tournamentRating, sqlControl);
    int rownums = sqlEngineTournamentRating.query(sqlSession, TournamentRating.class, tournamentRating, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query tournamentRating size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final TournamentRating tournamentRating, SqlControl sqlControl, final SqlRowProcessor<TournamentRating> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), tournamentRating, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final TournamentRating tournamentRating, final SqlRowProcessor<TournamentRating> sqlRowProcessor) {
    return query(sqlSession, tournamentRating, null, sqlRowProcessor);
  }
  
  public int query(final TournamentRating tournamentRating, final SqlRowProcessor<TournamentRating> sqlRowProcessor) {
    return query(tournamentRating, null, sqlRowProcessor);
  }
  
  public List<TournamentRating> listFromTo(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl) {
    if (sqlControl == null || sqlControl.getFirstResult() == null || sqlControl.getMaxResults() == null || tournamentRating == null)
    	return list(sqlSession, tournamentRating, sqlControl);
    
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list tournamentRating: " + tournamentRating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineTournamentRating = sqlEngineFactory.getCheckedQueryEngine("SELECT_TOURNAMENT_RATING");
    //sqlControl = getMoreResultClasses(tournamentRating, sqlControl);
    tournamentRating.setOnlyIds_(true);
    java.util.Set<String> initAssociations = tournamentRating.getInitAssociations_();
    tournamentRating.setInitAssociations_(new java.util.HashSet<String>());
    final java.util.List<java.lang.Integer> ids_ = sqlEngineTournamentRating.query(sqlSession, java.lang.Integer.class, tournamentRating, sqlControl);
    tournamentRating.setInitAssociations_(initAssociations);
    
    List<TournamentRating> tournamentRatingList = new java.util.ArrayList<TournamentRating>();
    if (!ids_.isEmpty()) {
    	org.sqlproc.engine.impl.SqlStandardControl sqlc = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	sqlc.setFirstResult(0);
    	sqlc.setMaxResults(0);
    	sqlc.setOrder(null);
    	final Map<java.lang.Integer, TournamentRating> map = new java.util.HashMap<java.lang.Integer, TournamentRating>();
    	final SqlRowProcessor<TournamentRating> sqlRowProcessor = new SqlRowProcessor<TournamentRating>() {
    		@Override
    		public boolean processRow(TournamentRating result, int rownum) throws org.sqlproc.engine.SqlRuntimeException {
    			map.put(result.getId(), result);
    			return true;
    		}
    	};
    	sqlEngineTournamentRating.query(sqlSession, TournamentRating.class, new TournamentRating()._setIds_(ids_), sqlc, sqlRowProcessor);
    	for (java.lang.Integer id : ids_)
    		tournamentRatingList.add(map.get(id));
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list tournamentRating size: " + ((tournamentRatingList != null) ? tournamentRatingList.size() : "null"));
    }
    return tournamentRatingList;
  }
  
  public List<TournamentRating> listFromTo(final TournamentRating tournamentRating, SqlControl sqlControl) {
    return listFromTo(sqlSessionFactory.getSqlSession(), tournamentRating, sqlControl);
  }
  
  public List<TournamentRating> listFromTo(final SqlSession sqlSession, final TournamentRating tournamentRating) {
    return listFromTo(sqlSession, tournamentRating, null);
  }
  
  public List<TournamentRating> listFromTo(final TournamentRating tournamentRating) {
    return listFromTo(tournamentRating, null);
  }
  
  public int count(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count tournamentRating: " + tournamentRating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineTournamentRating = sqlEngineFactory.getCheckedQueryEngine("SELECT_TOURNAMENT_RATING");
    //sqlControl = getMoreResultClasses(tournamentRating, sqlControl);
    int count = sqlEngineTournamentRating.queryCount(sqlSession, tournamentRating, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final TournamentRating tournamentRating, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), tournamentRating, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final TournamentRating tournamentRating) {
    return count(sqlSession, tournamentRating, null);
  }
  
  public int count(final TournamentRating tournamentRating) {
    return count(tournamentRating, null);
  }
}
