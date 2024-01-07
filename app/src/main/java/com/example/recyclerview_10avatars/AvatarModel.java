package com.example.recyclerview_10avatars;

public class AvatarModel {

    String name;

    String description;

    int avatarimage;

    public AvatarModel(String name, String description, int avatarimage) {
        this.name = name;
        this.description = description;
        this.avatarimage = avatarimage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAvatarimage() {
        return avatarimage;
    }

    public void setAvatarimage(int avatarimage) {
        this.avatarimage = avatarimage;
    }
}
