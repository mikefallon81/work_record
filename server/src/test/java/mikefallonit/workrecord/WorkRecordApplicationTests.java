package mikefallonit.workrecord;

import mikefallonit.workrecord.models.Activity;
import mikefallonit.workrecord.models.Customer;
import mikefallonit.workrecord.models.Expenditure;
import mikefallonit.workrecord.models.Job;
import mikefallonit.workrecord.repositories.ActivityRepository;
import mikefallonit.workrecord.repositories.CustomerRepository;
import mikefallonit.workrecord.repositories.ExpenditureRepository;
import mikefallonit.workrecord.repositories.JobRepository;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WorkRecordApplication.class)

public class WorkRecordApplicationTests {

	@Autowired
	JobRepository jobRepository;

	@Autowired
	ExpenditureRepository expenditureRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	ActivityRepository activityRepository;

	@Test
	public void contextLoads() {
	}


	@Test
	public void createCustomer(){
		Customer customer0 = new Customer("Stephen Loy Building Services", "stephenloy@hotmail.com", "0456987413");
		customerRepository.save(customer0);
		assertEquals(1, customerRepository.count());
	}

	@Test
	public void createJob(){
		Customer customer1 = new Customer("Joanna Fallon", "joannafallon@hotmail.com", "07918994772");
		customerRepository.save(customer1);
		Job job1 = new Job("IT", "01/05/2021", "PC broken", customer1, 50.00, "05/01/2021", "06/01/2021");
		jobRepository.save(job1);
		assertEquals(1, jobRepository.count());
	}

	@Test
	public void createExpense(){
		Customer customer1 = new Customer("Joanna Fallon", "joannafallon@hotmail.com", "07918994772");
		customerRepository.save(customer1);
		Job job1 = new Job("IT", "01/05/2021", "PC broken", customer1, 50.00, "05/01/2021", "06/01/2021");
		jobRepository.save(job1);
		Expenditure expenditure1 = new Expenditure("29/01/2021", "Materials", job1, 20.00);
		expenditureRepository.save(expenditure1);
		Expenditure expenditure2 = new Expenditure("26/01/2021", "Materials", job1, 30.00);
		expenditureRepository.save(expenditure2);
		assertEquals(2, expenditureRepository.count());

	}

	@Test
	public void createActivity(){
		Customer customer1 = new Customer("Joanna Fallon", "joannafallon@hotmail.com", "07918994772");
		customerRepository.save(customer1);
		Job job1 = new Job("IT", "01/05/2021", "PC broken", customer1, 50.00, "05/01/2021", "06/01/2021");
		jobRepository.save(job1);
		Activity activity1 = new Activity("01/02/2021", 5.0, job1, "Rerouted gas pipes, installed gas fire");
		activityRepository.save(activity1);
		assertEquals(1, activityRepository.count());
	}



}
