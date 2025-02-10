package org.example.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class HavaDurumu implements Yuklenebilir{

    private static final String API_ANAHTARI = "f087ac4077d244b994e95823241912";
    private static final String TEMEL_URL = "http://api.weatherapi.com/v1/current.json";

    @Override
    public String yukle(String sehir) throws IOException {

        URL url = new URL(TEMEL_URL + "?key=" + API_ANAHTARI + "&q=" + sehir);
        HttpURLConnection baglanti = (HttpURLConnection) url.openConnection();
        baglanti.setRequestMethod("GET");

        StringBuilder yanit;
        try (BufferedReader okuyucu = new BufferedReader(new InputStreamReader(baglanti.getInputStream()))) {
            String satir;
            yanit = new StringBuilder();
            while ((satir = okuyucu.readLine()) != null) {
                yanit.append(satir);
            }
        }

        JSONObject jsonYanit = new JSONObject(yanit.toString());
        JSONObject current = jsonYanit.getJSONObject("current");
        String sicaklik = current.get("temp_c").toString();
        String durum = current.getJSONObject("condition").get("text").toString();

        return "Şehir: " + sehir + "\nSıcaklık: " + sicaklik + "°C\nDurum: " + durum;
    }
}
