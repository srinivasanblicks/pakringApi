package com.anblicks.parking;


import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
public class DataSorceConfig {

	@Autowired
	private ApplicationProperties properties;
	
	@Bean
	private DataSource createDataSource() throws PropertyVetoException {
		ComboPooledDataSource ds=new ComboPooledDataSource();
		ds.setJdbcUrl(properties.getUrl());
		ds.setDriverClass(properties.getDriverClass());
		return ds;		
	}
 
}
