package org.tahom.repository.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.tahom.repository.model.PlayingFormat;

@SuppressWarnings("all")
public interface PlayingFormatDao {
  public PlayingFormat insert(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public PlayingFormat insert(final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public PlayingFormat insert(final SqlSession sqlSession, final PlayingFormat playingFormat);
  
  public PlayingFormat insert(final PlayingFormat playingFormat);
  
  public PlayingFormat get(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public PlayingFormat get(final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public PlayingFormat get(final SqlSession sqlSession, final PlayingFormat playingFormat);
  
  public PlayingFormat get(final PlayingFormat playingFormat);
  
  public int update(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public int update(final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final PlayingFormat playingFormat);
  
  public int update(final PlayingFormat playingFormat);
  
  public int delete(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public int delete(final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final PlayingFormat playingFormat);
  
  public int delete(final PlayingFormat playingFormat);
  
  public List<PlayingFormat> list(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public List<PlayingFormat> list(final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public List<PlayingFormat> list(final SqlSession sqlSession, final PlayingFormat playingFormat);
  
  public List<PlayingFormat> list(final PlayingFormat playingFormat);
  
  public int query(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl, final SqlRowProcessor<PlayingFormat> sqlRowProcessor);
  
  public int query(final PlayingFormat playingFormat, SqlControl sqlControl, final SqlRowProcessor<PlayingFormat> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final PlayingFormat playingFormat, final SqlRowProcessor<PlayingFormat> sqlRowProcessor);
  
  public int query(final PlayingFormat playingFormat, final SqlRowProcessor<PlayingFormat> sqlRowProcessor);
  
  public List<PlayingFormat> listFromTo(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public List<PlayingFormat> listFromTo(final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public List<PlayingFormat> listFromTo(final SqlSession sqlSession, final PlayingFormat playingFormat);
  
  public List<PlayingFormat> listFromTo(final PlayingFormat playingFormat);
  
  public int count(final SqlSession sqlSession, final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public int count(final PlayingFormat playingFormat, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final PlayingFormat playingFormat);
  
  public int count(final PlayingFormat playingFormat);
}
