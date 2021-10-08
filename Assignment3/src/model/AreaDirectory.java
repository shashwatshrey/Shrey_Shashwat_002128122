
package model;

import java.util.ArrayList;
import java.util.List;


public class AreaDirectory {

    private List<Area> areaList;

    public AreaDirectory() {
        areaList = new ArrayList<Area>();
    }

    public List<Area> getArealist() {
        return areaList;
    }

    public Area addSupplier() {
        Area newSupplier = new Area();
        areaList.add(newSupplier);
        return newSupplier;
    }

    public void removeSupplier(Area a) {
        areaList.remove(a);
    }

    public Area searchSupplier(String areaName) {
        for (Area area : areaList) {
            if (area.getAreaName().equals(areaName)) {
                return area;
            }
        }
        return null;
    }
}
