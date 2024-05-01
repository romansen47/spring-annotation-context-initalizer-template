# Spring annotation context initializer

Minimal template for projects using spring annotation configuration.

In order to use, create own implementation of SpringAnnotationContextInitializer
and adjust base package name. Instantiation of this implementation will initialize 
spring's annotation context and bean definition pick up and so on...