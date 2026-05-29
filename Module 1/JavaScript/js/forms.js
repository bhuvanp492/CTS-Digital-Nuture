const registrationForm =
    document.querySelector(
        "#registrationForm"
    );

const formMessage =
    document.querySelector(
        "#formMessage"
    );

registrationForm.addEventListener(
    "submit",

    function (event) {

        event.preventDefault();

        const username =
            registrationForm.elements[
                "username"
            ].value;

        const email =
            registrationForm.elements[
                "email"
            ].value;

        const selectedEvent =
            registrationForm.elements[
                "selectedEvent"
            ].value;

        if (
            username === "" ||
            email === "" ||
            selectedEvent === ""
        ) {

            formMessage.innerText =
                "Please fill all fields";

            return;
        }

        if (!email.includes("@")) {

            formMessage.innerText =
                "Enter a valid email";

            return;
        }

        formMessage.style.color = "green";

        formMessage.innerText =
            "Registration Successful";

        console.log({

            username,

            email,

            selectedEvent
        });

        registrationForm.reset();
    }
);