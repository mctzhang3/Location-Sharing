
package com.mzhang.locationsharing.network.responses.mapquest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HostedDatum {

    private String tableName;
    private String extraCriteria;
    private List<String> parameters = new ArrayList<String>();
    private List<Object> columnNames = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The tableName
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 
     * @param tableName
     *     The tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * 
     * @return
     *     The extraCriteria
     */
    public String getExtraCriteria() {
        return extraCriteria;
    }

    /**
     * 
     * @param extraCriteria
     *     The extraCriteria
     */
    public void setExtraCriteria(String extraCriteria) {
        this.extraCriteria = extraCriteria;
    }

    /**
     * 
     * @return
     *     The parameters
     */
    public List<String> getParameters() {
        return parameters;
    }

    /**
     * 
     * @param parameters
     *     The parameters
     */
    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    /**
     * 
     * @return
     *     The columnNames
     */
    public List<Object> getColumnNames() {
        return columnNames;
    }

    /**
     * 
     * @param columnNames
     *     The columnNames
     */
    public void setColumnNames(List<Object> columnNames) {
        this.columnNames = columnNames;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
