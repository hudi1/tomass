package org.tahom.repository.dao.impl;

import java.util.List;
import org.slf4j.Logger;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.sqlproc.engine.SqlSessionFactory;
import org.tahom.repository.dao.UserDao;
import org.tahom.repository.model.User;

@SuppressWarnings("all")
public class UserDaoImpl implements UserDao {
  protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());
  
  public UserDaoImpl() {
  }
  
  public UserDaoImpl(final SqlEngineFactory sqlEngineFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
  }
  
  public UserDaoImpl(final SqlEngineFactory sqlEngineFactory, final SqlSessionFactory sqlSessionFactory) {
    this.sqlEngineFactory = sqlEngineFactory;
    this.sqlSessionFactory = sqlSessionFactory;
  }
  
  protected SqlEngineFactory sqlEngineFactory;
  
  protected SqlSessionFactory sqlSessionFactory;
  
  public User insert(final SqlSession sqlSession, final User user, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert user: " + user + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlInsertUser = sqlEngineFactory.getCheckedCrudEngine("INSERT_USER");
    org.sqlproc.engine.SqlCrudEngine sqlInsertPlayer = sqlEngineFactory.getCheckedCrudEngine("INSERT_PLAYER");
    int count = sqlInsertPlayer.insert(sqlSession, user, sqlControl);
    if (count > 0) {
    	sqlInsertUser.insert(sqlSession, user, sqlControl);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql insert user result: " + count + " " + user);
    }
    return (count > 0) ? user : null;
  }
  
  public User insert(final User user, SqlControl sqlControl) {
    return insert(sqlSessionFactory.getSqlSession(), user, sqlControl);
  }
  
  public User insert(final SqlSession sqlSession, final User user) {
    return insert(sqlSession, user, null);
  }
  
  public User insert(final User user) {
    return insert(user, null);
  }
  
  public User get(final SqlSession sqlSession, final User user, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get: " + user + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlGetEngineUser = sqlEngineFactory.getCheckedCrudEngine("GET_USER");
    //sqlControl = getMoreResultClasses(user, sqlControl);
    User userGot = sqlGetEngineUser.get(sqlSession, User.class, user, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql get user result: " + userGot);
    }
    return userGot;
  }
  
  public User get(final User user, SqlControl sqlControl) {
    return get(sqlSessionFactory.getSqlSession(), user, sqlControl);
  }
  
  public User get(final SqlSession sqlSession, final User user) {
    return get(sqlSession, user, null);
  }
  
  public User get(final User user) {
    return get(user, null);
  }
  
  public int update(final SqlSession sqlSession, final User user, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update user: " + user + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlUpdateEngineUser = sqlEngineFactory.getCheckedCrudEngine("UPDATE_USER");
    org.sqlproc.engine.SqlCrudEngine sqlUpdatePlayer = sqlEngineFactory.getCheckedCrudEngine("UPDATE_PLAYER");
    int count = sqlUpdateEngineUser.update(sqlSession, user, sqlControl);
    if (count > 0) {
    	sqlUpdatePlayer.update(sqlSession, user, sqlControl);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql update user result count: " + count);
    }
    return count;
  }
  
  public int update(final User user, SqlControl sqlControl) {
    return update(sqlSessionFactory.getSqlSession(), user, sqlControl);
  }
  
  public int update(final SqlSession sqlSession, final User user) {
    return update(sqlSession, user, null);
  }
  
  public int update(final User user) {
    return update(user, null);
  }
  
  public int delete(final SqlSession sqlSession, final User user, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete user: " + user + " " + sqlControl);
    }
    org.sqlproc.engine.SqlCrudEngine sqlDeleteEngineUser = sqlEngineFactory.getCheckedCrudEngine("DELETE_USER");
    org.sqlproc.engine.SqlCrudEngine sqlDeletePlayer = sqlEngineFactory.getCheckedCrudEngine("DELETE_PLAYER");
    int count = sqlDeleteEngineUser.delete(sqlSession, user, sqlControl);
    if (count > 0) {
    	sqlDeletePlayer.delete(sqlSession, user, sqlControl);
    }
    if (logger.isTraceEnabled()) {
    	logger.trace("sql delete user result count: " + count);
    }
    return count;
  }
  
  public int delete(final User user, SqlControl sqlControl) {
    return delete(sqlSessionFactory.getSqlSession(), user, sqlControl);
  }
  
  public int delete(final SqlSession sqlSession, final User user) {
    return delete(sqlSession, user, null);
  }
  
  public int delete(final User user) {
    return delete(user, null);
  }
  
  public List<User> list(final SqlSession sqlSession, final User user, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list user: " + user + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineUser = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER");
    //sqlControl = getMoreResultClasses(user, sqlControl);
    List<User> userList = sqlEngineUser.query(sqlSession, User.class, user, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql list user size: " + ((userList != null) ? userList.size() : "null"));
    }
    return userList;
  }
  
  public List<User> list(final User user, SqlControl sqlControl) {
    return list(sqlSessionFactory.getSqlSession(), user, sqlControl);
  }
  
  public List<User> list(final SqlSession sqlSession, final User user) {
    return list(sqlSession, user, null);
  }
  
  public List<User> list(final User user) {
    return list(user, null);
  }
  
  public int query(final SqlSession sqlSession, final User user, SqlControl sqlControl, final SqlRowProcessor<User> sqlRowProcessor) {
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query user: " + user + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineUser = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER");
    //sqlControl = getMoreResultClasses(user, sqlControl);
    int rownums = sqlEngineUser.query(sqlSession, User.class, user, sqlControl, sqlRowProcessor);
    if (logger.isTraceEnabled()) {
    	logger.trace("sql query user size: " + rownums);
    }
    return rownums;
  }
  
  public int query(final User user, SqlControl sqlControl, final SqlRowProcessor<User> sqlRowProcessor) {
    return query(sqlSessionFactory.getSqlSession(), user, sqlControl, sqlRowProcessor);
  }
  
  public int query(final SqlSession sqlSession, final User user, final SqlRowProcessor<User> sqlRowProcessor) {
    return query(sqlSession, user, null, sqlRowProcessor);
  }
  
  public int query(final User user, final SqlRowProcessor<User> sqlRowProcessor) {
    return query(user, null, sqlRowProcessor);
  }
  
  public int count(final SqlSession sqlSession, final User user, SqlControl sqlControl) {
    if (logger.isTraceEnabled()) {
    	logger.trace("count user: " + user + " " + sqlControl);
    }
    org.sqlproc.engine.SqlQueryEngine sqlEngineUser = sqlEngineFactory.getCheckedQueryEngine("SELECT_USER");
    //sqlControl = getMoreResultClasses(user, sqlControl);
    int count = sqlEngineUser.queryCount(sqlSession, user, sqlControl);
    if (logger.isTraceEnabled()) {
    	logger.trace("count: " + count);
    }
    return count;
  }
  
  public int count(final User user, SqlControl sqlControl) {
    return count(sqlSessionFactory.getSqlSession(), user, sqlControl);
  }
  
  public int count(final SqlSession sqlSession, final User user) {
    return count(sqlSession, user, null);
  }
  
  public int count(final User user) {
    return count(user, null);
  }
}
