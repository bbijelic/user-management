package com.github.bbijelic.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.bbijelic.users.config.ServiceConfiguration;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * User management application
 * 
 * @author Bojan Bijelić <bojan.bijelic.os@gmail.com>
 */
public class UserManagementApplication extends Application<ServiceConfiguration> {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(UserManagementApplication.class);
    
    /**
     * Main method
     */
    public static void main(String[] args) throws Exception {
		new UserManagementApplication().run(args);
	}
    
    /**
     * Constructor
     */
    public UserManagementApplication() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public String getName() {
        return "UserManagementService";
    }
    
    @Override
    public void initialize(Bootstrap<ServiceConfiguration> bootstrap) {
        super.initialize(bootstrap);
        LOGGER.info("Initializing {}", getName());
    }
    
    @Override
    public void run(ServiceConfiguration arg0, Environment arg1) throws Exception {
        LOGGER.info("Running {}", getName());
        
    }
    
}
