package com.baeldung;

import com.baeldung.service.impl.OutputStreamingPortImpl;

public class Application {
    public static void main(String[] args) {
        new Domain(new OutputStreamingPortImpl()).greeting();
    }
}
