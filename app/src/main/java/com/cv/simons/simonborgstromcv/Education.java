package com.cv.simons.simonborgstromcv;

/**
 * Created by Simons on 17/03/2016.
 */
public class Education {

    private int id;
    private String namn;

    public Education(int id, String namn) {
        this.id = id;
        this.namn = namn;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return namn;
    }

    @Override
    public String toString() {
        return namn;
    }


}
