package com.xworkz.collectionbeans.configuration;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import lombok.Data;

@ComponentScan("com.xworkz")
@Data
public class CollectionMapConfiguration {

	public CollectionMapConfiguration() {
		System.out.println("constructor from configuration");
	}

	@Bean
	public List getList() {
		System.out.println("method from List");
		return new ArrayList();
	}

	@Bean
	public ArrayList getArrayList() {
		System.out.println("method from ArrayList");
		return new ArrayList();
	}

	@Bean
	public LinkedList getLinkedList() {
		System.out.println("method from LinkedList");
		return new LinkedList();
	}

	@Bean
	public Iterable getIterable() {
		System.out.println("method from Iterable");
		return new ArrayList();
	}

	@Bean
	public Collection getCollection() {
		System.out.println("method from Collection");
		return new ArrayList();
	}

	@Bean
	public Set getSet() {
		System.out.println("method from Set");
		return new HashSet();
	}

	@Bean
	public HashSet getHashSet() {
		System.out.println("method from Hashset");
		return new HashSet();
	}

	@Bean
	public LinkedHashSet getLinkedHashSet() {
		System.out.println("method from LinkedHashSet");
		return new LinkedHashSet();
	}

	@Bean
	public TreeSet getTreeSet() {
		System.out.println("method from TreeSet");
		return new TreeSet();
	}

	@Bean
	public Map getMap() {
		System.out.println("method from Map");
		return new HashMap();
	}

	@Bean
	public HashMap getHashMap() {
		System.out.println("method from HashMap");
		return new HashMap();
	}

	public LinkedHashMap getLinkedHashMap() {
		System.out.println("method from LinkedHashMap");
		return new LinkedHashMap();
	}

}
