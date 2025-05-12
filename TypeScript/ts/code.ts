let number: number[] =[2,3,4,5,6]
number.push(8);
console.log(number)


let fruit:Array<string> =["mango","banana","apple"]
fruit.push("litchi")
console.log(fruit)


const color : readonly string[] = ['red','yellow','blue']
console.log(color)

let mixed:(string|number)[] =['cat',67,'mat',65]
console.log(mixed);