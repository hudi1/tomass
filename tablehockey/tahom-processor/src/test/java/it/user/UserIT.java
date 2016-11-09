package it.user;

import java.time.LocalDate;
import java.util.List;

import net.sf.lightair.LightAirSpringRunner;
import net.sf.lightair.annotation.Setup;
import net.sf.lightair.annotation.Verify;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.tahom.processor.service.user.UserService;
import org.tahom.repository.model.PlayerGender;
import org.tahom.repository.model.User;
import org.tahom.repository.model.UserRole;
import org.tahom.repository.type.model.Surname;

@RunWith(LightAirSpringRunner.class)
@ContextConfiguration(locations = { "/spring/application-context-test.xml" })
@Setup.List({ @Setup("../clear-all.xml"), @Setup() })
public class UserIT {

    @Autowired
    private UserService userService;

    @Test
    @Verify("createUserTest-verify.xml")
    public void createUserTest() throws Exception {
        User user = userService.registerUser(createDefaultUser());
        Assert.assertNotNull(user.getId());
    }

    @Test
    @Verify("getUserTest-verify.xml")
    public void getUserTest() throws Exception {
        User user = new User();
        user.setId(1);
        User userDb = userService.getUser(user);
        Assert.assertNotNull(userDb);
    }

    @Test
    @Verify("getUserTest-verify.xml")
    public void getAllUserTest() throws Exception {
        List<User> users = userService.listAllUsers();
        Assert.assertNotSame(0, users.size());
    }

    @Test
    @Verify("updateUserTest-verify.xml")
    public void updateUserTest() throws Exception {
        int count = userService.editUser(createUpdatedUser(1));
        Assert.assertNotSame(0, count);
    }

    @Test
    @Verify("deleteUserTest-verify.xml")
    public void deleteUserTest() throws Exception {
        int count = userService.deleteUser(1);
        Assert.assertNotSame(0, count);
    }

    public User createDefaultUser() throws Exception {
        User user = new User();
        user.setCity("City");
        user.setClub("Club");
        user.setCountry("Country");
        user.setDateOfBirth(LocalDate.of(2000, 1, 1));
        user.setEmail("Email");
        user.setGender(PlayerGender.M);
        user.setIthfId(1234);
        user.setLogin("Login");
        user.setName("Name");
        user.setNameAscii("NameAscii");
        user.setNickname("Nickname");
        user.setPassword("Password");
        user.setPhone("Phone");
        user.setRole(UserRole.ADMIN);
        user.setSurname(new Surname("Surname"));
        user.setSurnameAscii("SurnameAscii");
        user.setValidity(true);
        user.setVerification(true);
        user.setWorldRanking(123);
        return user;
    }

    public User createUpdatedUser(Integer id) throws Exception {
        User user = new User();
        user.setId(id);
        user.setCity("UpdatedCity");
        user.setClub("UpdatedClub");
        user.setCountry("UpdatedCountry");
        user.setDateOfBirth(LocalDate.of(2100, 1, 1));
        user.setEmail("UpdatedEmail");
        user.setGender(PlayerGender.I0);
        user.setIthfId(4321);
        user.setLogin("UpdatedLogin");
        user.setName("UpdatedName");
        user.setNameAscii("UpdatedNameAscii");
        user.setNickname("UpdatedNickname");
        user.setPassword("UpdatedPassword");
        user.setPhone("UpdatedPhone");
        user.setRole(UserRole.USER);
        user.setSurname(new Surname("UpdatedSurname"));
        user.setSurnameAscii("UpdatedSurnameAscii");
        user.setValidity(false);
        user.setVerification(false);
        user.setWorldRanking(321);
        return user;
    }

}
