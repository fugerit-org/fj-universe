package org.fugerit.java.universe.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
public class SectionModel {

	@NonNull @Getter private String name;
	
	@NonNull @Getter private String[] items;

	public static SectionModel newInstance( String name, String... items ) {
		return new SectionModel( name, items );
	}
	
}
