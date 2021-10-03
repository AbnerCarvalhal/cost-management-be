package cost.management;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class CostManagementApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CostManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Version version = com.fasterxml.jackson.databind.cfg.PackageVersion.VERSION;
		System.out.println(version);
		
	}

	
	
}
