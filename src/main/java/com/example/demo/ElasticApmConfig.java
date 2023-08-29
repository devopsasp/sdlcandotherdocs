package com.example.demo;

import co.elastic.apm.attach.ElasticApmAttacher;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.Setter;
import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Setter
@Configuration
@ConfigurationProperties(prefix = "elastic.apm")
@ConditionalOnProperty(value = "elastic.apm.enabled", havingValue = "true")
public class ElasticApmConfig {

    private static final String SERVER_URL_KEY = "https://94dc08f3726f41a0a6f67acd8331bef3.apm.us-central1.gcp.cloud.es.io:443";
    private String serverUrl;

    private static final String SERVICE_NAME_KEY = "my-service-name";
    private String serviceName;

    private static final String SECRET_TOKEN_KEY = "Qyzjlw9JTR0LPHNYSi";
    private String secretToken;

    private static final String ENVIRONMENT_KEY = "my-environment";
    private String environment;

    private static final String APPLICATION_PACKAGES_KEY = "com.example.demo";
    private String applicationPackages;

    private static final String LOG_LEVEL_KEY = "DEBUG";
    private String logLevel;

    @PostConstruct
    public void init() {

        Map<String, String> apmProps = new HashMap<>(6);
        apmProps.put(SERVER_URL_KEY, serverUrl);
        apmProps.put(SERVICE_NAME_KEY, serviceName);
        apmProps.put(SECRET_TOKEN_KEY, secretToken);
        apmProps.put(ENVIRONMENT_KEY, environment);
        apmProps.put(APPLICATION_PACKAGES_KEY, applicationPackages);
        apmProps.put(LOG_LEVEL_KEY, logLevel);

        ElasticApmAttacher.attach(apmProps);
    }
}