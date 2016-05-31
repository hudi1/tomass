package org.tahom.repository.dao.impl;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.tahom.repository.dao.RatingDao;
import org.tahom.repository.model.Rating;

@SuppressWarnings("all")
public class RatingDaoImpl implements RatingDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public RatingDaoImpl() {
  }
  
  public RatingDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public RatingDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Rating insert(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert rating: " + rating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertRating = sqlEngineFactory.getCheckedCrudEngine("INSERT_RATING");
    int count = sqlInsertRating.insert(sqlSession, rating, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert rating result: " + count + " " + rating);
    }
    return (count > 0) ? rating : null;
  }
  
  public Rating insert(final Rating rating, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), rating, sqlControl);
  }
  
  public Rating insert(final SqlSession sqlSession, final Rating rating) {
    return insert(sqlSession, rating, null);
  }
  
  public Rating insert(final Rating rating) {
    return insert(rating, null);
  }
  
  public Rating get(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + rating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineRating = sqlEngineFactory.getCheckedCrudEngine("GET_RATING");
    //sqlControl = getMoreResultClasses(rating, sqlControl);
    Rating ratingGot = sqlGetEngineRating.get(sqlSession, Rating.class, rating, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get rating result: " + ratingGot);
    }
    return ratingGot;
  }
  
  public Rating get(final Rating rating, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), rating, sqlControl);
  }
  
  public Rating get(final SqlSession sqlSession, final Rating rating) {
    return get(sqlSession, rating, null);
  }
  
  public Rating get(final Rating rating) {
    return get(rating, null);
  }
  
  public int update(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update rating: " + rating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineRating = sqlEngineFactory.getCheckedCrudEngine("UPDATE_RATING");
    int count = sqlUpdateEngineRating.update(sqlSession, rating, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update rating result count: " + count);
    }
    return count;
  }
  
  public int update(final Rating rating, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), rating, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Rating rating) {
    return update(sqlSession, rating, null);
  }
  
  public int update(final Rating rating) {
    return update(rating, null);
  }
  
  public int delete(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete rating: " + rating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineRating = sqlEngineFactory.getCheckedCrudEngine("DELETE_RATING");
    int count = sqlDeleteEngineRating.delete(sqlSession, rating, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete rating result count: " + count);
    }
    return count;
  }
  
  public int delete(final Rating rating, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), rating, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Rating rating) {
    return delete(sqlSession, rating, null);
  }
  
  public int delete(final Rating rating) {
    return delete(rating, null);
  }
  
  public List<Rating> list(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list rating: " + rating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineRating = sqlEngineFactory.getCheckedQueryEngine("SELECT_RATING");
    //sqlControl = getMoreResultClasses(rating, sqlControl);
    List<Rating> ratingList = sqlEngineRating.query(sqlSession, Rating.class, rating, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list rating size: " + ((ratingList != null) ? ratingList.size() : "null"));
    }
    return ratingList;
  }
  
  public List<Rating> list(final Rating rating, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), rating, sqlControl);
  }
  
  public List<Rating> list(final SqlSession sqlSession, final Rating rating) {
    return list(sqlSession, rating, null);
  }
  
  public List<Rating> list(final Rating rating) {
    return list(rating, null);
  }
  
  public int query(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl, final SqlRowProcessor<Rating> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query rating: " + rating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineRating = sqlEngineFactory.getCheckedQueryEngine("SELECT_RATING");
    //sqlControl = getMoreResultClasses(rating, sqlControl);
    int rownums = sqlEngineRating.query(sqlSession, Rating.class, rating, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query rating size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final Rating rating, SqlControl sqlControl, final SqlRowProcessor<Rating> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), rating, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final Rating rating, final SqlRowProcessor<Rating> sqlRowProcessor) {
    return query(sqlSession, rating, null, sqlRowProcessor);
  }
  
  public int query(final Rating rating, final SqlRowProcessor<Rating> sqlRowProcessor) {
    return query(rating, null, sqlRowProcessor);
  }
  
  public List<Rating> listFromTo(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl) {
    if (sqlControl == null || sqlControl.getFirstResult() == null || sqlControl.getMaxResults() == null || rating == null)
    	return list(sqlSession, rating, sqlControl);
    
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list rating: " + rating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineRating = sqlEngineFactory.getCheckedQueryEngine("SELECT_RATING");
    //sqlControl = getMoreResultClasses(rating, sqlControl);
    rating.setOnlyIds_(true);
    java.util.Set<String> initAssociations = rating.getInitAssociations_();
    rating.setInitAssociations_(new java.util.HashSet<String>());
    final java.util.List<java.lang.Integer> ids_ = sqlEngineRating.query(sqlSession, java.lang.Integer.class, rating, sqlControl);
    rating.setInitAssociations_(initAssociations);
    
    List<Rating> ratingList = new java.util.ArrayList<Rating>();
    if (!ids_.isEmpty()) {
    	org.sqlproc.engine.impl.SqlStandardControl sqlc = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	sqlc.setFirstResult(0);
    	sqlc.setMaxResults(0);
    	sqlc.setOrder(null);
    	final Map<java.lang.Integer, Rating> map = new java.util.HashMap<java.lang.Integer, Rating>();
    	final SqlRowProcessor<Rating> sqlRowProcessor = new SqlRowProcessor<Rating>() {
    		@Override
    		public boolean processRow(Rating result, int rownum) throws org.sqlproc.engine.SqlRuntimeException {
    			map.put(result.getId(), result);
    			return true;
    		}
    	};
    	sqlEngineRating.query(sqlSession, Rating.class, new Rating()._setIds_(ids_), sqlc, sqlRowProcessor);
    	for (java.lang.Integer id : ids_)
    		ratingList.add(map.get(id));
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list rating size: " + ((ratingList != null) ? ratingList.size() : "null"));
    }
    return ratingList;
  }
  
  public List<Rating> listFromTo(final Rating rating, SqlControl sqlControl) {
    return listFromTo(sqlSessionFactory.getSqlSession(), rating, sqlControl);
  }
  
  public List<Rating> listFromTo(final SqlSession sqlSession, final Rating rating) {
    return listFromTo(sqlSession, rating, null);
  }
  
  public List<Rating> listFromTo(final Rating rating) {
    return listFromTo(rating, null);
  }
  
  public int count(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count rating: " + rating + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineRating = sqlEngineFactory.getCheckedQueryEngine("SELECT_RATING");
    //sqlControl = getMoreResultClasses(rating, sqlControl);
    int count = sqlEngineRating.queryCount(sqlSession, rating, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Rating rating, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), rating, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Rating rating) {
    return count(sqlSession, rating, null);
  }
  
  public int count(final Rating rating) {
    return count(rating, null);
  }
}
