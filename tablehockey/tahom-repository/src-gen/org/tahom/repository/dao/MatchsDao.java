package org.tahom.repository.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.tahom.repository.model.Matchs;

@SuppressWarnings("all")
public interface MatchsDao {
  public Matchs insert(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl);
  
  public Matchs insert(final Matchs matchs, SqlControl sqlControl);
  
  public Matchs insert(final SqlSession sqlSession, final Matchs matchs);
  
  public Matchs insert(final Matchs matchs);
  
  public Matchs get(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl);
  
  public Matchs get(final Matchs matchs, SqlControl sqlControl);
  
  public Matchs get(final SqlSession sqlSession, final Matchs matchs);
  
  public Matchs get(final Matchs matchs);
  
  public int update(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl);
  
  public int update(final Matchs matchs, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final Matchs matchs);
  
  public int update(final Matchs matchs);
  
  public int delete(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl);
  
  public int delete(final Matchs matchs, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final Matchs matchs);
  
  public int delete(final Matchs matchs);
  
  public List<Matchs> list(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl);
  
  public List<Matchs> list(final Matchs matchs, SqlControl sqlControl);
  
  public List<Matchs> list(final SqlSession sqlSession, final Matchs matchs);
  
  public List<Matchs> list(final Matchs matchs);
  
  public int query(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl, final SqlRowProcessor<Matchs> sqlRowProcessor);
  
  public int query(final Matchs matchs, SqlControl sqlControl, final SqlRowProcessor<Matchs> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final Matchs matchs, final SqlRowProcessor<Matchs> sqlRowProcessor);
  
  public int query(final Matchs matchs, final SqlRowProcessor<Matchs> sqlRowProcessor);
  
  public List<Matchs> listFromTo(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl);
  
  public List<Matchs> listFromTo(final Matchs matchs, SqlControl sqlControl);
  
  public List<Matchs> listFromTo(final SqlSession sqlSession, final Matchs matchs);
  
  public List<Matchs> listFromTo(final Matchs matchs);
  
  public int count(final SqlSession sqlSession, final Matchs matchs, SqlControl sqlControl);
  
  public int count(final Matchs matchs, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final Matchs matchs);
  
  public int count(final Matchs matchs);
  
  public SqlControl getMoreResultClasses(final Matchs matchs, SqlControl sqlControl);
}
