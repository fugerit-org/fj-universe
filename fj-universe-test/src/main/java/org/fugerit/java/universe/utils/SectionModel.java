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
	
	public static final SectionModel[] SECTIONS_FUGERIT_ORG = {
			SectionModel.newInstance( "core" , "fj-bom", "fj-lib", "fj-doc", "fj-daogen" ),
			SectionModel.newInstance( "extra" , "fj-doc-mod-openpdf" ),
			SectionModel.newInstance( "deprecated" , "fj-core-j2ee", "fj-doc-ent", "fj-doc-mod-jxl", "fj-doc-mod-itext" ),
	};
	
}
