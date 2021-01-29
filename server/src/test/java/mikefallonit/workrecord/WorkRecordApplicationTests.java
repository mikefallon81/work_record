package mikefallonit.workrecord;


import mikefallonit.workrecord.models.Customer;
import mikefallonit.workrecord.models.Expenditure;
import mikefallonit.workrecord.models.Job;
import mikefallonit.workrecord.repositories.CustomerRepository;
import mikefallonit.workrecord.repositories.ExpenditureRepository;
import org.junit.jupiter.api.Test;
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

	@Test
	public void contextLoads() {
	}

	@Test
	public void createJob(){
		Job job1 = new Job(customer1, 8.00, 5.00);
		jobRepository.save(job1);
		Customer customer1 = new Customer("Joanna Fallon", "joannafallon@hotmail.com", "07918994772", "53  Gilmour Road", "Newington", "Edinburgh", "EH16 5NU", job1);
		customerRepository.save(customer1);

		assertEquals(1, jobRepository.count());
	}

	@Test
	public void createExpense(){
		Job job1 = new Job("Joanna Fallon", 20.00, 10);
		jobRepository.save(job1);
		Expenditure expenditure1 = new Expenditure("29/01/2021", "Materials", job1, 20.00);
		expenditureRepository.save(expenditure1);
		Expenditure expenditure2 = new Expenditure("26/01/2021", "Materials", job1, 30.00);
		expenditureRepository.save(expenditure2);
		assertEquals(2, expenditureRepository.count());

	}



}
