package org.springframework.web.socket.sockjs.transport;

import org.springframework.scheduling.TaskScheduler;
import org.springframework.web.socket.sockjs.SockJsService;
import org.springframework.web.socket.sockjs.frame.SockJsMessageCodec;

public interface SockJsServiceConfig_1 {
    TaskScheduler getTaskScheduler();

    int getStreamBytesLimit();

    long getHeartbeatTime();

    SockJsMessageCodec getMessageCodec();
}
