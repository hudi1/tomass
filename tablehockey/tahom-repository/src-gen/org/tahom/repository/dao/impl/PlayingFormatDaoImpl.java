package org.tahom.repository.dao.impl;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.tahom.repository.dao.PlayingFormatDao;
import org.tahom.repository.model.PlayingFormat;

@SuppressWarnings("all")
public class PlayingFormatDaoImpl implements PlayingFormatDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public PlayingFormatDaoImpl() {
  }
  
  public PlayingFormatDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public PlayingFormatDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public PlayingFormat insert(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert playingFormat: " + playingFormat + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertPlayingFormat = sqlEngineFactory.getCheckedCrudEngine("INSERT_PLAYING_FORMAT");
    int count = sqlInsertPlayingFormat.insert(sqlSession, playingFormat, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert playingFormat result: " + count + " " + playingFormat);
    }
    return (count > 0) ? playingFormat : null;
  }
  
  public PlayingFormat insert(final PlayingFormat playingFormat, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), playingFormat, sqlControl);
  }
  
  public PlayingFormat insert(final SqlSession sqlSession, final PlayingFormat playingFormat) {
    return insert(sqlSession, playingFormat, null);
  }
  
  public PlayingFormat insert(final PlayingFormat playingFormat) {
    return insert(playingFormat, null);
  }
  
  public PlayingFormat get(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + playingFormat + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEnginePlayingFormat = sqlEngineFactory.getCheckedCrudEngine("GET_PLAYING_FORMAT");
    //sqlControl = getMoreResultClasses(playingFormat, sqlControl);
    PlayingFormat playingFormatGot = sqlGetEnginePlayingFormat.get(sqlSession, PlayingFormat.class, playingFormat, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get playingFormat result: " + playingFormatGot);
    }
    return playingFormatGot;
  }
  
  public PlayingFormat get(final PlayingFormat playingFormat, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), playingFormat, sqlControl);
  }
  
  public PlayingFormat get(final SqlSession sqlSession, final PlayingFormat playingFormat) {
    return get(sqlSession, playingFormat, null);
  }
  
  public PlayingFormat get(final PlayingFormat playingFormat) {
    return get(playingFormat, null);
  }
  
  public int update(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update playingFormat: " + playingFormat + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEnginePlayingFormat = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PLAYING_FORMAT");
    int count = sqlUpdateEnginePlayingFormat.update(sqlSession, playingFormat, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update playingFormat result count: " + count);
    }
    return count;
  }
  
  public int update(final PlayingFormat playingFormat, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), playingFormat, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final PlayingFormat playingFormat) {
    return update(sqlSession, playingFormat, null);
  }
  
  public int update(final PlayingFormat playingFormat) {
    return update(playingFormat, null);
  }
  
  public int delete(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete playingFormat: " + playingFormat + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEnginePlayingFormat = sqlEngineFactory.getCheckedCrudEngine("DELETE_PLAYING_FORMAT");
    int count = sqlDeleteEnginePlayingFormat.delete(sqlSession, playingFormat, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete playingFormat result count: " + count);
    }
    return count;
  }
  
  public int delete(final PlayingFormat playingFormat, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), playingFormat, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final PlayingFormat playingFormat) {
    return delete(sqlSession, playingFormat, null);
  }
  
  public int delete(final PlayingFormat playingFormat) {
    return delete(playingFormat, null);
  }
  
  public List<PlayingFormat> list(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list playingFormat: " + playingFormat + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePlayingFormat = sqlEngineFactory.getCheckedQueryEngine("SELECT_PLAYING_FORMAT");
    //sqlControl = getMoreResultClasses(playingFormat, sqlControl);
    List<PlayingFormat> playingFormatList = sqlEnginePlayingFormat.query(sqlSession, PlayingFormat.class, playingFormat, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list playingFormat size: " + ((playingFormatList != null) ? playingFormatList.size() : "null"));
    }
    return playingFormatList;
  }
  
  public List<PlayingFormat> list(final PlayingFormat playingFormat, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), playingFormat, sqlControl);
  }
  
  public List<PlayingFormat> list(final SqlSession sqlSession, final PlayingFormat playingFormat) {
    return list(sqlSession, playingFormat, null);
  }
  
  public List<PlayingFormat> list(final PlayingFormat playingFormat) {
    return list(playingFormat, null);
  }
  
  public int query(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl, final SqlRowProcessor<PlayingFormat> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query playingFormat: " + playingFormat + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePlayingFormat = sqlEngineFactory.getCheckedQueryEngine("SELECT_PLAYING_FORMAT");
    //sqlControl = getMoreResultClasses(playingFormat, sqlControl);
    int rownums = sqlEnginePlayingFormat.query(sqlSession, PlayingFormat.class, playingFormat, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query playingFormat size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final PlayingFormat playingFormat, SqlControl sqlControl, final SqlRowProcessor<PlayingFormat> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), playingFormat, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final PlayingFormat playingFormat, final SqlRowProcessor<PlayingFormat> sqlRowProcessor) {
    return query(sqlSession, playingFormat, null, sqlRowProcessor);
  }
  
  public int query(final PlayingFormat playingFormat, final SqlRowProcessor<PlayingFormat> sqlRowProcessor) {
    return query(playingFormat, null, sqlRowProcessor);
  }
  
  public List<PlayingFormat> listFromTo(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl) {
    if (sqlControl == null || sqlControl.getFirstResult() == null || sqlControl.getMaxResults() == null || playingFormat == null)
    	return list(sqlSession, playingFormat, sqlControl);
    
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list playingFormat: " + playingFormat + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePlayingFormat = sqlEngineFactory.getCheckedQueryEngine("SELECT_PLAYING_FORMAT");
    //sqlControl = getMoreResultClasses(playingFormat, sqlControl);
    playingFormat.setOnlyIds_(true);
    java.util.Set<String> initAssociations = playingFormat.getInitAssociations_();
    playingFormat.setInitAssociations_(new java.util.HashSet<String>());
    final java.util.List<java.lang.Integer> ids_ = sqlEnginePlayingFormat.query(sqlSession, java.lang.Integer.class, playingFormat, sqlControl);
    playingFormat.setInitAssociations_(initAssociations);
    
    List<PlayingFormat> playingFormatList = new java.util.ArrayList<PlayingFormat>();
    if (!ids_.isEmpty()) {
    	org.sqlproc.engine.impl.SqlStandardControl sqlc = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	sqlc.setFirstResult(0);
    	sqlc.setMaxResults(0);
    	sqlc.setOrder(null);
    	final Map<java.lang.Integer, PlayingFormat> map = new java.util.HashMap<java.lang.Integer, PlayingFormat>();
    	final SqlRowProcessor<PlayingFormat> sqlRowProcessor = new SqlRowProcessor<PlayingFormat>() {
    		@Override
    		public boolean processRow(PlayingFormat result, int rownum) throws org.sqlproc.engine.SqlRuntimeException {
    			map.put(result.getId(), result);
    			return true;
    		}
    	};
    	sqlEnginePlayingFormat.query(sqlSession, PlayingFormat.class, new PlayingFormat()._setIds_(ids_), sqlc, sqlRowProcessor);
    	for (java.lang.Integer id : ids_)
    		playingFormatList.add(map.get(id));
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list playingFormat size: " + ((playingFormatList != null) ? playingFormatList.size() : "null"));
    }
    return playingFormatList;
  }
  
  public List<PlayingFormat> listFromTo(final PlayingFormat playingFormat, SqlControl sqlControl) {
    return listFromTo(sqlSessionFactory.getSqlSession(), playingFormat, sqlControl);
  }
  
  public List<PlayingFormat> listFromTo(final SqlSession sqlSession, final PlayingFormat playingFormat) {
    return listFromTo(sqlSession, playingFormat, null);
  }
  
  public List<PlayingFormat> listFromTo(final PlayingFormat playingFormat) {
    return listFromTo(playingFormat, null);
  }
  
  public int count(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count playingFormat: " + playingFormat + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEnginePlayingFormat = sqlEngineFactory.getCheckedQueryEngine("SELECT_PLAYING_FORMAT");
    //sqlControl = getMoreResultClasses(playingFormat, sqlControl);
    int count = sqlEnginePlayingFormat.queryCount(sqlSession, playingFormat, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final PlayingFormat playingFormat, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), playingFormat, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final PlayingFormat playingFormat) {
    return count(sqlSession, playingFormat, null);
  }
  
  public int count(final PlayingFormat playingFormat) {
    return count(playingFormat, null);
  }
}
