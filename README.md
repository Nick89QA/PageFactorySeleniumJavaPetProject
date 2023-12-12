1. This is pet project which testing website "ToolsQa"

   ```shell
    https://www.toolsqa.com/

# Project Name: Pet project for testing UI part web application of the website

This repository contains a Java project that demonstrates automated testing of web applications using the JUnit testing
framework and the Selenium WebDriver library. This project has written on page factory model.

##  The structure of the project

- src/test/java/core - settings for execute tests include @before and @afterStep, also include settings of Webdriver

- src/test/java/pages - logic that concerns our pages of this project(xpath, methods)

- src/test/java/readProperties - interface configProvider stores variables and links which I reuse in different parts of my project

- src/test/java/runTests - java file which has three tests that execute and testing UI part of application
- src/test/java/resources - this interface includes a static method readConfig() to read configuration values using Typesafe Config library.
- jenkins.groovy -  this file stores settings which execute tests on jenkins server. Base set of CI/CD process 
## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java Development Kit (JDK) installed**: This project uses Java for test automation. You can download and install the
  latest JDK from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) or use an open-source
  alternative like OpenJDK.

- **Integrated Development Environment (IDE)**: You can use popular IDEs like Eclipse, IntelliJ IDEA, or Visual Studio
  Code for Java development.

- **Selenium WebDriver**: Ensure you have the Selenium WebDriver set up for your preferred web browser (e.g., Chrome,
  Firefox). You can download the WebDriver executable for your browser from the official Selenium
  website: [Selenium WebDriver Downloads](https://www.selenium.dev/downloads/).

- **Build tool (optional)**: This project can be managed using a build tool like Apache Maven. You can download and
  install Maven from [Maven Downloads](https://maven.apache.org/download.cgi).

## Getting Started

To get started with this project, follow these steps:

1. **Clone the repository to your local machine**:

   ```shell
   git clone https://github.com/Nick89QA/PetProjectSelenium.git

## Running the Tests

To execute the automated tests, you can use a build tool like Apache Maven. Open your terminal or command prompt, navigate to the project directory, and run the following command:

```shell
  mvn clean test
