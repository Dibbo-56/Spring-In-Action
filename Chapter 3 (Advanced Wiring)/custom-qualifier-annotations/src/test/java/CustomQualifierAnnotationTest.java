import org.example.annotation.BezosCompany;
import org.example.annotation.EcommerceSite;
import org.example.annotation.RocketCompany;
import org.example.config.SpringConfig;
import org.example.domain.Company;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dibyendu.debnath
 * @since 9/25/24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class CustomQualifierAnnotationTest {

    @Autowired
    @BezosCompany
    @EcommerceSite
    private Company amazon;

    @Autowired
    @BezosCompany
    @RocketCompany
    private Company blueOrigin;

    @Test
    public void test_CustomQualifierAnnotation() {
        System.out.println(amazon.getCompanyName());
        System.out.println(amazon.getCompanyServiceType());
        System.out.println();
        System.out.println(blueOrigin.getCompanyName());
        System.out.println(blueOrigin.getCompanyServiceType());
    }
}
