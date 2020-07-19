# spring-cloud-examples
Simple examples of Spring Cloud include the basic use of components such as Eureaka, Zuul, Ribbon, and Feign。 Spring Cloud简单示例，包括Eureaka, Zuul, Ribbon, Feign等组件的基本使用。


# 项目运行说明：
1、运行Eureka Server项目，打开http://localhost:8761/ 查看运行情况。  
2、运行service-a项目两次（第二次修改端口为8082），在Eureka面板可看到service-a注册了两个实例，对应的端口分别是8081，8082。可通过 http://localhost:8081/hi 或  http://localhost:8082/hi 访问具体的实例接口。  
3、运行zuul-server（对应端口8769），在Eureka看到注册成功后，直接打开zuul-server对应的网关地址 http://localhost:8769/a/hi 可访问到服务a的接口，重复刷新可看到返回的端口信息发生变更，说明通过网关访问服务a已实现均衡负载。  
4、运行service-b项目(对应端口8090)，打开 http://localhost:8090/hi 查看服务是否启动。然后打开 http://localhost:8090/callA 查看B服务调用A服务接口情况。应该跟步骤3类似，没刷新一次返回的端口都发生变更，说明微服务之间通过Feign调用也已实现均衡负载。  
