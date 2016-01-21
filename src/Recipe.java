/**
 * Created by phucnguyen on 1/20/16.
 */

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;


public class Recipe {
    private DoubleProperty dispenseVolume;
    private DoubleProperty dispenseRate;
    private DoubleProperty suckbackVolume;
    private DoubleProperty suckbackRate;
    private DoubleProperty extra;
    private DoubleProperty reloadRate;

    public Recipe(double dispenseVolume,double dispenseRate, double suckbackVolume, double suckbackRate, double extra, double reloadRate) {
        this.dispenseVolume = new SimpleDoubleProperty(dispenseVolume);
        this.suckbackVolume = new SimpleDoubleProperty(suckbackVolume);
        this.suckbackRate = new SimpleDoubleProperty(suckbackRate);
        this.dispenseRate = new SimpleDoubleProperty(dispenseRate);
        this.extra = new SimpleDoubleProperty(extra);
        this.reloadRate = new SimpleDoubleProperty(reloadRate);

    }

    /**
     * Default constructor with empty arguments.
     * Every property is set to 0
     */
    public Recipe() {
        dispenseVolume = new SimpleDoubleProperty(0);
        dispenseRate = new SimpleDoubleProperty(0);
        suckbackVolume = new SimpleDoubleProperty(0);
        suckbackRate = new SimpleDoubleProperty(0);
        extra = new SimpleDoubleProperty(0);
        reloadRate = new SimpleDoubleProperty(0);
    }


    // Getters and setters

    public double getDispenseVolume() {
        return dispenseVolume.get();
    }

    public DoubleProperty dispenseVolumeProperty() {
        return dispenseVolume;
    }

    public void setDispenseVolume(double dispenseVolume) {
        this.dispenseVolume.set(dispenseVolume);
    }

    public double getDispenseRate() {
        return dispenseRate.get();
    }

    public DoubleProperty dispenseRateProperty() {
        return dispenseRate;
    }

    public void setDispenseRate(double dispenseRate) {
        this.dispenseRate.set(dispenseRate);
    }

    public double getSuckbackVolume() {
        return suckbackVolume.get();
    }

    public DoubleProperty suckbackVolumeProperty() {
        return suckbackVolume;
    }

    public void setSuckbackVolume(double suckbackVolume) {
        this.suckbackVolume.set(suckbackVolume);
    }

    public double getSuckbackRate() {
        return suckbackRate.get();
    }

    public DoubleProperty suckbackRateProperty() {
        return suckbackRate;
    }

    public void setSuckbackRate(double suckbackRate) {
        this.suckbackRate.set(suckbackRate);
    }

    public double getExtra() {
        return extra.get();
    }

    public DoubleProperty extraProperty() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra.set(extra);
    }

    public double getReloadRate() {
        return reloadRate.get();
    }

    public DoubleProperty reloadRateProperty() {
        return reloadRate;
    }

    public void setReloadRate(double reloadRate) {
        this.reloadRate.set(reloadRate);
    }




}
