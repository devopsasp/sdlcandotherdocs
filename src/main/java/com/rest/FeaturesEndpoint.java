package com.rest;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.boot.actuate.endpoint.web.WebEndpointResponse;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import java.util.*;
import java.util.concurrent.*;
@Component
@Endpoint(id = "features")
public class FeaturesEndpoint {

    private Map<String, Feature> features = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Feature> features() {
    	features.put("feature1", new Feature(true,"App health feature","admin feaature"));
    	
        return features;
    }

    @ReadOperation
    public Feature feature(@Selector String name) {
        return features.get(name);
    }

    @WriteOperation
    public WebEndpointResponse<Feature> configureFeature(String featurename,String type) {
      Feature feature=new Feature(true,featurename,type);
    	features.put(featurename,feature);
    	return new WebEndpointResponse(feature);
    }

    @DeleteOperation
    public void deleteFeature(@Selector String name) {
        features.remove(name);
    }

    public static class Feature {
        private Boolean enabled;
        private String featureName;
        private String type;
		public Boolean getEnabled() {
			return enabled;
		}
		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
		public String getFeatureName() {
			return featureName;
		}
		public void setFeatureName(String featureName) {
			this.featureName = featureName;
		}
		public Feature() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Feature(Boolean enabled, String featureName, String type) {
			super();
			this.enabled = enabled;
			this.featureName = featureName;
			this.type = type;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		
		
		

    }

}
