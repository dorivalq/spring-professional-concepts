package com.silva.config_properties.config;

import com.silva.config_properties.config.imported.Importado;
import com.silva.config_properties.config.importer.Importador;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.Assert;

@Configuration
@Data
@AllArgsConstructor
@NoArgsConstructor
@ComponentScan(basePackages = "com.silva.config_properties.config.config_a")
public class NewFlowConfigurationApplier {
    @Value("${topicName:}")
    private String topicName;
    @Value("${spring.application.name:}")
    private String applicationName;

    @Value("${pi.eventmachine.newFlow:false}")
    private boolean newFlow;
    @Value("${pi.eventmachine.schemaName:}")
    private String schemaName;

    @Value("${pi.sharding.client.eventInterceptor.enabled:false}")
    private boolean eventInterceptor;
    @Value("${sharding.client.httpUrlInterceptor.enabled:false}")
    private boolean httpUrlInterceptor;
    @Value("${sharding.client.httpHeaderInterceptor.enabled:false}")
    private boolean httpHeaderInterceptor;


    @Autowired
    Importador importador;
    @Autowired
    Importado importado;
    @Bean
    public NewFlowConfigurationDTO newFlowConfig(){
        if (newFlow ) {
            Assert.hasText(schemaName,  "schemaName is mandatory when newFlow is true");
            Assert.hasText((topicName), "topicName is mandatory when newFlow is true");
            Assert.hasText(applicationName,  "applicationName is mandatory when newFlow is true");
        }

        System.out.println("importador = " + importador.execute());
        System.out.println("Importado = " + importado.execute());
        System.out.println("topicName = " + topicName);

       return new NewFlowConfigurationDTO(newFlow, schemaName, eventInterceptor, httpUrlInterceptor, httpHeaderInterceptor);
    }
}
