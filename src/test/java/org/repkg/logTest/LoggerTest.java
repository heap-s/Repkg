package org.repkg.logTest;

import org.repkg.logger.Logger;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.assertEquals;
import org.junit.After;

public class LoggerTest {

    private Logger logger;
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalErr = System.err;

    @Before
    public void setUp() {
        logger = new Logger();
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testPackageNotFoundException() {
        logger.PackageNotFoundException();
        assertEquals("Package not found\n", errContent.toString());
    }

    @Test
    public void testPackageVersionNotFoundException() {
        logger.PackageVersionNotFoundException();
        assertEquals("Package version not found\n", errContent.toString());
    }

    @Test
    public void testPackageVersionAlreadyExistsException() {
        logger.PackageVersionAlreadyExistsException();
        assertEquals("Package version already exists\n", errContent.toString());
    }

    @Test
    public void testPackageAlreadySatisfiedException() {
        logger.PackageAlreadySatisfiedException();
        assertEquals("Package already satisfied\n", errContent.toString());
    }

    @Test
    public void testPackageNotSatisfiedException() {
        logger.PackageNotSatisfiedException();
        assertEquals("Package not satisfied\n", errContent.toString());
    }

    @Test
    public void testPackageVersionNotSatisfiedException() {
        logger.PackageVersionNotSatisfiedException();
        assertEquals("Package version not satisfied\n", errContent.toString());
    }

    @Test
    public void testPackageVersionAlreadySatisfiedException() {
        logger.PackageVersionAlreadySatisfiedException();
        assertEquals("Package version already satisfied\n", errContent.toString());
    }

    @Test
    public void testPackageVersionNotExistsException() {
        logger.PackageVersionNotExistsException();
        assertEquals("Package version not exists\n", errContent.toString());
    }

    @After
    public void restoreStreams() {
        System.setErr(originalErr);
    }
}
