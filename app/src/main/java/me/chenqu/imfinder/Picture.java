package me.chenqu.imfinder;

/**
 * Created by Chen Qu on 2016/1/25.
 */
public class Picture {
    public int _id;
    public String tag;
    public String fileName;

    public Picture() {
    }

    public Picture(String tag, String fileName) {
        this.tag = tag;
        this.fileName = fileName;
    }
}
