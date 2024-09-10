package org.repkg.installer;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class HttpClientTest {
    @Test
    public void testHttpClient() {
        HttpClient httpClient = new HttpClient();
        assertEquals(httpClient.getPackageUrls(), new ArrayList<>());
    }

    @Test
    public void testHttpClientWithPackageUrls() {
        ArrayList<String> packageUrls = new ArrayList<>();
        packageUrls.add("https://example.com/package1");
        packageUrls.add("https://example.com/package2");
        HttpClient httpClient = new HttpClient(packageUrls);
        assertEquals(httpClient.getPackageUrls(), packageUrls);
    }

}
