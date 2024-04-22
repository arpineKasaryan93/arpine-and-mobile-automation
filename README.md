Usage
Clone the repository to your local machine.
Import the project into your preferred IDE.
Install allure in terminal using this command brew install allure
To run tests with maven command line use the following mvn test -Dsurefire.suiteXmlFiles=src/test/resources/testRun.xml
After running the tests, generate Allure reports using the following command:
allure serve allure-results

This command will generate and serve the Allure report containing the results of the tests.

