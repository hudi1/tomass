package it.group;

import java.util.List;

import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.group.GroupService;
import org.tahom.repository.model.Groups;
import org.tahom.repository.model.Groups.Association;
import org.tahom.repository.model.Stage;

@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../clear-all.xml"), @Setup() })
public class GroupIT {

    @Autowired
    private GroupService groupService;

    @Test
    @Verify("createGroupTest-verify.xml")
    public void createGroupTest() {
        Groups group = groupService.createGroup(createDefaultGroup());
        Assert.assertNotNull(group.getId());
    }

    @Test
    @Verify("getGroupTest-verify.xml")
    public void getGroupTest() throws Exception {
        Groups group = groupService.getGroup(1);
        Assert.assertNotNull(group);
    }

    @Test
    @Verify("getGroupTest-verify.xml")
    public void listGroupTest() throws Exception {
        List<Groups> groups = groupService.listGroups(new Groups()._setInit_(Association.values()));
        Assert.assertSame(1, groups.size());
    }

    @Test
    @Verify("updateGroupTest-verify.xml")
    public void updateGroupTest() throws Exception {
        int count = groupService.updateGroup(createUpdatedGroup(1));
        Assert.assertNotSame(0, count);
    }

    @Test
    @Verify("deleteGroupTest-verify.xml")
    public void deleteGroupTest() throws Exception {
        int count = groupService.deleteGroup(new Groups()._setId(1));
        Assert.assertNotSame(0, count);
    }

    private Groups createDefaultGroup() {
        Groups group = new Groups();
        group.setName("Name");
        group.setStage(new Stage()._setId(1));
        return group;
    }

    private Groups createUpdatedGroup(Integer groupId) {
        Groups group = new Groups();
        group.setId(groupId);
        group.setName("UpdatedName");
        group.setStage(new Stage()._setId(1));
        return group;
    }

}
