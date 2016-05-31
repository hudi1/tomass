package org.tahom.repository.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.tahom.repository.model.RatingPoints;

@SuppressWarnings("all")
public interface RatingPointsDao {
  public RatingPoints insert(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public RatingPoints insert(final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public RatingPoints insert(final SqlSession sqlSession, final RatingPoints ratingPoints);
  
  public RatingPoints insert(final RatingPoints ratingPoints);
  
  public RatingPoints get(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public RatingPoints get(final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public RatingPoints get(final SqlSession sqlSession, final RatingPoints ratingPoints);
  
  public RatingPoints get(final RatingPoints ratingPoints);
  
  public int update(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public int update(final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final RatingPoints ratingPoints);
  
  public int update(final RatingPoints ratingPoints);
  
  public int delete(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public int delete(final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final RatingPoints ratingPoints);
  
  public int delete(final RatingPoints ratingPoints);
  
  public List<RatingPoints> list(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public List<RatingPoints> list(final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public List<RatingPoints> list(final SqlSession sqlSession, final RatingPoints ratingPoints);
  
  public List<RatingPoints> list(final RatingPoints ratingPoints);
  
  public int query(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl, final SqlRowProcessor<RatingPoints> sqlRowProcessor);
  
  public int query(final RatingPoints ratingPoints, SqlControl sqlControl, final SqlRowProcessor<RatingPoints> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final RatingPoints ratingPoints, final SqlRowProcessor<RatingPoints> sqlRowProcessor);
  
  public int query(final RatingPoints ratingPoints, final SqlRowProcessor<RatingPoints> sqlRowProcessor);
  
  public List<RatingPoints> listFromTo(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public List<RatingPoints> listFromTo(final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public List<RatingPoints> listFromTo(final SqlSession sqlSession, final RatingPoints ratingPoints);
  
  public List<RatingPoints> listFromTo(final RatingPoints ratingPoints);
  
  public int count(final SqlSession sqlSession, final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public int count(final RatingPoints ratingPoints, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final RatingPoints ratingPoints);
  
  public int count(final RatingPoints ratingPoints);
}
