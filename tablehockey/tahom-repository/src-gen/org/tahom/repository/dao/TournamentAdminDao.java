package org.tahom.repository.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.tahom.repository.model.TournamentAdmin;

@SuppressWarnings("all")
public interface TournamentAdminDao {
  public TournamentAdmin insert(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl);
  
  public TournamentAdmin insert(final TournamentAdmin tournamentAdmin, SqlControl sqlControl);
  
  public TournamentAdmin insert(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin);
  
  public TournamentAdmin insert(final TournamentAdmin tournamentAdmin);
  
  public TournamentAdmin get(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl);
  
  public TournamentAdmin get(final TournamentAdmin tournamentAdmin, SqlControl sqlControl);
  
  public TournamentAdmin get(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin);
  
  public TournamentAdmin get(final TournamentAdmin tournamentAdmin);
  
  public int update(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl);
  
  public int update(final TournamentAdmin tournamentAdmin, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin);
  
  public int update(final TournamentAdmin tournamentAdmin);
  
  public int delete(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl);
  
  public int delete(final TournamentAdmin tournamentAdmin, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin);
  
  public int delete(final TournamentAdmin tournamentAdmin);
  
  public List<TournamentAdmin> list(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl);
  
  public List<TournamentAdmin> list(final TournamentAdmin tournamentAdmin, SqlControl sqlControl);
  
  public List<TournamentAdmin> list(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin);
  
  public List<TournamentAdmin> list(final TournamentAdmin tournamentAdmin);
  
  public int query(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl, final SqlRowProcessor<TournamentAdmin> sqlRowProcessor);
  
  public int query(final TournamentAdmin tournamentAdmin, SqlControl sqlControl, final SqlRowProcessor<TournamentAdmin> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, final SqlRowProcessor<TournamentAdmin> sqlRowProcessor);
  
  public int query(final TournamentAdmin tournamentAdmin, final SqlRowProcessor<TournamentAdmin> sqlRowProcessor);
  
  public int count(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin, SqlControl sqlControl);
  
  public int count(final TournamentAdmin tournamentAdmin, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final TournamentAdmin tournamentAdmin);
  
  public int count(final TournamentAdmin tournamentAdmin);
}
