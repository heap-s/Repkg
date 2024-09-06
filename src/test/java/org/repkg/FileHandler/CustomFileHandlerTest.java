package org.repkg.FileHandler;

import org.repkg.utils.FileHandler;
import org.junit.Test;
import static org.junit.Assert.*;
import org.repkg.utils.Date;
public class CustomFileHandlerTest {
     @Test
     public void testFileHandlerWithCustomPaths() {
        FileHandler fileHandler = new FileHandler("resources/customconfig.xml");
        assertEquals("resources/customconfig.xml", fileHandler.getInputPath());
        assertEquals("/temp/output/logs/repkg-" + Date.getCurrentDate() + ".txt", fileHandler.getOutputPath());
     }
}
