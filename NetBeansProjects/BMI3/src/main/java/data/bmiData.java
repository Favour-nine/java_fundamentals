/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author paul
 */
public class bmiData {
    PropertyChangeListener pcl;
    
    public void addPropertyChangeListener(PropertyChangeListener propChangeListn){
        pcl = propChangeListn;
    }
    
    public float calculateBMI(){
        return this.getWeight() / (this.getHeight()* this.getHeight());
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(String heightM) {
        this.height = Float.parseFloat(heightM);
        setBmi(calculateBMI());
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(String weightKg) {
        this.weight = Float.parseFloat(weightKg);
        setBmi(calculateBMI());
    }

    public float getBmi() {
        return bmi;
    }

    public void setBmi(float bmi) {
        float oldBMI = bmi;
        this.bmi = bmi;
        try{
            pcl.propertyChange(new PropertyChangeEvent(this, "bmi", oldBMI, getBmi()));
        }catch (Exception e){
            pcl.propertyChange(new PropertyChangeEvent(this, "bmi", 0, "invalid numbers"));
        }
    }
    private float height, weight, bmi;
    
}
