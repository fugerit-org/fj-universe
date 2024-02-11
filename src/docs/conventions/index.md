# Fugerit Org - Github Project Conventions

Aim of this document is to describe conventions used on github projects hosted on github [fugerit-org](https://github.com/fugerit-org) organization. Especially the ones included in the [fj-universe](https://github.com/fugerit-org/fj-universe) project.

## Project structure

The file and directory layout is an based on [Maven Standard Directory Layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html) and is described in the document [Fugerit project layout](fugerit-project-structure.md)

## Project workflows

Most projects will have a few workflows based on github actions.

|workflow|name|description|
|---|---|---|
|[build_maven_package.yml](workflows/build_maven_package.md)|CI maven build and scan|Run maven build, scan (Sonar Cloud and/or Snyk etc.), if needed, may also build and push docker image|
|[build_maven_compatibility.yml](workflows/build_maven_compatibility.md)|CI maven compatibility check|Rdeploy release artifacts on sonatype central repositor|
|[deploy_maven_package.yml](workflows/deploy_maven_package.md)|CI deploy maven package|deploy release artifacts on sonatype central repository.|
|[codeql-analysis](workflows/codeql-analysis.md)|CodeQL|Github code quality check|
