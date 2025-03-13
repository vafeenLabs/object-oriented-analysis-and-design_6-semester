# Объектно-ориентированный анализ и проектирование 6 семестр

lab1.

```kt
/**
 * Паттерн: Стратегия
 * Из файла подается массив целых чисел.
 * Необходимо реализовать три различные сортировки по возрастанию и по убыванию для каждой.
 * Быструю, Слиянием
 */
```

lab2.

```kt
/**
 * Паттерн: Шаблонный метод
 * 1) Создайте рабочую структуру, 
 * которая принимает список имен файлов из командной строки.
 * Она открывает каждый файл, за исключением последнего, 
 * для чтения, а последний для записи.
 * Эта рабочая структура обрабатывает каждый входящий файл,
 * используя неопределенную политику,
 * а затем пишет результат в последний файл.
 * Наследуйте от этой рабочей структуры 
 * для создания двух разный приложений:
 * • Первое конвертирует все литеры каждого файла в верхний регистр.
 * • Второе ищет файлы, в которых содержатся слова из первого файла.
 */
```

lab3.

```kt
/**
 * Паттерн: Команда
 * Игра крестики-нолики с возможностью отмены хода
 */
```

lab4.

```kt
/**
 * Паттерн: Абстрактная фабрика
 * Есть Гоблины и Орки
 * У каждого войска одинаковая иерархия: Генерал, Главнокомандующий, Солдаты
 * Реализовано создание войск и война
 */
```

lab5.

```kt

/**
 * Паттерн: Алаптер
 * Описание задачи: Вам нужно разработать систему,
 * которая поддерживает обработку платежей
 * в разных валютах (рубли, доллары, евро)
 * через несколько старых платежных систем.
 * Каждая старая система работает только с одной валютой,
 * но клиентский код должен уметь работать с любой валютой через единый интерфейс.
 * Требования:
 * 1.	Реализовать три старые платежные системы.
 * 2.	Создать интерфейс IModernPaymentGateway
 * с методом Pay(float amount, string currency),
 * где currency — это код валюты ("RUB", "USD", "EUR").
 * 3.	Реализовать адаптеры для каждой старой системы.
 * 4.	Добавить поддержку конвертации валют.
 * Если клиентский код передает платеж в валюте,
 * которую старая система не поддерживает,
 * адаптер должен конвертировать сумму в нужную валюту
 * (используйте фиксированные курсы для простоты).
 */
```
