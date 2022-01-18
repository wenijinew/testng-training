# TestNG Training Project


## TestNG Training Outline:

### Level 0:
    0.1: TestNG Author: Cedric Beust(https://twitter.com/cbeust)
    0.2: TestNG Site: http://testng.org
    0.3: TestNG Projects
        1. TestNG: https://github.com/cbeust/testng
        2. Remote-TestNG: https://github.com/testng-team/testng-remote
        3. TestNG-Eclipse: https://github.com/cbeust/testng-eclipse

### Level 1: Write a TestNG test and run it in Eclipse.
    1.1 Knows about org.testng.annotations.Test & org.testng.Assert - different from assert keyword of Java (-ea)
    1.2 Knows about difference between Java assert keyword and TestNG Assert class
    1.3 Knows about the TestNG test result report - test-output/index.html.
    1.4 Knows about the entry of TestNG test execution and testng.xml file.

### Level 2: Basic configuration methods by annotations
    1.1 Knows about what annotations can be used for configuration methods - @BeforeXXX and @AfterXXX, except for @BeforeGroups and @AfterGroups
    1.2 Knows about the basic execution life-cycle related to configuration methods and test methods.

### Level 3: Groups
    3.1: Knows about how to define groups in TestNG class and testng.xml file - groups of groups.
    3.2: Knows about how to run groups in class and package.
    3.3: Knows about how to run configuration method related to groups.

### Level 4: Parameterization
    4.1: Knows about how to define test method parameters
    4.2: Knows about how to define parameters in testng.xml file in suite and test level
    4.3: Knows about how to use DataProvider - normal data provider and static data provider
    4.4: Knows about return data type of data provider method

### Level 5: Dependency
    5.1: Knows about how to define dependency on methods and groups.
    5.2: Knows about hard/soft dependency difference and usage.
    5.3: Knows about dependency usage in testng.xml file.

### Level 6: Parallelism
    6.1: Knows about how to use run suites/tests/classes/instances/methods in parallel respectively.
    6.2: Knows about how to configure thread count in parallel execution.
    6.3: Knows about how to define timeout value for parallel execution.

### Level 7: Rerun failed test
    7.1: Knows about the automatically generated suite xml file for failed test cases under the directory specified by -d. In default, it's $user.dir/test-output/testng-failed.xml.
    7.2: Use joint commands or multiple suite xml file to run test and then failed test.

### Level 8: Junit test execution
    8.1: Knows about the configuration in suite xml file about junit test cases/suites execution.
    8.2: Limitation?

### Level 9: Run TestNg in your own program
    9.1: Knows about how to run TestNg by programming.
    9.2: Be familiar with TestNg APIs

### Level 10: BeanShell usage
    10.1: Knows about what's BeanShell and it's basic usage.
    10.2: Knows about how to use BeanShell in suite xml file.

### Level 11: Annotation Transformers
    11.1: Knows about the purpose of Annotation Transformers -
    11.2: Knows about the interface: org.testng.IAnnotationTransformer - an sub-interface of org.testng.ITestNGListener
        11.2.1: org.testng.IAnnotationTransformer is used to modify the annotation:@Test
        11.2.2: org.testng.IAnnotationTransformer2 can be used to modify any other annotations such as any configuration annotation or @Factory or @DataProvider
    11.3: Knows about how to use the implementation in TestNG:
        11.3.1: java org.testng.TestNG -listener MyTransformer testng.xml
        11.3.2: TestNG tng = new TestNG(); tng.setAnnotationTransformer(new MyTransformer());

### Level 12: Method Interceptors

### Level 13: Listeners
    13.0: Difference between Listeners and Configuration Methods - @BeforeXXX / @AfterXXX?
        Listeners - global
        Configuration methods - local (suite/test/class/method)
    13.1: org.testng.ITestNGListener - marker interface
    13.2:
    org.testng.IExecutionListener
        org.testng.ISuiteListener
            org.testng.ITestListener
                org.testng.IClassListener
                    org.testng.IConfigurationListener
                        org.testng.IInvokedMethodListener
    13.3:
    org.testng.IAlterSuiteListener - Altering Suites or Tests - <listeners> or service loader
    org.testng.IHookable - Overriding test methods - control test methods invocation in hook way.
    org.testng.IMethodInterceptor - powerful control for test methods execution order for those without dependency

### Level 14: Dependency Injection

### Level 15: IHookable Usage

### Level 16: @Factory Usage
    16.1: Knows about @Factory usage - create a class to provide a method with annotation @Factory. The method creates a number of Test class instances as return value.
    16.2: Knows about configuration in suite xml file by using class with method having @Factory - just use the class name as value of <class name="" />
    16.3: Knows about how TsetNG use / handle @Factory annotation.

### Level Final: TestNg Source Code Study
    F1: Knows how TestNG collects Test Method and how to organize them
        org.testng.TestClass.initMethods()
        org.testng.internal.TestNGMethodFinder.findConfiguration(Class, int)

    F2: Knows about how to build TestNG by source code:
        $ git clone git://github.com/cbeust/testng.git
        $ cd testng
        $ ./build-with-gradle
