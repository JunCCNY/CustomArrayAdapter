package com.codingmechanic.customarrayadapter;

/**
 * Created by mofi on 9/30/16.
 */

public class Event {
    private String date;
    private String name;
    private int capacity;
    private String location;
    private String food;
    private int bgImage;



    public Event(String name, String location, String food, String date, int capacity, int bgImage) {
        this.name = name;
        this.location = location;
        this.food = food;
        this.date = date;
        this.capacity = capacity;
        this.bgImage = bgImage;

    }

    public int getCapacity() {
        return capacity;
    }

    public String getDate() {
        return date;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public int getBgImage() {
        return bgImage;
    }
}
