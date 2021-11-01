## 看教程
[黑马程序员SpringBoot教程，6小时快速入门Java微服务架构Spring Boot](https://www.bilibili.com/video/BV1Lq4y1J77x?p=15&spm_id_from=pageDriver)
## 相关命令
```shell
# 命令行运行
 ./mvnw spring-boot:run 
```

```shell
# 打包 jar 包
./mvnw clean package
# 运行 jar 包
java -jar target/demo-0.0.1-SNAPSHOT.jar
# 切换环境
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=pro
 
```

## Test

```curl
curl -H "Content-Type: application/json" -X POST -d '{"name": "jackson", "coin":100 }' "http://localhost:9090/greet"
```

## SpringBoot-内部配置加载顺序

1. file: ./config/   : 当前项目下的 /config 目录下
2. file: ./      : 当前项目的根目录
3. classpath: /config/ : calsspath的/config目录
4. classpath:/ : classpath的根目录

加载的顺序为上文的排列顺序，高优先级配置的属性会生效

* resource 下的配置属于第四种

## SpringBoot-内部配置加载顺序
1. 通过命令行方式指定配置
```shell
#eg:
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=pro
```
2. 通过指定配置文件
```shell
#eg:
java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.config.location=./application.properties 
```
3. 将配置文件和 jar 包放在同一级目录，这样就会直接识别
4. 将配置文件和 jar 包同级目录想的 ./config 目录