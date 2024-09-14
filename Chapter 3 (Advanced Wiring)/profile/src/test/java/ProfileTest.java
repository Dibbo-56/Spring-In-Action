import org.example.config.SpringConfig;
import org.example.dto.UserDto;
import org.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dibyendu.debnath
 * @since 9/12/24
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
@ActiveProfiles("Test")
public class ProfileTest {

    @Autowired
    private UserService userService;

    @Test
    public void test_DevProfile() {
        UserDto userDto = userService.findUserByName(1, "test_users");

        System.out.println(userDto.getId());
        System.out.println(userDto.getName());
        System.out.println(userDto.getEmail());
    }
}
