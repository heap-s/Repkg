package org.repkg.FileHandler;

import org.repkg.utils.FileHandler;
import org.junit.Test;
import static org.junit.Assert.*;

public class DefaultFileHandler {
    @Test
    public void testDefaultFileHandler() {
        FileHandler fileHandler = new FileHandler();
        assertEquals("resources/autoconfig.xml", fileHandler.getInputPath());
        assertEquals("/temp/output/logs.txt", fileHandler.getOutputPath());
    }
}
