## Відповіді на контрольні питання

1. **Порівняння методів сортування:**
   - **Сортування бульбашкою:**
     - *Переваги:*
       - Простий для реалізації.
       - Не вимагає додаткової пам'яті для сортування.
     - *Недоліки:*
       - Дуже неефективний для великих масивів.
       - Має квадратичну складність часу.
       - Не є стабільним.

   - **Сортування вибором:**
     - *Переваги:*
       - Простий для реалізації.
       - Не вимагає додаткової пам'яті для сортування.
     - *Недоліки:*
       - Має квадратичну складність часу.
       - Не є стабільним.

   - **Сортування вставкою:**
     - *Переваги:*
       - Ефективний для невеликих масивів.
       - Простий для реалізації.
       - Зазвичай є стабільним.
     - *Недоліки:*
       - Має квадратичну складність часу для великих масивів.
       - Вимагає додаткової пам'яті для зміни масиву.

2. **Оцінка методів сортування:**
   - *Час роботи:* Усі три алгоритми мають середню та найгіршу часову складність O(n^2). Сортування вставкою може бути швидшим для малих масивів.
   - *Потреби у додатковій пам'яті:* Сортування бульбашкою та сортування вибором не вимагають додаткової пам'яті. Сортування вставкою вимагає додаткової пам'яті для зміни масиву.
   - *Стабільність:* Сортування вставкою зазвичай є стабільним.
   - *Додаткові критерії:* Сортування бульбашкою та сортування вибором використовують менше порівнянь, але більше обмінів у порівнянні з сортуванням вставкою.

3. **Найкращий та найгірший випадок:**
   - *Сортування бульбашкою та сортування вибором:*
     - *Найкращий випадок:* Масив вже повністю відсортований (час O(n)).
     - *Найгірший випадок:* Масив відсортований у зворотному порядку (час O(n^2)).

   - *Сортування вставкою:*
     - *Найкращий випадок:* Масив вже частково відсортований (час O(n)).
     - *Найгірший випадок:* Масив відсортований у зворотному порядку (час O(n^2)).

4. **Позначення O(1), O(n), O(n^2):**
   - *O(1):* Константна часова складність. Алгоритм часово не залежить від розміру вхідних даних.
   - *O(n):* Лінійна часова складність. Час роботи алгоритму залежить лінійно від розміру вхідних даних.
   - *O(n^2):* Квадратична часова складність. Час роботи алгоритму залежить квадратично від розміру вхідних даних.
