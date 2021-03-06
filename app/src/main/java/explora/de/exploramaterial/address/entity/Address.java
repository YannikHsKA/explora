package explora.de.exploramaterial.address.entity;

import android.content.ContentValues;

import explora.de.exploramaterial.database.entity.Entity;
import explora.de.exploramaterial.database.DatabaseConstants;

/**
 * Created by Marash on 25.05.2016.
 */
public class Address implements Entity {

    private int id;
    private String country;
    private String city;
    private String street;
    private String zipCode;

    public Address() {
    }

    public Address(String city) {
        this.city = city;
    }

    public Address(int id, String country, String city, String street, String zipCode) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.zipCode = zipCode;
    }

    @Override
    public ContentValues getContentValues() {
        ContentValues values = new ContentValues();

        values.put(DatabaseConstants.AddressEntry._ID, id);
        values.put(DatabaseConstants.AddressEntry.COLUMN_NAME_COUNTRY, country);
        values.put(DatabaseConstants.AddressEntry.COLUMN_NAME_CITY, city);
        values.put(DatabaseConstants.AddressEntry.COLUMN_NAME_STREET, street);
        values.put(DatabaseConstants.AddressEntry.COLUMN_NAME_ZIP_CODE, zipCode);

        return values;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
