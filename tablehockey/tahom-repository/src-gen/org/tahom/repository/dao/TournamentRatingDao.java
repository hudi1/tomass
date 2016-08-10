package org.tahom.repository.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.tahom.repository.model.TournamentRating;

@SuppressWarnings("all")
public interface TournamentRatingDao {
  public TournamentRating insert(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl);
  
  public TournamentRating insert(final TournamentRating tournamentRating, SqlControl sqlControl);
  
  public TournamentRating insert(final SqlSession sqlSession, final TournamentRating tournamentRating);
  
  public TournamentRating insert(final TournamentRating tournamentRating);
  
  public TournamentRating get(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl);
  
  public TournamentRating get(final TournamentRating tournamentRating, SqlControl sqlControl);
  
  public TournamentRating get(final SqlSession sqlSession, final TournamentRating tournamentRating);
  
  public TournamentRating get(final TournamentRating tournamentRating);
  
  public int update(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl);
  
  public int update(final TournamentRating tournamentRating, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final TournamentRating tournamentRating);
  
  public int update(final TournamentRating tournamentRating);
  
  public int delete(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl);
  
  public int delete(final TournamentRating tournamentRating, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final TournamentRating tournamentRating);
  
  public int delete(final TournamentRating tournamentRating);
  
  public List<TournamentRating> list(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl);
  
  public List<TournamentRating> list(final TournamentRating tournamentRating, SqlControl sqlControl);
  
  public List<TournamentRating> list(final SqlSession sqlSession, final TournamentRating tournamentRating);
  
  public List<TournamentRating> list(final TournamentRating tournamentRating);
  
  public int query(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl, final SqlRowProcessor<TournamentRating> sqlRowProcessor);
  
  public int query(final TournamentRating tournamentRating, SqlControl sqlControl, final SqlRowProcessor<TournamentRating> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final TournamentRating tournamentRating, final SqlRowProcessor<TournamentRating> sqlRowProcessor);
  
  public int query(final TournamentRating tournamentRating, final SqlRowProcessor<TournamentRating> sqlRowProcessor);
  
  public int count(final SqlSession sqlSession, final TournamentRating tournamentRating, SqlControl sqlControl);
  
  public int count(final TournamentRating tournamentRating, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final TournamentRating tournamentRating);
  
  public int count(final TournamentRating tournamentRating);
}
