
# Getting equipped with Unit Testing In Java 
[![Build Status](https://travis-ci.org/jboss-outreach/junit-get-started.svg?branch=master)](https://travis-ci.org/jboss-outreach/junit-get-started)

This repository is structured to help you getting started with unit testing and integration testing with `JUnit` , `Java` and `Gradle`.

## What is Unit Testing?

Unit testing is a testing technique used by developers or software testers using which individual modules of the program are tested to determine if there are any issues.
We are going to be using [JUnit](http://junit.org/junit5/), a unit testing framework for Java.

## Why JUnit?

We have preferred JUnit because:-
 1. It provides better features and reliability like Lamda Support,Extensions ... 
 2. It is opensource thus provides developers to have precise control over APIs
 3. The entire goal of the JUnit 5 revamp was to allow the success of JUnit to enable the use of other testing frameworks so you can      combine it with other frameworks  

## Contents
* [Setting up the project](#set)
* [Running the tests](#run)
* [Contribution Guidelines](#cont)
* [References](#ref)

## <a id="set"></a>Setting up the Project

* Download [Java 8 JDK] from this link : http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html for your operating system.
* Make sure you have declared the `JAVA_HOME` environment variable to the directory where JDK was installed. 
* Fork the repository by clicking on the *Fork* icon at the top right corner of this page.
* Clone the repository to your local machine by running the following commands on git:
			"git clone https://github.com/[YOUR-USERNAME]/junit-get-started.git"
* If you need help, refer [Forking and Cloning in git] (https://help.github.com/articles/fork-a-repo/).
* Make the necessary changes to the cloned repository.
* Use _git push_ to push the changes to your repository.

## <a id="run"></a>Running the tests
1. Set the present working directory in terminal (or cmd) to your project. (`cd \YOUR_PROJECT_DIRECTORY`).
2. Run `./gradlew test` on Linux/Unix or `gradlew test` on Windows.
* If the file is being denied to open, the use `chmod +x ./gradlew` (for Linux/Unix) or run `cmd as admin` (for Windows).

* If the file is being denied to open, the use `chmod +x ./gradlew` (for Linux/Unix) or run `cmd as admin` (for Windows).

###### Alternatively, if you are using an IDE like [Intellij IDEA](https://www.jetbrains.com/idea/)
1. Import the Git repository into the IDE and allow Gradle.
2. Right-click the src/test/ directory.
3. Click `Run 'All Tests'` or simply use the `Ctrl-Shift-F10` keyboard shortcut.

#### If you can't install IDE and Java use online java compilers such as jdoodle.com/online-java-compiler. 

## <a id="cont"></a>Contribution Guidelines
1. For this you need to learn junit. Link for learning : https://www.tutorialspoint.com/junit/ and you can refer other sites for learning in detail about Junit.
2. Add a **new** test class under src/test/java for the suite of test cases to be added.
3. First learn the basics and you can add 5 JUnit test cases in that class, one for each:
		-assertTrue
		-assertFalse
		-assertEquals
		-and any other two variety.
4. Verify that the test successfully builds. 
5. Then create a [pull request](https://help.github.com/articles/about-pull-requests/) requesting to merge the commits on your fork to this repository.
6. Write a informative pull request explaining about the junit tests you created.
7. After creating a pull request, verify that the codacy and travis checks passes. If it shows error there is some error in your project.
8. Don't forget to save the file in ".java" format
9. Happy coding.


## Points to keep in mind while contributing
* There is not much content in main code (src/main/). *Add your test code to (src/test/) only.* 
* Do not edit ApplicationTest.java! Create a **new test class** instead to avoid merge conflicts.
* Remember to add comments in your code so that the other person can know what the test module does.
* Class names should always be in PascalCase.
* This repository has [Travis CI integration](https://travis-ci.org/), verify that it builds successfully before submitting the task. 

# <a id="ref"></a>References
  * [How to set JAVA_HOME](https://docs.oracle.com/cd/E19182-01/820-7851/inst_cli_jdk_javahome_t/)
  * [Assert Documentation](http://junit.sourceforge.net/javadoc/org/junit/Assert.html)
  * [Junit Test Framework](https://www.tutorialspoint.com/junit/junit_test_framework.htm)
  * [Best Coding Practices](https://en.wikipedia.org/wiki/Best_coding_practices) 
  * [How to use GitHub](https://guides.github.com/activities/hello-world/)
  * [Git basics](https://git-scm.com/book/en/v2/Getting-Started-Git-Basics)
  * [Git commands handbook](https://git-scm.com/docs)
  * [Command Prompt handbook](http://www.makeuseof.com/tag/a-beginners-guide-to-the-windows-command-line/)
  * [Linux Terminal handbook](http://linuxcommand.org/)
  * [MacOS Terminal handbook](https://developer.apple.com/library/content/documentation/OpenSource/Conceptual/ShellScripting/CommandLInePrimer/CommandLine.html)
  * [Heroku Handbook](https://devcenter.heroku.com/)
  * [Maven Handbook](http://www.jcabi.com/jcabi-heroku-maven-plugin/example-start.html)
  * [Chat with us !](https://gitter.im/jboss-outreach)
