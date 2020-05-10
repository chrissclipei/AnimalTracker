package toombs.animaltracker.wrappers.infoClasses;

import android.media.Image;

import java.util.GregorianCalendar;

public class PictureInfo extends  GenericInfo {
    /**
     * The image that is being saved.
     */
    private Image picture;

    /**
     *
     * @param infoDate the date corresponding to the message.
     * @param picture the image tha is being saved.
     */
    public PictureInfo(GregorianCalendar infoDate, Image picture) {
        super(infoDate);
        this.picture = picture;
    }

    /**
     *
     * @return the image that is saved.
     */
    public Image getPicture() {
        return picture;
    }
}