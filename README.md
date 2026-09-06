# Java homework

Решай задачи в `src/main/java/academy/week01` (и других weekXX).

- Условие — комментарий над методом.
- Пиши код только внутри метода. Название и параметры не меняй.
- Пока стоит `throw new UnsupportedOperationException("TODO")` — задача
  ещё не сдана, автопроверка её пропускает.
- Сдал задачу (убрал TODO и написал решение) — GitHub Actions проверит
  её на следующем push.

## Как проверить у себя на компьютере

Тестов у тебя в репозитории нет — их запускает GitHub. Локально смотришь
результат через `Playground`.

1. Открой `src/main/java/academy/Playground.java`.
2. В `main` вызови свой метод, например:
   `System.out.println(ifElse.maxOfTwo(3, 7));`
3. Нажми зелёный треугольник слева от `main` (Run).
4. Смотри вкладку **Run** внизу IDEA.

Если метод ещё с `TODO` — упадёт `UnsupportedOperationException`.  
Если решение есть — в консоли напечатается ответ. Сравни его с примером
в комментарии над методом.

Из терминала, из папки `student-tasks`:

```bash
mvn -q exec:java
```

Когда уверен — `git push`. Скрытые тесты прогонит GitHub Actions.

## Порядок уроков

Решай в этом порядке — номер урока написан в комментарии каждого класса.

```text
week01/ — синтаксис
  1. IfElseTasks     if / else
  2. LoopTasks       циклы
  3. ArrayTasks      массивы
  4. StringTasks     строки
  5. MethodTasks     методы и перегрузка

week02/ — ООП
  1. BankAccount                              инкапсуляция
  2. Employee → Manager                       наследование
  3. Shape → Circle → Rectangle → ShapeTasks  абстракция + полиморфизм
  4. Discount → PercentDiscount → FixedDiscount → DiscountTasks  интерфейсы
  5. Book                                     equals / hashCode
  6. TrafficLight                             enum

week03/ — коллекции, дженерики, исключения
  1. ListTasks        List
  2. MapTasks         Map
  3. SetTasks         Set
  4. DequeTasks       стек: скобки, RPN
  5. Pair             дженерики
  6. ComparatorTasks  сортировки (Person — готовый класс)
  7. ExceptionTasks   исключения (InvalidAgeException — готовый класс)

week04/ — современная Java
  1. LambdaTasks         лямбды и функциональные интерфейсы
  2. StreamNumberTasks   Stream на числах
  3. StreamCollectTasks  collect / groupingBy / flatMap
  4. OptionalTasks       Optional без get()
  5. Point               record
  6. FileTasks           Files / Path
  7. DateTimeTasks       LocalDate / Period
  8. SafeCounter         потоки и synchronized

week05/ — Git, Maven, JUnit  →  задания: docs/week05.md
  4. StringCalculator    TDD-ката (остальные уроки — процессные)

week06/ — SQL
  SqlTasks               13 запросов от SELECT до подзапросов;
                         уроки пронумерованы прямо в комментариях методов

week07/ — JDBC
  OrderDao               DAO на PreparedStatement (PrintOrder — готовый класс)

week08/ — HTTP, REST, JSON
  1. HttpTasks           статус-коды, идемпотентность, URL
  2. JsonTasks           Jackson (WeatherReport — готовый класс)

недели 9–12 — Spring Boot и инфраструктура: отдельный проект,
задания в docs/week09.md … docs/week12.md, проверка через PR-ревью.
```

После решения:

```bash
git add .
git commit -m "week01: maxOfTwo"
git push
```
