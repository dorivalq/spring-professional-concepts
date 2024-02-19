package com.silva.config_properties.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewFlowConfigurationDTO {
    private boolean newFlow;
    private String schemaName;
    private boolean eventInterceptor;
    private boolean httpUrlInterceptor;
    private boolean httpHeaderInterceptor;
}
