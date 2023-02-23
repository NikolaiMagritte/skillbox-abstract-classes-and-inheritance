# <u>**Задача:**</u>
**Создайте класс компании Company, содержащей сотрудников и реализующей методы:**

    найм одного сотрудника — hire(Employee employee),  
    найм списка сотрудников – hireAll(Collection<Employee> employes),  
    увольнение сотрудника – fire(Employee employee),  
    получение значения дохода компании – getIncome().  
    Каждый метод НЕ должен иметь модификатор static, это позволит каждому объекту класса Company иметь свой набора сотрудников, свой расчет дохода, увольнение и найм. Аргументы и возвращаемое значение методов выберите на основании логики работы вашего приложения.

**Создайте два метода, возвращающие список указанной длины (count). Они должны содержать сотрудников, отсортированных по убыванию и возрастанию заработной платы:**

    List<Employee> getTopSalaryStaff(int count),  
    List<Employee> getLowestSalaryStaff(int count).

**Создайте классы сотрудников с информацией о зарплатах и условиями начисления зарплаты:**

    Manager — зарплата складывается из фиксированной части и бонуса
    в виде 5% от заработанных для компании денег.
    Количество заработанных денег для компании генерируйте 
    случайным образом от 115 000 до 140 000 рублей.  

    TopManager — зарплата складывается из фиксированной части и бонуса
    в виде 150% от заработной платы, если доход компании 
    более 10 млн рублей.  

    Operator — зарплата складывается только из фиксированной части.  

Каждый класс сотрудника должен имплементировать интерфейс Employee. В интерфейсе Employee должен быть объявлен метод, возвращающий зарплату сотрудника, — getMonthSalary().

Аргументы и возвращаемое значение метода выберите в соответствии с логикой начисления зарплат. В интерфейсе объявите необходимые методы.  



**Для демонстрации и тестирования работы ваших классов:**


    Создайте и наймите в компанию: 180 операторов Operator, 
    80 менеджеров по продажам Manager, 10 топ-менеджеров TopManager.  

    Распечатайте список из 10–15 самых высоких зарплат в компании.  

    Распечатайте список из 30 самых низких зарплат в компании.  

    Увольте 50% сотрудников.  

    Распечатайте список из 10–15 самых высоких зарплат в компании.  

    Распечатайте список из 30 самых низких зарплат в компании.

Подробная информация о решении задачи: https://dzen.ru/a/Y_eiYTA_H1wtsSmK