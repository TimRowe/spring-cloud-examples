项目说明（中文）
=========================
Spring Cloud简单示例，包括Eureaka, Zuul, Ribbon, Feign等组件的基本使用。

## 一张图带你了解Spring Cloud的世界
![Alt text](https://github.com/TimRowe/spring-cloud-examples/blob/master/SpringCloud.png)

## 项目运行说明：
- 运行Eureka Server项目，打开http://localhost:8761/ 查看运行情况。  
- 运行service-a项目两次（第二次修改端口为8082），在Eureka面板可看到service-a注册了两个实例，对应的端口分别是8081，8082。可通过 http://localhost:8081/hi 或  http://localhost:8082/hi 访问具体的实例接口。  
- 运行zuul-server（对应端口8769），在Eureka看到注册成功后，直接打开zuul-server对应的网关地址 http://localhost:8769/a/hi 可访问到服务a的接口，重复刷新可看到返回的端口信息发生变更，说明通过网关访问服务a已实现均衡负载。  
- 运行service-b项目(对应端口8090)，打开 http://localhost:8090/hi 查看服务是否启动。然后打开 http://localhost:8090/callA 查看B服务调用A服务接口情况。应该跟步骤3类似，没刷新一次返回的端口都发生变更，说明微服务之间通过Feign调用也已实现均衡负载。  

Project Description (English)
=========================
Simple examples of Spring Cloud include basic use of components such as Eureaka, Zuul, Ribbon, Feign, etc.

## A diagram to take you through the world of the Spring Cloud
![Alt text](https://github.com/TimRowe/spring-cloud-examples/blob/master/SpringCloud.png)

## Project Running Instructions:
- run the Eureka Server project and open http://localhost:8761/ to see how it is running.
- run the service-a project twice (the second change to port 8082). In the Eureka panel, you can see that service-a has registered two instances, and the corresponding port is 8081,8082 respectively. The specific instance interface can be accessed at either http://localhost:8081/hi or http://localhost:8082/hi.
- run zuul - server (port 8769), seen in Eureka, after registering successfully open zuul - corresponding gateway server address http://localhost:8769/a/hi directly accessible to service a interface, repeated refreshes you can see the return port information is changed, that through the gateway access service has achieved a balanced load.
- run the service-b project (corresponding to port 8090) and open http://localhost:8090/hi to see if the service is started. Then open the http://localhost:8090/callA view B service calls A service interface. As in Step 3, the ports returned without a refresh should change, indicating that the microservices have also been load-balanced through Feign calls.
