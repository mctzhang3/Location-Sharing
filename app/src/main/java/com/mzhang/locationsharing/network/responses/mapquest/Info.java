
package com.mzhang.locationsharing.network.responses.mapquest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Info {

    private Copyright copyright;
    private Long statuscode;
    private List<Object> messages = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The copyright
     */
    public Copyright getCopyright() {
        return copyright;
    }

    /**
     * 
     * @param copyright
     *     The copyright
     */
    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }

    /**
     * 
     * @return
     *     The statuscode
     */
    public Long getStatuscode() {
        return statuscode;
    }

    /**
     * 
     * @param statuscode
     *     The statuscode
     */
    public void setStatuscode(Long statuscode) {
        this.statuscode = statuscode;
    }

    /**
     * 
     * @return
     *     The messages
     */
    public List<Object> getMessages() {
        return messages;
    }

    /**
     * 
     * @param messages
     *     The messages
     */
    public void setMessages(List<Object> messages) {
        this.messages = messages;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
