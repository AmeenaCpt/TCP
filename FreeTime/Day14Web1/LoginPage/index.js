document.getElementById("loginForm").addEventListener("submit", function(e) {
  e.preventDefault();

  const username = document.getElementById("username").value.trim();
  const password = document.getElementById("password").value.trim();
  const errorMsg = document.getElementById("error-msg");

  if (username === "admin" && password === "12345") {
    alert("Login Successful!");
    errorMsg.textContent = "";
  } else {
    errorMsg.textContent = "Invalid username or password.";
    errorMsg.style.color = "yellow";
  }
});
