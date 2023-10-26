# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [0.5.5] - 2023-10-26

### Changed

- fj-bom set to 1.4.8

## [0.5.4] - 2023-10-26

### Changed

- fj-version set to 8.4.4
- fj-doc-version set to 3.1.8

## [0.5.3] - 2023-10-18

### Changed

- fj-doc-version set to 3.1.6
- j-i18n-xml-helper dependency set to 1.4.0

## [0.5.2] - 2023-10-02

### Changed

- fj-doc-version set to 3.1.2

## [0.5.1] - 2023-10-01

## Added

- query-export-version dependency set to 0.4.1

## [0.5.0] - 2023-10-01

## Added

- java and mavem badges
- fj-xml-to-json-version dependency set to 0.1.1
- j-i18n-xml-helper dependency set to 0.1.3
- yaml-doc-tool-version dependency set to 0.5.0
- github-issue-export-version> dependency set to 0.7.0

### Fixed

- LICENSE place holder

## [0.4.7] - 2023-09-28

### Changed

- fj-tool-helper-version set to 0.1.2

## [0.4.6] - 2023-09-28

### Changed

- fj-tool-helper-version set to 0.1.1

## [0.4.5] - 2023-09-28

### Added

- module fj-universe-tool, utility parent for stand alone tools
- fj-tool-util dependency handling set to 0.1.0
- fj-tool-helper dependency handling set to 0.1.0

### Changed

- fj-version set to 8.4.0-rc.1
- fj-doc-version set to 3.1.0-rc.2

## [0.4.4] - 2023-09-26

### Changed

- fj-bom version set to 1.4.7
- fj-daogen-version set to 1.3.1

## [0.4.3] - 2023-09-26

### Changed

- fj-daogen-version set to 1.3.0

## [0.4.2] - 2023-09-24

### Changed

- [Sonar cloud workflow merged in maven build](.github/workflows/deploy_maven_package.yml)
- fj-bom set to 1.4.5
- fj-version set to 8.3.9
- fj-daogen-version set to 1.3.0

## [0.4.1] - 2023-09-24

### Changed

- [Sonar cloud workflow merged in maven build](.github/workflows/deploy_maven_package.yml)
- fj-bom set to 1.4.4
- fj-doc set to 3.0.9

### Removed

- Sonar cloud workflow yml removed. (after being merged with maven build)

## [0.4.0] - 2023-09-24

### Added

- [Contributor covenant](https://github.com/EthicalSource/contributor_covenant) [CODE_OF_CONDUCT](CODE_OF_CONDUCT.md)
- Code of conduct badge

### Changed

- fj-bom set to 1.4.2
- fj-version set to 8.3.8

## [0.3.3] - 2023-09-21

### Added

- [sonar cloud maven workflow](.github/workflows/sonarcloud-maven.yml)

### Changed

- fj-version set to 8.3.7
- fj-doc-version set to 3.0.7
- fj-daogen-version set to 1.2.4

## [0.3.2] - 2023-09-18

### Changed

- fj-version set to 8.3.6

## [0.3.0] - 2023-09-17

### Changed

- fj-version set to 8.3.5
- fj-doc-version set to 3.0.5
- fj-daogen-version set to 1.2.3

## [0.2.6] - 2023-09-16

### Changed

- fj-core-j2ee-version set to 8.3.1-sa.1
- fj-doc-ent-version set to 1.1.0-sa.1
- fj-doc-mod-jxl-version set to 1.1.0-sa.1
- fj-doc-mod-openpdf-version set to 1.1.0-sa.1

### Fixed

- link in readme to extra and deprecated modules
- readme generator junit

### Security

- [Bouncy Castle vulnerability fix](https://github.com/fugerit-org/fj-universe/security/dependabot/9)

## [0.2.3] - 2023-09-16

### Changed

- fj-doc-mod-itext-version set to 1.1.0-sa.1

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
