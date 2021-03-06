package com.englishtown.vertx.hk2;

import com.englishtown.vertx.elasticsearch.ElasticSearchAdminService;
import com.englishtown.vertx.elasticsearch.ElasticSearchConfigurator;
import com.englishtown.vertx.elasticsearch.ElasticSearchService;
import com.englishtown.vertx.elasticsearch.TransportClientFactory;
import com.englishtown.vertx.elasticsearch.impl.DefaultElasticSearchAdminService;
import com.englishtown.vertx.elasticsearch.impl.DefaultElasticSearchService;
import com.englishtown.vertx.elasticsearch.impl.DefaultTransportClientFactory;
import com.englishtown.vertx.elasticsearch.impl.EnvElasticSearchConfigurator;
import com.englishtown.vertx.elasticsearch.internal.InternalElasticSearchAdminService;
import com.englishtown.vertx.elasticsearch.internal.InternalElasticSearchService;
import org.glassfish.hk2.utilities.binding.AbstractBinder;

import javax.inject.Singleton;

/**
 * ElasticSearch HK2 Binder
 * @deprecated Use {@link com.englishtown.vertx.elasticsearch.hk2.ElasticSearchBinder} instead
 */
@Deprecated
public class ElasticSearchBinder extends com.englishtown.vertx.elasticsearch.hk2.ElasticSearchBinder {
}
