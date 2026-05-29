const eventContainer =
    document.querySelector("#eventContainer");

const categoryFilter =
    document.querySelector("#categoryFilter");

const searchInput =
    document.querySelector("#searchInput");

function displayEvents(eventList) {

    eventContainer.innerHTML = "";

    eventList.forEach((event, index) => {

        const card =
            document.createElement("div");

        card.classList.add("event-card");

        card.innerHTML = `
            <h3>${event.name}</h3>

            <p>
                Category: ${event.category}
            </p>

            <p>
                Date: ${event.date}
            </p>

            <p>
                Location: ${event.location}
            </p>

            <p>
                Seats: 
                <span id="seat-${index}">
                    ${event.seats}
                </span>
            </p>

            <button onclick="register(${index})">
                Register
            </button>
        `;

        eventContainer.appendChild(card);
    });
}

function register(index) {

    if (events[index].seats > 0) {

        events[index].seats--;

        displayEvents(events);

        alert(
            `Registered for ${events[index].name}`
        );

    } else {

        alert("No seats available");
    }
}

categoryFilter.onchange = function () {

    const selectedCategory =
        categoryFilter.value;

    if (selectedCategory === "all") {

        displayEvents(events);

    } else {

        const filteredEvents =
            events.filter(event =>
                event.category === selectedCategory
            );

        displayEvents(filteredEvents);
    }
};

searchInput.addEventListener(
    "keydown",
    function () {

        const searchText =
            searchInput.value.toLowerCase();

        const searchedEvents =
            events.filter(event =>
                event.name
                    .toLowerCase()
                    .includes(searchText)
            );

        displayEvents(searchedEvents);
    }
);

displayEvents(events);