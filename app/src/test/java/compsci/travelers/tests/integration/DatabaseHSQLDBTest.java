package compsci.travelers.tests.integration;

import junit.framework.TestCase;

import compsci.travelers.application.Main;
import compsci.travelers.application.Services;
import compsci.travelers.persistence.Database;
import compsci.travelers.tests.persistence.DatabaseTest;

public class DatabaseHSQLDBTest extends TestCase {
    private static String dbName = Main.dbName;

    public DatabaseHSQLDBTest(String arg0) {
        super(arg0);
    }

    public void testDataAccess() {
        Database database;

        Services.closeDataAccess();

        System.out.println("\nStarting Integration test DataAccess (using default DB)");

        // Use the following two statements to run with the real database
        Services.createDataAccess(dbName);
        database = Services.getDataAccess(dbName);

        DatabaseTest.databaseTest();
        DatabaseTest.testGetFlightSequentialWithFilledList();
        DatabaseTest.testGetCitySequentialWithFilledList();
        DatabaseTest.testGetFlightSequentialWithNull();
        DatabaseTest.testGetCitySequentialWithNull();

        System.out.println("Finished Integration test DataAccess (using default DB)");
    }
}