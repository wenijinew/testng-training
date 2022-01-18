# This is solution for Exercise A.1: Learn how to run TestNG suite by mvn, and java commands respectively.

# Run TestNG suite by mvn command
mvn test -Dsurefire.suiteXmlFiles=[relative path to the suite file]

# Example: run src/test/resources/suites/demo/simple/TestSuite01.xml in training-testng project
cd /repo/egugwen/dj/training-mje/training-testng
mvn test -Dsurefire.suiteXmlFiles=src/test/resources/suites/demo/simple/TestSuite01.xml

# The output:
#egugwen@esekilxxen4182 (~/scripts) > cd /repo/egugwen/dj/training-mje/training-testng
#egugwen@esekilxxen4182 (training-mje/training-testng) > mvn test -Dsurefire.suiteXmlFiles=src/test/resources/suites/demo/simple/TestSuite01.xml
#Picked up _JAVA_OPTIONS: -Xmx4096m -Xms2048m
#[INFO] Scanning for projects...
#[INFO]
#[INFO] ----------------< se.ericsson.training:training-testng >----------------
#[INFO] Building training-testng 1.0-SNAPSHOT
#[INFO] --------------------------------[ jar ]---------------------------------
#[INFO]
#[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ training-testng ---
#[INFO] Using 'UTF-8' encoding to copy filtered resources.
#[INFO] skip non existing resourceDirectory /repo/egugwen/dj/training-mje/training-testng/src/main/resources
#[INFO]
#[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ training-testng ---
#[INFO] Nothing to compile - all classes are up to date
#[INFO]
#[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ training-testng ---
#[INFO] Using 'UTF-8' encoding to copy filtered resources.
#[INFO] Copying 28 resources
#[INFO]
#[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ training-testng ---
#[INFO] Changes detected - recompiling the module!
#[INFO] Compiling 32 source files to /repo/egugwen/dj/training-mje/training-testng/target/test-classes
#[INFO]
#[INFO] --- maven-surefire-plugin:3.0.0-M3:test (default-test) @ training-testng ---
#[INFO]
#[INFO] -------------------------------------------------------
#[INFO]  T E S T S
#[INFO] -------------------------------------------------------
#[INFO] Running TestSuite
#[TestA]: TC1
#
#[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.502 s - in TestSuite
#[INFO]
#[INFO] Results:
#[INFO]
#[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
#[INFO]
#[INFO] ------------------------------------------------------------------------
#[INFO] BUILD SUCCESS
#[INFO] ------------------------------------------------------------------------
#[INFO] Total time: 7.462 s
#[INFO] Finished at: 2019-05-01T10:46:51+02:00
#[INFO] ------------------------------------------------------------------------

# Note: if the command cannot work well. For example, it doesn't run the specified suite file but all test cases in
# src/test folder. Then, please use newer version of maven or specify the latest version of surefire plugin in pom.xml
# file - check /repo/egugwen/dj/training-mje/training-testng/pom.xml to know more.
<!--Solution_A.1: default surefire plugin in maven -->
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-plugin</artifactId>
    <version>3.0.0-M3</version>
</plugin>

# Run TestNG suite by java command
# To run java application, we have to specify the location of jar files or classes location by the option of java
# command: -cp or -classpath. We also need to provide the qualified class name of the class with main method. If the
# main class need arguments, we also specify the arguments values.
# For TestNG, the main class is org.testng.TestNG and the jar files includes:
#
java -cp [absolute path of classes or jar files] [qualified class name of the class with main method] [arguments here]

# Example: run src/test/resources/suites/demo/simple/TestSuite01.xml in training-testng project
egugwen@esekilxxen4182 (~/scripts) > java -cp /repo/egugwen/dj/training-mje/training-testng/target/classes:/repo/egugwen/dj/training-mje/training-testng/target/test-classes:/home/egugwen/.m2/repository/org/testng/testng/6.14.3/testng-6.14.3.jar:/proj/tfwlogs_wmr/users/egugwen/.m2/repository/com/beust/jcommander/1.74/jcommander-1.74.jar  org.testng.TestNG /repo/egugwen/dj/training-mje/training-testng/src/test/resources/suites/demo/simple/TestSuite01.xml
Picked up _JAVA_OPTIONS: -Xmx4096m -Xms2048m
[TestA]: TC1


===============================================
Demo Test Suite.01
Total tests run: 1, Failures: 0, Skips: 0
===============================================

# As you see, the command is too long to read. Therefore, to make it readable and reusable, we'd better to organize the
#command in shell script:

#!/usr/bin/env bash

# bash script to run TestNG suite file with java command

CLASSPATH=/repo/egugwen/dj/training-mje/training-testng/target/classes
CLASSPATH=$CLASSPATH:/repo/egugwen/dj/training-mje/training-testng/target/test-classes
CLASSPATH=$CLASSPATH:/home/egugwen/.m2/repository/org/testng/testng/6.14.3/testng-6.14.3.jar
CLASSPATH=$CLASSPATH:/home/egugwen/.m2/repository/com/beust/jcommander/1.74/jcommander-1.74.jar

SUITE_FILE_PATH=/repo/egugwen/dj/training-mje/training-testng/src/test/resources/suites/demo/simple/TestSuite01.xml

if [ $# -eq 1 ] ; then
    SUITE_FILE_PATH=$1
fi

java -cp $CLASSPATH  org.testng.TestNG $SUITE_FILE_PATH

# for projects with many dependencies, it's not that convenient to use java command to run TestNG suite file because we
# have to manage the classpath with many jar files. Thus, it's good to use mvn command instead. However, the key point
# is to understand how TestNG works.

