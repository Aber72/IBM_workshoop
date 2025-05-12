{
    // Tuple type declaration
    var tuple1 = ['hello', 42];
    // Tuple type declaration with multiple types
    var tuple2 = ['hello', 42, true];
    // Tuple type declaration with array type
    var tuple3 = [['hello', 42], ['world', 24]];
    // Tuple type declaration with readonly type
    var tuple4 = ['hello', 42];
    // Tuple type declaration with optional type
    var tuple5 = ['hello', 42];
    // Tuple type declaration with rest type
    var tuple6 = ['hello', 42, 24, 36];
    // Tuple type declaration with tuple type
    var tuple7 = ['hello', 42];
    console.log(tuple1); // ["hello", 42]
    console.log(tuple2); // ["hello", 42, true]
    console.log(tuple3); // [["hello", 42], ["world", 24]]
    console.log(tuple4); // ["hello", 42]
    console.log(tuple5); // ["hello", 42]
    console.log(tuple6); // ["hello", 42, 24, 36]
    console.log(tuple7);
} // ["hello", 42]}
