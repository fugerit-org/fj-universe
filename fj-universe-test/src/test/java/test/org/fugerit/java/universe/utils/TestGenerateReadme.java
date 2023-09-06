package test.org.fugerit.java.universe.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.MessageFormat;

import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestGenerateReadme {

	private static final SectionModel[] SECTIONS = {
			SectionModel.newInstance( "core" , "fj-bom", "fj-lib", "fj-doc", "fj-daogen" ),
			SectionModel.newInstance( "extra" , "fj-doc-mod-openpdf" ),
			SectionModel.newInstance( "deprecated" , "fj-core-j2ee", "fj-doc-ent", "fj-doc-mod-jxl", "fj-doc-mod-itext" ),
	};
	
	@Test
	public void generate() throws IOException {
		try ( StringWriter buffer = new StringWriter();
				PrintWriter writer = new PrintWriter( buffer ) ) {
			for ( SectionModel section : SECTIONS ) {
				String name = section.getName();
				writer.println( MessageFormat.format( "### [{0}](src/docs/versions-{0}.md) version properties", name ) );
				writer.println();
				writer.println( "| pom property | repository | repo central |" );
				writer.println( "|--------------|------------|--------------|" );
				for ( String module : section.getItems() ) {
					String propertyBase = module;
					if ( module.equals( "fj-lib" ) ) {
						propertyBase = "fj";
					}
					log.info( "current {} - {} - {}", name, module, propertyBase );
					writer.println( MessageFormat.format( 
							"| [{0}-version](src/docs/versions-core.md#{0}-version) |https://github.com/fugerit-org/{1} | [![Maven Central](https://img.shields.io/maven-central/v/org.fugerit.java/{0}.svg)](https://mvnrepository.com/artifact/org.fugerit.java/{0})|", 
							module, propertyBase ) );
				}
				writer.println();
			}
			writer.println();
			String test = buffer.toString();
			Assert.assertNotEquals( 0 , test.length() );
			log.info( "result -> \n{}", test );
		}
		
	}
	
}
