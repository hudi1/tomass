package org.tahom.repository.dao;

import java.util.List;
import org.sqlproc.engine.SqlControl;
import org.sqlproc.engine.SqlRowProcessor;
import org.sqlproc.engine.SqlSession;
import org.tahom.repository.model.GroupParticipant;

@SuppressWarnings("all")
public interface GroupParticipantDao {
  public GroupParticipant insert(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public GroupParticipant insert(final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public GroupParticipant insert(final SqlSession sqlSession, final GroupParticipant groupParticipant);
  
  public GroupParticipant insert(final GroupParticipant groupParticipant);
  
  public GroupParticipant get(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public GroupParticipant get(final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public GroupParticipant get(final SqlSession sqlSession, final GroupParticipant groupParticipant);
  
  public GroupParticipant get(final GroupParticipant groupParticipant);
  
  public int update(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public int update(final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public int update(final SqlSession sqlSession, final GroupParticipant groupParticipant);
  
  public int update(final GroupParticipant groupParticipant);
  
  public int delete(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public int delete(final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public int delete(final SqlSession sqlSession, final GroupParticipant groupParticipant);
  
  public int delete(final GroupParticipant groupParticipant);
  
  public List<GroupParticipant> list(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public List<GroupParticipant> list(final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public List<GroupParticipant> list(final SqlSession sqlSession, final GroupParticipant groupParticipant);
  
  public List<GroupParticipant> list(final GroupParticipant groupParticipant);
  
  public int query(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl, final SqlRowProcessor<GroupParticipant> sqlRowProcessor);
  
  public int query(final GroupParticipant groupParticipant, SqlControl sqlControl, final SqlRowProcessor<GroupParticipant> sqlRowProcessor);
  
  public int query(final SqlSession sqlSession, final GroupParticipant groupParticipant, final SqlRowProcessor<GroupParticipant> sqlRowProcessor);
  
  public int query(final GroupParticipant groupParticipant, final SqlRowProcessor<GroupParticipant> sqlRowProcessor);
  
  public List<GroupParticipant> listFromTo(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public List<GroupParticipant> listFromTo(final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public List<GroupParticipant> listFromTo(final SqlSession sqlSession, final GroupParticipant groupParticipant);
  
  public List<GroupParticipant> listFromTo(final GroupParticipant groupParticipant);
  
  public int count(final SqlSession sqlSession, final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public int count(final GroupParticipant groupParticipant, SqlControl sqlControl);
  
  public int count(final SqlSession sqlSession, final GroupParticipant groupParticipant);
  
  public int count(final GroupParticipant groupParticipant);
}
