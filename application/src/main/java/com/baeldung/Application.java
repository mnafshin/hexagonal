package com.baeldung;

import com.baeldung.service.impl.GreetingPortStaticAdapter;
import com.baeldung.service.impl.NamingPortStaticAdapter;
import com.baeldung.service.impl.OutputStreamingPortConsoleAdapter;
import com.baeldung.service.impl.TranslatingPortMapAdapter;

public class Application {
    public static void main(String[] args) {
        new Domain(new OutputStreamingPortConsoleAdapter(), new NamingPortStaticAdapter(),
                new GreetingPortStaticAdapter(), new TranslatingPortMapAdapter()).greeting();
    }
}
