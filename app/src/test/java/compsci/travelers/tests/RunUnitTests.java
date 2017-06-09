package compsci.travelers.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import compsci.travelers.tests.business.BusinessTests;
import compsci.travelers.tests.objects.ObjectTests;
import compsci.travelers.tests.persistence.PersistenceTests;

public class RunUnitTests {
    public static TestSuite suite;

    public static Test suite() {
        suite = new TestSuite("Unit tests");
        suite.addTest(ObjectTests.suite());
        suite.addTest(BusinessTests.suite());
        suite.addTest(PersistenceTests.suite());
        return suite;
    }
}
