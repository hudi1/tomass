package org.tahom.processor.service.match;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.tahom.repository.dao.MatchsDao;
import org.tahom.repository.model.Matchs;
import org.tahom.repository.model.Matchs.Attribute;

public class MatchService {

    @Inject
    private MatchsDao matchDao;

    @Transactional
    public Matchs createMatch(Matchs matchs) {
        return matchDao.insert(matchs);
    }

    @Transactional
    public int updateMatch(Matchs matchs) {
        return matchDao.update(matchs._setNull_(Attribute.values()));
    }

    @Transactional
    public int deleteMatch(Matchs matchs) {
        return matchDao.delete(matchs);
    }

    @Transactional(readOnly = true)
    public Matchs getMatch(Integer matchId) {
        return matchDao.get(new Matchs()._setId(matchId));
    }

    @Transactional(readOnly = true)
    public List<Matchs> listMatchs(Matchs matchs) {
        return matchDao.list(matchs);
    }

}
