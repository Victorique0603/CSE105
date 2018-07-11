/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse105.dao;

import cse105.model.Appointment;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Hsu
 */
public interface AppointmentDao {
    public boolean addAppointment (Appointment app);
    public boolean updateAppointment(int index, Appointment app);
    public Map<String, List<Appointment>> returnAppsOrderedByLocation();
    public List<Appointment> returnAppsOrderedByDate();
    public List<Appointment> returnApps();
    public boolean removeAppointment(Appointment app);
}
