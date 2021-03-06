package explora.de.exploramaterial.tour.entity;

import android.content.ContentValues;

import java.io.Serializable;

import explora.de.exploramaterial.database.entity.Entity;
import explora.de.exploramaterial.database.DatabaseConstants;

/**
 * Created by Andi on 25.05.2016.
 */
public class Tour implements Entity, Serializable {

    private int id;
    private String dateTime;
    private String meetingSpot;
    private String tourGuide;
    private int price;
    private String title;
    private String description;
    private String rating;
    private int address;
    private int owner;

    public Tour(){}

    public Tour(int id, String dateTime, String meetingSpot, String tourGuide, int price, String title, String description, String rating, int address,int owner) {
        this.id = id;
        this.dateTime = dateTime;
        this.meetingSpot = meetingSpot;
        this.tourGuide = tourGuide;
        this.price = price;
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.address = address;
        this.owner = owner;
    }


    public ContentValues getInsertContentValues() {
        ContentValues values = new ContentValues();

        values.put(DatabaseConstants.TourEntry.COLUMN_NAME_DATETIME, dateTime);
        values.put(DatabaseConstants.TourEntry.COLUMN_NAME_MEETING_SPOT, meetingSpot);
        values.put(DatabaseConstants.TourEntry.COLUMN_NAME_TOUR_GUIDE, tourGuide);
        values.put(DatabaseConstants.TourEntry.COLUMN_NAME_PRICE, price);
        values.put(DatabaseConstants.TourEntry.COLUMN_NAME_TITLE, title);
        values.put(DatabaseConstants.TourEntry.COLUMN_NAME_DESCRIPTION, description);
        values.put(DatabaseConstants.TourEntry.COLUMN_NAME_RATING, rating);
        values.put(DatabaseConstants.TourEntry.COLUMN_NAME_ADDRESS, address);
        values.put(DatabaseConstants.TourEntry.COLUMN_NAME_OWNER, owner);

        return values;
    }
    @Override
    public ContentValues getContentValues() {
        ContentValues values = getInsertContentValues();
        values.put(DatabaseConstants.TourEntry._ID, id);

        return values;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getMeetingSpot() {
        return meetingSpot;
    }

    public void setMeetingSpot(String meetingSpot) {
        this.meetingSpot = meetingSpot;
    }

    public String getTourGuide() {
        return tourGuide;
    }

    public void setTourGuide(String tourGuide) {
        this.tourGuide = tourGuide;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getOwner(){return this.owner;}

    public void setOwner(int owner){this.owner = owner;}
}
