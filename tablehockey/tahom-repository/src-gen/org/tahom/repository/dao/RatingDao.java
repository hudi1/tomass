package org.tahom.repository.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.tahom.repository.model.Rating;

@SuppressWarnings("all")
public interface RatingDao {
  public Rating insert(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl);
  
  public Rating insert(final Rating rating, SqlControl sqlControl);
  
  public Rating insert(final SqlSession sqlSession, final Rating rating);
  
  public Rating insert(final Rating rating);
  
  public Rating get(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl);
  
  public Rating get(final Rating rating, SqlControl sqlControl);
  
  public Rating get(final SqlSession sqlSession, final Rating rating);
  
  public Rating get(final Rating rating);
  
  public int update(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl);
  
  public int update(final Rating rating, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final Rating rating);
  
  public int update(final Rating rating);
  
  public int delete(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl);
  
  public int delete(final Rating rating, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final Rating rating);
  
  public int delete(final Rating rating);
  
  public List<Rating> list(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl);
  
  public List<Rating> list(final Rating rating, SqlControl sqlControl);
  
  public List<Rating> list(final SqlSession sqlSession, final Rating rating);
  
  public List<Rating> list(final Rating rating);
  
  public int query(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl, final SqlRowProcessor<Rating> sqlRowProcessor);
  
  public int query(final Rating rating, SqlControl sqlControl, final SqlRowProcessor<Rating> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final Rating rating, final SqlRowProcessor<Rating> sqlRowProcessor);
  
  public int query(final Rating rating, final SqlRowProcessor<Rating> sqlRowProcessor);
  
  public List<Rating> listFromTo(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl);
  
  public List<Rating> listFromTo(final Rating rating, SqlControl sqlControl);
  
  public List<Rating> listFromTo(final SqlSession sqlSession, final Rating rating);
  
  public List<Rating> listFromTo(final Rating rating);
  
  public int count(final SqlSession sqlSession, final Rating rating, SqlControl sqlControl);
  
  public int count(final Rating rating, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final Rating rating);
  
  public int count(final Rating rating);
}
