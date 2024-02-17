# build_maven_package.yml workflow

This is a maven java workflow responsible for running maven build, scan and, in some cases, other actions like docker image build.

**Version** : 1.0.1

There are a few steps which are always run : 

- Maven build (usually on ubuntu-latest runner and minimum needed JDK version)
- Sonar cloud scan
- Snyk scan

Optionally the workflow may : 

- Docker image build and push

For an example of this project look at [build_maven_package.yml](https://github.com/fugerit-org/fj-doc/blob/main/.github/workflows/build_maven_package.yml)

## step : Update dependency graph

To fix the issue :
[Github action broken with 4.0.1](https://github.com/advanced-security/maven-dependency-submission-action/issues/65)

Setting github variable `DISABLE_MAVEN_DEPENDENCY_SUBMISSION` to `true`, the step will be disabled.

It is possible to setup the variable at repository or account level.