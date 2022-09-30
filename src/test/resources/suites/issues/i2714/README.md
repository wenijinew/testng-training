# Execution Output Difference
## With dependsOnGroups = { "beforeMethod" }
### 6.14.3
[SubCaTestM]Base [Before Method]

[SubCaTestM]Sub [Before Method]

[SubCaTestM]: TC1

[SubCaTestM]Sub [After Method]

[SubCaTestM]Base [After Method]

[SubCaTestM]Base [Before Method]

[SubCaTestM]Sub [Before Method]

[SubCaTestM]: TC2

[SubCaTestM]Sub [After Method]

[SubCaTestM]Base [After Method]

### 7.5
[SubCaTestM]Base [Before Method]

[SubCaTestM]Sub [Before Method]

[SubCaTestM]: TC1

[SubCaTestM]Base [After Method]

[SubCaTestM]Sub [After Method]

[SubCaTestM]Base [Before Method]

[SubCaTestM]Sub [Before Method]

[SubCaTestM]: TC2

[SubCaTestM]Base [After Method]

[SubCaTestM]Sub [After Method]

## Without dependsOnGroups = { "beforeMethod" }

### 6.14.3
[SubCaTestM]Base [Before Method]

[SubCaTestM]Sub [Before Method]

[SubCaTestM]: TC1

[SubCaTestM]Sub [After Method]

[SubCaTestM]Base [After Method]

[SubCaTestM]Base [Before Method]

[SubCaTestM]Sub [Before Method]

[SubCaTestM]: TC2

[SubCaTestM]Sub [After Method]

[SubCaTestM]Base [After Method]

### 7.5
[SubCaTestM]Base [Before Method]

[SubCaTestM]Sub [Before Method]

[SubCaTestM]: TC1

[SubCaTestM]Sub [After Method]

[SubCaTestM]Base [After Method]

[SubCaTestM]Base [Before Method]

[SubCaTestM]Sub [Before Method]

[SubCaTestM]: TC2

[SubCaTestM]Sub [After Method]

[SubCaTestM]Base [After Method]

# Code Analysis
## 6.14.3
### org.testng.internal.Invoker

    @Override
    public List<ITestResult> invokeTestMethods(ITestNGMethod testMethod,
                                                         XmlSuite suite,
                                               Map<String, String> testParameters,
                                               ConfigurationGroupMethods groupMethods,
                                               ConfigurationGroupMethods groupMethods,
                                               Object instance,
                                               ITestContext testContext) {
        ...
        ITestNGMethod[] afterMethods = TestNgMethodUtils.filterAfterTestMethods(testClass, CAN_RUN_FROM_CLASS);
        ...
    }

## 7.5
### org.testng.internal.MethodHelper

    private static List<ITestNGMethod> sortMethods()
    This method is to make sure base classes are invoked before child classes if 'before', and the other way around if
    'after'.

### org.testng.TestClass

    private void initMethods(){}
    This method is to create ITestNGMethod[] for test methods and configuration methods.

### ConfigurationMethod

    ConfigurationMethod.createTestMethodConfigurationMethods()

### testMethodFinder.getAfterTestMethods(m_testClass)


### MethodHelper.collectAndOrderMethods


### MethodGroupsHelper.collectMethodsByGroup
