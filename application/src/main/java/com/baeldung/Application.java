package com.baeldung;

import com.baeldung.service.impl.NamingPortStaticAdapter;
import com.baeldung.service.impl.OutputStreamingPortConsoleAdapter;

public class Application {
    public static void main(String[] args) {
        new Domain(new OutputStreamingPortConsoleAdapter(), new NamingPortStaticAdapter()).greeting();
    }
}
