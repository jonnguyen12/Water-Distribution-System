package sample;

/**
 * Created by phucnguyen on 1/20/16.
 */

import javafx.beans.property.SimpleDoubleProperty;

/**
 * Dispense Volumne
 Dispense Rate
 Suckback Volume
 Suckback Rate
 Extra
 Reload rate

 */
public class Recipe {
    private SimpleDoubleProperty dispenseVolume;
    private SimpleDoubleProperty dispenseRate;
    private SimpleDoubleProperty suckbackVolume;
    private SimpleDoubleProperty suckbackRate;
    private SimpleDoubleProperty extra;
    private SimpleDoubleProperty reloadRate;

    public Recipe(double dispenseVolume,double dispenseRate, double suckbackVolume, double suckbackRate, double extra, double reloadRate) {
        this.dispenseVolume = new SimpleDoubleProperty(dispenseVolume);
        this.suckbackVolume = new SimpleDoubleProperty(suckbackVolume);
        this.suckbackRate = new SimpleDoubleProperty(suckbackRate);
        this.dispenseRate = new SimpleDoubleProperty(dispenseRate);
        this.extra = new SimpleDoubleProperty(extra);
        this.reloadRate = new SimpleDoubleProperty(reloadRate);

    }


    public Recipe() {
        dispenseVolume = new SimpleDoubleProperty(0);
        dispenseRate = new SimpleDoubleProperty(0);
        suckbackVolume = new SimpleDoubleProperty(0);
        suckbackRate = new SimpleDoubleProperty(0);
        extra = new SimpleDoubleProperty(0);
        reloadRate = new SimpleDoubleProperty(0);
    }






}
