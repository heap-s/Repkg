package org.repkg.installer;

import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.ArrayList;

public class HttpClient {
    private ArrayList<String> packageUrls;
    public HttpClient() {
        this.packageUrls = new ArrayList<>();
    }

    public HttpClient(ArrayList <String> packageUrls){
        this.packageUrls = packageUrls;
    }

    public ArrayList<String> getPackageUrls() {
        return packageUrls;
    }

    public void setPackageUrls(ArrayList <String> packageUrls){
        this.packageUrls = packageUrls; 
    }

    public ArrayList <JsonObject> minimalHttpClient(ArrayList<String> packageUrls) throws IOException, ParseException{
        ArrayList<JsonObject> results = new ArrayList<>();
        for (String url : packageUrls) {
            try (CloseableHttpClient httpClient = HttpClients.createMinimal()) {
                HttpGet request = new HttpGet(url);
                // this seems to be deprecated? Is there a better solution
                try (CloseableHttpResponse response = httpClient.execute(request)) {
                    String jsonString = EntityUtils.toString(response.getEntity());
                    JsonObject jsonObject = new Gson().fromJson(jsonString, JsonObject.class);
                    results.add(jsonObject);
                }
            } catch (IOException e) {
                // Log the exception or handle it as needed
                e.printStackTrace();
            }
        }
        return results;

    }
}
