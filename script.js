// function gopi() {
  // var username=document.getElementById("userName").value;
  // var password=document.getElementById("userPassword").value;
  // if(username!="Gopinadh"){
   // return  alert("Please enter username");
  // }else if(password=="Dinkana"){
  // return alert("please enter pasword");
  // }
  // else {
    // alert("Submited successfuly");
  // }
// }



//   $("#userEnter").click(function() {
//     if ($("#userName").val() == "") {
//       return alert("Please enter username.")
//   }
//   else if($("#userPassword").val() == ""){ 
//     return alert("Please enter password.")
//   }
//   });

//   $('#userPassword').on('input', function() {
//     const passwordValue = $(this).val();
//     if (/\D/.test(passwordValue)) {
//       alert('Password must only contain numbers.');
//       $(this).val('');
//     }
//   });


  // function fetchData() {
  //   return new Promise((resolve, reject) => {
  //     setTimeout(() => {
  //       const data = { id: 1, name: "John" };
  //       resolve(data);
  //     }, 2000);
  //   });
  // }
  
  // async function fetchDataAsync() {
  //   try {
  //     const data = await fetchData();
  //     // console.log(data);
  //     alert(data)
  //   } catch (error) {
  //     console.error(error);
  //   }
  // }
  
  // fetchDataAsync();
  
  // function fetchData() {
  //   return new Promise((resolve, reject) => {
  //     setTimeout(() => {
  //       const data = { id: 1, name: "John" };
  //       resolve(data);
  //     }, 2000);
  //   });
  // }
  
  // fetchData()
  //   .then((data) => {
  //     console.log(data.name);
  //     alert(data.id);
  //   })
  //   .catch((error) => {
  //     console.error(error);
  //   });
  
// var username = document.getElementById("userName").value;
// var password = document.getElementById("userPassword").value;
// if (username == "" || password == "") {
//   alert("Please enter both username and password.");
// }

// var dname = document.getElementById("userName").value;
// var sname  = document.getElementById("userPassword").value;
// if(username==Gopinadh){

// }
// let message = "<h1>Alert!</h1><p>This is an example of an alert message.</p>";
// console.log(message);

// function calculate() {
//   let num1 = parseInt(document.getElementById("num1").value);
//   let num2 = parseInt(document.getElementById("num2").value);
//   let result = num1 + num2;
//   document.getElementById("result").innerHTML = "Result: " + result;
// }

// const arr=[1,2,3,4,5];
// for (let i=0;i<arr.length;i++){
//   console.log(arr[i]);
// }

// let i=1;
// while(i<=5){
//   console.log(i);
//   i++;
// }

// let userInput;
// do{
//   userInput = prompt('Please enter a number:');
// }while(isNaN(userInput));
// console.log(`You entered the number ${userInput}`);


// const myHTML = `
//   <div>
//     <h1>Hello, World!</h1>
//     <p>This is an example of including HTML code inside JavaScript.</p>
//   </div>
// `;

// document.body.innerHTML = myHTML;


// let myHTML = `<div>
//                  <h1>Hello World</h1>
//               </div>`;
// document.getElementById("myDiv").innerHTML = myHTML;


// let arr=[a,b,c];
// for(let key in arr){
//   console.log(`${key}: ${arr[key]}`);
// }

// let arr = [1, 2, 3, 4, 5];
// for (let i = 0; i < arr.length; i++) {
//   arr[i] *= 6;
// }
// console.log(arr); // [2, 4, 6, 8, 10]


// function getData() {
//   return new Promise((resolve, reject) => {
//     // Perform an asynchronous operation, such as an AJAX request
//     // In this example, we use setTimeout to simulate an asynchronous operation
//     setTimeout(() => {
//       const data = { foo: 'bar' };
//       if (data) {
//         resolve(data); // Promise resolved with data
//         console.log(data);
//       } else {
//         reject(new Error('Data not found')); // Promise rejected with an error
//       }
//     }, 1000); // Wait for 1 second before resolving the promise
//   });
// }

// // Call the getData function and handle the promise using .then and .catch methods
// getData()
//   .then(data => {
//     console.log(data); // Logs { foo: 'bar' }
//   })
//   .catch(error => {
//     console.error(error); // Logs an error message if the promise was rejected
//   });

// $(function() {
//   // Initialize the dialog box
//   $("#add-user-dialog").dialog({
//     autoOpen: false,
//     modal: true,
//     buttons: {
//       "Add User": function() {
//         // Get the form values
//         var name = $("#name").val();
//         var email = $("#email").val();
//         var password = $("#password").val();
//          var user =$("#email").val();
//         // Perform the AJAX request to create the user
//         $.ajax({
//           type: "POST",
//           url: "/api/users",
//           data: {
//             name: name,
//             email: email,
//             password: password,
//             user:user
//           },
//           success: function(response) {
//             // Close the dialog box
//             $("#add-user-dialog").dialog("close");

