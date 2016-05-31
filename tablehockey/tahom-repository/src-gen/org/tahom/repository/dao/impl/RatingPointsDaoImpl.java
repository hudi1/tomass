package org.tahom.repository.dao.impl;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.tahom.repository.dao.RatingPointsDao;
import org.tahom.repository.model.RatingPoints;

@SuppressWarnings("all")
public class RatingPointsDaoImpl implements RatingPointsDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public RatingPointsDaoImpl() {
  }
  
  public RatingPointsDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public RatingPointsDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public RatingPoints insert(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert ratingPoints: " + ratingPoints + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertRatingPoints = sqlEngineFactory.getCheckedCrudEngine("INSERT_RATING_POINTS");
    int count = sqlInsertRatingPoints.insert(sqlSession, ratingPoints, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert ratingPoints result: " + count + " " + ratingPoints);
    }
    return (count > 0) ? ratingPoints : null;
  }
  
  public RatingPoints insert(final RatingPoints ratingPoints, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), ratingPoints, sqlControl);
  }
  
  public RatingPoints insert(final SqlSession sqlSession, final RatingPoints ratingPoints) {
    return insert(sqlSession, ratingPoints, null);
  }
  
  public RatingPoints insert(final RatingPoints ratingPoints) {
    return insert(ratingPoints, null);
  }
  
  public RatingPoints get(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + ratingPoints + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineRatingPoints = sqlEngineFactory.getCheckedCrudEngine("GET_RATING_POINTS");
    //sqlControl = getMoreResultClasses(ratingPoints, sqlControl);
    RatingPoints ratingPointsGot = sqlGetEngineRatingPoints.get(sqlSession, RatingPoints.class, ratingPoints, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get ratingPoints result: " + ratingPointsGot);
    }
    return ratingPointsGot;
  }
  
  public RatingPoints get(final RatingPoints ratingPoints, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), ratingPoints, sqlControl);
  }
  
  public RatingPoints get(final SqlSession sqlSession, final RatingPoints ratingPoints) {
    return get(sqlSession, ratingPoints, null);
  }
  
  public RatingPoints get(final RatingPoints ratingPoints) {
    return get(ratingPoints, null);
  }
  
  public int update(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update ratingPoints: " + ratingPoints + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineRatingPoints = sqlEngineFactory.getCheckedCrudEngine("UPDATE_RATING_POINTS");
    int count = sqlUpdateEngineRatingPoints.update(sqlSession, ratingPoints, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update ratingPoints result count: " + count);
    }
    return count;
  }
  
  public int update(final RatingPoints ratingPoints, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), ratingPoints, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final RatingPoints ratingPoints) {
    return update(sqlSession, ratingPoints, null);
  }
  
  public int update(final RatingPoints ratingPoints) {
    return update(ratingPoints, null);
  }
  
  public int delete(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete ratingPoints: " + ratingPoints + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineRatingPoints = sqlEngineFactory.getCheckedCrudEngine("DELETE_RATING_POINTS");
    int count = sqlDeleteEngineRatingPoints.delete(sqlSession, ratingPoints, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete ratingPoints result count: " + count);
    }
    return count;
  }
  
  public int delete(final RatingPoints ratingPoints, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), ratingPoints, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final RatingPoints ratingPoints) {
    return delete(sqlSession, ratingPoints, null);
  }
  
  public int delete(final RatingPoints ratingPoints) {
    return delete(ratingPoints, null);
  }
  
  public List<RatingPoints> list(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list ratingPoints: " + ratingPoints + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineRatingPoints = sqlEngineFactory.getCheckedQueryEngine("SELECT_RATING_POINTS");
    //sqlControl = getMoreResultClasses(ratingPoints, sqlControl);
    List<RatingPoints> ratingPointsList = sqlEngineRatingPoints.query(sqlSession, RatingPoints.class, ratingPoints, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list ratingPoints size: " + ((ratingPointsList != null) ? ratingPointsList.size() : "null"));
    }
    return ratingPointsList;
  }
  
  public List<RatingPoints> list(final RatingPoints ratingPoints, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), ratingPoints, sqlControl);
  }
  
  public List<RatingPoints> list(final SqlSession sqlSession, final RatingPoints ratingPoints) {
    return list(sqlSession, ratingPoints, null);
  }
  
  public List<RatingPoints> list(final RatingPoints ratingPoints) {
    return list(ratingPoints, null);
  }
  
  public int query(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl, final SqlRowProcessor<RatingPoints> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query ratingPoints: " + ratingPoints + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineRatingPoints = sqlEngineFactory.getCheckedQueryEngine("SELECT_RATING_POINTS");
    //sqlControl = getMoreResultClasses(ratingPoints, sqlControl);
    int rownums = sqlEngineRatingPoints.query(sqlSession, RatingPoints.class, ratingPoints, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query ratingPoints size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final RatingPoints ratingPoints, SqlControl sqlControl, final SqlRowProcessor<RatingPoints> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), ratingPoints, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final RatingPoints ratingPoints, final SqlRowProcessor<RatingPoints> sqlRowProcessor) {
    return query(sqlSession, ratingPoints, null, sqlRowProcessor);
  }
  
  public int query(final RatingPoints ratingPoints, final SqlRowProcessor<RatingPoints> sqlRowProcessor) {
    return query(ratingPoints, null, sqlRowProcessor);
  }
  
  public List<RatingPoints> listFromTo(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl) {
    if (sqlControl == null || sqlControl.getFirstResult() == null || sqlControl.getMaxResults() == null || ratingPoints == null)
    	return list(sqlSession, ratingPoints, sqlControl);
    
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list ratingPoints: " + ratingPoints + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineRatingPoints = sqlEngineFactory.getCheckedQueryEngine("SELECT_RATING_POINTS");
    //sqlControl = getMoreResultClasses(ratingPoints, sqlControl);
    ratingPoints.setOnlyIds_(true);
    java.util.Set<String> initAssociations = ratingPoints.getInitAssociations_();
    ratingPoints.setInitAssociations_(new java.util.HashSet<String>());
    final java.util.List<java.lang.Integer> ids_ = sqlEngineRatingPoints.query(sqlSession, java.lang.Integer.class, ratingPoints, sqlControl);
    ratingPoints.setInitAssociations_(initAssociations);
    
    List<RatingPoints> ratingPointsList = new java.util.ArrayList<RatingPoints>();
    if (!ids_.isEmpty()) {
    	org.sqlproc.engine.impl.SqlStandardControl sqlc = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	sqlc.setFirstResult(0);
    	sqlc.setMaxResults(0);
    	sqlc.setOrder(null);
    	final Map<java.lang.Integer, RatingPoints> map = new java.util.HashMap<java.lang.Integer, RatingPoints>();
    	final SqlRowProcessor<RatingPoints> sqlRowProcessor = new SqlRowProcessor<RatingPoints>() {
    		@Override
    		public boolean processRow(RatingPoints result, int rownum) throws org.sqlproc.engine.SqlRuntimeException {
    			map.put(result.getId(), result);
    			return true;
    		}
    	};
    	sqlEngineRatingPoints.query(sqlSession, RatingPoints.class, new RatingPoints()._setIds_(ids_), sqlc, sqlRowProcessor);
    	for (java.lang.Integer id : ids_)
    		ratingPointsList.add(map.get(id));
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list ratingPoints size: " + ((ratingPointsList != null) ? ratingPointsList.size() : "null"));
    }
    return ratingPointsList;
  }
  
  public List<RatingPoints> listFromTo(final RatingPoints ratingPoints, SqlControl sqlControl) {
    return listFromTo(sqlSessionFactory.getSqlSession(), ratingPoints, sqlControl);
  }
  
  public List<RatingPoints> listFromTo(final SqlSession sqlSession, final RatingPoints ratingPoints) {
    return listFromTo(sqlSession, ratingPoints, null);
  }
  
  public List<RatingPoints> listFromTo(final RatingPoints ratingPoints) {
    return listFromTo(ratingPoints, null);
  }
  
  public int count(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count ratingPoints: " + ratingPoints + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineRatingPoints = sqlEngineFactory.getCheckedQueryEngine("SELECT_RATING_POINTS");
    //sqlControl = getMoreResultClasses(ratingPoints, sqlControl);
    int count = sqlEngineRatingPoints.queryCount(sqlSession, ratingPoints, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final RatingPoints ratingPoints, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), ratingPoints, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final RatingPoints ratingPoints) {
    return count(sqlSession, ratingPoints, null);
  }
  
  public int count(final RatingPoints ratingPoints) {
    return count(ratingPoints, null);
  }
}
