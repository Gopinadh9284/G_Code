// async function loadNames() {
//     const response = await fetch('AddressSearchSampleData.json');
//     const result = await response.json();
  
//     console.log(result); 
   
//   }
  
//   loadNames();
// const url = 'app-config.json';

// fetch(url)
//   .then(response => {
//     if (!response.ok) {
//       throw new Error(`HTTP error! Status: ${response.status}`);
//     }
//     return response.json();
//   })
//   .then(jsonData => {
//     console.log('Fetched JSON data:', jsonData);
//     console.log('Name:', jsonData.name);
//     console.log('Age:', jsonData.age);
//     console.log('Email:', jsonData.email);
//   })
//   .catch(error => {
//     console.error('Fetch error:', error);
//   });

// fetch('AddressSearchSampleData.json')
//             .then((response) => response.json())
//             .then((data) => {

//                 console.log(data.result);
//                 // serverAppPath = data.serverAppPath;
//                 // decimalplaces = data.decimalplaces;
//             });

// async function getSomeValue() {
//     if (somethingIsNotOk) {
//       throw new Error('uh oh');
//     } else {
//       return 'Yay!';
//     }
//   }
  
//   async function () {
//     try {
//       // "await" will wait for the promise to resolve or reject
//       // if it rejects, an error will be thrown, which you can
//       // catch with a regular try/catch block
//       const someValue = await getSomeValue();
//       doSomethingWith(someValue);
//     } catch (error) {
//       console.error(error);
//     }
//   }                                                                                            

// async function f(){
//     console.log('Async function');
//     return Promise.resolve(1);
// }
// console.log(result);
// f().then(function(result){
//     console.log(result);
// })


// let promise=new Promise(function (resolve, reject){
//     setTimeout(function(){
//         resolve('Promise resolved')
//     },4000);
// });

// async function asyncFunc(){
//     let result=await promise;
//     console.log(result);
//     console.log('hello');
// }
// asyncFunc();

// Errorhandling

// let promise = new Promise(function(resolve,reject){
//  setTimeout(function(){
//     resolve('Promise resolved')
//  },4000);
// });

// let promise = new Promise(function (resolve, reject) {
//     setTimeout(function () {
//     resolve('Promise resolved')}, 4000); 
// });



// async function asyncFunc() {
//     try {
//         // wait until the promise resolves 
//         let result = await promise; 

//         console.log(result);
//     }   
//     catch(error) {
//         console.log(error);
//     }
// }
// asyncFunc();


// // program to display time every 5 seconds
// function showTime() {

//     // return new date and time
//     let dateTime= new Date();

//     // return the time
//     let time = dateTime.toLocaleTimeString();

//     console.log(time)
// }

// let display = setInterval(showTime, 5000);

// function great(name){
//     console.log("HI"+""+name);
// }
// great("gopi");

// function greet(name,myFunction){
//     console.log("Hello Gopinadh");
//     myFunction(name);   
// }
// function sayName(name){
//     console.log('Hello'+''+name)
// }
// setTimeout(greet,2000,'john',sayName);

// const student = {
//     name: 'Monica',
//     class: 7,
//     age: 12
// }

// // using for...in
// for ( let key in student ) {
// console.log(key);
//     // display the properties
//     console.log(`${key} => ${student[key]}`);
// }

// const arr=['hello',12,true];
// for(let x in arr){
//     console.log(arr[x]);
// }

// const name="hdkjcs";
// for(let x in name){
//     console.log(name[x]);
// }


// const salaries={
//     Jack:24000,
//     Paul:55000,
//     Monica:51344,
// }
// for(let x in salaries){
//     let salary="$"+salaries[x];
//     console.log(`${x}:${salary}`);
//     // console.log(salaries[x]);
// }


// let sum = 0;
// const n = 100;

// // looping from i = n to 1
// // in each iteration, i is decreased by 1
// for(let i = n; i >= 1; i-- ) {
//     console.log(sum);
//     // adding i to sum in each iteration
//     sum += i; // sum = sum + i
// }

// console.log('sum:',sum);


// const gopi=prompt("Enter the number:")
// if(gopi>=2){
// console.log("The number is greater than 2");
// }
// else{
//     console.log("The umber is less than Zero");
// }

// const number = prompt("Enter a number:")

// if(number>=0){
//     if(number==0){
//         console.log("you entered a nuber 0");
//     }else{
//         console.log("you entered a positive number");
//     }
// }else{
//     console.log("you entered a negative number");
// }

// function greet(){
//     console.log("Hello there!");
// }
// greet();


// function add(a,b){
//     console.log(a+b);
// }

// add(3,4);
// add(2,9);

// let a="hello";
// function greet(){
//     console.log(a);
// }
// greet();

// program to show the change in global variable
// let a = "hello";

// function greet() {
//     a = 3;
// }

// // before the function call
// console.log(a);

// //after the function call
// greet();
// alert(a);
// // console.log(a); // 3



// // LocaLscope
// var a="hello"

// function greet(){
//     var b="world"
//     console.log(a+b);
// }
// greet();
// console.log(a+b);

// var x=4;
// console.log(x);

// function greet(name,lastName){
//     console.log('Hello'+''+name+''+lastName);
// }
// setTimeout(greet,1000)

// function showTime(){
//     let dateTime = new Date();
//     let time=dateTime.toUTCString();
//     console.log(time);
//     setTimeout(showTime,3000);
// }
// showTime();

// function greet(){
//     console.log('Hello');
// }
// function sayName(){
//     console.log('Gopinadh');
// }
// greet();
// sayName();


// function greet(name,myFunction){
// console.log('Hello world');
// myFunction(name);
// }
// function sayName(name){
//     console.log('Hello'+''+name);
// }
// setTimeout(greet,2000,'john',sayName);


// let countValue = new Promise(function (resolve,reject){
//     resolve('Promise resolved');
// });

// countValue.then(function successValue(result){
//     console.log(result);
// })
// .then(function successValue1(){
//     console.log("You can call multiple functions this way.");
// });


// function Person(){
//     this.name='gopi';
//     console.log(this);
// }
// let person1=new Person();
// console.log(person1.name);

// const person={
//     name:'jack',
//     age:25,
//     greet(){
//         console.log(this);
//         console.log(this.name);
//     }
// }
// person.greet();


// 'use strict';
// this.name='jack';
// function greet(){
//     console.log(this.name);
//     alert(this.name);
//     }
// // greet.call(this);

// const person={
//     name:'jack',
//     age:25,
//     greet(){
//         alert(greet());
//         console.log(this);
//         console.log(this.age);

//         function innerFunc(){
//             console.log(this);
//             console.log(this.age);
//         }
//         innerFunc();
//     }
// }
// person.greet();


// function greet(){
//     let name = 'john';
//     function displayName(){
//         return 'Hi'+''+name;
//     }
//     return displayName;
// }
// const g1 = greet();
// console.log(g1);
// console.log(g1());


// JavaScript Methods and this Keyword:-

// const person={
//     name:'john',
//     greet: function(){
//         console.log('hello');
//     }
// };

// const person={
//     name:'Gopi',
//     greet:function(){
//         console.log('hello');
//     }
// };
// // person.name;
// person.greet();

// let  student={}
// student.name='John';
// student.greet=function(){
//     console.log('hello');
// }
// student.greet();


// const divSelect=document.getElementById('love');
// divSelect.addEventListener('click', ()=>{
//     console.log('Hello');
// });