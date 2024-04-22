# Allure Report Generation for Maven Appium Project

This guide provides instructions on how to generate Allure reports for a Maven Appium project using the command line.

## Prerequisites

- Git: Clone the repository to your local machine.
- Java and Maven: Ensure you have Java and Maven installed on your system.
- Allure: Install Allure using Homebrew in the terminal with the command `brew install allure`.

## Getting Started

1. Clone the repository to your local machine.
2. Import the project into your preferred IDE.
3. Install Allure in the terminal using the command:
   ```bash
   brew install allure
   ```

## Running Tests

To run tests with Maven from the command line, use the following command:
```bash
mvn test -Dsurefire.suiteXmlFiles=src/test/resources/testRun.xml
```

## Generating Allure Reports

After running the tests, generate Allure reports using the following command:
```bash
allure serve allure-results
```

This command will generate and serve the Allure report containing the results of the tests.

## Viewing the Report

Open the generated Allure report in your browser to view the results.

