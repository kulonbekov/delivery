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
mvn clean package
```
4. Убедитесь, что проект успешно собран и создан WAR-файл в папке
```bash
..\delivery\delivery\target
```
5. Установите Apache Tomcat 9.0 на сервер или компьютер, где планируется развернуть приложение
6. Скопируйте WAR-файл, полученный на предыдущем шаге, в директорию webapps внутри каталога установки Tomcat. Пример пути:
```bash
<путь к установке Tomcat>/webapps
```
7. Запустите сервер Apache Tomcat.
8. Перейдите в каталог bin внутри каталога установки Tomcat.
9. Запустите скрипт startup.bat (для Windows) или startup.sh (для Linux/Unix) для запуска сервера Tomcat.
```bash
http://localhost:8080/delivery/orders
```
11. Если приложение успешно развернуто, вы должны увидеть страница со списком принятых заказов.

Обзор проекта
================================

1. http://localhost:8080/delivery/orders  - страница со списком принятых заказов
2. http://localhost:8080/delivery/orders/new - cтраница с формой создания нового заказа
3. server.port=8060
