// // external js
// console.log("hello  me hu pehla javascript");
// var a ; // declaration
// a=10;// initializaztion
// console.log(a);
// var a;// redeclaration
// a =30;// re-initialization
// console.log(a)
// var a=78;// initializaztion & declaration
// console.log(a)
// var a1;
// console.log(a1);// undefined
// let b =90;
// let b1 ;
// console.log(b1);
// const c=89
// const c1;
// console.log(c1);

/*

                                  var | let |const|
    ________________________________________________
    declare                       |  y |  y  |  n  |
    initialize                    |  y |  y  |  n  |
    declare& initialize           |  y |  y  |  y  |
    re-declare                    |  y |  n  |  n  |
    re-initialize                 |  y |  y  |  n  |
    re-declare & re-initialize    |  y |  n  |  n  |
    ______________________________|____|_____|_____|

*/
// console.log("*******************************")
// k();
// console.log("before")
// function k()
// {
//     console.log("this is hoisting concept")
// }
// console.log(l)
// let l;
//  HOISTING are occurs only var
 // var are contain hoisting concept but let not contain hoisting cencept 
 // let are give this error " Cannot access 'l' before initialization"  
 // search  and find this word " TDZ" " temporalar demo Zone"
// l=6;
// console.log(a) // before declaration we can not access 'a' in let and const from  TDZ (temporal dead zone)
// jisme TDZ hoga vha script scope hota hai
let a;
console.log(a);
a=89;
console.log(a);
// in javascript all of data type  is number
// Data types---> (1) primitive  (immutable) --> number , string , boolean , undefined , null , big int , symbol
//                (2)  objects , Arrays , Functions
a=9.8838
let b = 9.8838
let c ="dhjdhjdfhj"
let d =undefined
let e =null // null can be anything such as number , string boolean etc.
let f =99n // coverting number into bigint
console.log(typeof a)
console.log(typeof b)
console.log(typeof c)
console.log(typeof d)
console.log(typeof e)
console.log(typeof f)
console.log(f)
let s1 = Symbol("hello")
let s2 = Symbol("hello")
console.log(typeof s1)
console.log(s1.length)
console.log(s1==s2) // == check only value
console.log(a  === b) //  === it check data as well as data type of this value
console.log(a==s1)
let str = "hello" // in js  array not homogenous but  it occurs only hetrogeneous  because array are contain in js differnt type of data
console.log(str[0])
let arr =[12 , "karan" , 9.099 ,undefined , null , 'o']
console.log(typeof arr[0]+ " "+ arr[0])
console.log(typeof arr[1] + " "+arr[1])
console.log(typeof arr[2] + " " + arr[2])
console.log(typeof arr[3] + " "+arr[3])
console.log(typeof arr[4]+ " "+ arr[4])
console.log(typeof arr[5]+ " "+ arr[5])
debugger
console.log("**************************************")
console.log("start")
console.log(p)
var q;
var p=10
console.log(q)
console.log(p,q)
var r =100
var q = 200
console.log(p,r)
console.log("End------------------------------")
// GEC engine scan two times of JS code (i) variable phase--> search all declaration part and  assign in memory a memory 
//  (ii) execution phase  --> function declaration , assignment of value  etc.


       
