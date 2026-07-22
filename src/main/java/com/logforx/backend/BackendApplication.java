package com.logforx.backend;

import com.logforx.backend.model.Investigator;
import com.logforx.backend.repository.InvestigatorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	/**
	 * Seeds the default investigator account on every startup.
	 * Since H2 is in-memory, accounts are wiped on restart —
	 * this ensures the default login always works.
	 */
	@Bean
	CommandLineRunner seedDefaultUsers(InvestigatorRepository repo) {
		return args -> {
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

			// Default investigator — always available
			if (!repo.existsByEmail("investigator@logforx.local")) {
				Investigator inv = new Investigator();
				inv.setEmail("investigator@logforx.local");
				inv.setPassword(encoder.encode("cybersecurity2026"));
				inv.setName("Investigator John Doe");
				inv.setBadgeId("INV-2026-9904");
				repo.save(inv);
				System.out.println("[SEED] Default investigator account created.");
			}
		};
	}
}
