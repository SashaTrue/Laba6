# Laba6
- Реализация адаптивного теста из цепочки в 3 – 4 вопроса.
Начальная страница:
![image](https://user-images.githubusercontent.com/32790158/229417085-130cad2f-4d1b-4e92-8484-3fa53927a034.png)

В зависимости от правильного или же неправильного ответа - задания усложняются или же становятся легче:
Неправильно ответив на 2 вопроса третий будет самый простой:

![image](https://user-images.githubusercontent.com/32790158/229417401-39e23c8d-c447-40cc-be36-9eb3afda87b7.png)

Внутри каждого сервлета есть метод (primerchik), который генерирует пример, метод в качестве аргументов принимает ответ (метод сгенерирует пример ответом на который будет этот аргумент) и сложность (от 1)
