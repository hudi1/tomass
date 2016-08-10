package org.tahom.processor.service.stage;

import java.util.List;

import javax.inject.Inject;

import org.springframework.transaction.annotation.Transactional;
import org.tahom.repository.dao.StageDao;
import org.tahom.repository.model.Stage;
import org.tahom.repository.model.Stage.Attribute;

public class StageService {

    @Inject
    private StageDao stageDao;

    @Transactional
    public Stage createStage(Stage stage) {
        return stageDao.insert(stage);
    }

    @Transactional
    public int updateStage(Stage stage) {
        return stageDao.update(stage._setNull_(Attribute.values()));
    }

    @Transactional
    public int deleteStage(Stage stage) {
        return stageDao.delete(stage);
    }

    @Transactional(readOnly = true)
    public Stage getStage(Integer stageId) {
        return stageDao.get(new Stage()._setId(stageId));
    }

    @Transactional(readOnly = true)
    public List<Stage> listStages(Stage stage) {
        return stageDao.list(stage);
    }
}
