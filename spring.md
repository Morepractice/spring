# Spring

### 发布订阅模式

- 事件源-广播器-事件-监听者
- spring内置事件：ContextRefreshedEvent和ContextClosedEvent、ContextStartedEvent和ContextStoppedEvent
- 监听的两种方式（@EventListener和继承ApplicationListener）；发送器applicationEventPublisher
- @Order事件排序

### 模块装配

- 模块：功能单元，可相互依赖，内部高内聚，目标明确
- 