package composition;

public class Equipment {
    private String abs;
    private String interior;
    private String driveUnit;

    public Equipment() {

    }

    public String getAbs() {
        return abs;
    }

    public Equipment setAbs(String abs) {
        this.abs = abs;
        return this;
    }

    public String getInterior() {
        return interior;
    }

    public Equipment setInterior(String interior) {
        this.interior = interior;
        return this;
    }

    public String getDriveUnit() {
        return driveUnit;
    }

    public Equipment setDriveUnit(String driveUnit) {
        this.driveUnit = driveUnit;
        return this;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "abs='" + abs + '\'' +
                ", interior='" + interior + '\'' +
                ", driveUnit='" + driveUnit + '\'' +
                '}';
    }
}
