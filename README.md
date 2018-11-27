# log-demo

# 已有的日志框架有
## jul:jdk自带
## jcl:apache common logger，是一个比较老的日志抽象框架，只提供接口，不提供具体的实现；目前只支持适配jul和log4j，且优先适配log4j
## log4j：apache日志框架，目前已停止更新
## log4j2: apache日志框架，目前使用比较多
## logback: 目前使用比较多
## slf4j: 日志抽象框架，提供binder包，可以绑定具体的日志框架到slf4j;提供桥接器包，可以把其他开源中的包桥接到指定日志框架包。