
// Define the interface Employee
interface Employee {
  name: string;
  age: number;
  department: string;
  salary: number;
  calculateSalary(): number;
}

// Implement the interface Employee by a function
function createEmployee(name: string, age: number, department: string, salary: number): Employee {
  return {
    name,
    age,
    department,
    salary,
    calculateSalary: () => salary * 1.1,
  };
}

// Create an employee object using the function
const employee1 = createEmployee('John Doe', 30, 'Sales', 50000);
console.log(employee1.name); // John Doe
console.log(employee1.calculateSalary()); // 55000

// Implement the interface Employee by a class
class EmployeeClass implements Employee {
  constructor(public name: string, public age: number, public department: string, public salary: number) {}

  calculateSalary(): number {
    return this.salary * 1.1;
  }
}

// Create an employee object using the class
const employee2 = new EmployeeClass('Jane Doe', 25, 'Marketing', 60000);
console.log(employee2.name); // Jane Doe
console.log(employee2.calculateSalary()); // 66000
