# Gradle Integration Test Merging Demo

This project demonstrates how to "merge" the execution of certain tests (e.g. integration tests) of multiple gradle subprojects into a single execution-context (JVM) by running them in another subproject.

This might be useful to still have the tests separated by module and to have access to module-internal classes, but share resources (like a spring-context or other expensive-to-create objects) between such tests.

## How to run

`gradlew clean build`

## How to verify

Check the `build/reports/tests/test/index.html` files of the individual projects.

In `project-a` and `project-b` you will only see the unit tests of these modules executed.

In `integration-tests` you will see the integration tests of the other 2 projects have been executed.