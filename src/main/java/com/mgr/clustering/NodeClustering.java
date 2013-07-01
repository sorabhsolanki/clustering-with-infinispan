package com.mgr.clustering;

import java.io.IOException;

import org.infinispan.Cache;
import org.infinispan.manager.DefaultCacheManager;

public class NodeClustering {

	private DefaultCacheManager cacheManager; 
	private Cache<String, String> userInputCache;
	
	public NodeClustering(){
		
	}
	
	public void initialize() throws IOException{
		cacheManager = new DefaultCacheManager("infinispan-replication.xml");
		userInputCache = cacheManager.getCache("userInput");
	}
	
	public void putInotCache(String key, String value){
		userInputCache.put(key, value);
	}
	
	public String getFromCache(String key){
		return userInputCache.get(key);
	}
}
