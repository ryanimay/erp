package com.erp.base.config.websocket;

public interface WebsocketConstant {
    interface FROM{
        String SYSTEM = "system";
    }

    interface TOPIC {
        String PREFIX = "/topic";
        String NOTIFICATION = PREFIX + "/notification";
    }

    interface DESTINATION{
        String PREFIX = "/app";
        String SEND_NOTIFICATION = "/sendNotification";
    }
}
