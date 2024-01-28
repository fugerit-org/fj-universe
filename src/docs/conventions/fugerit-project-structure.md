# Fugerit project layout

This document describes the structure to which most projects in [Fugerit Organization](https://github.com/fugerit-org) adhere.

The file and directory layout is based on [Maven Standard Directory Layout](https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html).


| **File** | **Description** | **Note**  |
|---------------|---------------|---------------|
| src/main/java | Application/Library sources | \* |
| src/main/resources | Application/Library resources | \* |
| src/test/java | Test sources | \* |
| src/test/resources | Test resource filter files | \* |
| src/docs | Additiona project documentation | \*\*\* |
| LICENSE | Project's license | \*\* - different extension |
| README.md | Project's readme | \*\* - different extension |
| CHANGELOG.md | Project's changelog | \*\*\* |
| CODE_OF_CONDUCT.md | Project's cod of conduct | \*\*\* |

(\*) - As for maven standard layout  
(\*\*) - As for maven standard layout with slight difference (i.e. README.md instead of README.txt )  
(\*\*\*) - Not present in maven standard layout  

NOTE: this layout is often used even when the project is not a maven or java project. This is because it is a structure that really suits me.