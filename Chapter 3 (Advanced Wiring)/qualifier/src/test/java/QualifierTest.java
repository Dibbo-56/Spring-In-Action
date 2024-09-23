import org.example.config.SpringConfig;
import org.example.dto.UserDto;
import org.example.formatter.Formatter;
import org.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dibyendu.debnath
 * @since 9/23/24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class QualifierTest {

    @Autowired
    @Qualifier("adminFormatter")
    private Formatter adminFormatter;

    @Autowired
    private UserService userService;

    @Test
    public void test_Qualifier() {
        UserDto userDto = userService.findUserById(1);

        adminFormatter.printFormattedName(userDto.getFirstName(), userDto.getLastName(), userDto.getTitle());
    }
}
