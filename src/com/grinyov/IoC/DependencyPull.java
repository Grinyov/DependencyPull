package com.grinyov.IoC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by green on 11/6/15.
 *
 * Показан типовой поиск Dependency Pull в приложении, осно­
 ванном на Spring
 Этот тип loC не только преобладает в JЕЕ-приложениях (использующих EJ В 2.1
 или предшествующие версии), в которых широко применяются поиски JNDI для
 получения зависимостей из реестра, но является центральным аспектом для работы
 с платформой Spring во многих средах
 *
 * Платформа Spring также предлагает Dependency Pull в качестве механизма для
 извлечения компонентов, которыми она управляет
 *
 * Вариант Dependency Lookup доступен в виде
 двух типов: Dependency Pull (Извлечение зависимостей) и Contextualized Dependency
 Lookup (Контекстуализированный поиск зависимостей), или CDL
 */
public class DependencyPull {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("app-context.xml");

        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}
