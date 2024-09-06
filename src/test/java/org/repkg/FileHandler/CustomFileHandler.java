package org.repkg.FileHandler;

import org.repkg.utils.FileHandler;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomFileHandler {
     @Test
     public void testFileHandlerWithCustomPaths() {
        FileHandler fileHandler = new FileHandler("resources/customconfig.xml", "/temp/output/customlogs.txt");
        assertEquals("resources/customconfig.xml", fileHandler.getInputPath());
        assertEquals("/temp/output/customlogs.txt", fileHandler.getOutputPath());
     }
}
