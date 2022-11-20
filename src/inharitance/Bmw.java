package inharitance;

import java.util.Objects;

public class Bmw extends Car{
    private boolean abs;
    private String interior;
    private String driveUnit;

    public Bmw() {
    }

    public boolean isAbs() {
        return abs;
    }

    public Bmw setAbs(boolean abs) {
        this.abs = abs;
        return this;
    }

    public String getInterior() {
        return interior;
    }

    public Bmw setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    public String getDriveUnit() {
        return driveUnit;
    }

    public Bmw setDriveUnit(String driveUnit) {
        this.driveUnit = driveUnit;
        return this;
    }

    @Override
    public boolean  equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bmw bmw = (Bmw) o;
        return abs == bmw.abs && Objects.equals(interior, bmw.interior) && Objects.equals(driveUnit, bmw.driveUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abs, interior, driveUnit);
    }

    @Override
    public String getCarInformation() {
        return super.getCarInformation()+
                "ABS: " + abs+"\n"+
                "Interior: " + interior+"\n"+
                "Drive unit: " + driveUnit+"\n";
    }
}
