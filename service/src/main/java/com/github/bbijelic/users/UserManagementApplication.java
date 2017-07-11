package com.github.bbijelic.users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.bbijelic.users.config.ServiceConfiguration;
import com.github.bbijelic.users.resources.UserResource;

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
    public void run(ServiceConfiguration config, Environment env) throws Exception {
        LOGGER.info("Running {}", getName());
        
        // Register resource
        env.jersey().register(new UserResource());
        
    }
    
}
