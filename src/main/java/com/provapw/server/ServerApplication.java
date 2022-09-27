package com.provapw.server;

import com.jatom.migrationdatabase.MigrationDataBase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

    public static void main(String[] args) {

        MigrationDataBase mig = new MigrationDataBase();
        mig.createInformationSchemaIntoSchema();
        mig.executeMigrationDataBaseResourcesIntoSchema();
        SpringApplication.run(ServerApplication.class, args);
    }

}
