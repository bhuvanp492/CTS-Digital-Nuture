$(document).ready(function () {
    console.log("jQuery Loaded Successfully");
    $(document).on(
        "click",
        ".event-card button",
        function () {
            $(this)
                .closest(".event-card")
                .fadeOut(500)
                .fadeIn(500);
        }
    );
});
console.log(
    "Frameworks like React and Vue make UI development easier using reusable components."
);