package com.example.pars2;

import android.os.Parcel;
import android.os.Parcelable;

public class Contacts implements Parcelable {
    private String name;
    private String surname;
    private int idx;

    public Contacts(String name, String surname, int idx) {
        this.name = name;
        this.surname = surname;
        this.idx = idx;
    }

    protected Contacts(Parcel in) {
        name = in.readString();
        surname = in.readString();
        idx = in.readInt();
    }

    public static final Creator<Contacts> CREATOR = new Creator<Contacts>() {
        @Override
        public Contacts createFromParcel(Parcel in) {
            return new Contacts(in);
        }

        @Override
        public Contacts[] newArray(int size) {
            return new Contacts[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(surname);
        dest.writeInt(idx);
    }
}
