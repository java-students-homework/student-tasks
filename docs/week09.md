# Неделя 9 — Spring Boot: DI и веб-слой

Домашка этой недели — отдельный Spring Boot проект в ТВОЁМ репозитории
(шаблон даёт ментор). Автотестов здесь нет: проверка через PR-ревью
ментора + Postman-коллекцию.

## Задание: REST-сервис «Заявки на 3D-печать» (in-memory)

1. **Урок 1 — каркас.** Сгенерируй проект на start.spring.io
   (web, validation, lombok — по желанию). Запусти, покажи
   `GET /actuator/health` недоступен — actuator ещё не подключён,
   объясни почему.
2. **Урок 2 — DI.** Слои: `OrderController` → `OrderService` →
   `OrderRepository` (пока `Map<Long, Order>` в памяти).
   Только конструкторная инъекция. Полевая `@Autowired` — реджект на ревью.
3. **Урок 3 — CRUD.** Эндпоинты:
   - `POST /orders` → 201 + Location;
   - `GET /orders` и `GET /orders/{id}` → 200 / 404;
   - `PUT /orders/{id}` → 200 / 404;
   - `DELETE /orders/{id}` → 204.
4. **Урок 4 — DTO.** Наружу только DTO (`OrderRequest`, `OrderResponse`),
   entity не отдаём. Маппинг руками в сервисе.
5. **Урок 5 — Swagger.** Подключи springdoc, проверь `/swagger-ui.html`.

Сдача: PR ментору + Postman-коллекция со всеми запросами
(включая 404-кейсы) в папке `postman/` репозитория.
