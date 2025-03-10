/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author ayobami7
 */
public class JourneyCoster {
    
    private float mpg;
    private float miles;
    private float pricePerLitre;
  
    private float totalCost;
    
    PropertyChangeListener pcl=null;
    
    public float getTotalCost() {
        return totalCost;
    }
    
    public void addPropertyChangeListener(PropertyChangeListener outsidePcl)
    {
        this.pcl = outsidePcl;
    }
   
    /**
     * @return the mpg
     */
    float g2l = (float) 4.54609;
    public float getMpg() {
        return mpg;
    }

    /**
     * @param mpg the mpg to set
     */
    public void setMpg(float mpg) {
        this.mpg = mpg;
        getJourneyCost();
    }

    /**
     * @return the miles
     */
    public float getMiles() {
        return miles;
    }

    /**
     * @param miles the miles to set
     */
    public void setMiles(float miles) {
        this.miles = miles;
        getJourneyCost();
    }

    /**
     * @return the pricePerLitre
     */
    public float getPricePerLitre() {
        return pricePerLitre;
    }

    /**
     * @param pricePerLitre the pricePerLitre to set
     */
    public void setPricePerLitre(float pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
        getJourneyCost();
    }
    
     /**
     * performs not null validation first, then greater than zero validation
     * throws an IllegalArgumentException if validation fails
     * the exception is passed to GUI (for display using JOptionPane)
     */
    public void setJourneyValues(String mpg, String pricePerLitre, String miles) throws IllegalArgumentException
    {
        if (
            miles != null && Float.parseFloat(miles) > 0 &&   
            mpg != null && Float.parseFloat(mpg) > 0 &&
            pricePerLitre != null && Float.parseFloat(pricePerLitre) > 0) 
            {
                this.setMiles(Float.parseFloat(miles));
                this.setMpg(Float.parseFloat(mpg));
                this.setPricePerLitre(Float.parseFloat(pricePerLitre));
                getJourneyCost();
                if (pcl!=null) pcl.propertyChange(new PropertyChangeEvent(this,"costs", null, toString()));
            }             
        else 
            throw new IllegalArgumentException();
    }  
    
    private boolean getJourneyCost()
    {
        try 
        {
        float milesPerLitre =  mpg/g2l;
        float petrolNeeded = miles/milesPerLitre;
        this.totalCost = petrolNeeded*pricePerLitre;
        return true;
        }
        catch (Exception e)
        {
            return false;
        }               
    }
    
    @Override
    public String toString()
    {
        return String.format("%.0f miles @ £%.2f per litre at %.1f mpg costs £%.2f",
                this.miles, this.pricePerLitre, this.mpg, this.totalCost);
    }
}



