package com.silva.config_properties;

import com.silva.config_properties.config.NewFlowConfigurationDTO;
import com.silva.config_properties.config.imported.Importado;
import com.silva.config_properties.config.importer.Importador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigPropertiesApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConfigPropertiesApplication.class, args);
	}


	@Autowired
	Importador importador;
	@Autowired
	Importado importado;
	@Autowired
	private NewFlowConfigurationDTO newFlowConfigurationDTO;
	@Override
	public void run(final ApplicationArguments args) throws Exception {

		System.out.println("Bean = " + importador.execute());
		System.out.println("Bean = " + importado.execute());
		System.out.println("SchemaName = " + newFlowConfigurationDTO.getSchemaName());

	}
}
