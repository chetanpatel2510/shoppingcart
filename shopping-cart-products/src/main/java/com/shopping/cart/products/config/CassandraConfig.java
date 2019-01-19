package com.shopping.cart.products.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.CassandraClusterFactoryBean;
import org.springframework.data.cassandra.core.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;

@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {
 
	@Value("${product.service.cassandra.ip}")
	private String contactPoint;
	
	@Value("${product.service.cassandra.port}")
	private int port;
	
	
    @Override
    protected String getKeyspaceName() {
        return "PRODUCT";
    }
    
 
    @Bean
    public CassandraClusterFactoryBean cluster() {
        CassandraClusterFactoryBean cluster = 
          super.cluster();
        cluster.setContactPoints(contactPoint);
        cluster.setPort(port);
        cluster.setJmxReportingEnabled(false);
        return cluster;
    }
 
    @Bean
    public CassandraMappingContext cassandraMapping() 
      throws ClassNotFoundException {
        return new BasicCassandraMappingContext();
    }
    
}
