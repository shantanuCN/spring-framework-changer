package org.springframework.transaction;

import java.io.Flushable;

public interface TransactionStatus_1 extends SavepointManager, Flushable {
    void setRollbackOnly();
}
