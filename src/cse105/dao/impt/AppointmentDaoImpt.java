package cse105.dao.impt;

import cse105.dao.AppointmentDao;
import cse105.model.Appointment;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hsu
 */
public class AppointmentDaoImpt implements AppointmentDao{

    private List<Appointment> Apps = null;
            
    /**
     *
     * @param app
     * @return
     */
    @Override
    public boolean addAppointment(Appointment app) {
        if (Apps == null){
            Apps = new ArrayList<>();
        }            
        return Apps.add(app);
    }

    /**
     *
     * @param index
     * @param app
     * @return
     */
    @Override
    public boolean updateAppointment(int index, Appointment app) {
        try{
            Apps.remove(index);
        } catch (Exception e){
            System.err.println(e.toString());
            return false;
        }
        return Apps.add(app);
    }

    /**
     *
     * @return
     */
    @Override
    public List<Appointment> returnAppsOrderedByLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public List<Appointment> returnAppsOrderedByDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return
     */
    @Override
    public List<Appointment> returnApps() {
        return Apps;
    }

    /**
     *
     * @param app
     * @return
     */
    @Override
    public boolean removeAppointment(Appointment app) {
        return Apps.remove(app);
    }
    
}
