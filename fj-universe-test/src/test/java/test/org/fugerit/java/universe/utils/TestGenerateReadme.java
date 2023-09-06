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
	
	@Test
	public void generate() throws IOException {
		try ( StringWriter buffer = new StringWriter();
				PrintWriter writer = new PrintWriter( buffer ) ) {
			for ( SectionModel section : SectionModel.SECTIONS_FUGERIT_ORG ) {
				String name = section.getName();
				writer.println( MessageFormat.format( "### [{0}](src/docs/versions-{0}.md) version properties", name ) );
				writer.println();
				writer.println( "| pom property | repository | repo central | quality gate |" );
				writer.println( "|--------------|------------|--------------|--------------|" );
				for ( String module : section.getItems() ) {
					String propertyBase = module;
					if ( module.equals( "fj-lib" ) ) {
						propertyBase = "fj";
					}
					log.info( "current {} - {} - {}", name, module, propertyBase );
					writer.println( MessageFormat.format( 
							"| [{1}-version](src/docs/versions-core.md#{1}-version) | [fugerit-org/{0}](https://github.com/fugerit-org/{0}) | "
							+ "[![Maven Central](https://img.shields.io/maven-central/v/org.fugerit.java/{0}.svg)](https://mvnrepository.com/artifact/org.fugerit.java/{0}) | "
							+ "[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=fugerit-org_{0}&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=fugerit-org_{0})", 
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
