package compsci.travelers.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import compsci.travelers.tests.business.AccessCitiesTest;
import compsci.travelers.tests.business.AccessFlightTest;
import compsci.travelers.tests.business.CalculateAirTicketPriceTest;
import compsci.travelers.tests.business.SortTicketPriceHighToLowTest;
import compsci.travelers.tests.business.SortTicketPriceLowToHighTest;
import compsci.travelers.tests.business.ValidateInputTest;
import compsci.travelers.tests.objects.CityTest;
import compsci.travelers.tests.objects.FlightsTest;
import compsci.travelers.tests.persistence.DatabaseTest;

public class AllTests {
    public static TestSuite suite;

    public static Test suite() {
        suite = new TestSuite("All tests");
        testObjects();
        testBusiness();
        testPersistence();
        return suite;
    }

    private static void testObjects() {
        suite.addTestSuite(CityTest.class);
        suite.addTestSuite(FlightsTest.class);
    }

    private static void testBusiness() {
        suite.addTestSuite(CalculateAirTicketPriceTest.class);
        suite.addTestSuite(AccessFlightTest.class);
        suite.addTestSuite(AccessCitiesTest.class);
        suite.addTestSuite(ValidateInputTest.class);
        suite.addTestSuite(SortTicketPriceLowToHighTest.class);
        suite.addTestSuite(SortTicketPriceHighToLowTest.class);
    }

    private static void testPersistence() {
        suite.addTestSuite(DatabaseTest.class);
    }
}
