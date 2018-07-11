package cse105.dao.impt;

import cse105.dao.AppointmentDao;
import cse105.model.Appointment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hsu
 */
public class AppointmentDaoImpt implements AppointmentDao {

    private List<Appointment> Apps = null;

    /**
     *
     * @param app
     * @return
     */
    @Override
    public boolean addAppointment(Appointment app) {
        if (Apps == null) {
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
        try {
            Apps.remove(index);
        } catch (Exception e) {
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
    public Map<String, List<Appointment>> returnAppsOrderedByLocation() {
        Map<String, List<Appointment>> result = new HashMap<>();
        for (Appointment app : Apps) {
            if (result.containsKey(app.getLocation())) {
                result.get(app.getLocation()).add(app);
            } else {
                List<Appointment> AppsList = new ArrayList<>();
                AppsList.add(app);
                result.put(app.getLocation(), AppsList);
            }
        }
        return result;
    }

    /**
     *
     * @return
     */
    @Override
    public List<Appointment> returnAppsOrderedByDate() {
        List<Appointment> listTmp = new ArrayList<>(Apps);

        Collections.sort(listTmp, (o1, o2) -> {
            Appointment a1 = (Appointment) o1;
            Appointment a2 = (Appointment) o2;
            int ret = a1.getDate().compareTo(a2.getDate());

            if (ret == 0) {
                int hour1 = Integer.parseInt(a1.getTime().substring(0, 2));
                int min1 = Integer.parseInt(a1.getTime().substring(3));
                int hour2 = Integer.parseInt(a2.getTime().substring(0, 2));
                int min2 = Integer.parseInt(a2.getTime().substring(3));

                if ((hour1 * 100 + min1) > (hour2 * 100 + min2)) {
                    return 1;
                }
            } else if (ret > 0){
                return 1;
            }
            return -1;
        });
        
        return listTmp;
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
