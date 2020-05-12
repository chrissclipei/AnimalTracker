package toombs.animaltracker.wrappers;

import java.util.GregorianCalendar;

public class Animal {
    /** The current weight of the animal. contains information about previous weights. **/
    private WeightWrapper currentWeight;
    /** The current picture of the animal. contains information about any previous pictures. **/
    private PictureWrapper currentPicture;
    /** The most recently logged information for an animal. contains information about less recently
     * logged information.
     */
    private LogInfoWrapper lastLoggedInfo;
    /** The animal's scientific name if provided */
    private String scientificName;
    /** The animal's common name if provided, i.e. dog */
    private String commonName;
    /** The animal's pet name. */
    private String petName;
    /** The animal's date of birth */
    private GregorianCalendar dateOfBirth;
    /** The animal's sex.*/
    private String sex;
    /** Whether or not an animal is archived or still in use. */
    private  boolean archived;
    /**
     *
     * @param currentWeight The current weight of the animal. contains information about previous weights.
     * @param currentPicture The current picture of the animal. contains information about any previous pictures.
     * @param lastLoggedInfo The most recently logged information for an animal. contains information about less recently
     *       logged information.
     * @param scientificName The animal's scientific name if provided
     * @param commonName The animal's common name if provided, i.e. dog
     * @param petName The animal's pet name.
     * @param dateOfBirth The animal's date of birth
     * @param sex The animal's sex.
     * @param archived whether or not an animal is archived or still in use.
     */
    public Animal(WeightWrapper currentWeight, PictureWrapper currentPicture, LogInfoWrapper lastLoggedInfo,
        String scientificName, String commonName, String petName, GregorianCalendar dateOfBirth,
                  String sex, boolean archived){
            this.currentWeight = currentWeight;
            this.currentPicture = currentPicture;
            this.lastLoggedInfo = lastLoggedInfo;
            this.scientificName = scientificName;
            this.commonName = commonName;
            this.petName = petName;
            this.dateOfBirth = dateOfBirth;
            this.sex = sex;
            this.archived = archived;
    }
    /** sets the most recently taken picture of an animal. NOT TO BE USED FOR PICTURES
     * THAT ARE NOT THE MOST RECENTLY TAKEN*/
    public void updatePicture(PictureWrapper newPic) {
        currentPicture = newPic;
    }

    /** sets the most recently logged information of an animal. NOT TO BE USED FOR LOGGED INFO THAT
     * IS NOT MOST RECENT.
     */
    public void updateLogInfo(LogInfoWrapper newLogInfo) {
        lastLoggedInfo = newLogInfo;
    }

    /**
     * sets the most recently recorded weight of an animal. NOT TO BE USED FOR RECORDED WEIGHTS THAT
     * ARE NOT MOST RECENT.
     */
    public void  updateWeight(WeightWrapper newWeight) {
        currentWeight = newWeight;
    }

    public String getCommonName() {
        return commonName;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public LogInfoWrapper getLastLoggedInfo() {
        return lastLoggedInfo;
    }

    public PictureWrapper getCurrentPicture() {
        return currentPicture;
    }

    public String getPetName() {
        return petName;
    }

    public String getScientificName() {
        return scientificName;
    }
    /** haha, you WISH it worked the way you thought it would :) */
    public String getSex() {
        return sex;
    }

    public WeightWrapper getCurrentWeight() {
        return currentWeight;
    }

}
