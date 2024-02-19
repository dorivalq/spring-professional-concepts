package com.silva.config_properties.config.importer;

import org.springframework.stereotype.Service;

@Service
public class Importador {

    public Importador(){
        System.out.println(" CREATED CONSTRUCTOR");
    }

    public String execute(){
        return "IMPORTADOR EXECUTE";
    }
}
