# Example Geb and Gradle Project

[![Build Status][build_status]](https://snap-ci.com/geb/geb-example-gradle/branch/master)

## Description

This is an example of incorporating Geb into a Gradle build. It shows the use of Spock and JUnit 4 tests.

The build is setup to work with Firefox, Chrome and PhantomJS. Have a look at the `build.gradle` and the `src/test/resources/GebConfig.groovy` files.

## Usage

The following commands will launch the tests with the individual browsers:

    ./gradlew chromeTest
    ./gradlew firefoxTest
    ./gradlew phantomJsTest

To run with all, you can run:

    ./gradlew test

Replace `./gradlew` with `gradlew.bat` in the above examples if you're on Windows.

## Questions and issues

Please ask questions on [Geb user mailing list][mailing_list] and raise issues in [Geb issue tracker][issue_tracker].



## Useful Links 
- cannot run in parallel: https://discuss.gradle.org/t/can-i-run-testng-tasks-in-parallel-single-build-project/18328/3
- grouping with TestNG: https://ferritedog.wordpress.com/2012/08/02/gradle-and-testng-grouping-the-test-runs/
- https://discuss.gradle.org/t/executing-junit-tests-belonging-to-a-class-in-parallel/6173
- http://stackoverflow.com/questions/29357333/quit-driver-after-each-geb-spock-test : browser potentially cannot be quit after each test / implications on reporting 



[build_status]: https://snap-ci.com/geb/geb-example-gradle/branch/master/build_image "Build Status"
[mailing_list]: https://groups.google.com/forum/#!forum/geb-user
[issue_tracker]: https://github.com/geb/issues/issues
