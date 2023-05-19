# Mutation Test

I wrote an article on medium explain a bit more about what is mutation test
[Read the article: What is a Mutation Test](https://medium.com/wearewaes/the-mutation-test-7fe94ee2e5e8)

##About this Application:

This is just a demo on how to run the mutation test

You can run the tests:

* build the application
`mvn clean install -DskipTest`


* run the unit test
`mvn test`

* Generate the mutation test
`mvn pitest:mutationCoverage`

* Generate the mutation test report
  `mvn pitest:report`

### Report

You can find the report in: 'target/pit-reports'