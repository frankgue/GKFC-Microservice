package com.gkfcsolution.limitsservice.models;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Frank GUEKENG
 * @creates 23/11/2020 - 10:00
 * @project limits-service
 */

@Component
@ConfigurationProperties("limits-service")
public class LimitsConfiguration {

    private int maximum;
    private int minimum;

    public LimitsConfiguration() {
    }

    public LimitsConfiguration(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }
}