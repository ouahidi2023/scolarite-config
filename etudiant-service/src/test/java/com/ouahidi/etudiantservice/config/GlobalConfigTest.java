package com.ouahidi.etudiantservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import static org.junit.jupiter.api.Assertions.*;

class GlobalConfigTest {
    @Value("{p1}")
    private int p1;
    @Value("{p2}")
    private int p2;

    public int getP1() {
        return p1;
    }
    public int getP2() {
        return p2;
    }
}