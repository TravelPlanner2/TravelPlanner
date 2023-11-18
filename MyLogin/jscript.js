// Function to handle Google login
function loginWithGoogle() {
    // Redirect to Google login page
    window.location.href = "https://accounts.google.com"; // Replace with your Google login URL
}

// Function to handle Facebook login
function loginWithFacebook() {
    // Redirect to Facebook login page
    window.location.href = "https://www.facebook.com"; // Replace with your Facebook login URL
}

// Form submission handling
document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();
    // Implement your login form submission handling here
    let email = document.getElementById('email').value;
    let password = document.getElementById('password').value;
    console.log('Email:', email);
    console.log('Password:', password);
    // You can perform form validation and authentication logic here
});
