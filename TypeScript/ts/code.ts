
interface Employee {
  name: string;
  age: number;
}

interface Department {
  departmentName: string;
}

interface Manager extends Employee, Department {
  // no additional properties or methods
}

interface Developer extends Employee, Department {
  // no additional properties or methods
}

const manager: Manager = {
  name: 'John Doe',
  age: 30,
  departmentName: 'Sales',
};

const developer: Developer = {
  name: 'Jane Doe',
  age: 25,
  departmentName: 'Marketing',
};
