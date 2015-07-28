package ProviderContracts;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ContractsChrome.class, ContractsFF.class, ContractsIE.class })
public class AllTests {

}
