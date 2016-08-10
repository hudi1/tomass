package it.stage;

import java.util.List;

import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.stage.StageService;
import org.tahom.repository.model.Stage;
import org.tahom.repository.model.Stage.Association;
import org.tahom.repository.model.StageStatus;
import org.tahom.repository.model.StageType;
import org.tahom.repository.model.Tournament;

@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../clear-all.xml"), @Setup() })
public class StageIT {

    @Autowired
    private StageService stageService;

    @Test
    @Verify("createStageTest-verify.xml")
    public void createParticipantTest() {
        Stage stage = stageService.createStage(createDefaultStage());
        Assert.assertNotNull(stage.getId());
    }

    @Test
    @Verify("getStageTest-verify.xml")
    public void getStageTest() throws Exception {
        Stage stage = stageService.getStage(1);
        Assert.assertNotNull(stage);
    }

    @Test
    @Verify("getStageTest-verify.xml")
    public void listStageTest() throws Exception {
        List<Stage> stages = stageService.listStages(new Stage()._setInit_(Association.values()));
        Assert.assertSame(1, stages.size());
    }

    @Test
    @Verify("updateStageTest-verify.xml")
    public void updateStageTest() throws Exception {
        int count = stageService.updateStage(createUpdatedStage(1));
        Assert.assertNotSame(0, count);
    }

    @Test
    @Verify("deleteStageTest-verify.xml")
    public void deleteStageTest() throws Exception {
        int count = stageService.deleteStage(new Stage()._setId(1));
        Assert.assertNotSame(0, count);
    }

    private Stage createDefaultStage() {
        Stage stage = new Stage();
        stage.setCopyResultStage(new Stage()._setId(1));
        stage.setName("Name");
        stage.setNumberOfHockey(1);
        stage.setSequence(1);
        stage.setStatus(StageStatus.BC);
        stage.setTournament(new Tournament()._setId(1));
        stage.setType(StageType.RR);
        stage.setWinPoints(2);
        return stage;
    }

    private Stage createUpdatedStage(Integer stageId) {
        Stage stage = new Stage();
        stage.setId(stageId);
        stage.setName("UpdatedName");
        stage.setNumberOfHockey(2);
        stage.setSequence(2);
        stage.setStatus(StageStatus.BC);
        stage.setTournament(new Tournament()._setId(1));
        stage.setType(StageType.PO);
        stage.setWinPoints(3);
        return stage;
    }

}
