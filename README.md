Реализовать простое веб приложение для приема заказов на доставку посылок - delivery
================================
Приложение должно состоять из двух страниц

1. Страница с формой создания нового заказа (все поля обязательны для заполнения):

* ФИО отправителя
* Город отправителя
* Адрес отправителя
* ФИО получателя
* Город получателя
* Адрес получателя
* Вес посылки
* Дата отправки

2. Страница со списком принятых заказов отображает все данные заказа введенные пользователем и номер заказа сгенерированный системой

Технические требования
================================
* [OpenJDK 11](https://www.oracle.com/cis/java/technologies/javase/jdk11-archive-downloads.html)
* [PostgreSQL 12](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads) или новее
* [Apache Tomkat 9.0.75](https://tomcat.apache.org/download-90.cgi)


Установка
================================

1. Склонировать git repository в локальную директорию
```bash
https://github.com/kulonbekov/delivery.git
```
2. Настройте параметры базы данных:
```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/db_delivery
spring.datasource.username=postgres
spring.datasource.password=postgres
```
3. В директории проекта, запустите PowerShell, введите команду 
```bash
./mvnw spring-boot:run
```
4. Если приложение успешно запущено, вы должны увидеть страница со списком принятых заказов.
```bash
http://localhost:8060/orders
```

Обзор проекта
================================

`http://localhost:8060/orders` - страница со списком принятых заказов

`http://localhost:8060/orders-new` - cтраница с формой создания нового заказа

`server.port=8060`
