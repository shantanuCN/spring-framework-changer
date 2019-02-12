package org.springframework.orm.jpa;

import java.util.Collections;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.persistence.spi.PersistenceUnitInfo;
import org.springframework.lang.Nullable;

public interface JpaVendorAdapter_1 {
    @Nullable
    default String getPersistenceProviderRootPackage() {
        return null;
    }
}
