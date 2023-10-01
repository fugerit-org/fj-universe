package test.org.fugerit.java.universe.utils;

import org.fugerit.java.universe.utils.SectionModel;

public class SectionCatalog {

	private SectionCatalog() {}
	
	private static final SectionModel[] SECTIONS_FUGERIT_ORG = {
			SectionModel.newInstance( "core" , "fj-bom", "fj-lib", "fj-doc", "fj-daogen" ),
			SectionModel.newInstance( "extra" , "fj-doc-mod-openpdf", "query-export-tool", "fj-tool-util", "fj-tool-helper", "fj-xml-to-json", "fj-i18n-xml-helper", "yaml-doc-tool" ),
			SectionModel.newInstance( "deprecated" , "fj-core-j2ee", "fj-doc-ent", "fj-doc-mod-jxl", "fj-doc-mod-itext" ),
	};
	
	public static SectionModel[] getSectionsFugeritOrg() {
		return SECTIONS_FUGERIT_ORG;
	}
	
}
