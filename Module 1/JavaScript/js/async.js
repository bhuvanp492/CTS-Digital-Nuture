const loadingMessage =
    document.createElement("h2");

loadingMessage.innerText = "Loading events...";

document.body.appendChild(loadingMessage);
fetch("data/events.json")
    .then((response) => {

        if (!response.ok) {

            throw new Error(
                "Failed to fetch events"
            );
        }
        return response.json();
    })
    .then((data) => {

        console.log(
            "Events fetched using .then():"
        );

        console.log(data);

        loadingMessage.remove();
    })

    .catch((error) => {

        console.log(error.message);

        loadingMessage.innerText =
            "Error loading events";
    });
async function loadEvents() {

    try {

        const response =
            await fetch("data/events.json");

        if (!response.ok) {

            throw new Error(
                "Unable to load events"
            );
        }

        const data =
            await response.json();

        console.log(
            "Events fetched using async/await:"
        );

        console.log(data);

    } catch (error) {

        console.log(error.message);
    }
}

loadEvents();
function sendRegistration(userData) {

    console.log(
        "Sending registration..."
    );

    setTimeout(() => {

        fetch(
            "https://jsonplaceholder.typicode.com/posts",
            {
                method: "POST",

                headers: {
                    "Content-Type":
                        "application/json"
                },

                body: JSON.stringify(userData)
            }
        )

        .then(response => response.json())

        .then(data => {

            console.log(
                "Registration Successful"
            );

            console.log(data);
        })

        .catch(error => {

            console.log(
                "Registration Failed"
            );

            console.log(error);
        });

    }, 2000);
}
sendRegistration({

    name: "Bhuvan",

    email: "bhuvan@gmail.com",

    event: "Music Night"
});