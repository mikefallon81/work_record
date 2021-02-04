package mikefallonit.workrecord;


import mikefallonit.workrecord.models.Activity;
import mikefallonit.workrecord.models.Customer;
import mikefallonit.workrecord.models.Expenditure;
import mikefallonit.workrecord.models.Job;
import mikefallonit.workrecord.repositories.ActivityRepository;
import mikefallonit.workrecord.repositories.CustomerRepository;
import mikefallonit.workrecord.repositories.ExpenditureRepository;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import mikefallonit.workrecord.repositories.JobRepository;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest

public class WorkRecordApplicationTests {

	@Autowired
	JobRepository jobRepository;

	@Autowired
	ExpenditureRepository expenditureRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	ActivityRepository activityRepository;

	@org.junit.Test
	public void contextLoads() {
	}


	@org.junit.Test
	public void createCustomer(){
		Customer customer0 = new Customer("Stephen Loy Building Services", "stephenloy@hotmail.com", "0456987413", "Mount vernon road", "Inch", "Edinburgh", "EH16 7hr");
		customerRepository.save(customer0);
		assertEquals(4, customerRepository.count());
	}

	@org.junit.Test
	public void createJob(){
		Customer customer1 = new Customer("Joanna Fallon", "joannafallon@hotmail.com", "07918994772", "53  Gilmour Road", "Newington", "Edinburgh", "EH16 5NU");
		customerRepository.save(customer1);
		Job job1 = new Job(customer1, 8.00, 5.00);
		jobRepository.save(job1);
		assertEquals(2, jobRepository.count());
	}

	@org.junit.Test
	public void createExpense(){
		Customer customer1 = new Customer("Joanna Fallon", "joannafallon@hotmail.com", "07918994772", "53  Gilmour Road", "Newington", "Edinburgh", "EH16 5NU");
		customerRepository.save(customer1);
		Job job1 = new Job(customer1, 20.00, 10);
		jobRepository.save(job1);
		Expenditure expenditure1 = new Expenditure("29/01/2021", "Materials", job1, 20.00);
		expenditureRepository.save(expenditure1);
		Expenditure expenditure2 = new Expenditure("26/01/2021", "Materials", job1, 30.00);
		expenditureRepository.save(expenditure2);
		assertEquals(2, expenditureRepository.count());

	}

	@org.junit.Test
	public void createActivity(){
		Customer customer1 = new Customer("Joanna Fallon", "joannafallon@hotmail.com", "07918994772", "53  Gilmour Road", "Newington", "Edinburgh", "EH16 5NU");
		customerRepository.save(customer1);
		Job job1 = new Job(customer1, 20.00, 10);
		jobRepository.save(job1);
		Activity activity1 = new Activity("01/02/2021", 5.0, job1, "Rerouted gas pipes, installed gas fire");
		activityRepository.save(activity1);
	}



}
