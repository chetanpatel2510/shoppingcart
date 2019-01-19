package com.shopping.cart.products.entity;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class CassandraTest {
	public static void main(String[] args) {
		String serverIP = "35.231.130.97";
		String keyspace = "EMPLOYEE";

		Cluster cluster = Cluster.builder().withoutJMXReporting()
		  .addContactPoints(serverIP)
		  .build();

		Session session = cluster.connect(keyspace);
		System.out.println(session);
	}
}
