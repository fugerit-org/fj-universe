package test.org.fugerit.java.universe.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.MessageFormat;

import org.fugerit.java.universe.utils.SectionModel;
import org.junit.Assert;
import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestGenerateStatus {
	
	@Test
	public void generate() throws IOException {
		try ( StringWriter buffer = new StringWriter();
				PrintWriter writer = new PrintWriter( buffer ) ) {
			writer.println( "| section | repository | repo central | quality gate | coverage |" );
			writer.println( "|---------|------------|--------------|--------------|----------|" );
			for ( SectionModel section : SectionCatalog.getSectionsFugeritOrg() ) {
				String name = section.getName();
				for ( String module : section.getItems() ) {
					String propertyBase = module;
					log.info( "current {} - {} - {}", name, module, propertyBase );
					writer.println( MessageFormat.format( 
							"| "+name+" | [fugerit-org/{0}](https://github.com/fugerit-org/{0})"
							+ " | [![Maven Central](https://img.shields.io/maven-central/v/org.fugerit.java/{0}.svg)](https://mvnrepository.com/artifact/org.fugerit.java/{0})"
							+ " | [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=fugerit-org_{0}&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=fugerit-org_{0})"
							+ " | [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=fugerit-org_{0}&metric=coverage)](https://sonarcloud.io/summary/new_code?id=fugerit-org_{0}) |",
							module, module ) );
				}
			}
			writer.println();
			String test = buffer.toString();
			Assert.assertNotEquals( 0 , test.length() );
			log.info( "result -> \n{}", test );
		}
	}
	
}
