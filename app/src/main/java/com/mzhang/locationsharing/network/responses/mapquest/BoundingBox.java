
package com.mzhang.locationsharing.network.responses.mapquest;

import java.util.HashMap;
import java.util.Map;

public class BoundingBox {

    private Ul ul;
    private Lr lr;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ul
     */
    public Ul getUl() {
        return ul;
    }

    /**
     * 
     * @param ul
     *     The ul
     */
    public void setUl(Ul ul) {
        this.ul = ul;
    }

    /**
     * 
     * @return
     *     The lr
     */
    public Lr getLr() {
        return lr;
    }

    /**
     * 
     * @param lr
     *     The lr
     */
    public void setLr(Lr lr) {
        this.lr = lr;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
