# Spring

### 发布订阅模式

- 事件源-广播器-事件-监听者
- spring内置事件：ContextRefreshedEvent和ContextClosedEvent、ContextStartedEvent和ContextStoppedEvent
- 监听的两种方式（@EventListener和继承ApplicationListener）；发送器applicationEventPublisher
- @Order事件排序

### 模块装配

- 模块：功能单元，可相互依赖，内部高内聚，目标明确
- 模块装配：@import(普通类，配置类，importSelector实现类，ImportBeanDefinitionRegistrar实现类)
- 条件装配：@profile和@Conditional

### environment

- 当前环境(profiles和property)
- **method加do(method为代码核心逻辑，加do可能会有前置条件判断或对结果进行处理)**
- **class加Mutable**为list封装组合
- **class加Configurable**扩展set方法

### beanDefinitionRegistrar

- beanDefinition注册器，实质相当于map
- 在条件装配重写importBeanDefinitionRegistrar的registerBeanDefinitions方法时使用

### beanPostProcessor

- beanPostProcessor是一个容器扩展点，可以在bean生命周期初始化阶段前后添加自定义处理逻辑，不同的ioc容器的beanPostProcessor不相互干扰
- 执行顺序 postProcessBeforeInitialization->@postConstruct->beanInit->initMethod->postProcessAfterInitialization