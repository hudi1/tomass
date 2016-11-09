package org.tahom.repository.dao.impl;

import java.util.List;

import org.sqlproc.engine.SqlEngineFactory;
import org.sqlproc.engine.SqlQueryEngine;
import org.sqlproc.engine.SqlSessionFactory;
import org.tahom.repository.dao.TournamentExtDao;
import org.tahom.repository.model.Tournament;
import org.tahom.repository.model.User;

public class TournamentExtDaoImpl extends TournamentDaoImpl implements TournamentExtDao {

    public TournamentExtDaoImpl(SqlEngineFactory sqlEngineFactory) {
        super(sqlEngineFactory);
    }

    public TournamentExtDaoImpl(SqlEngineFactory sqlEngineFactory, SqlSessionFactory sqlSessionFactory) {
        super(sqlEngineFactory, sqlSessionFactory);
    }

    @Override
    public List<Tournament> listTournamentsByUserAdmin(User user) {
        if (logger.isTraceEnabled()) {
            logger.trace("list tournaments by user admin: " + user);
        }
        SqlQueryEngine sqlEnginePlayer = sqlEngineFactory.getCheckedQueryEngine("SELECT_TOURNAMENT_BY_USER_ADMIN");
        List<Tournament> tournamentList = sqlEnginePlayer.query(sqlSessionFactory.getSqlSession(), Tournament.class,
                user);

        if (logger.isTraceEnabled()) {
            logger.trace("list tournaments size: " + ((tournamentList != null) ? tournamentList.size() : "null"));
        }
        return tournamentList;
    }

    @Override
    public List<Tournament> listTournamentsByUserParticipant(User user) {
        if (logger.isTraceEnabled()) {
            logger.trace("list tournaments by user participant: " + user);
        }
        SqlQueryEngine sqlEnginePlayer = sqlEngineFactory
                .getCheckedQueryEngine("SELECT_TOURNAMENT_BY_USER_PARTICIPANT");
        List<Tournament> tournamentList = sqlEnginePlayer.query(sqlSessionFactory.getSqlSession(), Tournament.class,
                user);

        if (logger.isTraceEnabled()) {
            logger.trace("list tournaments size: " + ((tournamentList != null) ? tournamentList.size() : "null"));
        }
        return tournamentList;
    }

}
