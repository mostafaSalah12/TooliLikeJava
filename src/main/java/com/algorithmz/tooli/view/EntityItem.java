package com.algorithmz.tooli.view;

/**
 * Created by kmagdy on 7/26/2017.
 */
public class EntityItem {
    private String name;
    private int type;
    private String thumbnail;
    private long id;

    public EntityItem() {
    }

    public EntityItem(String name, int type, String thumbnail, long id) {
        this.name = name;
        this.type = type;
        this.thumbnail = thumbnail;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
