package toombs.animaltracker.wrappers.infoClasses;

import java.util.GregorianCalendar;

public class WeightInfo extends GenericInfo
{
    /**
     * the weight being saved.
     */
    private double weight;

    /**
     * the unit of the weight, 0 for kg, 1 for lbs.
     */
    private int unit;

    /**
     *
     * @param infoDate the date corresponding to information provided.
     * @param weight the 'weight' of the animal.
     * @param unit unit specifying what the weight is measured in. 0 for kg, 1 for lbs.
     */
    public WeightInfo(GregorianCalendar infoDate, double weight, int unit) {
        super(infoDate);
        this.weight = weight;
        this.unit = unit;
    }

    /**
     *
     * @return the weight being saved.
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @return the unit of measurement for the weight. 0 for kg, 1 for lbs.
     */
    public int getUnit() {
        return unit;
    }

    /**
     *
     * @param weight the new weight associated with the data
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @param unit the *potentially* new unit of measurement for the data.
     * fails silently if unit is invalid.
     */
    public void setUnit(int unit) {
        if(unit != 1 && unit != 0) {
            return;
        }
        this.unit = unit;
    }
}
