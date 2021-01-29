package mikefallonit.workrecord.models;

import javax.persistence.*;

@Entity
@Table(name="expenditures")

public class Expenditure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="date")
    private String date;

    @Column(name="expensetype")
    private String expensetype;

    @Column(name="amount")
    private double amount;

   @ManyToOne
   @JoinColumn(name="job_id", nullable = false)
    private Job job;

    public Expenditure(String date, String expensetype, Job job, double amount) {
        this.date = date;
        this.expensetype = expensetype;
        this.job = job;
        this.amount = amount;
    }

    public Expenditure() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExpensetype() {
        return expensetype;
    }

    public void setExpensetype(String expensetype) {
        this.expensetype = expensetype;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }


}
