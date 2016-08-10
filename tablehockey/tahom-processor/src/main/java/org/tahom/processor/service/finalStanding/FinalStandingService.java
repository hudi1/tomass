package org.tahom.processor.service.finalStanding;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.tahom.repository.dao.FinalStandingDao;
import org.tahom.repository.model.FinalStanding;
import org.tahom.repository.model.FinalStanding.Attribute;

public class FinalStandingService {

    @Inject
    private FinalStandingDao finalStandingDao;

    @Transactional
    public FinalStanding createFinalStanding(FinalStanding finalStanding) {
        return finalStandingDao.insert(finalStanding);
    }

    @Transactional
    public int updateFinalStanding(FinalStanding finalStanding) {
        return finalStandingDao.update(finalStanding._setNull_(Attribute.values()));
    }

    @Transactional
    public int deleteFinalStanding(FinalStanding finalStanding) {
        return finalStandingDao.delete(finalStanding);
    }

    @Transactional(readOnly = true)
    public FinalStanding getFinalStanding(Integer finalStandingId) {
        return finalStandingDao.get(new FinalStanding()._setId(finalStandingId));
    }

    @Transactional(readOnly = true)
    public List<FinalStanding> listFinalStanding(FinalStanding finalStanding) {
        return finalStandingDao.list(finalStanding);
    }

}