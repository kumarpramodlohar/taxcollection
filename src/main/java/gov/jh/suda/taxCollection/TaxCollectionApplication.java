package gov.jh.suda.taxCollection;

import gov.jh.suda.taxCollection.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class TaxCollectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaxCollectionApplication.class, args);
	}

}
