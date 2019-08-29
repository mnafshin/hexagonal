package com.baeldung.service.impl;

import com.baeldung.service.OutputStreamingPort;

public class OutputStreamingPortImpl implements OutputStreamingPort {
    @Override
    public void write(String s) {
        System.out.println(s);
    }
}
