package org.repkg.installer;

import org.junit.Test;
import org.junit.Before;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.io.IOException;
import org.apache.hc.core5.http.ParseException;
import com.google.gson.JsonObject;

import org.repkg.utils.FileHandler;
import org.repkg.logger.Logger;

public class HttpClientTest {
    @Mock
    private Logger mockLogger;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

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

    @Test
    public void testMinimalHttpClientException() throws IOException, ParseException {
        HttpClient httpClient = new HttpClient();
        httpClient.log = mockLogger; // Inject the mock logger

        ArrayList<String> invalidUrls = new ArrayList<>();
        invalidUrls.add("http://invalid.url");

        ArrayList<JsonObject> results = httpClient.minimalHttpClient(invalidUrls);

        assertTrue(results.isEmpty());
        verify(mockLogger).CannotFetchPackageException();
    }
}
