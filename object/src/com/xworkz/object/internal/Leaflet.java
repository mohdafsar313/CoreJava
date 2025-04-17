package com.xworkz.object.internal;

import java.util.Objects;

public class Leaflet {
    private String title;
    private String content;
    private String color;
    private int pages;

    public Leaflet() {
    }

    public void setLeaflet(String title, String content, String color, int pages) {
        this.title = title;
        this.content = content;
        this.color = color;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Leaflet{title='" + title + "', content='" + content + "', color='" + color + "', pages=" + pages + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Leaflet) {
            Leaflet leaflet = (Leaflet) obj;
            if (Objects.equals(this.title, leaflet.title) &&
                    Objects.equals(this.content, leaflet.content) &&
                    Objects.equals(this.color, leaflet.color) &&
                    this.pages == leaflet.pages) {
                System.out.println("Leaflets are matching..");
                return true;
            }
        }
        return false;
    }
}
