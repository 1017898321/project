#springcloud gatway + nacos 演示项目



spring:
  application:
    name: gateway-service # gatway服务名
  cloud:
    nacos: # 配置nacos
      discovery:
        server-addr: localhost:8848 # 本地nacos地址
      config:
        server-addr: localhost:8848
    gateway:
      routes:    # 配置gatway路由
                 # id: 配置路由key
        - id: order  
                # uri配置有三种方式:
                # 1.ws://ip:port 长链接
                # 2.http://ip:port / 域名 
                # 3.lb://微服务服务名称   注: 此处必须与转发服务名相同
          uri: lb://order-service 
          predicates:
               # path: 拦截方式: 此处取路径拦截 还包含(cookie,method,host...) 
            - Path=/order/**
          filters:
            - StripPrefix=1 # 去前缀
            - name: CircuitBreaker # 断言
                args:
                  name: order-service 
                  fallbackuri: forward:/orderFallBack  # 重定向本地fallback
        - id: payment
          uri: lb://payment-service
          predicates:
            - Path=/payment/**
