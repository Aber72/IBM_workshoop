// Implement the interface Employee by a function
function createEmployee(name, age, department, salary) {
    return {
        name: name,
        age: age,
        department: department,
        salary: salary,
        calculateSalary: function () { return salary * 1.1; },
    };
}
// Create an employee object using the function
var employee1 = createEmployee('John Doe', 30, 'Sales', 50000);
console.log(employee1.name); // John Doe
console.log(employee1.calculateSalary()); // 55000
// Implement the interface Employee by a class
var EmployeeClass = /** @class */ (function () {
    function EmployeeClass(name, age, department, salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }
    EmployeeClass.prototype.calculateSalary = function () {
        return this.salary * 1.1;
    };
    return EmployeeClass;
}());
// Create an employee object using the class
var employee2 = new EmployeeClass('Jane Doe', 25, 'Marketing', 60000);
console.log(employee2.name); // Jane Doe
console.log(employee2.calculateSalary()); // 66000
