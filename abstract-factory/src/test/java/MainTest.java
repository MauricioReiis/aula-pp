import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({
        AppTest.class,
        CadeiaTest.class,
        DetentoFurtoBlocoTest.class,
        DetentoFurtoFactoryTest.class,
        DetentoFurtoPenaTest.class,
        DetentoHomicidioBlocoTest.class,
        DetentoHomicidioFactoryTest.class,
        DetentoHomicidioPenaTest.class
})

public class MainTest {
}
