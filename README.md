# spring-cloud-foundry
spring-cloud example tests.
So far contains an example of config server, eureka registrations.
All configurations are done in bootstrap.yml.

Config-server-dev is a git repository for storing configuration files for the actual application deployed on cloud.

Config-server is to be started first. It is the hub for configuration files. It fetches from git by cloning and all other
servers contact config-server to fetch their properties.
It points to a git repository where are located different config files (properties)
The clients of this server sends the client name and the profile. So for a client named eureka, with dev profile, 
the configurations are located in the github repository, in eureka-dev.properties file.

There is also a eureka server which is itself a client as well. The client is disabled for this case.

The client is both client for configuration server and eureka server. This means, it fetches the properties from config-server,
after it is build contacts the eureka-server and register itself for other eureka clients to finds it.

