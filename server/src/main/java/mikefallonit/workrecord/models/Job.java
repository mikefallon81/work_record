package mikefallonit.workrecord.models;

import javax.persistence.*;

@Entity
@Table(name="jobs")

public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="customer")
    private String customer;

    @Column(name="hourly_rate")
    private double hourlyRate;

    @Column(name="hours")
    private double hours;

    public Job(String customer, double hourlyRate, double hours) {
        this.customer = customer;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public Job() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
