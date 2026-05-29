const eventName = "Music Festival";
const eventDate = "2026-06-15";

let availableSeats = 50;

const eventInfo = `
Event Name: ${eventName}
Event Date: ${eventDate}
Available Seats: ${availableSeats}
`;

console.log(eventInfo);

availableSeats--;

console.log("After Registration:");
console.log(`Remaining Seats: ${availableSeats}`);

availableSeats++;

console.log("After Cancellation:");
console.log(`Available Seats: ${availableSeats}`);