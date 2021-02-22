package mikefallonit.workrecord.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jobs")

public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="job_type")
    private String jobType;

    @Column(name="date")
    private String date;

    @Column(name="description")
    private String description;

    @JsonIgnoreProperties("jobs")
    @ManyToOne
    @JoinColumn(name="customer_id", nullable = false)
    private Customer customer;

    @Column(name="invoice_amount")
    private double invoiceAmount;

    @Column(name="date_invoiced")
    private String dateInvoiced;

    @Column(name="date_paid")
    private String datePaid;


    @OneToMany(mappedBy = "job")
    private List<Expenditure> expenditures;

    @OneToMany(mappedBy = "job")
    private List<Activity> activities;

    public Job(String jobType, String date, String description, Customer customer, double invoiceAmount,  String dateInvoiced, String datePaid) {
        this.jobType = jobType;
        this.date = date;
        this.description = description;
        this.customer = customer;
        this.invoiceAmount = invoiceAmount;
        this.dateInvoiced = dateInvoiced;
        this.datePaid = datePaid;
        this.expenditures = new ArrayList<>();
        this.activities = new ArrayList<>();
    }

    public Job() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public String getDateInvoiced() {
        return dateInvoiced;
    }

    public void setDateInvoiced(String dateInvoiced) {
        this.dateInvoiced = dateInvoiced;
    }

    public String getDatePaid() {
        return datePaid;
    }

    public void setDatePaid(String datePaid) {
        this.datePaid = datePaid;
    }
}
