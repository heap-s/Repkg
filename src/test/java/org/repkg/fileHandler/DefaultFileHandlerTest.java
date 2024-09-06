package org.repkg.fileHandler;

import org.repkg.utils.FileHandler;
import org.junit.Test;
import static org.junit.Assert.*;
import org.repkg.utils.Date;
public class DefaultFileHandlerTest {
    @Test
    public void testDefaultFileHandler() {
        FileHandler fileHandler = new FileHandler();
        assertEquals("resources/autoconfig.xml", fileHandler.getInputPath());
        assertEquals("/temp/output/logs/repkg-" + Date.getCurrentDate() + ".txt", fileHandler.getOutputPath());
    }
}