//             // Show a success message
//             alert("User created successfully.");
//           },
//           error: function(error) {
//             // Show an error message
//             alert("Error creating user.");
//           }
//         });
//       },
//       "Cancel": function() {
//         // Close the dialog box
//         $("#add-user-dialog").dialog("close");
//       }
//     }
//   });

//   // Open the dialog box when the "Add User" button is clicked
//   $("#add-user-button").click(function() {
//     $("#add-user-dialog").dialog("open");
//   });
// });



// function validatePassword() {
//   var password = document.getElementById("password").value;

//   // Regular expression to check if the password meets the criteria
//   var regex = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/;

//   if (!regex.test(password)) {
//     alert("Password should be at least 8 characters long and should include at least one uppercase letter, one lowercase letter, one number, and one special character.");
//     return false;
//   }

//   return true;
// }

// var num =7;
// if(isOdd(number)){
//   console.log(number+"is odd.");
// }else{
//   console.log(number +"is even.");
// }

// function isOdd(number){
//   if(number % 2!==0){
//     return true;
//   }else{
//     return false;
//   }
// };

// 29-06-2023 Pass by value -->here a & b are independent each other.

// let a=10;
// let b=a;
// b=a+10;
// console.log(a);
// console.log(b);

// 29-06-2023 Pass by reference -->here we can change the values of object &n array without dependency.
// let obj1={
//   name:"Gopinadh",
//   pass:"love",
// }
// let obj2=obj1;
// obj2.pass="lover";
// console.log(obj2);

// let myArray = ["John Doe", 24, true];
// let myArray2 = ["John Doe", 24, true];
// myArray2.pop(24);
// console.log(myArray2);

// function modifyArray(arr){
//   arr.push(4,5,6);
// }
// const myArray=[1,2,3];
// myArray.push(4,5,6);
// // modifyArray(myArray);
// console.log(myArray);
// //array

// function gopi(obj){
//   obj={prop:"changed"};
// }
// const myObj={prop:"Gopinadh"};
// gopi(myObj);
// console.log(myObj.prop);

//..........Making  a GET request..........//

// fetch('https://api.example.com/data')
// .then(response=>response.json())
// .then(data=>{
  
//   console.log(data);
// })
// .catch(error=>{
//   console.error('Error:',error);
// })


// function myFunction(p1, p2) {
//   return p1 * p2;
// }

// let result = myFunction(4, 3);
// console.log(result);


// function updateValue(value){
//   value=42;
//   console.log("Inside the function:",value);
// }

// let originalValue=10;
// console.log("Before the function:",originalValue);

// updateValue(originalValue);

// console.log("After the function:", originalValue);


// function updateObject(obj){
//   obj.property="updated";
//   console.log("Inside the function:",obj);
//   alert('gopi');
// }

// const x = document.getElementById("demo");
// function getLocation(){
//   try{
//     navigator.geolocation.getCurrentPosition(showPosition);
//   }
//   catch{
//     x.innerHTML=err;
//   }
// }

// function showPosition(position){
//   x.innerHTML ="Latitude:" + position.coords.latitude + "<br>Longitude:"+position.coords.longitude;
// }


// Get references to HTML elements
// const locationInput = document.getElementById('location-input');
// const weatherButton = document.getElementById('weather-button');
// const weatherDisplay = document.getElementById('weather-display');

// // OpenWeatherMap API configuration
// const apiKey = 'YOUR_API_KEY'; // Replace with your OpenWeatherMap API key
// const apiUrl = 'https://api.openweathermap.org/data/2.5/weather';

// // Event listener for weather button click
// weatherButton.addEventListener('click', () => {
//   const location = locationInput.value;

//   // Make a request to OpenWeatherMap API
//   fetch(`${apiUrl}?q=${location}&appid=${apiKey}`)
//     .then(response => response.json())
//     .then(data => {
//       // Extract relevant weather information from API response
//       const cityName = data.name;
//       const temperature = data.main.temp;
//       const description = data.weather[0].description;
// console.log(cityName);
//       // Update weather display
//       weatherDisplay.innerHTML = `
//         <h2>Weather in ${cityName}</h2>
//         <p>Temperature: ${temperature} K</p>
//         <p>Description: ${description}</p>
//       `;
//     })
//     .catch(error => {
//       console.error('Error:', error);
//       weatherDisplay.innerHTML = 'Error fetching weather data.';
//     });
// });


