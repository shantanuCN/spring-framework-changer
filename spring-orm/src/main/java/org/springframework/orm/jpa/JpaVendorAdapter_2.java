package org.springframework.orm.jpa;

import java.util.Collections;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.spi.PersistenceProvider;
import javax.persistence.spi.PersistenceUnitInfo;
import org.springframework.lang.Nullable;

public interface JpaVendorAdapter_2 {
    PersistenceProvider getPersistenceProvider();

    default Map<String, ?> getJpaPropertyMap(PersistenceUnitInfo pui) {
        return getJpaPropertyMap();
    }

    default Map<String, ?> getJpaPropertyMap() {
        return Collections.emptyMap();
    }

    @Nullable
    default JpaDialect getJpaDialect() {
        return null;
    }

    default Class<? extends EntityManagerFactory> getEntityManagerFactoryInterface() {
        return EntityManagerFactory.class;
    }

    default Class<? extends EntityManager> getEntityManagerInterface() {
        return EntityManager.class;
    }

    default void postProcessEntityManagerFactory(EntityManagerFactory emf) {
    }
}
