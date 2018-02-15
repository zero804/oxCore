package org.gluu.jsf2.model;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Key/value store to render manually messages and JSF pages
 *
 * @author Yuriy Movchan
 * @version 17/111/2017
 */
@Named("renderParams")
@RequestScoped
public class RenderParameters {

    private Map<String, Object> map = new HashMap<String, Object>();

    public Map<String, Object> getMap() {
        return map;
    }

    public Object getParameter(String key) {
        return map.get(key);
    }

    public boolean hasParameter(String key) {
        return map.containsKey(key);
    }

    public void setParameter(String key, Object value) {
        this.map.put(key, value);
    }

    public void reset() {
        this.map.clear();;
    }

}