// const data = [
//   { name: 'John Doe', email: 'john@example.com', age: 25 },
//   { name: 'Jane Smith', email: 'jane@example.com', age: 30 },
//   // Add more data objects as needed
// ];
//  alert("Gopi");
// console.log(data);
// // alert(data);

// const table = document.getElementById('myTable');
// const tableBody = table.querySelector('tbody');

// data.forEach(function(item) {
//   const row = document.createElement('tr');
//   Object.values(item).forEach(function(value) {
//     const cell = document.createElement('td');
//     cell.textContent = value;
//     row.appendChild(cell);
//   });
//   tableBody.appendChild(row);
// });


//Get a reference to the table body
// var tableBody = document.getElementById("myTable").getElementsByTagName('tbody')[0];

// // Generate some dynamic data (e.g., an array of objects)
// var dynamicData = [
//   { column1: "Value 1", column2: "Value A" },
//   { column1: "Value 2", column2: "Value B" },
//   { column1: "Value 3", column2: "Value C" }
// ];

// console.log(dynamicData);

// // Loop through the dynamic data and create table rows
// for (var i = 0; i < dynamicData.length; i++) {
//   // Create a new row
//   var row = tableBody.insertRow();
//   // console.log(dynamicData.length);
//   // Insert data into the row cells
//   var cell1 = row.insertCell(0);
//   cell1.innerHTML = dynamicData[i].column1;

//   var cell2 = row.insertCell(1);
//   cell2.innerHTML = dynamicData[i].column2;
// }



// alert("This is testing...");
  


// var tableBody = document.getElementById("myTable").getElementsByTagName('tbody')[0];

// // Generate some dynamic data (e.g., an array of objects)
// var dynamicData = [
//   { column1: "Value 1", column2: "Value A" ,column3: "Value Gopinadh",},
//   { column1: "Value 2", column2: "Value B", column3: "Value Gopinadh",},
//   { column1: "Value 3", column2: "Value C", column3: "Value Gopinadh",},
//   { column1: "Value 1", column2: "Value A", column3: "Value Gopinadh",},
//   { column1: "Value 2", column2: "Value B", column3: "Value Gopinadh",},
//   { column1: "Value 3", column2: "Value C", column3: "Value Gopinadh", }
// ];

// // Loop through the dynamic data and create table rows
// for (var i = 0; i < dynamicData.length; i++) {
//   // Create a new row
//   var row = tableBody.insertRow();

//   // Insert data into the row cells
//   var cell1 = row.insertCell(0);
//   cell1.innerHTML = dynamicData[i].column1;

//   var cell2 = row.insertCell(1);
//   cell2.innerHTML = dynamicData[i].column2;

//   var cell3 = row.insertCell(2);
//   cell3.innerHTML = dynamicData[i].column3;
// }






// Function to create a promise for adding a task
function addTaskPromise(task) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (task.trim() !== "") {
        resolve(task);
      } else {
        reject("Task cannot be empty.");
      }
    }, 1000); // Simulating an asynchronous operation with a delay of 1 second
  });
}

// Function to create a promise for deleting a task
function deleteTaskPromise(taskIndex) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (taskIndex >= 0) {
        resolve(taskIndex);
      } else {
        reject("Invalid task index.");
      }
    }, 1000); // Simulating an asynchronous operation with a delay of 1 second
  });
}

// Function to add a task to the list
function addTask() {
  const taskInput = document.getElementById("taskInput");
  const taskText = taskInput.value;

  addTaskPromise(taskText)
    .then((task) => {
      const taskList = document.getElementById("taskList");
      const li = document.createElement("li");
      li.textContent = task;
      taskList.appendChild(li);
      taskInput.value = "";
    })
    .catch((error) => {
      alert(error);
    });
}

// Function to delete a task from the list
function deleteTask(taskIndex) {
  deleteTaskPromise(taskIndex)
    .then((index) => {
      const taskList = document.getElementById("taskList");
      const taskItems = taskList.getElementsByTagName("li");
      if (index < taskItems.length) {
        taskList.removeChild(taskItems[index]);
      }
    })
    .catch((error) => {
      alert(error);
    });
}

// Event listener for "Add Task" button click
document.getElementById("addButton").addEventListener("click", addTask);
// document.getElementById("delButton").addEventListener("click", deleteTask);
// Event listener for "Delete Task" click (using event delegation)
document.getElementById("taskList").addEventListener("click", function (event) {
  if (event.target && event.target.nodeName === "LI") {
    const taskIndex = Array.prototype.indexOf.call(
      event.target.parentElement.children,
      event.target
    );
    deleteTask(taskIndex);
  }
});
