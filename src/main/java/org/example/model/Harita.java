package org.example.model;

import javafx.scene.Node;
import javafx.scene.web.WebView;

public class Harita {
    private static final String API_KEY = "JyWqTCEjkSpUB0HDgbue"; // MapTiler API anahtarı
    private WebView webView;

    public Harita() {
        webView = new WebView();
    }

    public void haritayiYukle() {
        String mapHtml = """
                <!DOCTYPE html>
                <html>
                <head>
                    <meta charset="utf-8" />
                    <title>Map</title>
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <script src="https://unpkg.com/leaflet@1.9.4/dist/leaflet.js" 
                            integrity="sha256-oZ2cMnFMlX5WQBgRY9JjO2TYqKX3HQt/6KO7oEOVgGU=" 
                            crossorigin=""></script>
                    <link rel="stylesheet" 
                          href="https://unpkg.com/leaflet@1.9.4/dist/leaflet.css" 
                          integrity="sha256-sA+z+R5V5RMI1e78hWt69QFQfX9nK6G1HFNi7x3/JRs=" 
                          crossorigin=""/>
                </head>
                <body>
                    <div id="map" style="width: 100%; height: 100vh;"></div>
                    <script>
                        var map = L.map('map').setView([41.0082, 28.9784], 13); // İstanbul koordinatları
                        L.tileLayer('https://api.maptiler.com/maps/streets/{z}/{x}/{y}.png?key=""" + API_KEY;
        webView.getEngine().loadContent(mapHtml);
    }

    public Node getWebView() {
        return webView;
    }
}
