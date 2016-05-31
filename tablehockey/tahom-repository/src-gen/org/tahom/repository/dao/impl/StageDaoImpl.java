package org.tahom.repository.dao.impl;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.tahom.repository.dao.StageDao;
import org.tahom.repository.model.Stage;

@SuppressWarnings("all")
public class StageDaoImpl implements StageDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public StageDaoImpl() {
  }
  
  public StageDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public StageDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public Stage insert(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert stage: " + stage + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertStage = sqlEngineFactory.getCheckedCrudEngine("INSERT_STAGE");
    int count = sqlInsertStage.insert(sqlSession, stage, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert stage result: " + count + " " + stage);
    }
    return (count > 0) ? stage : null;
  }
  
  public Stage insert(final Stage stage, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), stage, sqlControl);
  }
  
  public Stage insert(final SqlSession sqlSession, final Stage stage) {
    return insert(sqlSession, stage, null);
  }
  
  public Stage insert(final Stage stage) {
    return insert(stage, null);
  }
  
  public Stage get(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + stage + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineStage = sqlEngineFactory.getCheckedCrudEngine("GET_STAGE");
    //sqlControl = getMoreResultClasses(stage, sqlControl);
    Stage stageGot = sqlGetEngineStage.get(sqlSession, Stage.class, stage, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get stage result: " + stageGot);
    }
    return stageGot;
  }
  
  public Stage get(final Stage stage, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), stage, sqlControl);
  }
  
  public Stage get(final SqlSession sqlSession, final Stage stage) {
    return get(sqlSession, stage, null);
  }
  
  public Stage get(final Stage stage) {
    return get(stage, null);
  }
  
  public int update(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update stage: " + stage + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineStage = sqlEngineFactory.getCheckedCrudEngine("UPDATE_STAGE");
    int count = sqlUpdateEngineStage.update(sqlSession, stage, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update stage result count: " + count);
    }
    return count;
  }
  
  public int update(final Stage stage, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), stage, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final Stage stage) {
    return update(sqlSession, stage, null);
  }
  
  public int update(final Stage stage) {
    return update(stage, null);
  }
  
  public int delete(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete stage: " + stage + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineStage = sqlEngineFactory.getCheckedCrudEngine("DELETE_STAGE");
    int count = sqlDeleteEngineStage.delete(sqlSession, stage, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete stage result count: " + count);
    }
    return count;
  }
  
  public int delete(final Stage stage, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), stage, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final Stage stage) {
    return delete(sqlSession, stage, null);
  }
  
  public int delete(final Stage stage) {
    return delete(stage, null);
  }
  
  public List<Stage> list(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list stage: " + stage + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineStage = sqlEngineFactory.getCheckedQueryEngine("SELECT_STAGE");
    //sqlControl = getMoreResultClasses(stage, sqlControl);
    List<Stage> stageList = sqlEngineStage.query(sqlSession, Stage.class, stage, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list stage size: " + ((stageList != null) ? stageList.size() : "null"));
    }
    return stageList;
  }
  
  public List<Stage> list(final Stage stage, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), stage, sqlControl);
  }
  
  public List<Stage> list(final SqlSession sqlSession, final Stage stage) {
    return list(sqlSession, stage, null);
  }
  
  public List<Stage> list(final Stage stage) {
    return list(stage, null);
  }
  
  public int query(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl, final SqlRowProcessor<Stage> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query stage: " + stage + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineStage = sqlEngineFactory.getCheckedQueryEngine("SELECT_STAGE");
    //sqlControl = getMoreResultClasses(stage, sqlControl);
    int rownums = sqlEngineStage.query(sqlSession, Stage.class, stage, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query stage size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final Stage stage, SqlControl sqlControl, final SqlRowProcessor<Stage> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), stage, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final Stage stage, final SqlRowProcessor<Stage> sqlRowProcessor) {
    return query(sqlSession, stage, null, sqlRowProcessor);
  }
  
  public int query(final Stage stage, final SqlRowProcessor<Stage> sqlRowProcessor) {
    return query(stage, null, sqlRowProcessor);
  }
  
  public List<Stage> listFromTo(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl) {
    if (sqlControl == null || sqlControl.getFirstResult() == null || sqlControl.getMaxResults() == null || stage == null)
    	return list(sqlSession, stage, sqlControl);
    
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list stage: " + stage + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineStage = sqlEngineFactory.getCheckedQueryEngine("SELECT_STAGE");
    //sqlControl = getMoreResultClasses(stage, sqlControl);
    stage.setOnlyIds_(true);
    java.util.Set<String> initAssociations = stage.getInitAssociations_();
    stage.setInitAssociations_(new java.util.HashSet<String>());
    final java.util.List<java.lang.Integer> ids_ = sqlEngineStage.query(sqlSession, java.lang.Integer.class, stage, sqlControl);
    stage.setInitAssociations_(initAssociations);
    
    List<Stage> stageList = new java.util.ArrayList<Stage>();
    if (!ids_.isEmpty()) {
    	org.sqlproc.engine.impl.SqlStandardControl sqlc = new org.sqlproc.engine.impl.SqlStandardControl(sqlControl);
    	sqlc.setFirstResult(0);
    	sqlc.setMaxResults(0);
    	sqlc.setOrder(null);
    	final Map<java.lang.Integer, Stage> map = new java.util.HashMap<java.lang.Integer, Stage>();
    	final SqlRowProcessor<Stage> sqlRowProcessor = new SqlRowProcessor<Stage>() {
    		@Override
    		public boolean processRow(Stage result, int rownum) throws org.sqlproc.engine.SqlRuntimeException {
    			map.put(result.getId(), result);
    			return true;
    		}
    	};
    	sqlEngineStage.query(sqlSession, Stage.class, new Stage()._setIds_(ids_), sqlc, sqlRowProcessor);
    	for (java.lang.Integer id : ids_)
    		stageList.add(map.get(id));
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list stage size: " + ((stageList != null) ? stageList.size() : "null"));
    }
    return stageList;
  }
  
  public List<Stage> listFromTo(final Stage stage, SqlControl sqlControl) {
    return listFromTo(sqlSessionFactory.getSqlSession(), stage, sqlControl);
  }
  
  public List<Stage> listFromTo(final SqlSession sqlSession, final Stage stage) {
    return listFromTo(sqlSession, stage, null);
  }
  
  public List<Stage> listFromTo(final Stage stage) {
    return listFromTo(stage, null);
  }
  
  public int count(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count stage: " + stage + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineStage = sqlEngineFactory.getCheckedQueryEngine("SELECT_STAGE");
    //sqlControl = getMoreResultClasses(stage, sqlControl);
    int count = sqlEngineStage.queryCount(sqlSession, stage, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final Stage stage, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), stage, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final Stage stage) {
    return count(sqlSession, stage, null);
  }
  
  public int count(final Stage stage) {
    return count(stage, null);
  }
}
