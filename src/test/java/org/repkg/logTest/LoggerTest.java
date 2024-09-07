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
        assertEquals("ERROR: Package not found\n", errContent.toString());
    }

    @Test
    public void testPackageVersionNotFoundException() {
        logger.PackageVersionNotFoundException();
        assertEquals("WARNING: Package version not found\n", errContent.toString());
    }

    @Test
    public void testPackageAlreadySatisfiedException() {
        logger.PackageAlreadySatisfiedException();
        assertEquals("WARNING: Package already satisfied\n", errContent.toString());
    }

    @Test
    public void testPackageNotSatisfiedException() {
        logger.PackageNotSatisfiedException();
        assertEquals("FATAL: Package not satisfied\n", errContent.toString());
    }

    @Test
    public void testPackageVersionAlreadySatisfiedException() {
        logger.PackageVersionAlreadySatisfiedException();
        assertEquals("WARNING: Package version already satisfied\n", errContent.toString());
    }

    @Test
    public void testPackageVersionNotExistsException() {
        logger.PackageVersionNotExistsException();
        assertEquals("FATAL: Package version not exists\n", errContent.toString());
    }
    
    @Test
    public void testCannotFetchPackageException(){
        logger.CannotFetchPackageException();
        assertEquals("ERROR: Could not fetch package from remote\n", errContent.toString());
    }

    @After
    public void restoreStreams() {
        System.setErr(originalErr);
    }
}
