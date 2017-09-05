
package com.mzhang.locationsharing.network.responses.mapquest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PoiSearch {

    private List<SearchResult> searchResults = new ArrayList<SearchResult>();
    private Origin origin;
    private Integer resultsCount;
    private List<HostedDatum> hostedData = new ArrayList<HostedDatum>();
    private Integer totalPages;
    private Info info;
    private Options options;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The searchResults
     */
    public List<SearchResult> getSearchResults() {
        return searchResults;
    }

    /**
     * 
     * @param searchResults
     *     The searchResults
     */
    public void setSearchResults(List<SearchResult> searchResults) {
        this.searchResults = searchResults;
    }

    /**
     * 
     * @return
     *     The origin
     */
    public Origin getOrigin() {
        return origin;
    }

    /**
     * 
     * @param origin
     *     The origin
     */
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    /**
     * 
     * @return
     *     The resultsCount
     */
    public Integer getResultsCount() {
        return resultsCount;
    }

    /**
     * 
     * @param resultsCount
     *     The resultsCount
     */
    public void setResultsCount(Integer resultsCount) {
        this.resultsCount = resultsCount;
    }

    /**
     * 
     * @return
     *     The hostedData
     */
    public List<HostedDatum> getHostedData() {
        return hostedData;
    }

    /**
     * 
     * @param hostedData
     *     The hostedData
     */
    public void setHostedData(List<HostedDatum> hostedData) {
        this.hostedData = hostedData;
    }

    /**
     * 
     * @return
     *     The totalPages
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * 
     * @param totalPages
     *     The totalPages
     */
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * 
     * @return
     *     The info
     */
    public Info getInfo() {
        return info;
    }

    /**
     * 
     * @param info
     *     The info
     */
    public void setInfo(Info info) {
        this.info = info;
    }

    /**
     * 
     * @return
     *     The options
     */
    public Options getOptions() {
        return options;
    }

    /**
     * 
     * @param options
     *     The options
     */
    public void setOptions(Options options) {
        this.options = options;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
