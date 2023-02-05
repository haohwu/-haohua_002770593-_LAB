/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author whh
 */
public class Observation {

    int observationId;
    private double bloodPressure;
    private double temperature;
    private Medicine medicine;

    public Observation() {

    }

    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    public int getObservationId() {
        return observationId;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
    
    
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.valueOf(this.observationId);
    }

}
