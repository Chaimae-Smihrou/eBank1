package org.sid.ebankingbackend;

import org.sid.ebankingbackend.entities.Customer;
import org.sid.ebankingbackend.repositories.AccountOperationRepository;
import org.sid.ebankingbackend.repositories.BankAccountRepository;
import org.sid.ebankingbackend.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class EBankingBackendApplication {

	public static void main(String[] args) {

		SpringApplication.run(EBankingBackendApplication.class, args);
	}
@Bean
	CommandLineRunner start(CustomerRepository customerRepository,
						BankAccountRepository bankAccountRepository,
						AccountOperationRepository accountOperationRepository){
		return args -> {
			Stream.of("hassan","chaimae","fatima").forEach(name->{
				Customer customer=new Customer();
				customer.setName(name);
				customer.setEmail(name+"@gmail.com");
				customerRepository.save(customer);
			});
		};
}

}
