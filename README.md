# Лабораторна робота № 4. Мережева взаємодія мобільних додатків

**Мета роботи:** ознайомитись з засобами мережевої взаємодії мобільних додатків. Навчитись створювати засоби авторизації користувачів на мобільній платформі.

Хід роботи:
1. Створити сервіс в Azure Mobile Services (https://portal.azure.com)
2. Створити таблицю в  Azure Mobile Services. Ознайомитись із засобами редагування таблиці і скриптів.
3. Створити приклад програми на Android або iOS для роботи з  Azure Mobile Services.
4. Ознайомитись із засобами авторизації користувачів (див. https://azure.microsoft.com/en-us/documentation/articles/mobile-services-android-get-started-users/)
5. Додати до програми авторизацію з використанням одного з провайдерів авторизації.
6. Заборонити доступ до таблиці для неавторизованих користувачів.
7. Написати звіт.

Додаткові відомості.

Для авторизації з допомогою Facebook необхідно створити програму на Facebook і в налаштуваннях програми додати домен <назва мобільного сервісу>.azure-mobile.net/ як AppDomains і як WebSite/Site URL. Інакше буде помилка при спробі авторизації.

Кроки виконання:

Створення Mobile App Quickstart (бекенд з готовою таблицею)

![](img/img-01.png)

![](img/img-02.png)

![](img/img-03.png)

![](img/img-04.png)

Скачування готового прикладу, який взаємодії з Azure Mobile Services:

![](img/img-05.png)

![](img/img-06.png)

![](img/img-07.png)

Перевірка таблиці `todoitem`

![](img/img-08.png)

Заповнення таблиці у програмі:

![](img/img-09.png)

Перевірка введених значень у таблиці `todoitem`

![](img/img-10.png)

Перевірка скриптів і колонок таблиці  `todoitem`

![](img/img-11.png)

![](img/img-12.png)

Створення додатку на Facebook, щоб дозволити авторизацію користувачів:

![](img/img-13.png)

![](img/img-14.png)

![](img/img-15.png)

Увімкнення авторизації корстувачів з допомогою Facebook: 

![](img/img-16.png)

![](img/img-17.png)

![](img/img-18.png)

![](img/img-19.png)

![](img/img-20.png)

![](img/img-21.png)

![](img/img-22.png)

Дозвіл на доступ лише авторизованим користувачам: 

![](img/img-23.png)

![](img/img-24.png)

![](img/img-25.png)

Додавання авторизації в мобільний додаток:

![](img/img-26.png)

![](img/img-27.png)

![](img/img-28.png)

![](img/img-29.png)

![](img/img-30.png)

![](img/img-31.png)

![](img/img-32.png)

![](img/img-33.png)

![](img/img-34.png)

![](img/img-35.png)

![](img/img-36.png)

![](img/img-37.png)

![](img/img-38.png)

![](img/img-39.png)
