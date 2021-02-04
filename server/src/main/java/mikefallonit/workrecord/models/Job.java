package mikefallonit.workrecord.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jobs")

public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="customer_id", referencedColumnName = "id")
    private Customer customer;

    @Column(name="hourly_rate")
    private double hourlyRate;

    @Column(name="hours")
    private double hours;

    @OneToMany(mappedBy = "job")
    private List<Expenditure> expenditures;

    @OneToMany(mappedBy = "job")
    private List<Activity> activities;

    public Job(Customer customer, double hourlyRate, double hours) {
        this.customer = customer;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
        this.expenditures = new ArrayList<Expenditure>();
        this.activities = new ArrayList<Activity>();
    }

    public Job() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
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
