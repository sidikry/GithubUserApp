package com.timkontrakan.githubuserapp.model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private String username, name, address, following, followers, aboutme;
    private int avatar;

    public User() {
    }

    public User(String username, String name, String address, String following, String followers, String aboutme, int avatar) {
        this.username = username;
        this.name = name;
        this.address = address;
        this.following = following;
        this.followers = followers;
        this.aboutme = aboutme;
        this.avatar = avatar;
    }

    private User(Parcel in) {
        username = in.readString();
        name = in.readString();
        address = in.readString();
        following = in.readString();
        followers = in.readString();
        aboutme = in.readString();
        avatar = in.readInt();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getFollowers() {
        return followers;
    }

    public void setFollowers(String followers) {
        this.followers = followers;
    }

    public String getAboutme() {
        return aboutme;
    }

    public void setAboutme(String aboutme) {
        this.aboutme = aboutme;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(name);
        dest.writeString(address);
        dest.writeString(following);
        dest.writeString(followers);
        dest.writeString(aboutme);
        dest.writeInt(avatar);
    }
}
