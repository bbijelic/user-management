package com.github.bbijelic.users.representations;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * User representation
 * 
 * @author Bojan Bijelić <bojan.bijelic.os@gmail.com>
 */
public class User {
    
    /**
     * List of user aliases. Alias can be username, email address, etc.
     */
    @JsonProperty
    @NotEmpty
    private List<String> aliases;
    
    /**
     * Aliases getter
     * @return the alias list
     */
    public List<String> getAliases() {
        return aliases;
    }
    
    /**
     * Aliases setter
     * @param aliases the alias list
     */
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }
    
    /**
     * Email address
     */
    @JsonProperty
    @NotEmpty
    private String email;
    
    /**
     * Email address getter
     * @return the email adress
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Email address setter
     * @param email the email address
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * Password
     */
    @JsonProperty
    private String password;
    
    /**
     * Password getter
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * Password setter
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
