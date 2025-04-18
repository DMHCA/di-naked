package com.romantrippel.dinaked.annotations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QualifierTest {

    static class ServiceA implements MyService {
        public String name() {
            return "ServiceA";
        }
    }

    static class ServiceB implements MyService {
        public String name() {
            return "ServiceB";
        }
    }

    interface MyService {
        String name();
    }

    static class Client {
        private final MyService service;

        public Client(@Qualifier("ServiceA") MyService service) {
            this.service = service;
        }

        public String getServiceName() {
            return service.name();
        }
    }

    @Test
    void testQualifier() {
        Client client = new Client(new ServiceA());
        assertEquals("ServiceA", client.getServiceName());
    }
}
