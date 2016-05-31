package org.tahom.repository.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.tahom.repository.model.Stage;

@SuppressWarnings("all")
public interface StageDao {
  public Stage insert(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl);
  
  public Stage insert(final Stage stage, SqlControl sqlControl);
  
  public Stage insert(final SqlSession sqlSession, final Stage stage);
  
  public Stage insert(final Stage stage);
  
  public Stage get(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl);
  
  public Stage get(final Stage stage, SqlControl sqlControl);
  
  public Stage get(final SqlSession sqlSession, final Stage stage);
  
  public Stage get(final Stage stage);
  
  public int update(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl);
  
  public int update(final Stage stage, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final Stage stage);
  
  public int update(final Stage stage);
  
  public int delete(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl);
  
  public int delete(final Stage stage, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final Stage stage);
  
  public int delete(final Stage stage);
  
  public List<Stage> list(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl);
  
  public List<Stage> list(final Stage stage, SqlControl sqlControl);
  
  public List<Stage> list(final SqlSession sqlSession, final Stage stage);
  
  public List<Stage> list(final Stage stage);
  
  public int query(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl, final SqlRowProcessor<Stage> sqlRowProcessor);
  
  public int query(final Stage stage, SqlControl sqlControl, final SqlRowProcessor<Stage> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final Stage stage, final SqlRowProcessor<Stage> sqlRowProcessor);
  
  public int query(final Stage stage, final SqlRowProcessor<Stage> sqlRowProcessor);
  
  public List<Stage> listFromTo(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl);
  
  public List<Stage> listFromTo(final Stage stage, SqlControl sqlControl);
  
  public List<Stage> listFromTo(final SqlSession sqlSession, final Stage stage);
  
  public List<Stage> listFromTo(final Stage stage);
  
  public int count(final SqlSession sqlSession, final Stage stage, SqlControl sqlControl);
  
  public int count(final Stage stage, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final Stage stage);
  
  public int count(final Stage stage);
}
