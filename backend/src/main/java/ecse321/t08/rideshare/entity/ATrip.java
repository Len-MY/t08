package ecse321.t08.rideshare.entity;

import javax.persistence.*;

@Entity
@Table(name = "trips")
@NamedQueries({
        @NamedQuery(name = "ATrip.findAll", query = "SELECT e FROM ATrip e")
})
public class ATrip {

    private int tripid;
    private int tripStatus; // 0 for ongoing, 1 for planned, 2 for completed
    private String costPerStop; // Contains all costs per stop, in order, separated by delimiter ';'
    private long startdate; // Implemented as Unix Time Stamp
    private long enddate;
    private String startLocation;
    private String stops; // Contains all stops, separated by delimiter ';'
    private int vehicleid;
    private String passengerid; // Contains all passenger ids, separated by delimiter ';'
    private int driverid;

    public ATrip() {
    }

    public ATrip(
        int tripid,
        int tripStatus,
        String costPerStop,
        long startDate,
        long endDate,
        String startLocation,
        String stops,
        int vehicleid,
        String passengerid,
        int driverid
    ) {
        this.tripid = tripid;
        this.tripStatus = tripStatus;
        this.costPerStop = costPerStop;
        this.startdate = startDate;
        this.enddate = endDate;
        this.startLocation = startLocation;
        this.stops = stops;
        this.vehicleid = vehicleid;
        this.passengerid = passengerid;
        this.driverid = driverid;
    }

    @Column(name = "passengerid")
    public String getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid;
    }

    @Id
    @Column(name = "tripid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getTripid() {
        return this.tripid;
    }

    public void setTripid(int value) {
        this.tripid = value;
    }

    @Column(name = "startdate")
    public long getStartdate() {
        return this.startdate;
    }

    public void setStartdate(long value) {
        this.startdate = value;
    }

    @Column(name = "enddate")
    public long getEnddate() {
        return enddate;
    }

    public void setEnddate(long endDate) {
        this.enddate = endDate;
    }

    @Column(name = "status")
    public int getStatus() {
        return this.tripStatus;
    }

    public void setStatus(int value) {
        this.tripStatus = value;
    }

    @Column(name = "startlocation")
    public String getStartLocation() {
        return this.startLocation;
    }

    public void setStartLocation(String value) {
        this.startLocation = value;
    }

    @Column(name = "getstops")
    public String getStops() {
        return this.stops;
    }

    public void setStops(String value) {
        this.stops = value;
    }

    @Column(name = "cost")
    public String getCostPerStop() {
        return costPerStop;
    }

    public void setCostPerStop(String costPerStop) {
        this.costPerStop = costPerStop;
    }

    @Column(name = "vehicleid")
    public int getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(int vehicleid) {
        this.vehicleid = vehicleid;
    }

    @Column(name = "driverid")
    public int getDriverid() {
        return driverid;
    }

    public void setDriverid(int driverid) {
        this.driverid = driverid;
    }
}