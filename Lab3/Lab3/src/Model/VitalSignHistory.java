/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author whh
 */
public class VitalSignHistory {

    ArrayList<Observation> vitalSignHistory;

    public VitalSignHistory() {
        this.vitalSignHistory = new ArrayList<Observation>();
    }

    public ArrayList<Observation> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<Observation> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public Observation createObservation(int observationId, double bloodPressure, double tempertaure) {
        Observation observation = new Observation();
        observation.setBloodPressure(bloodPressure);
        observation.setTemperature(tempertaure);
        observation.setObservationId(observationId);

        this.vitalSignHistory.add(observation);
        return observation;
    }

    public Boolean CheckObservationIDUnique(int id) {
        for (Observation o : this.vitalSignHistory) {
            if (o.getObservationId() == id) {
                return false;
            }

        }
        return true;
    }

    public Observation findObservation(Integer valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
