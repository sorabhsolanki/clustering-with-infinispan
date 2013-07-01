package com.ngr.client;

import java.io.IOException;

import com.mgr.clustering.NodeClustering;

public class Node1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("java.net.preferIPv4Stack", "true");
		NodeClustering clustering = new NodeClustering();
		clustering.initialize();
		
		//clustering.putInotCache("name", "sorabh");
		
		System.out.println(clustering.getFromCache("name"));
	}
}
