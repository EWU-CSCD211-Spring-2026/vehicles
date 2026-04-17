
package model;

/**
 * Represents a drive train
 */
public class DriveTrain {

    private String type;

    /**
     * Initialize the drive train
     * @param type the type of drivetrain (e.g. AWD, RWD, FWD)
     */
    public DriveTrain(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (this.getClass() != obj.getClass()) {
            return false;
        }
        DriveTrain other = (DriveTrain) obj;
        if (!(this.type.equals(other.type))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return type.hashCode();
    }

}
