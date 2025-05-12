{
// Tuple type declaration
let tuple1: [string, number] = ['hello', 42];

// Tuple type declaration with multiple types
let tuple2: [string, number, boolean] = ['hello', 42, true];

// Tuple type declaration with array type
let tuple3: [string, number][] = [['hello', 42], ['world', 24]];

// Tuple type declaration with readonly type
let tuple4: readonly [string, number] = ['hello', 42];

// Tuple type declaration with optional type
let tuple5: [string, number, boolean?] = ['hello', 42];

// Tuple type declaration with rest type
let tuple6: [string, ...number[]] = ['hello', 42, 24, 36];

// Tuple type declaration with tuple type
let tuple7: [string, number] = ['hello', 42];

console.log(tuple1); // ["hello", 42]
console.log(tuple2); // ["hello", 42, true]
console.log(tuple3); // [["hello", 42], ["world", 24]]
console.log(tuple4); // ["hello", 42]
console.log(tuple5); // ["hello", 42]
console.log(tuple6); // ["hello", 42, 24, 36]
console.log(tuple7);} // ["hello", 42]}
