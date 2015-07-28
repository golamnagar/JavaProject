package newProviderSignUp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ NewProviderSignUpChrome.class, NewProviderSignUpFF.class,
		NewProviderSignUpIE.class })
public class AllTests {

}
