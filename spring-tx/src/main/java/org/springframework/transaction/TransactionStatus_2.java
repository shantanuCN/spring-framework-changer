package org.springframework.transaction;

import java.io.Flushable;

public interface TransactionStatus_2 extends SavepointManager, Flushable {
    boolean isCompleted();
}
