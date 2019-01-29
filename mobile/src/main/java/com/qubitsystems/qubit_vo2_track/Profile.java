package com.qubitsystems.qubit_vo2_track;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Property;

public class Profile implements Parcelable {

    private String nameFirst;
    private String nameLast;

    private String userName;
    private int userAge;
    private String userGender;
    private double userHeight; // Centimeters
    private double userWeight; // Kilograms

    public void writeToParcel(Parcel dest, int flags){
        dest.writeString(nameFirst);
        dest.writeString(nameLast);
        dest.writeString(userName);
        dest.writeInt(userAge);
        dest.writeString(userGender);
        dest.writeDouble(userHeight);
        dest.writeDouble(userWeight);
    }

    public Profile(Parcel parcel){
        nameFirst = parcel.readString();
        nameLast = parcel.readString();
        userName = parcel.readString();
        userAge = parcel.readInt();
        userGender = parcel.readString();
        userHeight = parcel.readDouble();
        userWeight = parcel.readDouble();

    }

    public static final Parcelable.Creator<Profile> CREATOR = new Parcelable.Creator<Profile>(){

        public Profile createFromParcel(Parcel parcel) {
            return new Profile(parcel);
        }

        public Profile[] newArray(int size) {
            return new Profile[0];
        }
    };

    public int describeContents() {
        return hashCode();
    }

    public Profile() {
        this.nameFirst = "FIRST";
        this.nameLast = "LAST";
        this.userName = "USER";
        this.userAge = 0;
        this.userGender = "GENDER";
        this.userHeight = 0.00;
        this.userWeight = 0.00;
    }

    public Profile(String firstName, String lastName, String user, int age, String gender, double heightVal, double weightVal){
        this.nameFirst = firstName;
        this.nameLast = lastName;
        this.userName = user;
        this.userAge = age;
        this.userGender = gender;
        this.userHeight = heightVal;
        this.userWeight = weightVal;
    }

    public String getFirstName() {return nameFirst;}
    public String getLastName() {return nameLast;}
    public String getUserName() {return userName;}
    public int getUserAge() {return userAge;}
    public String getUserGender() {return userGender;}
    public double getUserHeight() {return userHeight;}
    public double getUserWeight() {return userWeight;}

}
