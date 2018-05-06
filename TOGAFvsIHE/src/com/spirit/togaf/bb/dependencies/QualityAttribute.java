package com.spirit.togaf.bb.dependencies;

import com.spirit.togaf.bb.ABB;

public abstract class QualityAttribute {

    
    public abstract void evaluate(ABB y, ABB y2);

    public abstract String getValue();

    public abstract void addRule(String value);

    // to add a specialization method
}
