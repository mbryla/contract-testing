# preface
This is a small project to demonstrate contract testing which was created as an example to lectures about mutation and contract testing. The slides are included in this repository. You can also find a commentary article in the links below:

https://medium.com/@mateusz.bryla/mutation-and-contract-testing-842c9571df82
https://codete.com/blog/mutation-and-contract-testing/

# contract-testing
This is the demo project for Contract Testing for Java using Spring Cloud Contract. It consists of two Maven projects located in the `java` directory - a producer and a consumer. The prducer provides an endpoint for HTTP GET requests and answers with an echo response.

The producer project includes a contract which is listed as a dependency of the consumer. To see the example contract testing workflow please download the code sample, run `mvn install` in the producer project and then `mvn test` in the consumer project. Those commands will first generate contract verifying tests in the producer project, run them and then install contract stubs in the local Maven repository. The consumer project will then use WireMock to use them as a producer stub.
