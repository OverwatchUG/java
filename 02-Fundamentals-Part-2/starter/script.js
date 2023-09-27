'use strict';
/*
let hasDriversLicense = false;
const passTest = true;

if (passTest) hasDriversLicense = true;
if (hasDriversLicense) console.log("I can drive :D");

// const interface = 'Audio';
// const private = 534;
*/




// function logger() {
//   console.log('My name is Jonas');
// }

// // calling / running / invoking function
// logger();
// logger();
// logger();

// function fruitProcessor(apples, oranges){
//   console.log(apples, oranges);
//   const juice = `Juice with ${apples} apples and ${oranges} oranges.`;
//   return juice;
// }

// const appleJuice = fruitProcessor(5, 0);
// console.log(appleJuice);


// const friends = ['Waako','Shadidu','Ismail'];


// const newLenght = friends.push('Pearl');
// console.log(friends);
// console.log(newLenght);

// friends.unshift('Overwatch');
// console.log(friends);

// const waako = {
//   firstName: 'Waako',
//   lastName: 'Shadidu',
//   job: 'student',
//   age: 2023 - 2002,
//   friends: ['Mafabi', 'Tiiso', 'Aiphat']
// };

// console.log(waako);

// console.log(waako.lastName);
// console.log(waako['lastName']);
// console.log(waako.friends[2]);

// const nameKey = 'Name';
// console.log(waako['first' + nameKey]);
// console.log(waako['last' + nameKey]);

// console.log()

// const interestedIn = prompt('What do you what to know about Waako? Choose between firstName, lastName, age, job, and friends');


// if (waako[interestedIn]) {
//   console.log(waako[interestedIn]);
// } else {
//   console.log('Wrong requet! Choose between firstName, lastName, age, job, and friends');
// }

// waako.location = 'Mbale';
// waako['twitter'] = '@overwatch';
// console.log(waako);

// console.log(`${waako.firstName} has ${waako.friends.length}, add his best friend is called ${waako.friends[1]}`);


// const waako = {
//   firstName: 'Waako',
//   lastName: 'Shadidu',
//   job: 'student',
//   birthYeah:2002,
//   friends: ['Mafabi', 'Tiiso', 'Aiphat'],
//   hasDriversLicense: true,

  // calcAge: function(birthYeah) {
  //   return 2037 - birthYeah;
  // }

  // calcAge: function () {
  //   // console.log(this)
  //   return 2037 - this.birthYeah;
  // }

//   calcAge: function () {
//     this.age = 2037 - this.birthYeah;
//     return this.age;
//   },

//   getSummary: function() {
//     return `${this.firstName} is a ${this.calcAge()}-year old ${this.job}, and he has ${this.hasDriversLicense ? 'a' : 'no'} driver's license.`
//   }
// };

// console.log(waako.calcAge());

// console.log(waako.age);
// console.log(waako.age);
// console.log(waako.age);

// console.log(waako.getSummary());

// const mark = {
//   fullName: 'Mark Miller',
//   mass: 78,
//   height: 1.69,
//   calcBMI: function () {
//     this.bmi = this.mass / this.height ** 2;
//     return this.bmi;
//   }
// }

// const john = {
//   fullName: 'John Smith',
//   mass: 92,
//   height: 1.95,
//   calcBMI: function () {
//     this.bmi = this.mass / this.height ** 2;
//     return this.bmi;
//   }
// }

// mark.calcBMI();
// john.calcBMI();

// console.log(mark.bmi, john.bmi);

// if (mark.bmi > john.bmi) {
//   console.log(`${mark.fullName}'s BMI ${mark.bmi} is higher than ${john.fullName}'s ${john.bmi}`)
// } else if (john.bmi > mark.bmi) {
//   console.log(`${john.fullName}'s BMI ${john.bmi} is higher than ${mark.fullName}'s ${mark.bmi}`)
// }
 
// for(let rep = 1; rep <= 10; rep++) {
//   console.log(`Lifting weights repetition ${rep}`);
// }

const waako = [
 'Waako',
 'Shadidu',
 'student',
 2023 - 2002,
 ['Mafabi', 'Tiiso', 'Aiphat'], 
 true
];
const types = [];

for(let i = 0; i < waako.length; i++) {
  console.log(waako[i], typeof waako[i]);

  // types[i] = typeof waako[i];
  types.push(typeof waako[i]);
}

console.log(types);

const years = [1991, 2007, 1969, 2020];
const ages = [];

for (let i = 0; i < years.length; i++) {
  ages.push(2037 - years[i]);
}

console.log(ages);