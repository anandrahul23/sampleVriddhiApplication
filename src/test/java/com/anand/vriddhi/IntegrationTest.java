package com.anand.vriddhi;

import com.anand.vriddhi.SampleVriddhiApplicationApp;
import com.anand.vriddhi.config.AsyncSyncConfiguration;
import com.anand.vriddhi.config.EmbeddedElasticsearch;
import com.anand.vriddhi.config.EmbeddedKafka;
import com.anand.vriddhi.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { SampleVriddhiApplicationApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
