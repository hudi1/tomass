package org.tahom.repository.dao.impl;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.tahom.repository.dao.TournamentAdminDao;
import org.tahom.repository.model.TournamentAdmin;

@SuppressWarnings("all")
public class TournamentAdminDaoImpl implements TournamentAdminDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public TournamentAdminDaoImpl() {
  }
  
  public TournamentAdminDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public TournamentAdminDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public TournamentAdmin insert(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert tournamentAdmin: " + tournamentAdmin + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertTournamentAdmin = sqlEngineFactory.getCheckedCrudEngine("INSERT_TOURNAMENT_ADMIN");
    int count = sqlInsertTournamentAdmin.insert(sqlSession, tournamentAdmin, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert tournamentAdmin result: " + count + " " + tournamentAdmin);
    }
    return (count > 0) ? tournamentAdmin : null;
  }
  
  public TournamentAdmin insert(final TournamentAdmin tournamentAdmin, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), tournamentAdmin, sqlControl);
  }
  
  public TournamentAdmin insert(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin) {
    return insert(sqlSession, tournamentAdmin, null);
  }
  
  public TournamentAdmin insert(final TournamentAdmin tournamentAdmin) {
    return insert(tournamentAdmin, null);
  }
  
  public TournamentAdmin get(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + tournamentAdmin + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineTournamentAdmin = sqlEngineFactory.getCheckedCrudEngine("GET_TOURNAMENT_ADMIN");
    //sqlControl = getMoreResultClasses(tournamentAdmin, sqlControl);
    TournamentAdmin tournamentAdminGot = sqlGetEngineTournamentAdmin.get(sqlSession, TournamentAdmin.class, tournamentAdmin, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get tournamentAdmin result: " + tournamentAdminGot);
    }
    return tournamentAdminGot;
  }
  
  public TournamentAdmin get(final TournamentAdmin tournamentAdmin, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), tournamentAdmin, sqlControl);
  }
  
  public TournamentAdmin get(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin) {
    return get(sqlSession, tournamentAdmin, null);
  }
  
  public TournamentAdmin get(final TournamentAdmin tournamentAdmin) {
    return get(tournamentAdmin, null);
  }
  
  public int update(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update tournamentAdmin: " + tournamentAdmin + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineTournamentAdmin = sqlEngineFactory.getCheckedCrudEngine("UPDATE_TOURNAMENT_ADMIN");
    int count = sqlUpdateEngineTournamentAdmin.update(sqlSession, tournamentAdmin, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update tournamentAdmin result count: " + count);
    }
    return count;
  }
  
  public int update(final TournamentAdmin tournamentAdmin, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), tournamentAdmin, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin) {
    return update(sqlSession, tournamentAdmin, null);
  }
  
  public int update(final TournamentAdmin tournamentAdmin) {
    return update(tournamentAdmin, null);
  }
  
  public int delete(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete tournamentAdmin: " + tournamentAdmin + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineTournamentAdmin = sqlEngineFactory.getCheckedCrudEngine("DELETE_TOURNAMENT_ADMIN");
    int count = sqlDeleteEngineTournamentAdmin.delete(sqlSession, tournamentAdmin, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete tournamentAdmin result count: " + count);
    }
    return count;
  }
  
  public int delete(final TournamentAdmin tournamentAdmin, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), tournamentAdmin, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin) {
    return delete(sqlSession, tournamentAdmin, null);
  }
  
  public int delete(final TournamentAdmin tournamentAdmin) {
    return delete(tournamentAdmin, null);
  }
  
  public List<TournamentAdmin> list(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list tournamentAdmin: " + tournamentAdmin + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineTournamentAdmin = sqlEngineFactory.getCheckedQueryEngine("SELECT_TOURNAMENT_ADMIN");
    //sqlControl = getMoreResultClasses(tournamentAdmin, sqlControl);
    List<TournamentAdmin> tournamentAdminList = sqlEngineTournamentAdmin.query(sqlSession, TournamentAdmin.class, tournamentAdmin, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list tournamentAdmin size: " + ((tournamentAdminList != null) ? tournamentAdminList.size() : "null"));
    }
    return tournamentAdminList;
  }
  
  public List<TournamentAdmin> list(final TournamentAdmin tournamentAdmin, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), tournamentAdmin, sqlControl);
  }
  
  public List<TournamentAdmin> list(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin) {
    return list(sqlSession, tournamentAdmin, null);
  }
  
  public List<TournamentAdmin> list(final TournamentAdmin tournamentAdmin) {
    return list(tournamentAdmin, null);
  }
  
  public int query(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl, final SqlRowProcessor<TournamentAdmin> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query tournamentAdmin: " + tournamentAdmin + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineTournamentAdmin = sqlEngineFactory.getCheckedQueryEngine("SELECT_TOURNAMENT_ADMIN");
    //sqlControl = getMoreResultClasses(tournamentAdmin, sqlControl);
    int rownums = sqlEngineTournamentAdmin.query(sqlSession, TournamentAdmin.class, tournamentAdmin, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query tournamentAdmin size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final TournamentAdmin tournamentAdmin, SqlControl sqlControl, final SqlRowProcessor<TournamentAdmin> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), tournamentAdmin, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, final SqlRowProcessor<TournamentAdmin> sqlRowProcessor) {
    return query(sqlSession, tournamentAdmin, null, sqlRowProcessor);
  }
  
  public int query(final TournamentAdmin tournamentAdmin, final SqlRowProcessor<TournamentAdmin> sqlRowProcessor) {
    return query(tournamentAdmin, null, sqlRowProcessor);
  }
  
  public int count(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count tournamentAdmin: " + tournamentAdmin + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineTournamentAdmin = sqlEngineFactory.getCheckedQueryEngine("SELECT_TOURNAMENT_ADMIN");
    //sqlControl = getMoreResultClasses(tournamentAdmin, sqlControl);
    int count = sqlEngineTournamentAdmin.queryCount(sqlSession, tournamentAdmin, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final TournamentAdmin tournamentAdmin, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), tournamentAdmin, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin) {
    return count(sqlSession, tournamentAdmin, null);
  }
  
  public int count(final TournamentAdmin tournamentAdmin) {
    return count(tournamentAdmin, null);
  }
}
