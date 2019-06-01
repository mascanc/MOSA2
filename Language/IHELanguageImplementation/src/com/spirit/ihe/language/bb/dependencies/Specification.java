package com.spirit.ihe.language.bb.dependencies;

public class Specification {
        
    private String name;
    
    private String description;
    
    public Specification(String aname, String adescription) {
        this.name = aname;
        this.description = adescription;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    
}
