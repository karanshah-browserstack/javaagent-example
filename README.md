# browserstack-javaagent
BrowserStack JavaAgent for Selenium framework.

## Setup
* Create sample browserstack.yaml file with the browserstack related capabilities and place it in your root folder.
* Add maven dependency of browserstack-javaagent in your pom.xml file
```sh
<dependency>
    <groupId>com.browserstack</groupId>
    <artifactId>browserstack-javaagent</artifactId>
    <version>1.0.0</version>
</dependency>
```
* Modify your build plugin to run tests by adding argLine `-javaagent:${org.browserstack:browserstack-javaagent:jar}`.
```
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.0.0-M5</version>
                <configuration>
                    <suiteXmlFiles>
                        <suiteXmlFile>testng.xml</suiteXmlFile>
                    </suiteXmlFiles>
                    <argLine>
                        -javaagent:${org.browserstack:browserstack-javaagent:jar}
                    </argLine>
                </configuration>
                <dependencies>
                    <dependency>
                        <groupId>org.aspectj</groupId>
                        <artifactId>aspectjweaver</artifactId>
                        <version>1.9.6</version>
                    </dependency>
                </dependencies>
            </plugin>
```

## Running your tests
- To run tests using maven, run `mvn test`

## Sample browserstack.yaml file
```sh
hubUrl: https://hub-cloud.browserstack.com/wd/hub
userName: BROWSERSTACK_USERNAME
accessKey: BROWSERSTACK_ACCESS_KEY
buildName: browserstack-build-1
projectName: BrowserStack JavaAgent
browserstackLocal: true
browserStackLocalOptions:
  localIdentifier: browserStackLocalIdentifierName
debug: true
networkLogs: true
consoleLogs: debug
platforms:
  - os: OS X
    os_version: Big Sur
    browser: Chrome
    browser_version: latest
    browserstack.selenium_version: 3.141.59
```

