# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [0.2.2] - 2023-09-16

### Fixed

- maven deploy

## [0.2.1] - 2023-09-16

### Added

- documentation on pom version properties
- fj-doc-mod-openpdf-version property for repository https://github.com/fugerit-org/fj-doc-mod-openpdf
- fj-core-j2ee-version property for repository https://github.com/fugerit-org/fj-core-j2ee
- fj-doc-ent-version property for repository https://github.com/fugerit-org/fj-doc-ent
- fj-doc-mod-jxl-version property for repository https://github.com/fugerit-org/fj-doc-mod-jxl
- fj-doc-mod-itext-version property for repository https://github.com/fugerit-org/fj-doc-mod-itext
- [maven deploy workflow](.github/workflows/deploy_maven_package.yml)
- coverage badfe for core modules

### Changed

- fj-bom-version set to 1.4.0
- fj-version set to 8.3.1
- fj-doc-version set to 3.0.4
- fj-daogen-version set to 1.2.1

## [0.2.0] - 2023-09-05

### Changed

- fj-doc version set to 2.0.1

### Removed

- fj-doc-mod-poi5

## [0.1.1] - 2023-09-04

### Fixed

- scm url submodule fj-universe-test

## [0.1.0] - 2023-09-04

### Added

- badges for changelog, maven repo central and license
- dependencies for project [fj-lib](https://github.com/fugerit-org/fj-lib) , version property : 'fj-version'
- dependencies for project [fj-doc](https://github.com/fugerit-org/fj-doc) , version property : 'fj-doc-version'
- dependencies for project [fj-daogen](https://github.com/fugerit-org/fj-daogen) , version property : 'fj-daogen-version'
- [dependabot](.github/dependabot.yml) configuration
- [workflow codeql on branch main](.github/workflows/codeql-analysis.yml)
- [workflow](.github/workflows/build_maven_package.yml) for package testing and dependency upload