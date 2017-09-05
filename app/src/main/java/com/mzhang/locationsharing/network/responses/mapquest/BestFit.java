
package com.mzhang.locationsharing.network.responses.mapquest;

import java.util.HashMap;
import java.util.Map;

public class BestFit {

    private Long scale;
    private Long height;
    private Long newScale;
    private NewCenter newCenter;
    private Long width;
    private Long margin;
    private Long newLevel;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The scale
     */
    public Long getScale() {
        return scale;
    }

    /**
     * 
     * @param scale
     *     The scale
     */
    public void setScale(Long scale) {
        this.scale = scale;
    }

    /**
     * 
     * @return
     *     The height
     */
    public Long getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    public void setHeight(Long height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The newScale
     */
    public Long getNewScale() {
        return newScale;
    }

    /**
     * 
     * @param newScale
     *     The newScale
     */
    public void setNewScale(Long newScale) {
        this.newScale = newScale;
    }

    /**
     * 
     * @return
     *     The newCenter
     */
    public NewCenter getNewCenter() {
        return newCenter;
    }

    /**
     * 
     * @param newCenter
     *     The newCenter
     */
    public void setNewCenter(NewCenter newCenter) {
        this.newCenter = newCenter;
    }

    /**
     * 
     * @return
     *     The width
     */
    public Long getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    public void setWidth(Long width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The margin
     */
    public Long getMargin() {
        return margin;
    }

    /**
     * 
     * @param margin
     *     The margin
     */
    public void setMargin(Long margin) {
        this.margin = margin;
    }

    /**
     * 
     * @return
     *     The newLevel
     */
    public Long getNewLevel() {
        return newLevel;
    }

    /**
     * 
     * @param newLevel
     *     The newLevel
     */
    public void setNewLevel(Long newLevel) {
        this.newLevel = newLevel;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
