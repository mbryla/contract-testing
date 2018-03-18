package com.mbryla.contract.producer.echo;

public class Echo {
    private final String echo;

    Echo(String echo) {
        this.echo = echo;
    }

    public String getEcho() {
        return echo;
    }

}
