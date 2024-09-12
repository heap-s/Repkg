package org.repkg.installer;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.repkg.utils.FileHandler;

public class HttpClientTest {
    @Test
    public void testHttpClientDefaultConstructor() {
        HttpClient httpClient = new HttpClient();
        assertTrue(httpClient.getPackageUrls().isEmpty());
        assertNotNull(httpClient.getFileHandler());
    }

    @Test
    public void testHttpClientParameterizedConstructor() {
        ArrayList<String> packageUrls = new ArrayList<>();
        packageUrls.add("https://example.com/package1");
        packageUrls.add("https://example.com/package2");
        FileHandler fileHandler = new FileHandler();
        
        HttpClient httpClient = new HttpClient(packageUrls, fileHandler);
        assertEquals(httpClient.getPackageUrls(), packageUrls);
        assertEquals(httpClient.getFileHandler(), fileHandler);
    }

    @Test
    public void testSetAndGetPackageUrls() {
        HttpClient httpClient = new HttpClient();
        ArrayList<String> packageUrls = new ArrayList<>();
        packageUrls.add("https://example.com/package1");
        packageUrls.add("https://example.com/package2");
        
        httpClient.setPackageUrls(packageUrls);
        assertEquals(httpClient.getPackageUrls(), packageUrls);
    }

    @Test
    public void testSetAndGetFileHandler() {
        HttpClient httpClient = new HttpClient();
        FileHandler fileHandler = new FileHandler("custom/path/input.xml");
        
        httpClient.setFileHandler(fileHandler);
        assertEquals(httpClient.getFileHandler(), fileHandler);
    }
}
