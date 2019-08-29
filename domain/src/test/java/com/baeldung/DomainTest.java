package com.baeldung;

import com.baeldung.service.OutputStreamingPort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class DomainTest {

    @Test
    void testGreeting() {
        OutputStreamingPort outputStreamingPort = mock(OutputStreamingPort.class);
        doAnswer((i) -> {
            Assertions.assertEquals("Hello World", i.getArgument(0));
            return null;
        }).when(outputStreamingPort).write(anyString());
        outputStreamingPort.write("Hello World");
        new Domain(outputStreamingPort).greeting();
    }
}