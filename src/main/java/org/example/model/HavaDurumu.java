package org.example.model;


// Hava durumu API bağlantısı
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class HavaDurumu{
    private static final String API_ANAHTARI = "f087ac4077d244b994e95823241912"; // API anahtarınızı buraya ekleyin.
    private static final String TEMEL_URL = "http://api.weatherapi.com/v1/current.json";

    public String havaDurumunuGetir(String sehir) throws Exception {
        // URL oluşturma
        URL url = new URL(TEMEL_URL + "?key=" + API_ANAHTARI + "&q=" + sehir);
        HttpURLConnection baglanti = (HttpURLConnection) url.openConnection();
        baglanti.setRequestMethod("GET");

        // API yanıtını okuma
        StringBuilder yanit;
        try (BufferedReader okuyucu = new BufferedReader(new InputStreamReader(baglanti.getInputStream()))) {
            String satir;
            yanit = new StringBuilder();
            while ((satir = okuyucu.readLine()) != null) {
                yanit.append(satir);
            }
        }

        // Yanıtı JSON nesnesine dönüştürme
        JSONObject jsonYanit = new JSONObject(yanit.toString());
        JSONObject current = jsonYanit.getJSONObject("current");
        String sicaklik = current.get("temp_c").toString(); // Sıcaklık (Celsius) değeri
        String durum = current.getJSONObject("condition").get("text").toString(); // Hava durumu açıklaması

        // Sonucu döndürme
        return "Şehir: " + sehir + "\nSıcaklık: " + sicaklik + "°C\nDurum: " + durum;
    }
}
