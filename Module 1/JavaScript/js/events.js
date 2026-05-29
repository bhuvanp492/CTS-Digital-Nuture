class Event {

    constructor(name, category, date, seats, location) {

        this.name = name;
        this.category = category;
        this.date = date;
        this.seats = seats;
        this.location = location;
    }

    checkAvailability() {

        return this.seats > 0;
    }
}

const events = [

    new Event(
        "Music Night",
        "Music",
        "2026-06-10",
        20,
        "Chennai"
    ),

    new Event(
        "Baking Workshop",
        "Workshop",
        "2026-06-15",
        15,
        "Coimbatore"
    ),

    new Event(
        "Football Match",
        "Sports",
        "2026-06-20",
        0,
        "Madurai"
    )
];

events.forEach((event) => {

    if (event.checkAvailability()) {

        console.log(
            `${event.name} - Seats Available: ${event.seats}`
        );

    } else {

        console.log(
            `${event.name} is Full`
        );
    }
});

function addEvent(name, category, date, seats, location) {

    const newEvent = new Event(
        name,
        category,
        date,
        seats,
        location
    );

    events.push(newEvent);

    console.log(`${name} added successfully`);
}

function registerUser(eventName) {

    try {

        const selectedEvent = events.find(
            event => event.name === eventName
        );

        if (!selectedEvent) {

            throw new Error("Event Not Found");
        }

        if (selectedEvent.seats <= 0) {

            throw new Error("No Seats Available");
        }

        selectedEvent.seats--;

        console.log(
            `Registered for ${selectedEvent.name}`
        );

    } catch (error) {

        console.log(error.message);
    }
}

function filterEventsByCategory(category) {

    return events.filter(
        event => event.category === category
    );
}

addEvent(
    "Dance Show",
    "Music",
    "2026-07-01",
    30,
    "Salem"
);

registerUser("Music Night");

console.log(
    filterEventsByCategory("Music")
);

events.forEach((event) => {

    console.log(
        Object.entries(event)
    );
});